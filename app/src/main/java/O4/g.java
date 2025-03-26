package o4;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
class g implements Closeable {

    /* renamed from: x, reason: collision with root package name */
    private static final Logger f39837x = Logger.getLogger(g.class.getName());

    /* renamed from: o, reason: collision with root package name */
    private final RandomAccessFile f39838o;

    /* renamed from: s, reason: collision with root package name */
    int f39839s;

    /* renamed from: t, reason: collision with root package name */
    private int f39840t;

    /* renamed from: u, reason: collision with root package name */
    private b f39841u;

    /* renamed from: v, reason: collision with root package name */
    private b f39842v;

    /* renamed from: w, reason: collision with root package name */
    private final byte[] f39843w = new byte[16];

    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        boolean f39844a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f39845b;

        a(StringBuilder sb) {
            this.f39845b = sb;
        }

        @Override // o4.g.d
        public void a(InputStream inputStream, int i8) {
            if (this.f39844a) {
                this.f39844a = false;
            } else {
                this.f39845b.append(", ");
            }
            this.f39845b.append(i8);
        }
    }

    static class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f39847c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final int f39848a;

        /* renamed from: b, reason: collision with root package name */
        final int f39849b;

        b(int i8, int i9) {
            this.f39848a = i8;
            this.f39849b = i9;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f39848a + ", length = " + this.f39849b + "]";
        }
    }

    private final class c extends InputStream {

        /* renamed from: o, reason: collision with root package name */
        private int f39850o;

        /* renamed from: s, reason: collision with root package name */
        private int f39851s;

        /* synthetic */ c(g gVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            g.z(bArr, "buffer");
            if ((i8 | i9) < 0 || i9 > bArr.length - i8) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i10 = this.f39851s;
            if (i10 <= 0) {
                return -1;
            }
            if (i9 > i10) {
                i9 = i10;
            }
            g.this.K(this.f39850o, bArr, i8, i9);
            this.f39850o = g.this.X(this.f39850o + i9);
            this.f39851s -= i9;
            return i9;
        }

        private c(b bVar) {
            this.f39850o = g.this.X(bVar.f39848a + 4);
            this.f39851s = bVar.f39849b;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f39851s == 0) {
                return -1;
            }
            g.this.f39838o.seek(this.f39850o);
            int read = g.this.f39838o.read();
            this.f39850o = g.this.X(this.f39850o + 1);
            this.f39851s--;
            return read;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i8);
    }

    public g(File file) {
        if (!file.exists()) {
            m(file);
        }
        this.f39838o = A(file);
        D();
    }

    private static RandomAccessFile A(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b B(int i8) {
        if (i8 == 0) {
            return b.f39847c;
        }
        this.f39838o.seek(i8);
        return new b(i8, this.f39838o.readInt());
    }

    private void D() {
        this.f39838o.seek(0L);
        this.f39838o.readFully(this.f39843w);
        int E7 = E(this.f39843w, 0);
        this.f39839s = E7;
        if (E7 <= this.f39838o.length()) {
            this.f39840t = E(this.f39843w, 4);
            int E8 = E(this.f39843w, 8);
            int E9 = E(this.f39843w, 12);
            this.f39841u = B(E8);
            this.f39842v = B(E9);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f39839s + ", Actual length: " + this.f39838o.length());
    }

    private static int E(byte[] bArr, int i8) {
        return ((bArr[i8] & 255) << 24) + ((bArr[i8 + 1] & 255) << 16) + ((bArr[i8 + 2] & 255) << 8) + (bArr[i8 + 3] & 255);
    }

    private int G() {
        return this.f39839s - T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(int i8, byte[] bArr, int i9, int i10) {
        int X7 = X(i8);
        int i11 = X7 + i10;
        int i12 = this.f39839s;
        if (i11 <= i12) {
            this.f39838o.seek(X7);
            this.f39838o.readFully(bArr, i9, i10);
            return;
        }
        int i13 = i12 - X7;
        this.f39838o.seek(X7);
        this.f39838o.readFully(bArr, i9, i13);
        this.f39838o.seek(16L);
        this.f39838o.readFully(bArr, i9 + i13, i10 - i13);
    }

    private void M(int i8, byte[] bArr, int i9, int i10) {
        int X7 = X(i8);
        int i11 = X7 + i10;
        int i12 = this.f39839s;
        if (i11 <= i12) {
            this.f39838o.seek(X7);
            this.f39838o.write(bArr, i9, i10);
            return;
        }
        int i13 = i12 - X7;
        this.f39838o.seek(X7);
        this.f39838o.write(bArr, i9, i13);
        this.f39838o.seek(16L);
        this.f39838o.write(bArr, i9 + i13, i10 - i13);
    }

    private void N(int i8) {
        this.f39838o.setLength(i8);
        this.f39838o.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int X(int i8) {
        int i9 = this.f39839s;
        return i8 < i9 ? i8 : (i8 + 16) - i9;
    }

    private void b0(int i8, int i9, int i10, int i11) {
        e0(this.f39843w, i8, i9, i10, i11);
        this.f39838o.seek(0L);
        this.f39838o.write(this.f39843w);
    }

    private static void c0(byte[] bArr, int i8, int i9) {
        bArr[i8] = (byte) (i9 >> 24);
        bArr[i8 + 1] = (byte) (i9 >> 16);
        bArr[i8 + 2] = (byte) (i9 >> 8);
        bArr[i8 + 3] = (byte) i9;
    }

    private static void e0(byte[] bArr, int... iArr) {
        int i8 = 0;
        for (int i9 : iArr) {
            c0(bArr, i8, i9);
            i8 += 4;
        }
    }

    private void k(int i8) {
        int i9 = i8 + 4;
        int G7 = G();
        if (G7 >= i9) {
            return;
        }
        int i10 = this.f39839s;
        do {
            G7 += i10;
            i10 <<= 1;
        } while (G7 < i9);
        N(i10);
        b bVar = this.f39842v;
        int X7 = X(bVar.f39848a + 4 + bVar.f39849b);
        if (X7 < this.f39841u.f39848a) {
            FileChannel channel = this.f39838o.getChannel();
            channel.position(this.f39839s);
            long j8 = X7 - 4;
            if (channel.transferTo(16L, j8, channel) != j8) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i11 = this.f39842v.f39848a;
        int i12 = this.f39841u.f39848a;
        if (i11 < i12) {
            int i13 = (this.f39839s + i11) - 16;
            b0(i10, this.f39840t, i12, i13);
            this.f39842v = new b(i13, this.f39842v.f39849b);
        } else {
            b0(i10, this.f39840t, i12, i11);
        }
        this.f39839s = i10;
    }

    private static void m(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile A7 = A(file2);
        try {
            A7.setLength(4096L);
            A7.seek(0L);
            byte[] bArr = new byte[16];
            e0(bArr, 4096, 0, 0, 0);
            A7.write(bArr);
            A7.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            A7.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object z(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public synchronized void I() {
        try {
            if (u()) {
                throw new NoSuchElementException();
            }
            if (this.f39840t == 1) {
                j();
            } else {
                b bVar = this.f39841u;
                int X7 = X(bVar.f39848a + 4 + bVar.f39849b);
                K(X7, this.f39843w, 0, 4);
                int E7 = E(this.f39843w, 0);
                b0(this.f39839s, this.f39840t - 1, X7, this.f39842v.f39848a);
                this.f39840t--;
                this.f39841u = new b(X7, E7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public int T() {
        if (this.f39840t == 0) {
            return 16;
        }
        b bVar = this.f39842v;
        int i8 = bVar.f39848a;
        int i9 = this.f39841u.f39848a;
        return i8 >= i9 ? (i8 - i9) + 4 + bVar.f39849b + 16 : (((i8 + 4) + bVar.f39849b) + this.f39839s) - i9;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f39838o.close();
    }

    public void h(byte[] bArr) {
        i(bArr, 0, bArr.length);
    }

    public synchronized void i(byte[] bArr, int i8, int i9) {
        int X7;
        try {
            z(bArr, "buffer");
            if ((i8 | i9) < 0 || i9 > bArr.length - i8) {
                throw new IndexOutOfBoundsException();
            }
            k(i9);
            boolean u7 = u();
            if (u7) {
                X7 = 16;
            } else {
                b bVar = this.f39842v;
                X7 = X(bVar.f39848a + 4 + bVar.f39849b);
            }
            b bVar2 = new b(X7, i9);
            c0(this.f39843w, 0, i9);
            M(bVar2.f39848a, this.f39843w, 0, 4);
            M(bVar2.f39848a + 4, bArr, i8, i9);
            b0(this.f39839s, this.f39840t + 1, u7 ? bVar2.f39848a : this.f39841u.f39848a, bVar2.f39848a);
            this.f39842v = bVar2;
            this.f39840t++;
            if (u7) {
                this.f39841u = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void j() {
        try {
            b0(4096, 0, 0, 0);
            this.f39840t = 0;
            b bVar = b.f39847c;
            this.f39841u = bVar;
            this.f39842v = bVar;
            if (this.f39839s > 4096) {
                N(4096);
            }
            this.f39839s = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void l(d dVar) {
        int i8 = this.f39841u.f39848a;
        for (int i9 = 0; i9 < this.f39840t; i9++) {
            b B7 = B(i8);
            dVar.a(new c(this, B7, null), B7.f39849b);
            i8 = X(B7.f39848a + 4 + B7.f39849b);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f39839s);
        sb.append(", size=");
        sb.append(this.f39840t);
        sb.append(", first=");
        sb.append(this.f39841u);
        sb.append(", last=");
        sb.append(this.f39842v);
        sb.append(", element lengths=[");
        try {
            l(new a(sb));
        } catch (IOException e8) {
            f39837x.log(Level.WARNING, "read error", (Throwable) e8);
        }
        sb.append("]]");
        return sb.toString();
    }

    public synchronized boolean u() {
        return this.f39840t == 0;
    }
}
