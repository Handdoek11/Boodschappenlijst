package f1;

import J6.AbstractC0650j;
import J6.r;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0922h;
import androidx.savedstate.Recreator;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5763c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f35801d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5764d f35802a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.savedstate.a f35803b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35804c;

    /* renamed from: f1.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final C5763c a(InterfaceC5764d interfaceC5764d) {
            r.e(interfaceC5764d, "owner");
            return new C5763c(interfaceC5764d, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C5763c(InterfaceC5764d interfaceC5764d, AbstractC0650j abstractC0650j) {
        this(interfaceC5764d);
    }

    public static final C5763c a(InterfaceC5764d interfaceC5764d) {
        return f35801d.a(interfaceC5764d);
    }

    public final androidx.savedstate.a b() {
        return this.f35803b;
    }

    public final void c() {
        AbstractC0922h lifecycle = this.f35802a.getLifecycle();
        if (lifecycle.b() != AbstractC0922h.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(this.f35802a));
        this.f35803b.e(lifecycle);
        this.f35804c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f35804c) {
            c();
        }
        AbstractC0922h lifecycle = this.f35802a.getLifecycle();
        if (!lifecycle.b().c(AbstractC0922h.b.STARTED)) {
            this.f35803b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle bundle) {
        r.e(bundle, "outBundle");
        this.f35803b.g(bundle);
    }

    private C5763c(InterfaceC5764d interfaceC5764d) {
        this.f35802a = interfaceC5764d;
        this.f35803b = new androidx.savedstate.a();
    }
}
