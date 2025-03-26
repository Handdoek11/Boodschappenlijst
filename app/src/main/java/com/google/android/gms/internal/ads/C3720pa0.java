package com.google.android.gms.internal.ads;

import D2.InterfaceC0491c0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import f3.InterfaceC5781e;
import i3.BinderC5853b;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.pa0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3720pa0 extends AbstractC1647Pa0 {
    public C3720pa0(ClientApi clientApi, Context context, int i8, InterfaceC1242Dl interfaceC1242Dl, D2.I1 i12, InterfaceC0491c0 interfaceC0491c0, ScheduledExecutorService scheduledExecutorService, C3502na0 c3502na0, InterfaceC5781e interfaceC5781e) {
        super(clientApi, context, i8, interfaceC1242Dl, i12, interfaceC0491c0, scheduledExecutorService, c3502na0, interfaceC5781e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1647Pa0
    protected final com.google.common.util.concurrent.d e() {
        C4611xk0 D7 = C4611xk0.D();
        D2.V A42 = this.f18207a.A4(BinderC5853b.p2(this.f18208b), new D2.c2(), this.f18211e.f1147o, this.f18210d, this.f18209c);
        if (A42 != null) {
            try {
                A42.R4(this.f18211e.f1149t, new BinderC3611oa0(this, D7, A42));
            } catch (RemoteException e8) {
                H2.p.h("Failed to load interstitial ad.", e8);
                D7.h(new zzfjc(1, "remote exception"));
            }
        } else {
            D7.h(new zzfjc(1, "Failed to create an interstitial ad manager."));
        }
        return D7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1647Pa0
    protected final /* bridge */ /* synthetic */ Optional f(Object obj) {
        try {
            return Optional.ofNullable(((D2.V) obj).i());
        } catch (RemoteException e8) {
            H2.p.c("Failed to get response info for  the interstitial ad.", e8);
            return Optional.empty();
        }
    }
}
