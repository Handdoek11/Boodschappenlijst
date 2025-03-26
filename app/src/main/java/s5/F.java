package s5;

import com.google.protobuf.h;

/* loaded from: classes2.dex */
public enum F {
    EA_UNKNOWN(0, 0),
    EA_MONTHLY(1, 1),
    EA_YEARLY(2, 2),
    EA_CANCEL(3, 3);


    /* renamed from: w, reason: collision with root package name */
    private static h.a f42796w = new h.a() { // from class: s5.F.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f42798o;

    F(int i8, int i9) {
        this.f42798o = i9;
    }

    public static F c(int i8) {
        if (i8 == 0) {
            return EA_UNKNOWN;
        }
        if (i8 == 1) {
            return EA_MONTHLY;
        }
        if (i8 == 2) {
            return EA_YEARLY;
        }
        if (i8 != 3) {
            return null;
        }
        return EA_CANCEL;
    }

    public final int e() {
        return this.f42798o;
    }
}
