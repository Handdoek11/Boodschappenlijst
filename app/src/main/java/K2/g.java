package k2;

/* loaded from: classes.dex */
public abstract class g {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static g a() {
        return new C6096b(a.FATAL_ERROR, -1L);
    }

    public static g d() {
        return new C6096b(a.INVALID_PAYLOAD, -1L);
    }

    public static g e(long j8) {
        return new C6096b(a.OK, j8);
    }

    public static g f() {
        return new C6096b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
