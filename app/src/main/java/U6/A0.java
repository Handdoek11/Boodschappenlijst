package U6;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class A0 {
    public static final A a(InterfaceC0745v0 interfaceC0745v0) {
        return new C0749x0(interfaceC0745v0);
    }

    public static /* synthetic */ A b(InterfaceC0745v0 interfaceC0745v0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC0745v0 = null;
        }
        return AbstractC0751y0.a(interfaceC0745v0);
    }

    public static final void c(A6.g gVar, CancellationException cancellationException) {
        InterfaceC0745v0 interfaceC0745v0 = (InterfaceC0745v0) gVar.d(InterfaceC0745v0.f5485d);
        if (interfaceC0745v0 != null) {
            interfaceC0745v0.l0(cancellationException);
        }
    }

    public static final void d(InterfaceC0745v0 interfaceC0745v0, String str, Throwable th) {
        interfaceC0745v0.l0(AbstractC0724k0.a(str, th));
    }

    public static /* synthetic */ void e(A6.g gVar, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC0751y0.c(gVar, cancellationException);
    }

    public static final void f(A6.g gVar) {
        InterfaceC0745v0 interfaceC0745v0 = (InterfaceC0745v0) gVar.d(InterfaceC0745v0.f5485d);
        if (interfaceC0745v0 != null) {
            AbstractC0751y0.h(interfaceC0745v0);
        }
    }

    public static final void g(InterfaceC0745v0 interfaceC0745v0) {
        if (!interfaceC0745v0.h()) {
            throw interfaceC0745v0.A();
        }
    }

    public static final InterfaceC0745v0 h(A6.g gVar) {
        InterfaceC0745v0 interfaceC0745v0 = (InterfaceC0745v0) gVar.d(InterfaceC0745v0.f5485d);
        if (interfaceC0745v0 != null) {
            return interfaceC0745v0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }
}
