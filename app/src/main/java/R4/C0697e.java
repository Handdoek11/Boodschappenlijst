package R4;

/* renamed from: R4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0697e {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC0696d f4867a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC0696d f4868b;

    /* renamed from: c, reason: collision with root package name */
    private final double f4869c;

    public C0697e(EnumC0696d enumC0696d, EnumC0696d enumC0696d2, double d8) {
        J6.r.e(enumC0696d, "performance");
        J6.r.e(enumC0696d2, "crashlytics");
        this.f4867a = enumC0696d;
        this.f4868b = enumC0696d2;
        this.f4869c = d8;
    }

    public final EnumC0696d a() {
        return this.f4868b;
    }

    public final EnumC0696d b() {
        return this.f4867a;
    }

    public final double c() {
        return this.f4869c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0697e)) {
            return false;
        }
        C0697e c0697e = (C0697e) obj;
        return this.f4867a == c0697e.f4867a && this.f4868b == c0697e.f4868b && Double.compare(this.f4869c, c0697e.f4869c) == 0;
    }

    public int hashCode() {
        return (((this.f4867a.hashCode() * 31) + this.f4868b.hashCode()) * 31) + H.y.a(this.f4869c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f4867a + ", crashlytics=" + this.f4868b + ", sessionSamplingRate=" + this.f4869c + ')';
    }
}
