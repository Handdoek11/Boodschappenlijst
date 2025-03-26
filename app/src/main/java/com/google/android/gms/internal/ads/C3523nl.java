package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3523nl {

    /* renamed from: a, reason: collision with root package name */
    private final C1700Qk f25034a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.common.util.concurrent.d f25035b;

    C3523nl(C1700Qk c1700Qk) {
        this.f25034a = c1700Qk;
    }

    private final void d() {
        if (this.f25035b == null) {
            final C1811Tq c1811Tq = new C1811Tq();
            this.f25035b = c1811Tq;
            this.f25034a.b(null).f(new InterfaceC1951Xq() { // from class: com.google.android.gms.internal.ads.kl
                @Override // com.google.android.gms.internal.ads.InterfaceC1951Xq
                public final void a(Object obj) {
                    c1811Tq.c((InterfaceC1735Rk) obj);
                }
            }, new InterfaceC1881Vq() { // from class: com.google.android.gms.internal.ads.ll
                @Override // com.google.android.gms.internal.ads.InterfaceC1881Vq
                public final void zza() {
                    c1811Tq.d(new zzbnv("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final C3850ql a(String str, InterfaceC1910Wk interfaceC1910Wk, InterfaceC1875Vk interfaceC1875Vk) {
        d();
        return new C3850ql(this.f25035b, "google.afma.activeView.handleUpdate", interfaceC1910Wk, interfaceC1875Vk);
    }

    public final void b(final String str, final InterfaceC1662Pi interfaceC1662Pi) {
        d();
        this.f25035b = AbstractC2326ck0.n(this.f25035b, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.ml
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                InterfaceC1735Rk interfaceC1735Rk = (InterfaceC1735Rk) obj;
                interfaceC1735Rk.H0(str, interfaceC1662Pi);
                return AbstractC2326ck0.h(interfaceC1735Rk);
            }
        }, AbstractC1497Kq.f16650g);
    }

    public final void c(final String str, final InterfaceC1662Pi interfaceC1662Pi) {
        this.f25035b = AbstractC2326ck0.m(this.f25035b, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.jl
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                InterfaceC1735Rk interfaceC1735Rk = (InterfaceC1735Rk) obj;
                interfaceC1735Rk.M0(str, interfaceC1662Pi);
                return interfaceC1735Rk;
            }
        }, AbstractC1497Kq.f16650g);
    }
}
