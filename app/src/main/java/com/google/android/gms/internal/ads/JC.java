package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class JC extends AbstractC2714gF {
    public JC(Set set) {
        super(set);
    }

    public final void m1(final Context context) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.IC
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((FC) obj).e(context);
            }
        });
    }

    public final void p1(final Context context) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.GC
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((FC) obj).i(context);
            }
        });
    }

    public final void q1(final Context context) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.HC
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((FC) obj).p(context);
            }
        });
    }
}
