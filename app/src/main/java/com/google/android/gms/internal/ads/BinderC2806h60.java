package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import i3.BinderC5853b;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.h60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2806h60 extends AbstractBinderC2335cp {

    /* renamed from: A, reason: collision with root package name */
    private boolean f22480A = ((Boolean) D2.A.c().a(AbstractC3184kf.f23743O0)).booleanValue();

    /* renamed from: o, reason: collision with root package name */
    private final C2371d60 f22481o;

    /* renamed from: s, reason: collision with root package name */
    private final S50 f22482s;

    /* renamed from: t, reason: collision with root package name */
    private final String f22483t;

    /* renamed from: u, reason: collision with root package name */
    private final D60 f22484u;

    /* renamed from: v, reason: collision with root package name */
    private final Context f22485v;

    /* renamed from: w, reason: collision with root package name */
    private final H2.a f22486w;

    /* renamed from: x, reason: collision with root package name */
    private final N9 f22487x;

    /* renamed from: y, reason: collision with root package name */
    private final HN f22488y;

    /* renamed from: z, reason: collision with root package name */
    private IL f22489z;

    public BinderC2806h60(String str, C2371d60 c2371d60, Context context, S50 s50, D60 d60, H2.a aVar, N9 n9, HN hn) {
        this.f22483t = str;
        this.f22481o = c2371d60;
        this.f22482s = s50;
        this.f22484u = d60;
        this.f22485v = context;
        this.f22486w = aVar;
        this.f22487x = n9;
        this.f22488y = hn;
    }

    private final synchronized void x7(D2.X1 x12, InterfaceC3204kp interfaceC3204kp, int i8) {
        try {
            if (!x12.B0()) {
                boolean z7 = false;
                if (((Boolean) AbstractC3077jg.f23305k.e()).booleanValue()) {
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.bb)).booleanValue()) {
                        z7 = true;
                    }
                }
                if (this.f22486w.f2916t < ((Integer) D2.A.c().a(AbstractC3184kf.cb)).intValue() || !z7) {
                    Z2.r.e("#008 Must be called on the main UI thread.");
                }
            }
            this.f22482s.t(interfaceC3204kp);
            C2.v.t();
            if (G2.D0.i(this.f22485v) && x12.f1178J == null) {
                H2.p.d("Failed to load the ad because app ID is missing.");
                this.f22482s.r0(AbstractC3351m70.d(4, null, null));
                return;
            }
            if (this.f22489z != null) {
                return;
            }
            U50 u50 = new U50(null);
            this.f22481o.i(i8);
            this.f22481o.a(x12, this.f22483t, u50, new C2697g60(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final synchronized void E3(C4075sp c4075sp) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        D60 d60 = this.f22484u;
        d60.f14414a = c4075sp.f26744o;
        d60.f14415b = c4075sp.f26745s;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void G3(InterfaceC2770gp interfaceC2770gp) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        this.f22482s.r(interfaceC2770gp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void M3(D2.N0 n02) {
        Z2.r.e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!n02.c()) {
                this.f22488y.e();
            }
        } catch (RemoteException e8) {
            H2.p.c("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f22482s.n(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void Z2(C3313lp c3313lp) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        this.f22482s.E(c3313lp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final D2.U0 a() {
        IL il;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23653C6)).booleanValue() && (il = this.f22489z) != null) {
            return il.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final synchronized String b() {
        IL il = this.f22489z;
        if (il == null || il.c() == null) {
            return null;
        }
        return il.c().g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final InterfaceC2118ap d() {
        Z2.r.e("#008 Must be called on the main UI thread.");
        IL il = this.f22489z;
        if (il != null) {
            return il.j();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final synchronized void f2(InterfaceC5852a interfaceC5852a, boolean z7) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        if (this.f22489z == null) {
            H2.p.g("Rewarded can not be shown before loaded");
            this.f22482s.m(AbstractC3351m70.d(9, null, null));
            return;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23785T2)).booleanValue()) {
            this.f22487x.c().c(new Throwable().getStackTrace());
        }
        this.f22489z.o(z7, (Activity) BinderC5853b.J0(interfaceC5852a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final synchronized void k3(D2.X1 x12, InterfaceC3204kp interfaceC3204kp) {
        x7(x12, interfaceC3204kp, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final synchronized void n2(D2.X1 x12, InterfaceC3204kp interfaceC3204kp) {
        x7(x12, interfaceC3204kp, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final boolean o() {
        Z2.r.e("#008 Must be called on the main UI thread.");
        IL il = this.f22489z;
        return (il == null || il.m()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void o7(D2.K0 k02) {
        if (k02 == null) {
            this.f22482s.g(null);
        } else {
            this.f22482s.g(new C2588f60(this, k02));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final synchronized void t5(InterfaceC5852a interfaceC5852a) {
        f2(interfaceC5852a, this.f22480A);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final synchronized void x4(boolean z7) {
        Z2.r.e("setImmersiveMode must be called on the main UI thread.");
        this.f22480A = z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final Bundle zzb() {
        Z2.r.e("#008 Must be called on the main UI thread.");
        IL il = this.f22489z;
        return il != null ? il.i() : new Bundle();
    }
}
