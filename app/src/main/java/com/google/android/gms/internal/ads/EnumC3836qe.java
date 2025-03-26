package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3836qe implements Su0 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* renamed from: D, reason: collision with root package name */
    private static final Tu0 f25967D = new Tu0() { // from class: com.google.android.gms.internal.ads.qe.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f25977o;

    EnumC3836qe(int i8) {
        this.f25977o = i8;
    }

    public static EnumC3836qe a(int i8) {
        switch (i8) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    public static Uu0 c() {
        return C3944re.f26204a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        return this.f25977o;
    }
}
