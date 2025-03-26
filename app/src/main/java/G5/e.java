package G5;

import J6.r;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public abstract class e {
    public static final Throwable a(Throwable th) {
        r.e(th, "<this>");
        Throwable th2 = th;
        while (th2 instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) th2;
            if (r.a(th2, cancellationException.getCause())) {
                return th;
            }
            th2 = cancellationException.getCause();
        }
        return th2 == null ? th : th2;
    }
}
