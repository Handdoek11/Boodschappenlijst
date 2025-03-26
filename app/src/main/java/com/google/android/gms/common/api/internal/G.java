package com.google.android.gms.common.api.internal;

import A3.C0377k;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.internal.C1092d;

/* loaded from: classes.dex */
public final class G extends C {

    /* renamed from: c, reason: collision with root package name */
    public final C1092d.a f13269c;

    public G(C1092d.a aVar, C0377k c0377k) {
        super(4, c0377k);
        this.f13269c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final /* bridge */ /* synthetic */ void d(C1100l c1100l, boolean z7) {
    }

    @Override // X2.s
    public final boolean f(s sVar) {
        X2.u uVar = (X2.u) sVar.u().get(this.f13269c);
        return uVar != null && uVar.f5933a.f();
    }

    @Override // X2.s
    public final C1105d[] g(s sVar) {
        X2.u uVar = (X2.u) sVar.u().get(this.f13269c);
        if (uVar == null) {
            return null;
        }
        return uVar.f5933a.c();
    }

    @Override // com.google.android.gms.common.api.internal.C
    public final void h(s sVar) {
        X2.u uVar = (X2.u) sVar.u().remove(this.f13269c);
        if (uVar == null) {
            this.f13263b.e(Boolean.FALSE);
            return;
        }
        uVar.f5934b.b(sVar.s(), this.f13263b);
        uVar.f5933a.a();
    }
}
