package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class P10 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18102a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f18103b;

    public P10(String str, Bundle bundle) {
        this.f18102a = str;
        this.f18103b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        KB kb = (KB) obj;
        kb.f16551a.putString("rtb", this.f18102a);
        if (this.f18103b.isEmpty()) {
            return;
        }
        kb.f16551a.putBundle("adapter_initialization_status", this.f18103b);
    }
}
