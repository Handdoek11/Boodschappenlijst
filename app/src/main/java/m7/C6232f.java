package m7;

/* renamed from: m7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6232f {

    /* renamed from: a, reason: collision with root package name */
    public final D f39456a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39457b;

    public C6232f(D d8) {
        J6.r.e(d8, "writer");
        this.f39456a = d8;
        this.f39457b = true;
    }

    public final boolean a() {
        return this.f39457b;
    }

    public void b() {
        this.f39457b = true;
    }

    public void c() {
        this.f39457b = false;
    }

    public void d(byte b8) {
        this.f39456a.c(b8);
    }

    public final void e(char c8) {
        this.f39456a.a(c8);
    }

    public void f(double d8) {
        this.f39456a.d(String.valueOf(d8));
    }

    public void g(float f8) {
        this.f39456a.d(String.valueOf(f8));
    }

    public void h(int i8) {
        this.f39456a.c(i8);
    }

    public void i(long j8) {
        this.f39456a.c(j8);
    }

    public final void j(String str) {
        J6.r.e(str, "v");
        this.f39456a.d(str);
    }

    public void k(short s8) {
        this.f39456a.c(s8);
    }

    public void l(boolean z7) {
        this.f39456a.d(String.valueOf(z7));
    }

    public final void m(String str) {
        J6.r.e(str, "value");
        this.f39456a.b(str);
    }

    protected final void n(boolean z7) {
        this.f39457b = z7;
    }

    public void o() {
    }

    public void p() {
    }
}
