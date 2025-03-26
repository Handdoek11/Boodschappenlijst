package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ge, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1337Ge implements Su0 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);


    /* renamed from: v, reason: collision with root package name */
    private static final Tu0 f15419v = new Tu0() { // from class: com.google.android.gms.internal.ads.Ge.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f15421o;

    EnumC1337Ge(int i8) {
        this.f15421o = i8;
    }

    public static EnumC1337Ge a(int i8) {
        if (i8 == 0) {
            return ENUM_FALSE;
        }
        if (i8 == 1) {
            return ENUM_TRUE;
        }
        if (i8 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static Uu0 c() {
        return C1373He.f15762a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        return this.f15421o;
    }
}
