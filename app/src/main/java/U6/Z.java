package U6;

import Z6.C0795i;
import java.util.concurrent.CancellationException;
import x6.AbstractC6923e;
import x6.C6916E;
import x6.C6934p;

/* loaded from: classes2.dex */
public abstract class Z extends b7.h {

    /* renamed from: t, reason: collision with root package name */
    public int f5432t;

    public Z(int i8) {
        this.f5432t = i8;
    }

    public abstract void a(Object obj, Throwable th);

    public abstract A6.d d();

    public Throwable e(Object obj) {
        C c8 = obj instanceof C ? (C) obj : null;
        if (c8 != null) {
            return c8.f5374a;
        }
        return null;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC6923e.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        J6.r.b(th);
        K.a(d().getContext(), new P("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object b8;
        Object b9;
        b7.i iVar = this.f12051s;
        try {
            A6.d d8 = d();
            J6.r.c(d8, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C0795i c0795i = (C0795i) d8;
            A6.d dVar = c0795i.f6477v;
            Object obj = c0795i.f6479x;
            A6.g context = dVar.getContext();
            Object c8 = Z6.I.c(context, obj);
            U0 g8 = c8 != Z6.I.f6454a ? H.g(dVar, context, c8) : null;
            try {
                A6.g context2 = dVar.getContext();
                Object h8 = h();
                Throwable e8 = e(h8);
                InterfaceC0745v0 interfaceC0745v0 = (e8 == null && AbstractC0704a0.b(this.f5432t)) ? (InterfaceC0745v0) context2.d(InterfaceC0745v0.f5485d) : null;
                if (interfaceC0745v0 != null && !interfaceC0745v0.h()) {
                    CancellationException A7 = interfaceC0745v0.A();
                    a(h8, A7);
                    C6934p.a aVar = C6934p.f44487s;
                    dVar.resumeWith(C6934p.b(x6.q.a(A7)));
                } else if (e8 != null) {
                    C6934p.a aVar2 = C6934p.f44487s;
                    dVar.resumeWith(C6934p.b(x6.q.a(e8)));
                } else {
                    C6934p.a aVar3 = C6934p.f44487s;
                    dVar.resumeWith(C6934p.b(f(h8)));
                }
                C6916E c6916e = C6916E.f44463a;
                if (g8 == null || g8.Z0()) {
                    Z6.I.a(context, c8);
                }
                try {
                    iVar.a();
                    b9 = C6934p.b(C6916E.f44463a);
                } catch (Throwable th) {
                    C6934p.a aVar4 = C6934p.f44487s;
                    b9 = C6934p.b(x6.q.a(th));
                }
                g(null, C6934p.e(b9));
            } catch (Throwable th2) {
                if (g8 == null || g8.Z0()) {
                    Z6.I.a(context, c8);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                C6934p.a aVar5 = C6934p.f44487s;
                iVar.a();
                b8 = C6934p.b(C6916E.f44463a);
            } catch (Throwable th4) {
                C6934p.a aVar6 = C6934p.f44487s;
                b8 = C6934p.b(x6.q.a(th4));
            }
            g(th3, C6934p.e(b8));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
