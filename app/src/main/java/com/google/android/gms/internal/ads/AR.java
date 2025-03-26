package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class AR implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2768go f13554a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3856qo f13555b;

    AR(GR gr, C3856qo c3856qo, C2768go c2768go) {
        this.f13555b = c3856qo;
        this.f13554a = c2768go;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        try {
            this.f13555b.T6(G2.C.B0(th));
        } catch (RemoteException e8) {
            AbstractC0608p0.l("Service can't call client", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            this.f13555b.q2((String) obj, this.f13554a);
        } catch (RemoteException e8) {
            AbstractC0608p0.l("Service can't call client", e8);
        }
    }
}
