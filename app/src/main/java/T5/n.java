package T5;

import J6.r;
import java.util.List;
import x6.C6934p;
import x6.q;

/* loaded from: classes2.dex */
public final class n extends e {

    /* renamed from: s, reason: collision with root package name */
    private final List f5288s;

    /* renamed from: t, reason: collision with root package name */
    private final A6.d f5289t;

    /* renamed from: u, reason: collision with root package name */
    private Object f5290u;

    /* renamed from: v, reason: collision with root package name */
    private final A6.d[] f5291v;

    /* renamed from: w, reason: collision with root package name */
    private int f5292w;

    /* renamed from: x, reason: collision with root package name */
    private int f5293x;

    public static final class a implements A6.d, kotlin.coroutines.jvm.internal.e {

        /* renamed from: o, reason: collision with root package name */
        private int f5294o = Integer.MIN_VALUE;

        a() {
        }

        private final A6.d a() {
            if (this.f5294o == Integer.MIN_VALUE) {
                this.f5294o = n.this.f5292w;
            }
            if (this.f5294o < 0) {
                this.f5294o = Integer.MIN_VALUE;
                return null;
            }
            try {
                A6.d[] dVarArr = n.this.f5291v;
                int i8 = this.f5294o;
                A6.d dVar = dVarArr[i8];
                if (dVar == null) {
                    return m.f5287o;
                }
                this.f5294o = i8 - 1;
                return dVar;
            } catch (Throwable unused) {
                return m.f5287o;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.e
        public kotlin.coroutines.jvm.internal.e getCallerFrame() {
            A6.d a8 = a();
            if (a8 instanceof kotlin.coroutines.jvm.internal.e) {
                return (kotlin.coroutines.jvm.internal.e) a8;
            }
            return null;
        }

        @Override // A6.d
        public A6.g getContext() {
            A6.g context;
            A6.d dVar = n.this.f5291v[n.this.f5292w];
            if (dVar == null || (context = dVar.getContext()) == null) {
                throw new IllegalStateException("Not started");
            }
            return context;
        }

        @Override // A6.d
        public void resumeWith(Object obj) {
            if (!C6934p.g(obj)) {
                n.this.n(false);
                return;
            }
            n nVar = n.this;
            Throwable e8 = C6934p.e(obj);
            r.b(e8);
            nVar.o(C6934p.b(q.a(e8)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Object obj, Object obj2, List list) {
        super(obj2);
        r.e(obj, "initial");
        r.e(obj2, "context");
        r.e(list, "blocks");
        this.f5288s = list;
        this.f5289t = new a();
        this.f5290u = obj;
        this.f5291v = new A6.d[list.size()];
        this.f5292w = -1;
    }

    private final void l(A6.d dVar) {
        A6.d[] dVarArr = this.f5291v;
        int i8 = this.f5292w + 1;
        this.f5292w = i8;
        dVarArr[i8] = dVar;
    }

    private final void m() {
        int i8 = this.f5292w;
        if (i8 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        A6.d[] dVarArr = this.f5291v;
        this.f5292w = i8 - 1;
        dVarArr[i8] = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(boolean z7) {
        int i8;
        do {
            i8 = this.f5293x;
            if (i8 == this.f5288s.size()) {
                if (z7) {
                    return true;
                }
                C6934p.a aVar = C6934p.f44487s;
                o(C6934p.b(c()));
                return false;
            }
            this.f5293x = i8 + 1;
            try {
            } catch (Throwable th) {
                C6934p.a aVar2 = C6934p.f44487s;
                o(C6934p.b(q.a(th)));
                return false;
            }
        } while (((I6.q) this.f5288s.get(i8)).d(this, c(), this.f5289t) != B6.b.e());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Object obj) {
        int i8 = this.f5292w;
        if (i8 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        A6.d dVar = this.f5291v[i8];
        r.b(dVar);
        A6.d[] dVarArr = this.f5291v;
        int i9 = this.f5292w;
        this.f5292w = i9 - 1;
        dVarArr[i9] = null;
        if (!C6934p.g(obj)) {
            dVar.resumeWith(obj);
            return;
        }
        Throwable e8 = C6934p.e(obj);
        r.b(e8);
        dVar.resumeWith(C6934p.b(q.a(k.a(e8, dVar))));
    }

    @Override // T5.e
    public Object a(Object obj, A6.d dVar) {
        this.f5293x = 0;
        if (this.f5288s.size() == 0) {
            return obj;
        }
        p(obj);
        if (this.f5292w < 0) {
            return d(dVar);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // T5.e
    public Object c() {
        return this.f5290u;
    }

    @Override // T5.e
    public Object d(A6.d dVar) {
        Object e8;
        if (this.f5293x == this.f5288s.size()) {
            e8 = c();
        } else {
            l(B6.b.c(dVar));
            if (n(true)) {
                m();
                e8 = c();
            } else {
                e8 = B6.b.e();
            }
        }
        if (e8 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e8;
    }

    @Override // T5.e
    public Object e(Object obj, A6.d dVar) {
        p(obj);
        return d(dVar);
    }

    @Override // U6.M
    public A6.g getCoroutineContext() {
        return this.f5289t.getContext();
    }

    public void p(Object obj) {
        r.e(obj, "<set-?>");
        this.f5290u = obj;
    }
}
