package U6;

import Z6.AbstractC0794h;
import x6.AbstractC6923e;

/* loaded from: classes2.dex */
public abstract class K {
    public static final void a(A6.g gVar, Throwable th) {
        try {
            J j8 = (J) gVar.d(J.f5406c);
            if (j8 != null) {
                j8.N(gVar, th);
            } else {
                AbstractC0794h.a(gVar, th);
            }
        } catch (Throwable th2) {
            AbstractC0794h.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC6923e.a(runtimeException, th);
        return runtimeException;
    }
}
