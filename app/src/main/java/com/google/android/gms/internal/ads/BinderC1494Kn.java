package com.google.android.gms.internal.ads;

import D2.C0539s1;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Kn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC1494Kn extends AbstractBinderC2663fq {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ O2.b f16632o;

    BinderC1494Kn(C1529Ln c1529Ln, O2.b bVar) {
        this.f16632o = bVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2772gq
    public final void a2(String str, String str2, Bundle bundle) {
        this.f16632o.b(new O2.a(new C0539s1(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2772gq
    public final void v(String str) {
        this.f16632o.a(str);
    }
}
