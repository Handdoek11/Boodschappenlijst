package com.google.android.gms.common.api.internal;

import A3.C0377k;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C1092d;
import com.google.android.gms.common.api.internal.C1095g;

/* loaded from: classes.dex */
final class A extends AbstractC1097i {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1095g.a f13248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(C1095g.a aVar, C1092d.a aVar2) {
        super(aVar2);
        this.f13248b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1097i
    protected final void b(a.b bVar, C0377k c0377k) {
        this.f13248b.f13322b.accept(bVar, c0377k);
    }
}
