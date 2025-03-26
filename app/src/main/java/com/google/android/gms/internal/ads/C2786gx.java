package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.gx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2786gx implements FC {

    /* renamed from: o, reason: collision with root package name */
    private final C3024j70 f22462o;

    public C2786gx(C3024j70 c3024j70) {
        this.f22462o = c3024j70;
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final void e(Context context) {
        try {
            this.f22462o.l();
        } catch (zzfcq e8) {
            H2.p.h("Cannot invoke onDestroy for the mediation adapter.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final void i(Context context) {
        try {
            this.f22462o.y();
        } catch (zzfcq e8) {
            H2.p.h("Cannot invoke onPause for the mediation adapter.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final void p(Context context) {
        try {
            this.f22462o.z();
            if (context != null) {
                this.f22462o.x(context);
            }
        } catch (zzfcq e8) {
            H2.p.h("Cannot invoke onResume for the mediation adapter.", e8);
        }
    }
}
