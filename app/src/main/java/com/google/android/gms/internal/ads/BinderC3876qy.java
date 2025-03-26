package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import i3.BinderC5853b;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.qy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC3876qy extends AbstractBinderC3940rc {

    /* renamed from: o, reason: collision with root package name */
    private final C3767py f26032o;

    /* renamed from: s, reason: collision with root package name */
    private final D2.V f26033s;

    /* renamed from: t, reason: collision with root package name */
    private final C3018j40 f26034t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f26035u = ((Boolean) D2.A.c().a(AbstractC3184kf.f23767R0)).booleanValue();

    /* renamed from: v, reason: collision with root package name */
    private final HN f26036v;

    public BinderC3876qy(C3767py c3767py, D2.V v7, C3018j40 c3018j40, HN hn) {
        this.f26032o = c3767py;
        this.f26033s = v7;
        this.f26034t = c3018j40;
        this.f26036v = hn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049sc
    public final void I0(boolean z7) {
        this.f26035u = z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049sc
    public final D2.V b() {
        return this.f26033s;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049sc
    public final D2.U0 c() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23653C6)).booleanValue()) {
            return this.f26032o.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049sc
    public final void l5(D2.N0 n02) {
        Z2.r.e("setOnPaidEventListener must be called on the main UI thread.");
        if (this.f26034t != null) {
            try {
                if (!n02.c()) {
                    this.f26036v.e();
                }
            } catch (RemoteException e8) {
                H2.p.c("Error in making CSI ping for reporting paid event callback", e8);
            }
            this.f26034t.o(n02);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049sc
    public final void q5(InterfaceC5852a interfaceC5852a, InterfaceC4812zc interfaceC4812zc) {
        try {
            this.f26034t.t(interfaceC4812zc);
            this.f26032o.k((Activity) BinderC5853b.J0(interfaceC5852a), interfaceC4812zc, this.f26035u);
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }
}
