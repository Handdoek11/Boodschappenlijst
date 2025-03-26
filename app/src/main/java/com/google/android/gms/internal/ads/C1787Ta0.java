package com.google.android.gms.internal.ads;

import D2.InterfaceC0491c0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import f3.InterfaceC5781e;
import i3.BinderC5853b;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Ta0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1787Ta0 extends AbstractC1647Pa0 {
    public C1787Ta0(ClientApi clientApi, Context context, int i8, InterfaceC1242Dl interfaceC1242Dl, D2.I1 i12, InterfaceC0491c0 interfaceC0491c0, ScheduledExecutorService scheduledExecutorService, C3502na0 c3502na0, InterfaceC5781e interfaceC5781e) {
        super(clientApi, context, i8, interfaceC1242Dl, i12, interfaceC0491c0, scheduledExecutorService, c3502na0, interfaceC5781e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1647Pa0
    protected final com.google.common.util.concurrent.d e() {
        C4611xk0 D7 = C4611xk0.D();
        InterfaceC2443dp O62 = this.f18207a.O6(BinderC5853b.p2(this.f18208b), this.f18211e.f1147o, this.f18210d, this.f18209c);
        BinderC1752Sa0 binderC1752Sa0 = new BinderC1752Sa0(this, D7, O62);
        if (O62 != null) {
            try {
                O62.n2(this.f18211e.f1149t, binderC1752Sa0);
            } catch (RemoteException unused) {
                H2.p.g("Failed to load rewarded ad.");
                D7.h(new zzfjc(1, "remote exception"));
            }
        } else {
            D7.h(new zzfjc(1, "Failed to create a rewarded ad."));
        }
        return D7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1647Pa0
    protected final /* bridge */ /* synthetic */ Optional f(Object obj) {
        try {
            return Optional.ofNullable(((InterfaceC2443dp) obj).a());
        } catch (RemoteException e8) {
            H2.p.c("Failed to get response info for the rewarded ad.", e8);
            return Optional.empty();
        }
    }
}
