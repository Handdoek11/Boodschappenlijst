package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class CR implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4618xo f14166a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3747po f14167b;

    CR(GR gr, C4618xo c4618xo, InterfaceC3747po interfaceC3747po) {
        this.f14166a = c4618xo;
        this.f14167b = interfaceC3747po;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        try {
            this.f14167b.T6(G2.C.B0(th));
        } catch (RemoteException e8) {
            AbstractC0608p0.l("Service can't call client", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue()) {
                this.f14167b.f4(parcelFileDescriptor);
                return;
            }
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23940l2)).booleanValue() && (bundle = this.f14166a.f27914D) != null) {
                bundle.putLong(EnumC3706pN.BINDER_CALL_START.a(), C2.v.c().a());
            }
            this.f14167b.y6(parcelFileDescriptor, this.f14166a);
        } catch (RemoteException e8) {
            AbstractC0608p0.l("Service can't call client", e8);
        }
    }
}
