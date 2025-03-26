package s5;

import com.google.protobuf.h;

/* loaded from: classes2.dex */
public enum s0 {
    SUB_NONE(0, 0),
    SUB_MONTHLY(1, 1),
    SUB_YEARLY(2, 2);


    /* renamed from: v, reason: collision with root package name */
    private static h.a f43512v = new h.a() { // from class: s5.s0.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43514o;

    s0(int i8, int i9) {
        this.f43514o = i9;
    }

    public static s0 c(int i8) {
        if (i8 == 0) {
            return SUB_NONE;
        }
        if (i8 == 1) {
            return SUB_MONTHLY;
        }
        if (i8 != 2) {
            return null;
        }
        return SUB_YEARLY;
    }

    public final int e() {
        return this.f43514o;
    }
}
