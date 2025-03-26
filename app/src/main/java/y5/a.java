package Y5;

import J6.AbstractC0650j;
import J6.r;
import Z5.f;
import Z5.g;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class a extends X5.a {

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6126k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f6127l;

    /* renamed from: n, reason: collision with root package name */
    private static final g f6129n;

    /* renamed from: o, reason: collision with root package name */
    private static final a f6130o;

    /* renamed from: p, reason: collision with root package name */
    private static final g f6131p;

    /* renamed from: q, reason: collision with root package name */
    private static final g f6132q;

    /* renamed from: h, reason: collision with root package name */
    private final g f6133h;

    /* renamed from: i, reason: collision with root package name */
    private a f6134i;
    private volatile /* synthetic */ Object nextRef;
    private volatile /* synthetic */ int refCount;

    /* renamed from: j, reason: collision with root package name */
    public static final e f6125j = new e(null);

    /* renamed from: m, reason: collision with root package name */
    private static final g f6128m = new d();

    public static final class b extends f {
        b() {
        }

        @Override // Z5.g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a C() {
            return new a(V5.b.f5731a.b(4096), null, this, 0 == true ? 1 : 0);
        }

        @Override // Z5.f, Z5.g
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void o0(a aVar) {
            r.e(aVar, "instance");
            V5.b.f5731a.a(aVar.h());
        }
    }

    public static final class c extends f {
        c() {
        }

        @Override // Z5.g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a C() {
            throw new UnsupportedOperationException("This pool doesn't support borrow");
        }

        @Override // Z5.f, Z5.g
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void o0(a aVar) {
            r.e(aVar, "instance");
        }
    }

    public static final class d implements g {
        d() {
        }

        @Override // Z5.g
        public void c() {
            X5.c.a().c();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            g.a.a(this);
        }

        @Override // Z5.g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a C() {
            return (a) X5.c.a().C();
        }

        @Override // Z5.g
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void o0(a aVar) {
            r.e(aVar, "instance");
            X5.c.a().o0(aVar);
        }
    }

    public static final class e {
        public /* synthetic */ e(AbstractC0650j abstractC0650j) {
            this();
        }

        public final a a() {
            return a.f6130o;
        }

        public final g b() {
            return a.f6129n;
        }

        public final g c() {
            return a.f6128m;
        }

        private e() {
        }
    }

    static {
        C0126a c0126a = new C0126a();
        f6129n = c0126a;
        f6130o = new a(V5.c.f5732a.a(), 0 == true ? 1 : 0, c0126a, 0 == true ? 1 : 0);
        f6131p = new b();
        f6132q = new c();
        f6126k = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "nextRef");
        f6127l = AtomicIntegerFieldUpdater.newUpdater(a.class, "refCount");
    }

    public /* synthetic */ a(ByteBuffer byteBuffer, a aVar, g gVar, AbstractC0650j abstractC0650j) {
        this(byteBuffer, aVar, gVar);
    }

    private final void y(a aVar) {
        if (!androidx.concurrent.futures.b.a(f6126k, this, null, aVar)) {
            throw new IllegalStateException("This chunk has already a next chunk.");
        }
    }

    public a A() {
        a aVar = this.f6134i;
        if (aVar == null) {
            aVar = this;
        }
        aVar.x();
        a aVar2 = new a(h(), aVar, this.f6133h, null);
        e(aVar2);
        return aVar2;
    }

    public final a B() {
        return (a) this.nextRef;
    }

    public final a C() {
        return this.f6134i;
    }

    public final int D() {
        return this.refCount;
    }

    public void E(g gVar) {
        r.e(gVar, "pool");
        if (F()) {
            a aVar = this.f6134i;
            if (aVar != null) {
                H();
                aVar.E(gVar);
            } else {
                g gVar2 = this.f6133h;
                if (gVar2 != null) {
                    gVar = gVar2;
                }
                gVar.o0(this);
            }
        }
    }

    public final boolean F() {
        int i8;
        int i9;
        do {
            i8 = this.refCount;
            if (i8 <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i9 = i8 - 1;
        } while (!f6127l.compareAndSet(this, i8, i9));
        return i9 == 0;
    }

    public final void G(a aVar) {
        if (aVar == null) {
            z();
        } else {
            y(aVar);
        }
    }

    public final void H() {
        if (!f6127l.compareAndSet(this, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        z();
        this.f6134i = null;
    }

    public final void I() {
        int i8;
        do {
            i8 = this.refCount;
            if (i8 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i8 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!f6127l.compareAndSet(this, i8, 1));
    }

    @Override // X5.a
    public final void r() {
        if (this.f6134i != null) {
            throw new IllegalArgumentException("Unable to reset buffer with origin");
        }
        super.r();
        this.nextRef = null;
    }

    public final void x() {
        int i8;
        do {
            i8 = this.refCount;
            if (i8 <= 0) {
                throw new IllegalStateException("Unable to acquire chunk: it is already released.");
            }
        } while (!f6127l.compareAndSet(this, i8, i8 + 1));
    }

    public final a z() {
        return (a) f6126k.getAndSet(this, null);
    }

    private a(ByteBuffer byteBuffer, a aVar, g gVar) {
        super(byteBuffer, null);
        this.f6133h = gVar;
        if (aVar == this) {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
        }
        this.nextRef = null;
        this.refCount = 1;
        this.f6134i = aVar;
    }

    /* renamed from: Y5.a$a, reason: collision with other inner class name */
    public static final class C0126a implements g {
        C0126a() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            g.a.a(this);
        }

        @Override // Z5.g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a C() {
            return a.f6125j.a();
        }

        @Override // Z5.g
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void o0(a aVar) {
            r.e(aVar, "instance");
            if (aVar != a.f6125j.a()) {
                throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
            }
        }

        @Override // Z5.g
        public void c() {
        }
    }
}
