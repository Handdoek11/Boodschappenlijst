package androidx.lifecycle;

import T0.a;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.H;
import androidx.savedstate.a;
import f1.InterfaceC5764d;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final a.b f10204a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f10205b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final a.b f10206c = new a();

    public static final class a implements a.b {
        a() {
        }
    }

    public static final class b implements a.b {
        b() {
        }
    }

    public static final class c implements a.b {
        c() {
        }
    }

    static final class d extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final d f10207o = new d();

        d() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C invoke(T0.a aVar) {
            J6.r.e(aVar, "$this$initializer");
            return new C();
        }
    }

    public static final z a(T0.a aVar) {
        J6.r.e(aVar, "<this>");
        InterfaceC5764d interfaceC5764d = (InterfaceC5764d) aVar.a(f10204a);
        if (interfaceC5764d == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        L l8 = (L) aVar.a(f10205b);
        if (l8 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f10206c);
        String str = (String) aVar.a(H.c.f10244c);
        if (str != null) {
            return b(interfaceC5764d, l8, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final z b(InterfaceC5764d interfaceC5764d, L l8, String str, Bundle bundle) {
        B d8 = d(interfaceC5764d);
        C e8 = e(l8);
        z zVar = (z) e8.f().get(str);
        if (zVar != null) {
            return zVar;
        }
        z a8 = z.f10346f.a(d8.b(str), bundle);
        e8.f().put(str, a8);
        return a8;
    }

    public static final void c(InterfaceC5764d interfaceC5764d) {
        J6.r.e(interfaceC5764d, "<this>");
        AbstractC0922h.b b8 = interfaceC5764d.getLifecycle().b();
        if (b8 != AbstractC0922h.b.INITIALIZED && b8 != AbstractC0922h.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC5764d.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            B b9 = new B(interfaceC5764d.getSavedStateRegistry(), (L) interfaceC5764d);
            interfaceC5764d.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", b9);
            interfaceC5764d.getLifecycle().a(new SavedStateHandleAttacher(b9));
        }
    }

    public static final B d(InterfaceC5764d interfaceC5764d) {
        J6.r.e(interfaceC5764d, "<this>");
        a.c c8 = interfaceC5764d.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        B b8 = c8 instanceof B ? (B) c8 : null;
        if (b8 != null) {
            return b8;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final C e(L l8) {
        J6.r.e(l8, "<this>");
        T0.c cVar = new T0.c();
        cVar.a(J6.H.b(C.class), d.f10207o);
        return (C) new H(l8, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", C.class);
    }
}
