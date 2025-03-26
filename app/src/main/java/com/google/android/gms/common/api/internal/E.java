package com.google.android.gms.common.api.internal;

import A3.C0377k;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.internal.C1092d;

/* loaded from: classes.dex */
public final class E extends C {

    /* renamed from: c, reason: collision with root package name */
    public final X2.u f13265c;

    public E(X2.u uVar, C0377k c0377k) {
        super(3, c0377k);
        this.f13265c = uVar;
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final /* bridge */ /* synthetic */ void d(C1100l c1100l, boolean z7) {
    }

    @Override // X2.s
    public final boolean f(s sVar) {
        return this.f13265c.f5933a.f();
    }

    @Override // X2.s
    public final C1105d[] g(s sVar) {
        return this.f13265c.f5933a.c();
    }

    @Override // com.google.android.gms.common.api.internal.C
    public final void h(s sVar) {
        this.f13265c.f5933a.d(sVar.s(), this.f13263b);
        C1092d.a b8 = this.f13265c.f5933a.b();
        if (b8 != null) {
            sVar.u().put(b8, this.f13265c);
        }
    }
}
