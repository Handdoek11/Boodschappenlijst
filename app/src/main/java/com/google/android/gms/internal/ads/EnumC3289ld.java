package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3289ld implements Su0 {
    CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
    TWO_G(1),
    THREE_G(2),
    LTE(4);


    /* renamed from: w, reason: collision with root package name */
    private static final Tu0 f24355w = new Tu0() { // from class: com.google.android.gms.internal.ads.ld.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f24357o;

    EnumC3289ld(int i8) {
        this.f24357o = i8;
    }

    public static EnumC3289ld a(int i8) {
        if (i8 == 0) {
            return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
        }
        if (i8 == 1) {
            return TWO_G;
        }
        if (i8 == 2) {
            return THREE_G;
        }
        if (i8 != 4) {
            return null;
        }
        return LTE;
    }

    public static Uu0 c() {
        return C3398md.f24543a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        return this.f24357o;
    }
}
