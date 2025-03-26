package m6;

import a6.InterfaceC0830g;
import e6.AbstractC5751a;
import g6.EnumC5815c;
import h6.AbstractC5844b;
import i6.InterfaceC5876a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class p {

    public static final class a extends AtomicInteger implements InterfaceC5876a, Runnable {

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39356o;

        /* renamed from: s, reason: collision with root package name */
        final Object f39357s;

        public a(a6.i iVar, Object obj) {
            this.f39356o = iVar;
            this.f39357s = obj;
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            set(3);
        }

        @Override // i6.InterfaceC5880e
        public void clear() {
            lazySet(3);
        }

        @Override // i6.InterfaceC5880e
        public Object f() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f39357s;
        }

        @Override // i6.InterfaceC5880e
        public boolean g(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // i6.InterfaceC5877b
        public int i(int i8) {
            if ((i8 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // i6.InterfaceC5880e
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f39356o.b(this.f39357s);
                if (get() == 2) {
                    lazySet(3);
                    this.f39356o.a();
                }
            }
        }
    }

    public static boolean a(InterfaceC0830g interfaceC0830g, a6.i iVar, f6.g gVar) {
        if (!(interfaceC0830g instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) interfaceC0830g).call();
            if (call == null) {
                EnumC5815c.a(iVar);
                return true;
            }
            try {
                InterfaceC0830g interfaceC0830g2 = (InterfaceC0830g) AbstractC5844b.e(gVar.apply(call), "The mapper returned a null ObservableSource");
                if (interfaceC0830g2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) interfaceC0830g2).call();
                        if (call2 == null) {
                            EnumC5815c.a(iVar);
                            return true;
                        }
                        a aVar = new a(iVar, call2);
                        iVar.d(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        AbstractC5751a.b(th);
                        EnumC5815c.h(th, iVar);
                        return true;
                    }
                } else {
                    interfaceC0830g2.c(iVar);
                }
                return true;
            } catch (Throwable th2) {
                AbstractC5751a.b(th2);
                EnumC5815c.h(th2, iVar);
                return true;
            }
        } catch (Throwable th3) {
            AbstractC5751a.b(th3);
            EnumC5815c.h(th3, iVar);
            return true;
        }
    }
}
