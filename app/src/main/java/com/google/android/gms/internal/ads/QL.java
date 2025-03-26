package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class QL implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f18452a;

    public QL(InterfaceC4203ty0 interfaceC4203ty0) {
        this.f18452a = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        EnumC2746gd enumC2746gd = ((C2056aC) this.f18452a).a().f16777o.f27749a == 3 ? EnumC2746gd.REWARDED_INTERSTITIAL : EnumC2746gd.REWARD_BASED_VIDEO_AD;
        AbstractC3332ly0.b(enumC2746gd);
        return enumC2746gd;
    }
}
