package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class CC extends AbstractC2714gF {

    /* renamed from: s, reason: collision with root package name */
    private boolean f14116s;

    public CC(Set set) {
        super(set);
        this.f14116s = false;
    }

    public final synchronized void zza() {
        if (this.f14116s) {
            return;
        }
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.BC
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((EC) obj).r();
            }
        });
        this.f14116s = true;
    }
}
