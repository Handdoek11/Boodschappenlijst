package Z6;

import java.util.Iterator;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import x6.AbstractC6923e;

/* renamed from: Z6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0794h {
    public static final void a(A6.g gVar, Throwable th) {
        Iterator it = AbstractC0793g.a().iterator();
        while (it.hasNext()) {
            try {
                ((U6.J) it.next()).N(gVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                AbstractC0793g.b(U6.K.b(th, th2));
            }
        }
        try {
            AbstractC6923e.a(th, new DiagnosticCoroutineContextException(gVar));
        } catch (Throwable unused2) {
        }
        AbstractC0793g.b(th);
    }
}
