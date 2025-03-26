package U6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x6.C6916E;
import x6.C6934p;

/* renamed from: U6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0711e {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f5440b = AtomicIntegerFieldUpdater.newUpdater(C0711e.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    private final U[] f5441a;
    private volatile int notCompletedCount;

    /* renamed from: U6.e$a */
    private final class a extends B0 {

        /* renamed from: y, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f5442y = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
        private volatile Object _disposer;

        /* renamed from: v, reason: collision with root package name */
        private final InterfaceC0731o f5443v;

        /* renamed from: w, reason: collision with root package name */
        public InterfaceC0708c0 f5444w;

        public a(InterfaceC0731o interfaceC0731o) {
            this.f5443v = interfaceC0731o;
        }

        public final void A(b bVar) {
            f5442y.set(this, bVar);
        }

        public final void B(InterfaceC0708c0 interfaceC0708c0) {
            this.f5444w = interfaceC0708c0;
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            v((Throwable) obj);
            return C6916E.f44463a;
        }

        @Override // U6.E
        public void v(Throwable th) {
            if (th != null) {
                Object n8 = this.f5443v.n(th);
                if (n8 != null) {
                    this.f5443v.r(n8);
                    b y7 = y();
                    if (y7 != null) {
                        y7.c();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C0711e.f5440b.decrementAndGet(C0711e.this) == 0) {
                InterfaceC0731o interfaceC0731o = this.f5443v;
                U[] uArr = C0711e.this.f5441a;
                ArrayList arrayList = new ArrayList(uArr.length);
                for (U u7 : uArr) {
                    arrayList.add(u7.m());
                }
                interfaceC0731o.resumeWith(C6934p.b(arrayList));
            }
        }

        public final b y() {
            return (b) f5442y.get(this);
        }

        public final InterfaceC0708c0 z() {
            InterfaceC0708c0 interfaceC0708c0 = this.f5444w;
            if (interfaceC0708c0 != null) {
                return interfaceC0708c0;
            }
            J6.r.p("handle");
            return null;
        }
    }

    /* renamed from: U6.e$b */
    private final class b extends AbstractC0727m {

        /* renamed from: o, reason: collision with root package name */
        private final a[] f5446o;

        public b(a[] aVarArr) {
            this.f5446o = aVarArr;
        }

        @Override // U6.AbstractC0729n
        public void b(Throwable th) {
            c();
        }

        public final void c() {
            for (a aVar : this.f5446o) {
                aVar.z().c();
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f5446o + ']';
        }
    }

    public C0711e(U[] uArr) {
        this.f5441a = uArr;
        this.notCompletedCount = uArr.length;
    }

    public final Object c(A6.d dVar) {
        C0733p c0733p = new C0733p(B6.b.c(dVar), 1);
        c0733p.C();
        int length = this.f5441a.length;
        a[] aVarArr = new a[length];
        for (int i8 = 0; i8 < length; i8++) {
            U u7 = this.f5441a[i8];
            u7.start();
            a aVar = new a(c0733p);
            aVar.B(u7.D(aVar));
            C6916E c6916e = C6916E.f44463a;
            aVarArr[i8] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i9 = 0; i9 < length; i9++) {
            aVarArr[i9].A(bVar);
        }
        if (c0733p.j()) {
            bVar.c();
        } else {
            c0733p.q(bVar);
        }
        Object z7 = c0733p.z();
        if (z7 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z7;
    }
}
