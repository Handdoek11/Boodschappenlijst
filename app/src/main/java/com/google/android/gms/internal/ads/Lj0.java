package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class Lj0 extends AbstractC1168Bj0 {

    /* renamed from: G, reason: collision with root package name */
    private List f16873G;

    Lj0(AbstractC3625oh0 abstractC3625oh0, boolean z7) {
        super(abstractC3625oh0, z7, true);
        List emptyList = abstractC3625oh0.isEmpty() ? Collections.emptyList() : AbstractC1487Kh0.a(abstractC3625oh0.size());
        for (int i8 = 0; i8 < abstractC3625oh0.size(); i8++) {
            emptyList.add(null);
        }
        this.f16873G = emptyList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1168Bj0
    final void R(int i8, Object obj) {
        List list = this.f16873G;
        if (list != null) {
            list.set(i8, new Kj0(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1168Bj0
    final void S() {
        List list = this.f16873G;
        if (list != null) {
            e(X(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1168Bj0
    final void W(int i8) {
        super.W(i8);
        this.f16873G = null;
    }

    abstract Object X(List list);
}
