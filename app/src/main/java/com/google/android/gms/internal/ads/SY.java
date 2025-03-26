package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class SY implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    final String f18921a;

    /* renamed from: b, reason: collision with root package name */
    final int f18922b;

    public SY(String str, int i8) {
        this.f18921a = str;
        this.f18922b = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        if (TextUtils.isEmpty(this.f18921a) || this.f18922b == -1) {
            return;
        }
        Bundle a8 = Y60.a(bundle, "pii");
        bundle.putBundle("pii", a8);
        a8.putString("pvid", this.f18921a);
        a8.putInt("pvid_s", this.f18922b);
    }
}
