package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import q.C6397a;

/* renamed from: com.google.android.gms.internal.ads.xz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4640xz implements ZC, EC {

    /* renamed from: o, reason: collision with root package name */
    private final Context f27947o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC4410vt f27948s;

    /* renamed from: t, reason: collision with root package name */
    private final C3785q60 f27949t;

    /* renamed from: u, reason: collision with root package name */
    private final H2.a f27950u;

    /* renamed from: v, reason: collision with root package name */
    private C3929rT f27951v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f27952w;

    /* renamed from: x, reason: collision with root package name */
    private final C3712pT f27953x;

    public C4640xz(Context context, InterfaceC4410vt interfaceC4410vt, C3785q60 c3785q60, H2.a aVar, C3712pT c3712pT) {
        this.f27947o = context;
        this.f27948s = interfaceC4410vt;
        this.f27949t = c3785q60;
        this.f27950u = aVar;
        this.f27953x = c3712pT;
    }

    private final synchronized void a() {
        EnumC3603oT enumC3603oT;
        EnumC3494nT enumC3494nT;
        try {
            if (this.f27949t.f25771T && this.f27948s != null) {
                if (C2.v.b().f(this.f27947o)) {
                    H2.a aVar = this.f27950u;
                    String str = aVar.f2915s + "." + aVar.f2916t;
                    O60 o60 = this.f27949t.f25773V;
                    String a8 = o60.a();
                    if (o60.c() == 1) {
                        enumC3494nT = EnumC3494nT.VIDEO;
                        enumC3603oT = EnumC3603oT.DEFINED_BY_JAVASCRIPT;
                    } else {
                        C3785q60 c3785q60 = this.f27949t;
                        EnumC3494nT enumC3494nT2 = EnumC3494nT.HTML_DISPLAY;
                        enumC3603oT = c3785q60.f25786e == 1 ? EnumC3603oT.ONE_PIXEL : EnumC3603oT.BEGIN_TO_RENDER;
                        enumC3494nT = enumC3494nT2;
                    }
                    this.f27951v = C2.v.b().k(str, this.f27948s.A(), "", "javascript", a8, enumC3603oT, enumC3494nT, this.f27949t.f25801l0);
                    View M7 = this.f27948s.M();
                    C3929rT c3929rT = this.f27951v;
                    if (c3929rT != null) {
                        AbstractC1927Xa0 a9 = c3929rT.a();
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23880e5)).booleanValue()) {
                            C2.v.b().c(a9, this.f27948s.A());
                            Iterator it = this.f27948s.E0().iterator();
                            while (it.hasNext()) {
                                C2.v.b().d(a9, (View) it.next());
                            }
                        } else {
                            C2.v.b().c(a9, M7);
                        }
                        this.f27948s.n1(this.f27951v);
                        C2.v.b().e(a9);
                        this.f27952w = true;
                        this.f27948s.D0("onSdkLoaded", new C6397a());
                    }
                }
            }
        } finally {
        }
    }

    private final boolean b() {
        return ((Boolean) D2.A.c().a(AbstractC3184kf.f23889f5)).booleanValue() && this.f27953x.d();
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final synchronized void r() {
        InterfaceC4410vt interfaceC4410vt;
        if (b()) {
            this.f27953x.b();
            return;
        }
        if (!this.f27952w) {
            a();
        }
        if (!this.f27949t.f25771T || this.f27951v == null || (interfaceC4410vt = this.f27948s) == null) {
            return;
        }
        interfaceC4410vt.D0("onSdkImpression", new C6397a());
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final synchronized void s() {
        if (b()) {
            this.f27953x.c();
        } else {
            if (this.f27952w) {
                return;
            }
            a();
        }
    }
}
