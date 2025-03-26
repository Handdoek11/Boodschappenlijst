package s5;

import com.google.protobuf.h;

/* renamed from: s5.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC6746l {
    AC_LEAVE(0, 0),
    AC_ASK(1, 1),
    AC_GUESS(2, 2);


    /* renamed from: v, reason: collision with root package name */
    private static h.a f43332v = new h.a() { // from class: s5.l.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43334o;

    EnumC6746l(int i8, int i9) {
        this.f43334o = i9;
    }

    public static EnumC6746l c(int i8) {
        if (i8 == 0) {
            return AC_LEAVE;
        }
        if (i8 == 1) {
            return AC_ASK;
        }
        if (i8 != 2) {
            return null;
        }
        return AC_GUESS;
    }

    public final int e() {
        return this.f43334o;
    }
}
