package s5;

import com.google.protobuf.h;

/* loaded from: classes2.dex */
public enum W {
    UNKNOWN_SCREEN(0, 0),
    WELCOME(1, 1),
    TOUR_1(2, 2),
    TOUR_2(3, 3),
    TOUR_3(4, 4),
    TOUR_4(5, 5),
    TOUR_5(6, 6),
    SIGN_IN(7, 7);


    /* renamed from: A, reason: collision with root package name */
    private static h.a f43019A = new h.a() { // from class: s5.W.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43029o;

    W(int i8, int i9) {
        this.f43029o = i9;
    }

    public static W c(int i8) {
        switch (i8) {
            case 0:
                return UNKNOWN_SCREEN;
            case 1:
                return WELCOME;
            case 2:
                return TOUR_1;
            case 3:
                return TOUR_2;
            case 4:
                return TOUR_3;
            case 5:
                return TOUR_4;
            case 6:
                return TOUR_5;
            case 7:
                return SIGN_IN;
            default:
                return null;
        }
    }

    public final int e() {
        return this.f43029o;
    }
}
