package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.nc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3505nc {

    /* renamed from: e, reason: collision with root package name */
    public static final C3505nc f25000e = new C3505nc(null, new C2031a[0], 0, -9223372036854775807L, 0);

    /* renamed from: f, reason: collision with root package name */
    private static final C2031a f25001f = new C2031a(0).b(0);

    /* renamed from: d, reason: collision with root package name */
    private final C2031a[] f25005d;

    /* renamed from: b, reason: collision with root package name */
    public final long f25003b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f25002a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f25004c = 0;

    static {
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    private C3505nc(Object obj, C2031a[] c2031aArr, long j8, long j9, int i8) {
        this.f25005d = c2031aArr;
    }

    public final C2031a a(int i8) {
        return i8 < 0 ? f25001f : this.f25005d[i8];
    }

    public final boolean b(int i8) {
        a(-1);
        int i9 = C2031a.f20602i;
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3505nc.class == obj.getClass() && Arrays.equals(this.f25005d, ((C3505nc) obj).f25005d);
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f25005d);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
