package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.lZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3282lZ implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final double f24341a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24342b;

    public C3282lZ(double d8, boolean z7) {
        this.f24341a = d8;
        this.f24342b = z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        Bundle a8 = Y60.a(bundle, "device");
        bundle.putBundle("device", a8);
        Bundle a9 = Y60.a(a8, "battery");
        a8.putBundle("battery", a9);
        a9.putBoolean("is_charging", this.f24342b);
        a9.putDouble("battery_level", this.f24341a);
    }
}
