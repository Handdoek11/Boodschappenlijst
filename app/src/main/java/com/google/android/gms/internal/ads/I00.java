package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class I00 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f15840a;

    public I00(Integer num) {
        this.f15840a = num;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Integer num = this.f15840a;
        KB kb = (KB) obj;
        if (num != null) {
            kb.f16551a.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
