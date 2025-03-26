package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class DY implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14507a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14508b;

    public DY(String str, boolean z7) {
        this.f14507a = str;
        this.f14508b = z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        String str = this.f14507a;
        KB kb = (KB) obj;
        if (str != null) {
            Bundle a8 = Y60.a(kb.f16551a, "pii");
            a8.putString("afai", str);
            a8.putBoolean("is_afai_lat", this.f14508b);
        }
    }
}
