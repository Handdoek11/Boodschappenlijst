package androidx.appcompat.app;

/* loaded from: classes.dex */
class G {

    /* renamed from: d, reason: collision with root package name */
    private static G f6798d;

    /* renamed from: a, reason: collision with root package name */
    public long f6799a;

    /* renamed from: b, reason: collision with root package name */
    public long f6800b;

    /* renamed from: c, reason: collision with root package name */
    public int f6801c;

    G() {
    }

    static G b() {
        if (f6798d == null) {
            f6798d = new G();
        }
        return f6798d;
    }

    public void a(long j8, double d8, double d9) {
        double d10 = (0.01720197f * ((j8 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d10) * 0.03341960161924362d) + d10 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d9) / 360.0d) + (Math.sin(d10) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d11 = 0.01745329238474369d * d8;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d11) * Math.sin(asin))) / (Math.cos(d11) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f6801c = 1;
            this.f6799a = -1L;
            this.f6800b = -1L;
        } else {
            if (sin2 <= -1.0d) {
                this.f6801c = 0;
                this.f6799a = -1L;
                this.f6800b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.f6799a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.f6800b = round2;
            if (round2 >= j8 || this.f6799a <= j8) {
                this.f6801c = 1;
            } else {
                this.f6801c = 0;
            }
        }
    }
}
