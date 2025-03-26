package A3;

import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Object f208a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f209b;

    /* renamed from: c, reason: collision with root package name */
    private final N f210c;

    /* renamed from: d, reason: collision with root package name */
    private int f211d;

    /* renamed from: e, reason: collision with root package name */
    private int f212e;

    /* renamed from: f, reason: collision with root package name */
    private int f213f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f214g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f215h;

    public r(int i8, N n8) {
        this.f209b = i8;
        this.f210c = n8;
    }

    private final void a() {
        if (this.f211d + this.f212e + this.f213f == this.f209b) {
            if (this.f214g == null) {
                if (this.f215h) {
                    this.f210c.x();
                    return;
                } else {
                    this.f210c.w(null);
                    return;
                }
            }
            this.f210c.v(new ExecutionException(this.f212e + " out of " + this.f209b + " underlying tasks failed", this.f214g));
        }
    }

    @Override // A3.InterfaceC0373g
    public final void b(Object obj) {
        synchronized (this.f208a) {
            this.f211d++;
            a();
        }
    }

    @Override // A3.InterfaceC0370d
    public final void c() {
        synchronized (this.f208a) {
            this.f213f++;
            this.f215h = true;
            a();
        }
    }

    @Override // A3.InterfaceC0372f
    public final void e(Exception exc) {
        synchronized (this.f208a) {
            this.f212e++;
            this.f214g = exc;
            a();
        }
    }
}
