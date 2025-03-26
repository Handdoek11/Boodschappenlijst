package U6;

import Z6.C0795i;
import x6.C6916E;
import x6.C6934p;

/* renamed from: U6.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0704a0 {
    public static final void a(Z z7, int i8) {
        A6.d d8 = z7.d();
        boolean z8 = i8 == 4;
        if (z8 || !(d8 instanceof C0795i) || b(i8) != b(z7.f5432t)) {
            d(z7, d8, z8);
            return;
        }
        I i9 = ((C0795i) d8).f6476u;
        A6.g context = d8.getContext();
        if (i9.x0(context)) {
            i9.q0(context, z7);
        } else {
            e(z7);
        }
    }

    public static final boolean b(int i8) {
        return i8 == 1 || i8 == 2;
    }

    public static final boolean c(int i8) {
        return i8 == 2;
    }

    public static final void d(Z z7, A6.d dVar, boolean z8) {
        Object f8;
        Object h8 = z7.h();
        Throwable e8 = z7.e(h8);
        if (e8 != null) {
            C6934p.a aVar = C6934p.f44487s;
            f8 = x6.q.a(e8);
        } else {
            C6934p.a aVar2 = C6934p.f44487s;
            f8 = z7.f(h8);
        }
        Object b8 = C6934p.b(f8);
        if (!z8) {
            dVar.resumeWith(b8);
            return;
        }
        J6.r.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C0795i c0795i = (C0795i) dVar;
        A6.d dVar2 = c0795i.f6477v;
        Object obj = c0795i.f6479x;
        A6.g context = dVar2.getContext();
        Object c8 = Z6.I.c(context, obj);
        U0 g8 = c8 != Z6.I.f6454a ? H.g(dVar2, context, c8) : null;
        try {
            c0795i.f6477v.resumeWith(b8);
            C6916E c6916e = C6916E.f44463a;
        } finally {
            if (g8 == null || g8.Z0()) {
                Z6.I.a(context, c8);
            }
        }
    }

    private static final void e(Z z7) {
        AbstractC0714f0 b8 = S0.f5422a.b();
        if (b8.H0()) {
            b8.D0(z7);
            return;
        }
        b8.F0(true);
        try {
            d(z7, z7.d(), true);
            do {
            } while (b8.K0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
