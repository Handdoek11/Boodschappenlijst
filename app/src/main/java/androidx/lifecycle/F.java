package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC0922h;

/* loaded from: classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    private final C0928n f10225a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f10226b;

    /* renamed from: c, reason: collision with root package name */
    private a f10227c;

    public static final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final C0928n f10228o;

        /* renamed from: s, reason: collision with root package name */
        private final AbstractC0922h.a f10229s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f10230t;

        public a(C0928n c0928n, AbstractC0922h.a aVar) {
            J6.r.e(c0928n, "registry");
            J6.r.e(aVar, "event");
            this.f10228o = c0928n;
            this.f10229s = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10230t) {
                return;
            }
            this.f10228o.h(this.f10229s);
            this.f10230t = true;
        }
    }

    public F(InterfaceC0927m interfaceC0927m) {
        J6.r.e(interfaceC0927m, "provider");
        this.f10225a = new C0928n(interfaceC0927m);
        this.f10226b = new Handler();
    }

    private final void f(AbstractC0922h.a aVar) {
        a aVar2 = this.f10227c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f10225a, aVar);
        this.f10227c = aVar3;
        Handler handler = this.f10226b;
        J6.r.b(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public AbstractC0922h a() {
        return this.f10225a;
    }

    public void b() {
        f(AbstractC0922h.a.ON_START);
    }

    public void c() {
        f(AbstractC0922h.a.ON_CREATE);
    }

    public void d() {
        f(AbstractC0922h.a.ON_STOP);
        f(AbstractC0922h.a.ON_DESTROY);
    }

    public void e() {
        f(AbstractC0922h.a.ON_START);
    }
}
