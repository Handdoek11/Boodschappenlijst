package U6;

import Z6.C0792f;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public abstract class N {
    public static final M a(A6.g gVar) {
        if (gVar.d(InterfaceC0745v0.f5485d) == null) {
            gVar = gVar.u(A0.b(null, 1, null));
        }
        return new C0792f(gVar);
    }

    public static final void b(M m8, String str, Throwable th) {
        c(m8, AbstractC0724k0.a(str, th));
    }

    public static final void c(M m8, CancellationException cancellationException) {
        InterfaceC0745v0 interfaceC0745v0 = (InterfaceC0745v0) m8.getCoroutineContext().d(InterfaceC0745v0.f5485d);
        if (interfaceC0745v0 != null) {
            interfaceC0745v0.l0(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + m8).toString());
    }

    public static /* synthetic */ void d(M m8, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        c(m8, cancellationException);
    }

    public static final Object e(I6.p pVar, A6.d dVar) {
        Z6.A a8 = new Z6.A(dVar.getContext(), dVar);
        Object b8 = a7.b.b(a8, a8, pVar);
        if (b8 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b8;
    }

    public static final void f(M m8) {
        AbstractC0751y0.g(m8.getCoroutineContext());
    }
}
