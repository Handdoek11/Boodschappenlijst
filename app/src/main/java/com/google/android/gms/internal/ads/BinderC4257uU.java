package com.google.android.gms.internal.ads;

import i3.InterfaceC5852a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.uU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4257uU extends AbstractBinderC1844Uo implements VC {

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC1879Vo f27061o;

    /* renamed from: s, reason: collision with root package name */
    private UC f27062s;

    /* renamed from: t, reason: collision with root package name */
    private CG f27063t;

    @Override // com.google.android.gms.internal.ads.VC
    public final synchronized void J0(UC uc) {
        this.f27062s = uc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1879Vo
    public final synchronized void R2(InterfaceC5852a interfaceC5852a) {
        CG cg = this.f27063t;
        if (cg != null) {
            Executor executor = ((ZV) cg).f20490d.f20885b;
            final C4801zT c4801zT = ((ZV) cg).f20489c;
            final C3785q60 c3785q60 = ((ZV) cg).f20488b;
            final C60 c60 = ((ZV) cg).f20487a;
            final ZV zv = (ZV) cg;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.YV
                @Override // java.lang.Runnable
                public final void run() {
                    C2193bW c2193bW = zv.f20490d;
                    C2193bW.e(c60, c3785q60, c4801zT);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1879Vo
    public final synchronized void T5(InterfaceC5852a interfaceC5852a) {
        InterfaceC1879Vo interfaceC1879Vo = this.f27061o;
        if (interfaceC1879Vo != null) {
            ((BinderC2084aW) interfaceC1879Vo).f20712t.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1879Vo
    public final synchronized void U(InterfaceC5852a interfaceC5852a) {
        InterfaceC1879Vo interfaceC1879Vo = this.f27061o;
        if (interfaceC1879Vo != null) {
            ((BinderC2084aW) interfaceC1879Vo).f20710o.r3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1879Vo
    public final synchronized void Y5(InterfaceC5852a interfaceC5852a, int i8) {
        CG cg = this.f27063t;
        if (cg != null) {
            H2.p.g("Fail to initialize adapter ".concat(String.valueOf(((ZV) cg).f20489c.f28626a)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1879Vo
    public final synchronized void c7(InterfaceC5852a interfaceC5852a, C1914Wo c1914Wo) {
        InterfaceC1879Vo interfaceC1879Vo = this.f27061o;
        if (interfaceC1879Vo != null) {
            ((BinderC2084aW) interfaceC1879Vo).f20713u.P0(c1914Wo);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1879Vo
    public final synchronized void d3(InterfaceC5852a interfaceC5852a, int i8) {
        UC uc = this.f27062s;
        if (uc != null) {
            uc.m(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1879Vo
    public final synchronized void j0(InterfaceC5852a interfaceC5852a) {
        UC uc = this.f27062s;
        if (uc != null) {
            uc.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1879Vo
    public final synchronized void n7(InterfaceC5852a interfaceC5852a) {
        InterfaceC1879Vo interfaceC1879Vo = this.f27061o;
        if (interfaceC1879Vo != null) {
            ((BinderC2084aW) interfaceC1879Vo).f20713u.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1879Vo
    public final synchronized void u0(InterfaceC5852a interfaceC5852a) {
        InterfaceC1879Vo interfaceC1879Vo = this.f27061o;
        if (interfaceC1879Vo != null) {
            interfaceC1879Vo.u0(interfaceC5852a);
        }
    }

    public final synchronized void u7(InterfaceC1879Vo interfaceC1879Vo) {
        this.f27061o = interfaceC1879Vo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1879Vo
    public final synchronized void v0(InterfaceC5852a interfaceC5852a) {
        InterfaceC1879Vo interfaceC1879Vo = this.f27061o;
        if (interfaceC1879Vo != null) {
            ((BinderC2084aW) interfaceC1879Vo).f20712t.b();
        }
    }

    public final synchronized void v7(CG cg) {
        this.f27063t = cg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1879Vo
    public final synchronized void zze(InterfaceC5852a interfaceC5852a) {
        InterfaceC1879Vo interfaceC1879Vo = this.f27061o;
        if (interfaceC1879Vo != null) {
            ((BinderC2084aW) interfaceC1879Vo).f20711s.I0();
        }
    }
}
