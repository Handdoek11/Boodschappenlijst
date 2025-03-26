package s5;

import com.google.protobuf.h;

/* loaded from: classes2.dex */
public enum c0 {
    PS_UNSPECIFIED(0, 0),
    PS_PURCHASED(1, 1),
    PS_PENDING(2, 2);


    /* renamed from: v, reason: collision with root package name */
    private static h.a f43086v = new h.a() { // from class: s5.c0.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43088o;

    c0(int i8, int i9) {
        this.f43088o = i9;
    }

    public static c0 c(int i8) {
        if (i8 == 0) {
            return PS_UNSPECIFIED;
        }
        if (i8 == 1) {
            return PS_PURCHASED;
        }
        if (i8 != 2) {
            return null;
        }
        return PS_PENDING;
    }

    public final int e() {
        return this.f43088o;
    }
}
