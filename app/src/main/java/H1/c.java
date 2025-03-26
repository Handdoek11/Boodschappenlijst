package H1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class c implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    private final InputStream f2906o;

    /* renamed from: s, reason: collision with root package name */
    private final Charset f2907s;

    /* renamed from: t, reason: collision with root package name */
    private byte[] f2908t;

    /* renamed from: u, reason: collision with root package name */
    private int f2909u;

    /* renamed from: v, reason: collision with root package name */
    private int f2910v;

    class a extends ByteArrayOutputStream {
        a(int i8) {
            super(i8);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i8 = ((ByteArrayOutputStream) this).count;
            if (i8 > 0 && ((ByteArrayOutputStream) this).buf[i8 - 1] == 13) {
                i8--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i8, c.this.f2907s.name());
            } catch (UnsupportedEncodingException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void e() {
        InputStream inputStream = this.f2906o;
        byte[] bArr = this.f2908t;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f2909u = 0;
        this.f2910v = read;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f2906o) {
            try {
                if (this.f2908t != null) {
                    this.f2908t = null;
                    this.f2906o.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean f() {
        return this.f2910v == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String g() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f2906o
            monitor-enter(r0)
            byte[] r1 = r7.f2908t     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.f2909u     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f2910v     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.e()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.f2909u     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.f2910v     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.f2908t     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.f2909u     // Catch: java.lang.Throwable -> L11
            if (r1 == r3) goto L2f
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L11
            r6 = 13
            if (r5 != r6) goto L2f
            goto L30
        L2f:
            r4 = r1
        L30:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f2907s     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.f2909u = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            H1.c$a r1 = new H1.c$a     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f2910v     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f2909u     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.f2908t     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f2909u     // Catch: java.lang.Throwable -> L11
            int r5 = r7.f2910v     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.f2910v = r2     // Catch: java.lang.Throwable -> L11
            r7.e()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f2909u     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.f2910v     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.f2908t     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.f2909u     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.f2909u = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.c.g():java.lang.String");
    }

    public c(InputStream inputStream, int i8, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(d.f2912a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f2906o = inputStream;
        this.f2907s = charset;
        this.f2908t = new byte[i8];
    }
}
