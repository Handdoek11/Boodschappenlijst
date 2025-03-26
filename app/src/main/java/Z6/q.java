package Z6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6496a = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_cur");
    private volatile Object _cur;

    public q(boolean z7) {
        this._cur = new r(8, z7);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6496a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            int a8 = rVar.a(obj);
            if (a8 == 0) {
                return true;
            }
            if (a8 == 1) {
                androidx.concurrent.futures.b.a(f6496a, this, rVar, rVar.i());
            } else if (a8 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6496a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            if (rVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f6496a, this, rVar, rVar.i());
            }
        }
    }

    public final int c() {
        return ((r) f6496a.get(this)).f();
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6496a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            Object j8 = rVar.j();
            if (j8 != r.f6500h) {
                return j8;
            }
            androidx.concurrent.futures.b.a(f6496a, this, rVar, rVar.i());
        }
    }
}
