package o4;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import m4.AbstractC6203i;
import o4.g;

/* loaded from: classes2.dex */
class h implements InterfaceC6290c {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f39853d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final File f39854a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39855b;

    /* renamed from: c, reason: collision with root package name */
    private g f39856c;

    class a implements g.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f39857a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f39858b;

        a(byte[] bArr, int[] iArr) {
            this.f39857a = bArr;
            this.f39858b = iArr;
        }

        @Override // o4.g.d
        public void a(InputStream inputStream, int i8) {
            try {
                inputStream.read(this.f39857a, this.f39858b[0], i8);
                int[] iArr = this.f39858b;
                iArr[0] = iArr[0] + i8;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f39860a;

        /* renamed from: b, reason: collision with root package name */
        public final int f39861b;

        b(byte[] bArr, int i8) {
            this.f39860a = bArr;
            this.f39861b = i8;
        }
    }

    h(File file, int i8) {
        this.f39854a = file;
        this.f39855b = i8;
    }

    private void f(long j8, String str) {
        if (this.f39856c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i8 = this.f39855b / 4;
            if (str.length() > i8) {
                str = "..." + str.substring(str.length() - i8);
            }
            this.f39856c.h(String.format(Locale.US, "%d %s%n", Long.valueOf(j8), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f39853d));
            while (!this.f39856c.u() && this.f39856c.T() > this.f39855b) {
                this.f39856c.I();
            }
        } catch (IOException e8) {
            j4.g.f().e("There was a problem writing to the Crashlytics log.", e8);
        }
    }

    private b g() {
        if (!this.f39854a.exists()) {
            return null;
        }
        h();
        g gVar = this.f39856c;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.T()];
        try {
            this.f39856c.l(new a(bArr, iArr));
        } catch (IOException e8) {
            j4.g.f().e("A problem occurred while reading the Crashlytics log file.", e8);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f39856c == null) {
            try {
                this.f39856c = new g(this.f39854a);
            } catch (IOException e8) {
                j4.g.f().e("Could not open log file: " + this.f39854a, e8);
            }
        }
    }

    @Override // o4.InterfaceC6290c
    public void a() {
        AbstractC6203i.f(this.f39856c, "There was a problem closing the Crashlytics log file.");
        this.f39856c = null;
    }

    @Override // o4.InterfaceC6290c
    public String b() {
        byte[] c8 = c();
        if (c8 != null) {
            return new String(c8, f39853d);
        }
        return null;
    }

    @Override // o4.InterfaceC6290c
    public byte[] c() {
        b g8 = g();
        if (g8 == null) {
            return null;
        }
        int i8 = g8.f39861b;
        byte[] bArr = new byte[i8];
        System.arraycopy(g8.f39860a, 0, bArr, 0, i8);
        return bArr;
    }

    @Override // o4.InterfaceC6290c
    public void d() {
        a();
        this.f39854a.delete();
    }

    @Override // o4.InterfaceC6290c
    public void e(long j8, String str) {
        h();
        f(j8, str);
    }
}
