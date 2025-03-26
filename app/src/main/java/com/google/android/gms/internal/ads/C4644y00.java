package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.y00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4644y00 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final String f27958a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27959b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f27960c;

    /* synthetic */ C4644y00(String str, String str2, Bundle bundle, AbstractC4753z00 abstractC4753z00) {
        this.f27958a = str;
        this.f27959b = str2;
        this.f27960c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        bundle.putString("consent_string", this.f27958a);
        bundle.putString("fc_consent", this.f27959b);
        Bundle bundle2 = this.f27960c;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
