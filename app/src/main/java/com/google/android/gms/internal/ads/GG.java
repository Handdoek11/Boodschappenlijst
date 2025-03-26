package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class GG extends AbstractC2714gF {
    GG(Set set) {
        super(set);
    }

    public final synchronized void m1(final M2.N n8) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.EG
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((DG) obj).a(n8);
            }
        });
    }

    public final synchronized void p1(final String str) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.FG
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((DG) obj).E(str);
            }
        });
    }
}
