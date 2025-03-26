package y5;

import A6.g;
import J6.r;
import J6.s;
import N5.m;
import U6.A;
import U6.InterfaceC0745v0;
import U6.L;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v5.C6841a;
import x6.AbstractC6929k;
import x6.C6916E;
import x6.InterfaceC6928j;
import y5.InterfaceC6958a;

/* renamed from: y5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6959b implements InterfaceC6958a {

    /* renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f44612t = AtomicIntegerFieldUpdater.newUpdater(AbstractC6959b.class, "closed");
    private volatile /* synthetic */ int closed;

    /* renamed from: o, reason: collision with root package name */
    private final String f44613o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC6928j f44614s;

    /* renamed from: y5.b$a */
    static final class a extends s implements I6.l {
        a() {
            super(1);
        }

        public final void b(Throwable th) {
            AbstractC6960c.b(AbstractC6959b.this.r0());
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    /* renamed from: y5.b$b, reason: collision with other inner class name */
    static final class C0354b extends s implements I6.a {
        C0354b() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final A6.g invoke() {
            return m.b(null, 1, null).u(AbstractC6959b.this.r0()).u(new L(AbstractC6959b.this.f44613o + "-context"));
        }
    }

    public AbstractC6959b(String str) {
        r.e(str, "engineName");
        this.f44613o = str;
        this.closed = 0;
        this.f44614s = AbstractC6929k.a(new C0354b());
    }

    @Override // y5.InterfaceC6958a
    public Set J() {
        return InterfaceC6958a.C0351a.g(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f44612t.compareAndSet(this, 0, 1)) {
            g.b d8 = getCoroutineContext().d(InterfaceC0745v0.f5485d);
            A a8 = d8 instanceof A ? (A) d8 : null;
            if (a8 == null) {
                return;
            }
            a8.T();
            a8.D(new a());
        }
    }

    @Override // y5.InterfaceC6958a
    public void g0(C6841a c6841a) {
        InterfaceC6958a.C0351a.h(this, c6841a);
    }

    @Override // U6.M
    public A6.g getCoroutineContext() {
        return (A6.g) this.f44614s.getValue();
    }
}
