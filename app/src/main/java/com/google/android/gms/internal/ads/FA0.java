package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class FA0 {

    /* renamed from: c, reason: collision with root package name */
    public static final FA0 f15095c;

    /* renamed from: d, reason: collision with root package name */
    public static final FA0 f15096d;

    /* renamed from: a, reason: collision with root package name */
    public final long f15097a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15098b;

    static {
        FA0 fa0 = new FA0(0L, 0L);
        f15095c = fa0;
        new FA0(Long.MAX_VALUE, Long.MAX_VALUE);
        new FA0(Long.MAX_VALUE, 0L);
        new FA0(0L, Long.MAX_VALUE);
        f15096d = fa0;
    }

    public FA0(long j8, long j9) {
        AbstractC3796qC.d(j8 >= 0);
        AbstractC3796qC.d(j9 >= 0);
        this.f15097a = j8;
        this.f15098b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FA0.class == obj.getClass()) {
            FA0 fa0 = (FA0) obj;
            if (this.f15097a == fa0.f15097a && this.f15098b == fa0.f15098b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f15097a) * 31) + ((int) this.f15098b);
    }
}
