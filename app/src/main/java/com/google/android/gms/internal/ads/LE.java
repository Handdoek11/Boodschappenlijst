package com.google.android.gms.internal.ads;

import java.util.Set;
import x2.InterfaceC6905d;

/* loaded from: classes.dex */
public final class LE extends AbstractC2714gF implements InterfaceC2756gi {
    public LE(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756gi
    public final synchronized void m(final String str, final String str2) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.KE
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((InterfaceC6905d) obj).n(str, str2);
            }
        });
    }
}
