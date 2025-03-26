package Z6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Z6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0791e {

    /* renamed from: o, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6471o = AtomicReferenceFieldUpdater.newUpdater(AbstractC0791e.class, Object.class, "_next");

    /* renamed from: s, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6472s = AtomicReferenceFieldUpdater.newUpdater(AbstractC0791e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC0791e(AbstractC0791e abstractC0791e) {
        this._prev = abstractC0791e;
    }

    private final AbstractC0791e c() {
        AbstractC0791e g8 = g();
        while (g8 != null && g8.h()) {
            g8 = (AbstractC0791e) f6472s.get(g8);
        }
        return g8;
    }

    private final AbstractC0791e d() {
        AbstractC0791e e8 = e();
        J6.r.b(e8);
        while (e8.h()) {
            AbstractC0791e e9 = e8.e();
            if (e9 == null) {
                return e8;
            }
            e8 = e9;
        }
        return e8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return f6471o.get(this);
    }

    public final void b() {
        f6472s.lazySet(this, null);
    }

    public final AbstractC0791e e() {
        Object f8 = f();
        if (f8 == AbstractC0790d.f6470a) {
            return null;
        }
        return (AbstractC0791e) f8;
    }

    public final AbstractC0791e g() {
        return (AbstractC0791e) f6472s.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return androidx.concurrent.futures.b.a(f6471o, this, null, AbstractC0790d.f6470a);
    }

    public final void k() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            AbstractC0791e c8 = c();
            AbstractC0791e d8 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6472s;
            do {
                obj = atomicReferenceFieldUpdater.get(d8);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, d8, obj, ((AbstractC0791e) obj) == null ? null : c8));
            if (c8 != null) {
                f6471o.set(c8, d8);
            }
            if (!d8.h() || d8.i()) {
                if (c8 == null || !c8.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(AbstractC0791e abstractC0791e) {
        return androidx.concurrent.futures.b.a(f6471o, this, null, abstractC0791e);
    }
}
