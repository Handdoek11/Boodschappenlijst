package s5;

import com.google.protobuf.h;

/* loaded from: classes2.dex */
public enum r0 {
    STAR_NONE(0, 0),
    STAR_YELLOW(1, 1);


    /* renamed from: u, reason: collision with root package name */
    private static h.a f43495u = new h.a() { // from class: s5.r0.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43497o;

    r0(int i8, int i9) {
        this.f43497o = i9;
    }

    public static r0 c(int i8) {
        if (i8 == 0) {
            return STAR_NONE;
        }
        if (i8 != 1) {
            return null;
        }
        return STAR_YELLOW;
    }

    public final int e() {
        return this.f43497o;
    }
}
