package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.z10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4755z10 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f28260a;

    public C4755z10(Bundle bundle) {
        this.f28260a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = this.f28260a;
        KB kb = (KB) obj;
        if (bundle != null) {
            kb.f16552b.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = this.f28260a;
        KB kb = (KB) obj;
        if (bundle != null) {
            kb.f16551a.putAll(bundle);
        }
    }
}
