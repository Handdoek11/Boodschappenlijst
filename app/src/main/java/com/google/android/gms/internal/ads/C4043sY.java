package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.sY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4043sY implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f26696a;

    C4043sY(Set set) {
        this.f26696a = set;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f26696a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return AbstractC2326ck0.h(new C3826qY(arrayList, null));
    }
}
