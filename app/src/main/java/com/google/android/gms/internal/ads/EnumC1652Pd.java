package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1652Pd implements Su0 {
    VIDEO_ERROR_CODE_UNSPECIFIED(0),
    OPENGL_RENDERING_FAILED(1),
    CACHE_LOAD_FAILED(2),
    ANDROID_TARGET_API_TOO_LOW(3);


    /* renamed from: w, reason: collision with root package name */
    private static final Tu0 f18233w = new Tu0() { // from class: com.google.android.gms.internal.ads.Pd.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f18235o;

    EnumC1652Pd(int i8) {
        this.f18235o = i8;
    }

    public static EnumC1652Pd a(int i8) {
        if (i8 == 0) {
            return VIDEO_ERROR_CODE_UNSPECIFIED;
        }
        if (i8 == 1) {
            return OPENGL_RENDERING_FAILED;
        }
        if (i8 == 2) {
            return CACHE_LOAD_FAILED;
        }
        if (i8 != 3) {
            return null;
        }
        return ANDROID_TARGET_API_TOO_LOW;
    }

    public static Uu0 c() {
        return C1687Qd.f18512a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        return this.f18235o;
    }
}
