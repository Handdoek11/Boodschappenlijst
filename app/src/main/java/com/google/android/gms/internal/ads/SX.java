package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class SX implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18920a;

    public SX(boolean z7) {
        this.f18920a = z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ((KB) obj).f16551a.putString("adid_p", true != this.f18920a ? "0" : "1");
    }
}
