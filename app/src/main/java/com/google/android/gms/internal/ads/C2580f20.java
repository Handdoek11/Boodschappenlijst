package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.f20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2580f20 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f21922a;

    public C2580f20(Bundle bundle) {
        this.f21922a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        KB kb = (KB) obj;
        if (this.f21922a.isEmpty()) {
            return;
        }
        kb.f16552b.putBundle("shared_pref", this.f21922a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        KB kb = (KB) obj;
        if (this.f21922a.isEmpty()) {
            return;
        }
        kb.f16551a.putBundle("shared_pref", this.f21922a);
    }
}
