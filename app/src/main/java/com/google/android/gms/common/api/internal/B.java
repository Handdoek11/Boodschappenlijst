package com.google.android.gms.common.api.internal;

import A3.C0377k;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC1096h;

/* loaded from: classes.dex */
final class B extends AbstractC1096h {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC1096h.a f13249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(AbstractC1096h.a aVar, C1105d[] c1105dArr, boolean z7, int i8) {
        super(c1105dArr, z7, i8);
        this.f13249d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1096h
    protected final void b(a.b bVar, C0377k c0377k) {
        this.f13249d.f13331a.accept(bVar, c0377k);
    }
}
