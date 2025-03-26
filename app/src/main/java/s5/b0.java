package s5;

import com.google.protobuf.h;

/* loaded from: classes2.dex */
public enum b0 {
    POPULATION_NONE(0, 0),
    POPULATION_A(1, 1),
    POPULATION_B(2, 2);


    /* renamed from: v, reason: collision with root package name */
    private static h.a f43074v = new h.a() { // from class: s5.b0.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43076o;

    b0(int i8, int i9) {
        this.f43076o = i9;
    }

    public static b0 c(int i8) {
        if (i8 == 0) {
            return POPULATION_NONE;
        }
        if (i8 == 1) {
            return POPULATION_A;
        }
        if (i8 != 2) {
            return null;
        }
        return POPULATION_B;
    }

    public final int e() {
        return this.f43076o;
    }
}
