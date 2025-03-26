package e7;

import A6.g;
import I6.l;
import I6.q;
import J6.s;
import U6.C0733p;
import U6.I;
import U6.InterfaceC0731o;
import U6.Q;
import U6.W0;
import U6.r;
import Z6.B;
import androidx.appcompat.app.E;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import x6.C6916E;

/* loaded from: classes2.dex */
public class b extends d implements e7.a {

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35331i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* renamed from: h, reason: collision with root package name */
    private final q f35332h;
    private volatile Object owner;

    private final class a implements InterfaceC0731o, W0 {

        /* renamed from: o, reason: collision with root package name */
        public final C0733p f35333o;

        /* renamed from: s, reason: collision with root package name */
        public final Object f35334s;

        /* renamed from: e7.b$a$a, reason: collision with other inner class name */
        static final class C0254a extends s implements l {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f35336o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ a f35337s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0254a(b bVar, a aVar) {
                super(1);
                this.f35336o = bVar;
                this.f35337s = aVar;
            }

            public final void b(Throwable th) {
                this.f35336o.c(this.f35337s.f35334s);
            }

            @Override // I6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return C6916E.f44463a;
            }
        }

        /* renamed from: e7.b$a$b, reason: collision with other inner class name */
        static final class C0255b extends s implements l {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f35338o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ a f35339s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0255b(b bVar, a aVar) {
                super(1);
                this.f35338o = bVar;
                this.f35339s = aVar;
            }

            public final void b(Throwable th) {
                b.f35331i.set(this.f35338o, this.f35339s.f35334s);
                this.f35338o.c(this.f35339s.f35334s);
            }

            @Override // I6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return C6916E.f44463a;
            }
        }

        public a(C0733p c0733p, Object obj) {
            this.f35333o = c0733p;
            this.f35334s = obj;
        }

        @Override // U6.InterfaceC0731o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void p(C6916E c6916e, l lVar) {
            b.f35331i.set(b.this, this.f35334s);
            this.f35333o.p(c6916e, new C0254a(b.this, this));
        }

        @Override // U6.InterfaceC0731o
        public boolean b(Throwable th) {
            return this.f35333o.b(th);
        }

        @Override // U6.W0
        public void c(B b8, int i8) {
            this.f35333o.c(b8, i8);
        }

        @Override // U6.InterfaceC0731o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void o(I i8, C6916E c6916e) {
            this.f35333o.o(i8, c6916e);
        }

        @Override // U6.InterfaceC0731o
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Object l(C6916E c6916e, Object obj, l lVar) {
            Object l8 = this.f35333o.l(c6916e, obj, new C0255b(b.this, this));
            if (l8 != null) {
                b.f35331i.set(b.this, this.f35334s);
            }
            return l8;
        }

        @Override // A6.d
        public g getContext() {
            return this.f35333o.getContext();
        }

        @Override // U6.InterfaceC0731o
        public boolean j() {
            return this.f35333o.j();
        }

        @Override // U6.InterfaceC0731o
        public Object n(Throwable th) {
            return this.f35333o.n(th);
        }

        @Override // U6.InterfaceC0731o
        public void q(l lVar) {
            this.f35333o.q(lVar);
        }

        @Override // U6.InterfaceC0731o
        public void r(Object obj) {
            this.f35333o.r(obj);
        }

        @Override // A6.d
        public void resumeWith(Object obj) {
            this.f35333o.resumeWith(obj);
        }
    }

    /* renamed from: e7.b$b, reason: collision with other inner class name */
    static final class C0256b extends s implements q {

        /* renamed from: e7.b$b$a */
        static final class a extends s implements l {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f35341o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Object f35342s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.f35341o = bVar;
                this.f35342s = obj;
            }

            public final void b(Throwable th) {
                this.f35341o.c(this.f35342s);
            }

            @Override // I6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return C6916E.f44463a;
            }
        }

        C0256b() {
            super(3);
        }

        public final l b(c7.a aVar, Object obj, Object obj2) {
            return new a(b.this, obj);
        }

        @Override // I6.q
        public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
            E.a(obj);
            return b(null, obj2, obj3);
        }
    }

    public b(boolean z7) {
        super(1, z7 ? 1 : 0);
        this.owner = z7 ? null : c.f35343a;
        this.f35332h = new C0256b();
    }

    private final int n(Object obj) {
        while (b()) {
            Object obj2 = f35331i.get(this);
            if (obj2 != c.f35343a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object o(b bVar, Object obj, A6.d dVar) {
        if (bVar.q(obj)) {
            return C6916E.f44463a;
        }
        Object p8 = bVar.p(obj, dVar);
        return p8 == B6.b.e() ? p8 : C6916E.f44463a;
    }

    private final Object p(Object obj, A6.d dVar) {
        C0733p b8 = r.b(B6.b.c(dVar));
        try {
            d(new a(b8, obj));
            Object z7 = b8.z();
            if (z7 == B6.b.e()) {
                h.c(dVar);
            }
            return z7 == B6.b.e() ? z7 : C6916E.f44463a;
        } catch (Throwable th) {
            b8.K();
            throw th;
        }
    }

    private final int r(Object obj) {
        while (!j()) {
            if (obj == null) {
                return 1;
            }
            int n8 = n(obj);
            if (n8 == 1) {
                return 2;
            }
            if (n8 == 2) {
                return 1;
            }
        }
        f35331i.set(this, obj);
        return 0;
    }

    @Override // e7.a
    public Object a(Object obj, A6.d dVar) {
        return o(this, obj, dVar);
    }

    @Override // e7.a
    public boolean b() {
        return h() == 0;
    }

    @Override // e7.a
    public void c(Object obj) {
        while (b()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35331i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != c.f35343a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, c.f35343a)) {
                    i();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public boolean q(Object obj) {
        int r8 = r(obj);
        if (r8 == 0) {
            return true;
        }
        if (r8 == 1) {
            return false;
        }
        if (r8 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public String toString() {
        return "Mutex@" + Q.b(this) + "[isLocked=" + b() + ",owner=" + f35331i.get(this) + ']';
    }
}
