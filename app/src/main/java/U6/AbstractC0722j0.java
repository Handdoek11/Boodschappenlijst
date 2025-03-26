package U6;

/* renamed from: U6.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0722j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Z6.E f5463a = new Z6.E("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    private static final Z6.E f5464b = new Z6.E("CLOSED_EMPTY");

    public static final long c(long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        if (j8 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j8;
    }
}
