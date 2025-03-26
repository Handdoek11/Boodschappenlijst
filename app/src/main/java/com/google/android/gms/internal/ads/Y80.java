package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class Y80 implements VF, AC, InterfaceC2064aG {

    /* renamed from: o, reason: collision with root package name */
    private final RunnableC3464n90 f20214o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC2160b90 f20215s;

    Y80(Context context, RunnableC3464n90 runnableC3464n90) {
        this.f20214o = runnableC3464n90;
        this.f20215s = AbstractC2051a90.a(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void j() {
        if (((Boolean) AbstractC2534eg.f21868d.e()).booleanValue()) {
            this.f20215s.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.AC
    public final void m(D2.W0 w02) {
        if (((Boolean) AbstractC2534eg.f21868d.e()).booleanValue()) {
            RunnableC3464n90 runnableC3464n90 = this.f20214o;
            InterfaceC2160b90 interfaceC2160b90 = this.f20215s;
            interfaceC2160b90.C(w02.A0().toString());
            interfaceC2160b90.I0(false);
            runnableC3464n90.a(interfaceC2160b90);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2064aG
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2064aG
    public final void zzb() {
        if (((Boolean) AbstractC2534eg.f21868d.e()).booleanValue()) {
            RunnableC3464n90 runnableC3464n90 = this.f20214o;
            InterfaceC2160b90 interfaceC2160b90 = this.f20215s;
            interfaceC2160b90.I0(true);
            runnableC3464n90.a(interfaceC2160b90);
        }
    }
}
