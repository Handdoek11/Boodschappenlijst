package N5;

/* loaded from: classes2.dex */
public abstract class x {
    public static final Throwable a(Throwable th) {
        J6.r.e(th, "<this>");
        while (true) {
            if ((th != null ? th.getCause() : null) == null) {
                return th;
            }
            th = th.getCause();
        }
    }
}
