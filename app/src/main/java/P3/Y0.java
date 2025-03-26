package p3;

import a4.C0820d;
import a4.C0821e;
import a4.InterfaceC0819c;
import android.app.Activity;
import android.util.Log;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC0819c {

    /* renamed from: a, reason: collision with root package name */
    private final C6354n f40218a;

    /* renamed from: b, reason: collision with root package name */
    private final l1 f40219b;

    /* renamed from: c, reason: collision with root package name */
    private final M f40220c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f40221d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Object f40222e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f40223f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40224g = false;

    /* renamed from: h, reason: collision with root package name */
    private C0820d f40225h = new C0820d.a().a();

    public Y0(C6354n c6354n, l1 l1Var, M m8) {
        this.f40218a = c6354n;
        this.f40219b = l1Var;
        this.f40220c = m8;
    }

    @Override // a4.InterfaceC0819c
    public final int a() {
        if (h()) {
            return this.f40218a.a();
        }
        return 0;
    }

    @Override // a4.InterfaceC0819c
    public final InterfaceC0819c.EnumC0131c b() {
        return !h() ? InterfaceC0819c.EnumC0131c.UNKNOWN : this.f40218a.b();
    }

    @Override // a4.InterfaceC0819c
    public final void c(Activity activity, C0820d c0820d, InterfaceC0819c.b bVar, InterfaceC0819c.a aVar) {
        synchronized (this.f40221d) {
            this.f40223f = true;
        }
        this.f40225h = c0820d;
        this.f40219b.c(activity, c0820d, bVar, aVar);
    }

    public final boolean d() {
        if (!this.f40218a.j()) {
            int a8 = !h() ? 0 : this.f40218a.a();
            if (a8 != 1 && a8 != 3) {
                return false;
            }
        }
        return true;
    }

    public final boolean e() {
        return this.f40220c.f();
    }

    public final void f(Activity activity) {
        if (h() && !i()) {
            g(true);
            this.f40219b.c(activity, this.f40225h, new InterfaceC0819c.b() { // from class: p3.W0
                @Override // a4.InterfaceC0819c.b
                public final void a() {
                    this.f40214a.g(false);
                }
            }, new InterfaceC0819c.a() { // from class: p3.X0
                @Override // a4.InterfaceC0819c.a
                public final void a(C0821e c0821e) {
                    this.f40216a.g(false);
                }
            });
            return;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + h() + ", retryRequestIsInProgress=" + i());
    }

    public final void g(boolean z7) {
        synchronized (this.f40222e) {
            this.f40224g = z7;
        }
    }

    public final boolean h() {
        boolean z7;
        synchronized (this.f40221d) {
            z7 = this.f40223f;
        }
        return z7;
    }

    public final boolean i() {
        boolean z7;
        synchronized (this.f40222e) {
            z7 = this.f40224g;
        }
        return z7;
    }
}
