package T5;

import J6.r;

/* loaded from: classes2.dex */
public abstract class j {
    public static final Throwable a(Throwable th, Throwable th2) {
        Throwable e8;
        r.e(th, "<this>");
        if (th2 == null || r.a(th.getCause(), th2) || (e8 = io.ktor.utils.io.n.e(th, th2)) == null) {
            return th;
        }
        e8.setStackTrace(th.getStackTrace());
        return e8;
    }
}
