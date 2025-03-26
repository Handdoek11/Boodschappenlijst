package s5;

import com.google.protobuf.h;

/* renamed from: s5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC6743i {
    ADMOB(0, 0),
    APP_RELATED(1, 1),
    APP_RELATED_BANNER(2, 2),
    PDN(3, 3),
    MOPUB(4, 4),
    VALID_MEDIA(5, 5),
    HOUSE(6, 6),
    AD_ADAPTED(7, 7),
    FLIPP(8, 8),
    GAM(9, 9);


    /* renamed from: C, reason: collision with root package name */
    private static h.a f43247C = new h.a() { // from class: s5.i.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43257o;

    EnumC6743i(int i8, int i9) {
        this.f43257o = i9;
    }

    public static EnumC6743i c(int i8) {
        switch (i8) {
            case 0:
                return ADMOB;
            case 1:
                return APP_RELATED;
            case 2:
                return APP_RELATED_BANNER;
            case 3:
                return PDN;
            case 4:
                return MOPUB;
            case 5:
                return VALID_MEDIA;
            case 6:
                return HOUSE;
            case 7:
                return AD_ADAPTED;
            case 8:
                return FLIPP;
            case 9:
                return GAM;
            default:
                return null;
        }
    }

    public final int e() {
        return this.f43257o;
    }
}
