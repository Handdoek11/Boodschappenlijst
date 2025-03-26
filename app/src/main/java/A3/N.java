package A3;

import android.app.Activity;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class N extends AbstractC0376j {

    /* renamed from: a, reason: collision with root package name */
    private final Object f194a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final I f195b = new I();

    /* renamed from: c, reason: collision with root package name */
    private boolean f196c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f197d;

    /* renamed from: e, reason: collision with root package name */
    private Object f198e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f199f;

    N() {
    }

    private final void A() {
        Z2.r.q(this.f196c, "Task is not yet complete");
    }

    private final void B() {
        if (this.f197d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void C() {
        if (this.f196c) {
            throw DuplicateTaskCompletionException.a(this);
        }
    }

    private final void D() {
        synchronized (this.f194a) {
            try {
                if (this.f196c) {
                    this.f195b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j a(InterfaceC0370d interfaceC0370d) {
        b(AbstractC0378l.f204a, interfaceC0370d);
        return this;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j b(Executor executor, InterfaceC0370d interfaceC0370d) {
        this.f195b.a(new y(executor, interfaceC0370d));
        D();
        return this;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j c(InterfaceC0371e interfaceC0371e) {
        this.f195b.a(new A(AbstractC0378l.f204a, interfaceC0371e));
        D();
        return this;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j d(Executor executor, InterfaceC0371e interfaceC0371e) {
        this.f195b.a(new A(executor, interfaceC0371e));
        D();
        return this;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j e(InterfaceC0372f interfaceC0372f) {
        g(AbstractC0378l.f204a, interfaceC0372f);
        return this;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j f(Activity activity, InterfaceC0372f interfaceC0372f) {
        C c8 = new C(AbstractC0378l.f204a, interfaceC0372f);
        this.f195b.a(c8);
        M.l(activity).m(c8);
        D();
        return this;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j g(Executor executor, InterfaceC0372f interfaceC0372f) {
        this.f195b.a(new C(executor, interfaceC0372f));
        D();
        return this;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j h(InterfaceC0373g interfaceC0373g) {
        j(AbstractC0378l.f204a, interfaceC0373g);
        return this;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j i(Activity activity, InterfaceC0373g interfaceC0373g) {
        E e8 = new E(AbstractC0378l.f204a, interfaceC0373g);
        this.f195b.a(e8);
        M.l(activity).m(e8);
        D();
        return this;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j j(Executor executor, InterfaceC0373g interfaceC0373g) {
        this.f195b.a(new E(executor, interfaceC0373g));
        D();
        return this;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j k(Executor executor, InterfaceC0369c interfaceC0369c) {
        N n8 = new N();
        this.f195b.a(new u(executor, interfaceC0369c, n8));
        D();
        return n8;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j l(InterfaceC0369c interfaceC0369c) {
        return m(AbstractC0378l.f204a, interfaceC0369c);
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j m(Executor executor, InterfaceC0369c interfaceC0369c) {
        N n8 = new N();
        this.f195b.a(new w(executor, interfaceC0369c, n8));
        D();
        return n8;
    }

    @Override // A3.AbstractC0376j
    public final Exception n() {
        Exception exc;
        synchronized (this.f194a) {
            exc = this.f199f;
        }
        return exc;
    }

    @Override // A3.AbstractC0376j
    public final Object o() {
        Object obj;
        synchronized (this.f194a) {
            try {
                A();
                B();
                Exception exc = this.f199f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f198e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // A3.AbstractC0376j
    public final Object p(Class cls) {
        Object obj;
        synchronized (this.f194a) {
            try {
                A();
                B();
                if (cls.isInstance(this.f199f)) {
                    throw ((Throwable) cls.cast(this.f199f));
                }
                Exception exc = this.f199f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f198e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // A3.AbstractC0376j
    public final boolean q() {
        return this.f197d;
    }

    @Override // A3.AbstractC0376j
    public final boolean r() {
        boolean z7;
        synchronized (this.f194a) {
            z7 = this.f196c;
        }
        return z7;
    }

    @Override // A3.AbstractC0376j
    public final boolean s() {
        boolean z7;
        synchronized (this.f194a) {
            try {
                z7 = false;
                if (this.f196c && !this.f197d && this.f199f == null) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j t(InterfaceC0375i interfaceC0375i) {
        Executor executor = AbstractC0378l.f204a;
        N n8 = new N();
        this.f195b.a(new G(executor, interfaceC0375i, n8));
        D();
        return n8;
    }

    @Override // A3.AbstractC0376j
    public final AbstractC0376j u(Executor executor, InterfaceC0375i interfaceC0375i) {
        N n8 = new N();
        this.f195b.a(new G(executor, interfaceC0375i, n8));
        D();
        return n8;
    }

    public final void v(Exception exc) {
        Z2.r.m(exc, "Exception must not be null");
        synchronized (this.f194a) {
            C();
            this.f196c = true;
            this.f199f = exc;
        }
        this.f195b.b(this);
    }

    public final void w(Object obj) {
        synchronized (this.f194a) {
            C();
            this.f196c = true;
            this.f198e = obj;
        }
        this.f195b.b(this);
    }

    public final boolean x() {
        synchronized (this.f194a) {
            try {
                if (this.f196c) {
                    return false;
                }
                this.f196c = true;
                this.f197d = true;
                this.f195b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean y(Exception exc) {
        Z2.r.m(exc, "Exception must not be null");
        synchronized (this.f194a) {
            try {
                if (this.f196c) {
                    return false;
                }
                this.f196c = true;
                this.f199f = exc;
                this.f195b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean z(Object obj) {
        synchronized (this.f194a) {
            try {
                if (this.f196c) {
                    return false;
                }
                this.f196c = true;
                this.f198e = obj;
                this.f195b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
