package F;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private float f2210a;

    /* renamed from: b, reason: collision with root package name */
    private float f2211b;

    /* renamed from: c, reason: collision with root package name */
    private float f2212c;

    /* renamed from: d, reason: collision with root package name */
    private float f2213d;

    public b(float f8, float f9, float f10, float f11) {
        this.f2210a = f8;
        this.f2211b = f9;
        this.f2212c = f10;
        this.f2213d = f11;
    }

    public final float a() {
        return this.f2213d;
    }

    public final float b() {
        return this.f2210a;
    }

    public final float c() {
        return this.f2212c;
    }

    public final float d() {
        return this.f2211b;
    }

    public final void e(float f8, float f9, float f10, float f11) {
        this.f2210a = Math.max(f8, this.f2210a);
        this.f2211b = Math.max(f9, this.f2211b);
        this.f2212c = Math.min(f10, this.f2212c);
        this.f2213d = Math.min(f11, this.f2213d);
    }

    public final boolean f() {
        return this.f2210a >= this.f2212c || this.f2211b >= this.f2213d;
    }

    public final void g(float f8) {
        this.f2213d = f8;
    }

    public final void h(float f8) {
        this.f2210a = f8;
    }

    public final void i(float f8) {
        this.f2212c = f8;
    }

    public final void j(float f8) {
        this.f2211b = f8;
    }

    public String toString() {
        return "MutableRect(" + a.a(this.f2210a, 1) + ", " + a.a(this.f2211b, 1) + ", " + a.a(this.f2212c, 1) + ", " + a.a(this.f2213d, 1) + ')';
    }
}
