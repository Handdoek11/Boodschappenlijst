package Z6;

import U6.Q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: o, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6491o = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next");

    /* renamed from: s, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6492s = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_prev");

    /* renamed from: t, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6493t = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public static abstract class a extends AbstractC0788b {

        /* renamed from: b, reason: collision with root package name */
        public final p f6494b;

        /* renamed from: c, reason: collision with root package name */
        public p f6495c;

        public a(p pVar) {
            this.f6494b = pVar;
        }

        @Override // Z6.AbstractC0788b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(p pVar, Object obj) {
            boolean z7 = obj == null;
            p pVar2 = z7 ? this.f6494b : this.f6495c;
            if (pVar2 != null && androidx.concurrent.futures.b.a(p.f6491o, pVar, this, pVar2) && z7) {
                p pVar3 = this.f6494b;
                p pVar4 = this.f6495c;
                J6.r.b(pVar4);
                pVar3.m(pVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (androidx.concurrent.futures.b.a(r4, r3, r2, ((Z6.y) r5).f6511a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Z6.p k(Z6.x r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Z6.p.f6492s
            java.lang.Object r0 = r0.get(r8)
            Z6.p r0 = (Z6.p) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = Z6.p.f6491o
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Z6.p.f6492s
            boolean r0 = androidx.concurrent.futures.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.q()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof Z6.x
            if (r6 == 0) goto L34
            Z6.x r5 = (Z6.x) r5
            r5.a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof Z6.y
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            Z6.y r5 = (Z6.y) r5
            Z6.p r5 = r5.f6511a
            boolean r2 = androidx.concurrent.futures.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = Z6.p.f6492s
            java.lang.Object r2 = r4.get(r2)
            Z6.p r2 = (Z6.p) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            J6.r.c(r5, r3)
            r3 = r5
            Z6.p r3 = (Z6.p) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Z6.p.k(Z6.x):Z6.p");
    }

    private final p l(p pVar) {
        while (pVar.q()) {
            pVar = (p) f6492s.get(pVar);
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(p pVar) {
        p pVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6492s;
        do {
            pVar2 = (p) atomicReferenceFieldUpdater.get(pVar);
            if (n() != pVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f6492s, pVar, pVar2, this));
        if (q()) {
            pVar.k(null);
        }
    }

    private final y t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6493t;
        y yVar = (y) atomicReferenceFieldUpdater.get(this);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this);
        atomicReferenceFieldUpdater.lazySet(this, yVar2);
        return yVar2;
    }

    public final boolean j(p pVar) {
        f6492s.lazySet(pVar, this);
        f6491o.lazySet(pVar, this);
        while (n() == this) {
            if (androidx.concurrent.futures.b.a(f6491o, this, this, pVar)) {
                pVar.m(this);
                return true;
            }
        }
        return false;
    }

    public final Object n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6491o;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof x)) {
                return obj;
            }
            ((x) obj).a(this);
        }
    }

    public final p o() {
        return o.b(n());
    }

    public final p p() {
        p k8 = k(null);
        return k8 == null ? l((p) f6492s.get(this)) : k8;
    }

    public boolean q() {
        return n() instanceof y;
    }

    public boolean r() {
        return s() == null;
    }

    public final p s() {
        Object n8;
        p pVar;
        do {
            n8 = n();
            if (n8 instanceof y) {
                return ((y) n8).f6511a;
            }
            if (n8 == this) {
                return (p) n8;
            }
            J6.r.c(n8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            pVar = (p) n8;
        } while (!androidx.concurrent.futures.b.a(f6491o, this, n8, pVar.t()));
        pVar.k(null);
        return null;
    }

    public String toString() {
        return new J6.z(this) { // from class: Z6.p.b
            @Override // Q6.g
            public Object get() {
                return Q.a(this.f3564s);
            }
        } + '@' + Q.b(this);
    }

    public final int u(p pVar, p pVar2, a aVar) {
        f6492s.lazySet(pVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6491o;
        atomicReferenceFieldUpdater.lazySet(pVar, pVar2);
        aVar.f6495c = pVar2;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, pVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
