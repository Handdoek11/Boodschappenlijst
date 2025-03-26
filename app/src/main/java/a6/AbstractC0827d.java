package a6;

import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import f6.InterfaceC5793a;
import h6.AbstractC5843a;
import h6.AbstractC5844b;
import l6.C6180a;
import t6.AbstractC6805a;

/* renamed from: a6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0827d {
    public final InterfaceC5732b a(f6.d dVar) {
        return b(dVar, AbstractC5843a.f36267f, AbstractC5843a.f36264c);
    }

    public final InterfaceC5732b b(f6.d dVar, f6.d dVar2, InterfaceC5793a interfaceC5793a) {
        AbstractC5844b.e(dVar, "onSuccess is null");
        AbstractC5844b.e(dVar2, "onError is null");
        AbstractC5844b.e(interfaceC5793a, "onComplete is null");
        return (InterfaceC5732b) e(new C6180a(dVar, dVar2, interfaceC5793a));
    }

    public final void c(InterfaceC0828e interfaceC0828e) {
        AbstractC5844b.e(interfaceC0828e, "observer is null");
        InterfaceC0828e p8 = AbstractC6805a.p(this, interfaceC0828e);
        AbstractC5844b.e(p8, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            d(p8);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th) {
            AbstractC5751a.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void d(InterfaceC0828e interfaceC0828e);

    public final InterfaceC0828e e(InterfaceC0828e interfaceC0828e) {
        c(interfaceC0828e);
        return interfaceC0828e;
    }
}
