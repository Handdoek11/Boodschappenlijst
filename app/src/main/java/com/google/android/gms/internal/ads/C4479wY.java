package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.wY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4479wY implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f27505a;

    C4479wY(Bundle bundle) {
        this.f27505a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        KB kb = (KB) obj;
        if (this.f27505a.isEmpty()) {
            return;
        }
        kb.f16551a.putBundle("installed_adapter_data", this.f27505a);
    }
}
