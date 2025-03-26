package X6;

import J6.r;
import U6.C0733p;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x6.C6916E;
import x6.C6934p;

/* loaded from: classes2.dex */
final class p extends Y6.c {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6039a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state");
    private volatile Object _state;

    @Override // Y6.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(n nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6039a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, o.f6037a);
        return true;
    }

    public final Object e(A6.d dVar) {
        C0733p c0733p = new C0733p(B6.b.c(dVar), 1);
        c0733p.C();
        if (!androidx.concurrent.futures.b.a(f6039a, this, o.f6037a, c0733p)) {
            C6934p.a aVar = C6934p.f44487s;
            c0733p.resumeWith(C6934p.b(C6916E.f44463a));
        }
        Object z7 = c0733p.z();
        if (z7 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z7 == B6.b.e() ? z7 : C6916E.f44463a;
    }

    @Override // Y6.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public A6.d[] b(n nVar) {
        f6039a.set(this, null);
        return Y6.b.f6140a;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6039a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == o.f6038b) {
                return;
            }
            if (obj == o.f6037a) {
                if (androidx.concurrent.futures.b.a(f6039a, this, obj, o.f6038b)) {
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f6039a, this, obj, o.f6037a)) {
                C6934p.a aVar = C6934p.f44487s;
                ((C0733p) obj).resumeWith(C6934p.b(C6916E.f44463a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = f6039a.getAndSet(this, o.f6037a);
        r.b(andSet);
        return andSet == o.f6038b;
    }
}
