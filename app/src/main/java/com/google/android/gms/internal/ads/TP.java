package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class TP implements JD, DG {

    /* renamed from: o, reason: collision with root package name */
    private final Context f19128o;

    /* renamed from: s, reason: collision with root package name */
    private final HN f19129s;

    TP(Context context, HN hn) {
        this.f19128o = context;
        this.f19129s = hn;
    }

    private final void c(final Context context) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23683G4)).booleanValue()) {
            AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.RP
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18648o.b(context);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void E(String str) {
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void Q(C4618xo c4618xo) {
        c(this.f19128o);
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void T0(C60 c60) {
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void a(M2.N n8) {
        c(this.f19128o);
    }

    final /* synthetic */ void b(Context context) {
        C2.v.i().d(context, this.f19129s);
    }
}
