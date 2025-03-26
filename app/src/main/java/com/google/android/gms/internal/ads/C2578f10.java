package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2578f10 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    public final C3676p60 f21916a;

    public C2578f10(C3676p60 c3676p60) {
        this.f21916a = c3676p60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        KB kb = (KB) obj;
        if (this.f21916a != null) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.Ob)).booleanValue()) {
                return;
            }
            kb.f16551a.putBoolean("render_in_browser", this.f21916a.d());
            kb.f16551a.putBoolean("disable_ml", this.f21916a.c());
        }
    }
}
