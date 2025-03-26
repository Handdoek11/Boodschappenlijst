package s5;

import com.google.protobuf.h;

/* loaded from: classes2.dex */
public enum Q {
    UNKNOWN(0, 100),
    SHOPPING(1, 0),
    MASTER(2, 1),
    RECIPE(3, 2),
    CATEGORY(4, 3);


    /* renamed from: x, reason: collision with root package name */
    private static h.a f42974x = new h.a() { // from class: s5.Q.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f42976o;

    Q(int i8, int i9) {
        this.f42976o = i9;
    }

    public static Q c(int i8) {
        if (i8 == 0) {
            return SHOPPING;
        }
        if (i8 == 1) {
            return MASTER;
        }
        if (i8 == 2) {
            return RECIPE;
        }
        if (i8 == 3) {
            return CATEGORY;
        }
        if (i8 != 100) {
            return null;
        }
        return UNKNOWN;
    }

    public final int e() {
        return this.f42976o;
    }
}
