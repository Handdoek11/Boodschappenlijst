package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import q.C6397a;

/* loaded from: classes.dex */
public final class KJ implements EC {

    /* renamed from: o, reason: collision with root package name */
    private final HI f16573o;

    /* renamed from: s, reason: collision with root package name */
    private final MI f16574s;

    /* renamed from: t, reason: collision with root package name */
    private final Executor f16575t;

    /* renamed from: u, reason: collision with root package name */
    private final Executor f16576u;

    public KJ(HI hi, MI mi, Executor executor, Executor executor2) {
        this.f16573o = hi;
        this.f16574s = mi;
        this.f16575t = executor;
        this.f16576u = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final InterfaceC4410vt interfaceC4410vt) {
        this.f16575t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.IJ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4410vt.D0("onSdkImpression", new C6397a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void r() {
        if (this.f16574s.d()) {
            HI hi = this.f16573o;
            C3929rT h02 = hi.h0();
            if (h02 == null && hi.j0() != null && ((Boolean) D2.A.c().a(AbstractC3184kf.f23943l5)).booleanValue()) {
                HI hi2 = this.f16573o;
                com.google.common.util.concurrent.d j02 = hi2.j0();
                C1811Tq c02 = hi2.c0();
                if (j02 == null || c02 == null) {
                    return;
                }
                AbstractC2326ck0.r(AbstractC2326ck0.l(j02, c02), new JJ(this), this.f16576u);
                return;
            }
            if (h02 != null) {
                HI hi3 = this.f16573o;
                InterfaceC4410vt e02 = hi3.e0();
                InterfaceC4410vt f02 = hi3.f0();
                if (e02 == null) {
                    e02 = f02 != null ? f02 : null;
                }
                if (e02 != null) {
                    b(e02);
                }
            }
        }
    }
}
