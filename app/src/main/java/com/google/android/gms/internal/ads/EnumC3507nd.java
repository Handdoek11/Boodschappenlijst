package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3507nd implements Su0 {
    NETWORKTYPE_UNSPECIFIED(0),
    CELL(1),
    WIFI(2);


    /* renamed from: v, reason: collision with root package name */
    private static final Tu0 f25009v = new Tu0() { // from class: com.google.android.gms.internal.ads.nd.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f25011o;

    EnumC3507nd(int i8) {
        this.f25011o = i8;
    }

    public static EnumC3507nd a(int i8) {
        if (i8 == 0) {
            return NETWORKTYPE_UNSPECIFIED;
        }
        if (i8 == 1) {
            return CELL;
        }
        if (i8 != 2) {
            return null;
        }
        return WIFI;
    }

    public static Uu0 c() {
        return C3616od.f25239a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        return this.f25011o;
    }
}
