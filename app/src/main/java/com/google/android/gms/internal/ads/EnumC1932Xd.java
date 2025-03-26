package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1932Xd implements Su0 {
    UNSPECIFIED(0),
    IN_MEMORY(1);


    /* renamed from: u, reason: collision with root package name */
    private static final Tu0 f20102u = new Tu0() { // from class: com.google.android.gms.internal.ads.Xd.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f20104o;

    EnumC1932Xd(int i8) {
        this.f20104o = i8;
    }

    public static EnumC1932Xd a(int i8) {
        if (i8 == 0) {
            return UNSPECIFIED;
        }
        if (i8 != 1) {
            return null;
        }
        return IN_MEMORY;
    }

    public static Uu0 c() {
        return C1967Yd.f20295a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        return this.f20104o;
    }
}
