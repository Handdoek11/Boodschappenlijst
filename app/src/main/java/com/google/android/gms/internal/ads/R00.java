package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class R00 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f18583a;

    public R00(Boolean bool) {
        this.f18583a = bool;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Boolean bool = this.f18583a;
        KB kb = (KB) obj;
        if (bool != null) {
            kb.f16551a.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
