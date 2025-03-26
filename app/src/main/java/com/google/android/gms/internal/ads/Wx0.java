package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Wx0 {

    /* renamed from: j, reason: collision with root package name */
    public static final Wx0 f19911j = new Wx0(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final Wx0 f19912k = new Wx0(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final Wx0 f19913l = new Wx0(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final Wx0 f19914m = new Wx0(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f19915a;

    /* renamed from: b, reason: collision with root package name */
    public final double f19916b;

    /* renamed from: c, reason: collision with root package name */
    public final double f19917c;

    /* renamed from: d, reason: collision with root package name */
    public final double f19918d;

    /* renamed from: e, reason: collision with root package name */
    public final double f19919e;

    /* renamed from: f, reason: collision with root package name */
    public final double f19920f;

    /* renamed from: g, reason: collision with root package name */
    public final double f19921g;

    /* renamed from: h, reason: collision with root package name */
    public final double f19922h;

    /* renamed from: i, reason: collision with root package name */
    public final double f19923i;

    public Wx0(double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f19915a = d12;
        this.f19916b = d13;
        this.f19917c = d14;
        this.f19918d = d8;
        this.f19919e = d9;
        this.f19920f = d10;
        this.f19921g = d11;
        this.f19922h = d15;
        this.f19923i = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Wx0.class != obj.getClass()) {
            return false;
        }
        Wx0 wx0 = (Wx0) obj;
        return Double.compare(wx0.f19918d, this.f19918d) == 0 && Double.compare(wx0.f19919e, this.f19919e) == 0 && Double.compare(wx0.f19920f, this.f19920f) == 0 && Double.compare(wx0.f19921g, this.f19921g) == 0 && Double.compare(wx0.f19922h, this.f19922h) == 0 && Double.compare(wx0.f19923i, this.f19923i) == 0 && Double.compare(wx0.f19915a, this.f19915a) == 0 && Double.compare(wx0.f19916b, this.f19916b) == 0 && Double.compare(wx0.f19917c, this.f19917c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f19915a);
        long j8 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f19916b);
        long j9 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f19917c);
        long j10 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f19918d);
        long j11 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f19919e);
        long j12 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f19920f);
        long j13 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f19921g);
        long j14 = doubleToLongBits7 ^ (doubleToLongBits7 >>> 32);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f19922h);
        long j15 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f19923i);
        return (((((((((((((((((int) j8) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f19911j)) {
            return "Rotate 0°";
        }
        if (equals(f19912k)) {
            return "Rotate 90°";
        }
        if (equals(f19913l)) {
            return "Rotate 180°";
        }
        if (equals(f19914m)) {
            return "Rotate 270°";
        }
        double d8 = this.f19915a;
        double d9 = this.f19916b;
        double d10 = this.f19917c;
        double d11 = this.f19918d;
        double d12 = this.f19919e;
        double d13 = this.f19920f;
        double d14 = this.f19921g;
        double d15 = this.f19922h;
        double d16 = this.f19923i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d8);
        sb.append(", v=");
        sb.append(d9);
        sb.append(", w=");
        sb.append(d10);
        sb.append(", a=");
        sb.append(d11);
        sb.append(", b=");
        sb.append(d12);
        sb.append(", c=");
        sb.append(d13);
        sb.append(", d=");
        sb.append(d14);
        sb.append(", tx=");
        sb.append(d15);
        sb.append(", ty=");
        sb.append(d16);
        sb.append("}");
        return sb.toString();
    }
}
