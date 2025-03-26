package s5;

import com.google.protobuf.h;

/* loaded from: classes2.dex */
public enum E {
    UNKNOWN_EXPERIMENT(0, 0),
    NULL_EXPERIMENT(1, 1),
    START_IN_SHOPPING_LIST(2, 2),
    NO_WELCOME_OR_TOUR(3, 3),
    NO_TOUR(4, 4),
    DELAY_EXTERNAL_ADS(5, 5),
    START_IN_SHOPPING_LIST_2(6, 6),
    SEEDED_ITEM_PHOTOS(7, 7),
    SIMPLE_WELCOME_SCREEN(8, 8);


    /* renamed from: B, reason: collision with root package name */
    private static h.a f42781B = new h.a() { // from class: s5.E.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f42791o;

    E(int i8, int i9) {
        this.f42791o = i9;
    }

    public static E c(int i8) {
        switch (i8) {
            case 0:
                return UNKNOWN_EXPERIMENT;
            case 1:
                return NULL_EXPERIMENT;
            case 2:
                return START_IN_SHOPPING_LIST;
            case 3:
                return NO_WELCOME_OR_TOUR;
            case 4:
                return NO_TOUR;
            case 5:
                return DELAY_EXTERNAL_ADS;
            case 6:
                return START_IN_SHOPPING_LIST_2;
            case 7:
                return SEEDED_ITEM_PHOTOS;
            case 8:
                return SIMPLE_WELCOME_SCREEN;
            default:
                return null;
        }
    }

    public final int e() {
        return this.f42791o;
    }
}
