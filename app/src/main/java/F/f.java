package F;

import J6.AbstractC0650j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f2218e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final f f2219f = new f(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final float f2220a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2221b;

    /* renamed from: c, reason: collision with root package name */
    private final float f2222c;

    /* renamed from: d, reason: collision with root package name */
    private final float f2223d;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final f a() {
            return f.f2219f;
        }

        private a() {
        }
    }

    public f(float f8, float f9, float f10, float f11) {
        this.f2220a = f8;
        this.f2221b = f9;
        this.f2222c = f10;
        this.f2223d = f11;
    }

    public final boolean b(long j8) {
        return d.f(j8) >= this.f2220a && d.f(j8) < this.f2222c && d.g(j8) >= this.f2221b && d.g(j8) < this.f2223d;
    }

    public final float c() {
        return this.f2223d;
    }

    public final float d() {
        return this.f2220a;
    }

    public final float e() {
        return this.f2222c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f2220a, fVar.f2220a) == 0 && Float.compare(this.f2221b, fVar.f2221b) == 0 && Float.compare(this.f2222c, fVar.f2222c) == 0 && Float.compare(this.f2223d, fVar.f2223d) == 0;
    }

    public final float f() {
        return this.f2221b;
    }

    public final f g(float f8, float f9, float f10, float f11) {
        return new f(Math.max(this.f2220a, f8), Math.max(this.f2221b, f9), Math.min(this.f2222c, f10), Math.min(this.f2223d, f11));
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f2220a) * 31) + Float.floatToIntBits(this.f2221b)) * 31) + Float.floatToIntBits(this.f2222c)) * 31) + Float.floatToIntBits(this.f2223d);
    }

    public String toString() {
        return "Rect.fromLTRB(" + F.a.a(this.f2220a, 1) + ", " + F.a.a(this.f2221b, 1) + ", " + F.a.a(this.f2222c, 1) + ", " + F.a.a(this.f2223d, 1) + ')';
    }
}
