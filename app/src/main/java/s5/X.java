package s5;

import com.google.protobuf.h;

/* loaded from: classes2.dex */
public enum X {
    NOT_OFFERED(0, 0),
    IN_PROGRESS(1, 1),
    SKIPPED(2, 2),
    COMPLETED(3, 3);


    /* renamed from: w, reason: collision with root package name */
    private static h.a f43034w = new h.a() { // from class: s5.X.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43036o;

    X(int i8, int i9) {
        this.f43036o = i9;
    }

    public static X c(int i8) {
        if (i8 == 0) {
            return NOT_OFFERED;
        }
        if (i8 == 1) {
            return IN_PROGRESS;
        }
        if (i8 == 2) {
            return SKIPPED;
        }
        if (i8 != 3) {
            return null;
        }
        return COMPLETED;
    }

    public final int e() {
        return this.f43036o;
    }
}
