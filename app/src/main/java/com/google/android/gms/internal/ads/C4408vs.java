package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4408vs {

    /* renamed from: d, reason: collision with root package name */
    public static final C4408vs f27376d = new C4408vs(0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f27377a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27378b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27379c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public C4408vs(int i8, int i9, float f8) {
        this.f27377a = i8;
        this.f27378b = i9;
        this.f27379c = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4408vs) {
            C4408vs c4408vs = (C4408vs) obj;
            if (this.f27377a == c4408vs.f27377a && this.f27378b == c4408vs.f27378b && this.f27379c == c4408vs.f27379c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f27377a + 217) * 31) + this.f27378b) * 31) + Float.floatToRawIntBits(this.f27379c);
    }
}
