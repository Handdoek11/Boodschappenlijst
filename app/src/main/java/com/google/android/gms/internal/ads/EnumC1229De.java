package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.De, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1229De implements Su0 {
    PLATFORM_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2);


    /* renamed from: v, reason: collision with root package name */
    private static final Tu0 f14531v = new Tu0() { // from class: com.google.android.gms.internal.ads.De.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f14533o;

    EnumC1229De(int i8) {
        this.f14533o = i8;
    }

    public static EnumC1229De a(int i8) {
        if (i8 == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i8 == 1) {
            return IOS;
        }
        if (i8 != 2) {
            return null;
        }
        return ANDROID;
    }

    public static Uu0 c() {
        return C1265Ee.f14755a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        return this.f14533o;
    }
}
