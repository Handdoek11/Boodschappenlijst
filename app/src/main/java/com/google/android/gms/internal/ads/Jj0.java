package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class Jj0 extends Lj0 {
    Jj0(AbstractC3625oh0 abstractC3625oh0, boolean z7) {
        super(abstractC3625oh0, z7);
        T();
    }

    @Override // com.google.android.gms.internal.ads.Lj0
    public final /* bridge */ /* synthetic */ Object X(List list) {
        ArrayList a8 = AbstractC1487Kh0.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Kj0 kj0 = (Kj0) it.next();
            a8.add(kj0 != null ? kj0.f16618a : null);
        }
        return DesugarCollections.unmodifiableList(a8);
    }
}
