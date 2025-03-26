package com.google.android.gms.common.api.internal;

import A3.C0377k;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C1095g;

/* loaded from: classes.dex */
final class z extends AbstractC1094f {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C1095g.a f13384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(C1095g.a aVar, C1092d c1092d, C1105d[] c1105dArr, boolean z7, int i8) {
        super(c1092d, c1105dArr, z7, i8);
        this.f13384e = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1094f
    protected final void d(a.b bVar, C0377k c0377k) {
        this.f13384e.f13321a.accept(bVar, c0377k);
    }
}
