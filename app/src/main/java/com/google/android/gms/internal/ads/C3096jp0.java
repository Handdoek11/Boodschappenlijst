package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.jp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3096jp0 {

    /* renamed from: b, reason: collision with root package name */
    private static final C3096jp0 f23349b = new C3096jp0();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f23350a = new AtomicReference(new Ep0(new Ap0(null), null));

    C3096jp0() {
    }

    public static C3096jp0 a() {
        return f23349b;
    }

    public final Class b(Class cls) {
        return ((Ep0) this.f23350a.get()).a(cls);
    }

    public final Object c(Sk0 sk0, Class cls) {
        return ((Ep0) this.f23350a.get()).b(sk0, cls);
    }

    public final Object d(Ip0 ip0, Class cls) {
        return ((Ep0) this.f23350a.get()).c(ip0, cls);
    }

    public final synchronized void e(AbstractC4839zp0 abstractC4839zp0) {
        Ap0 ap0 = new Ap0((Ep0) this.f23350a.get(), null);
        ap0.a(abstractC4839zp0);
        this.f23350a.set(new Ep0(ap0, null));
    }

    public final synchronized void f(Jp0 jp0) {
        Ap0 ap0 = new Ap0((Ep0) this.f23350a.get(), null);
        ap0.b(jp0);
        this.f23350a.set(new Ep0(ap0, null));
    }
}
