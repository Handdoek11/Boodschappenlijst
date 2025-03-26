package G2;

import Z2.AbstractC0777p;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f2578a;

    /* renamed from: b, reason: collision with root package name */
    public final double f2579b;

    /* renamed from: c, reason: collision with root package name */
    public final double f2580c;

    /* renamed from: d, reason: collision with root package name */
    public final double f2581d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2582e;

    public F(String str, double d8, double d9, double d10, int i8) {
        this.f2578a = str;
        this.f2580c = d8;
        this.f2579b = d9;
        this.f2581d = d10;
        this.f2582e = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f8 = (F) obj;
        return AbstractC0777p.a(this.f2578a, f8.f2578a) && this.f2579b == f8.f2579b && this.f2580c == f8.f2580c && this.f2582e == f8.f2582e && Double.compare(this.f2581d, f8.f2581d) == 0;
    }

    public final int hashCode() {
        return AbstractC0777p.b(this.f2578a, Double.valueOf(this.f2579b), Double.valueOf(this.f2580c), Double.valueOf(this.f2581d), Integer.valueOf(this.f2582e));
    }

    public final String toString() {
        return AbstractC0777p.c(this).a("name", this.f2578a).a("minBound", Double.valueOf(this.f2580c)).a("maxBound", Double.valueOf(this.f2579b)).a("percent", Double.valueOf(this.f2581d)).a("count", Integer.valueOf(this.f2582e)).toString();
    }
}
