package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.fD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2601fD extends AbstractC2714gF implements InterfaceC2538ei {

    /* renamed from: s, reason: collision with root package name */
    private final Bundle f21967s;

    C2601fD(Set set) {
        super(set);
        this.f21967s = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2538ei
    public final synchronized void E(String str, Bundle bundle) {
        this.f21967s.putAll(bundle);
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.eD
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((P2.a) obj).i();
            }
        });
    }

    public final synchronized Bundle m1() {
        return new Bundle(this.f21967s);
    }
}
