package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.mp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3423mp0 {

    /* renamed from: b, reason: collision with root package name */
    private static final C3423mp0 f24590b = (C3423mp0) zzgnt.a(new Vp0() { // from class: com.google.android.gms.internal.ads.kp0
        @Override // com.google.android.gms.internal.ads.Vp0
        public final Object zza() {
            C3423mp0 c3423mp0 = new C3423mp0();
            c3423mp0.g(new Go0(Mo0.class, Kp0.class, new Ho0() { // from class: com.google.android.gms.internal.ads.lp0
                @Override // com.google.android.gms.internal.ads.Ho0
                public final Pp0 a(Sk0 sk0, C3197kl0 c3197kl0) {
                    return ((Mo0) sk0).a(c3197kl0);
                }
            }));
            return c3423mp0;
        }
    });

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f24591a = new AtomicReference(new Up0(new Qp0(), null));

    public static C3423mp0 c() {
        return f24590b;
    }

    public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
        return ((Up0) this.f24591a.get()).a(pp0, c3197kl0);
    }

    public final AbstractC2763gl0 b(Pp0 pp0) {
        return ((Up0) this.f24591a.get()).b(pp0);
    }

    public final Pp0 d(Sk0 sk0, Class cls, C3197kl0 c3197kl0) {
        return ((Up0) this.f24591a.get()).c(sk0, cls, c3197kl0);
    }

    public final Pp0 e(AbstractC2763gl0 abstractC2763gl0, Class cls) {
        return ((Up0) this.f24591a.get()).d(abstractC2763gl0, cls);
    }

    public final synchronized void f(Fo0 fo0) {
        Qp0 qp0 = new Qp0((Up0) this.f24591a.get());
        qp0.a(fo0);
        this.f24591a.set(new Up0(qp0, null));
    }

    public final synchronized void g(Jo0 jo0) {
        Qp0 qp0 = new Qp0((Up0) this.f24591a.get());
        qp0.b(jo0);
        this.f24591a.set(new Up0(qp0, null));
    }

    public final synchronized void h(AbstractC3967rp0 abstractC3967rp0) {
        Qp0 qp0 = new Qp0((Up0) this.f24591a.get());
        qp0.c(abstractC3967rp0);
        this.f24591a.set(new Up0(qp0, null));
    }

    public final synchronized void i(AbstractC4403vp0 abstractC4403vp0) {
        Qp0 qp0 = new Qp0((Up0) this.f24591a.get());
        qp0.d(abstractC4403vp0);
        this.f24591a.set(new Up0(qp0, null));
    }

    public final boolean j(Pp0 pp0) {
        return ((Up0) this.f24591a.get()).i(pp0);
    }

    public final boolean k(Pp0 pp0) {
        return ((Up0) this.f24591a.get()).j(pp0);
    }
}
