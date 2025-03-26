package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.c10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2252c10 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f21046a;

    public C2252c10(Bundle bundle) {
        this.f21046a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        Bundle a8 = Y60.a(bundle, "device");
        a8.putBundle("android_mem_info", this.f21046a);
        bundle.putBundle("device", a8);
    }
}
