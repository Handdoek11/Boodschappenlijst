package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class KU implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f16591a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f16592b;

    public KU(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f16591a = interfaceC4203ty0;
        this.f16592b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JU zzb() {
        return new JU((Context) this.f16591a.zzb(), (AbstractC4241uH) this.f16592b.zzb());
    }
}
