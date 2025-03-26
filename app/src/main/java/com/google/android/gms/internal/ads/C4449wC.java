package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4449wC extends AbstractC2714gF implements InterfaceC3469nC {
    public C4449wC(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3469nC
    public final void T(final zzdgb zzdgbVar) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.tC
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                AC ac = (AC) obj;
                String message = zzdgbVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                ac.m(AbstractC3351m70.d(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3469nC
    public final void o(final D2.W0 w02) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.vC
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((AC) obj).m(w02);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3469nC
    public final void zzb() {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.uC
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((AC) obj).m(AbstractC3351m70.d(11, null, null));
            }
        });
    }
}
