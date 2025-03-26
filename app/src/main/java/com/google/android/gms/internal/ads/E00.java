package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class E00 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14618a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14619b;

    public E00(String str, boolean z7) {
        this.f14618a = str;
        this.f14619b = z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((KB) obj).f16552b.putString("gct", this.f14618a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        bundle.putString("gct", this.f14618a);
        if (this.f14619b) {
            bundle.putString("de", "1");
        }
    }
}
