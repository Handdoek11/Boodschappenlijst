package c0;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0971c {
    public static final long a(int i8, int i9, int i10, int i11) {
        if (i9 < i8) {
            throw new IllegalArgumentException(("maxWidth(" + i9 + ") must be >= than minWidth(" + i8 + ')').toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("maxHeight(" + i11 + ") must be >= than minHeight(" + i10 + ')').toString());
        }
        if (i8 >= 0 && i10 >= 0) {
            return C0970b.f12070b.b(i8, i9, i10, i11);
        }
        throw new IllegalArgumentException(("minWidth(" + i8 + ") and minHeight(" + i10 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long b(int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = 0;
        }
        if ((i12 & 2) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return a(i8, i9, i10, i11);
    }
}
