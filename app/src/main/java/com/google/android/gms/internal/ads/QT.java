package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class QT implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f18468a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f18469b;

    public QT(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f18468a = interfaceC4203ty0;
        this.f18469b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final PT zzb() {
        return new PT((Context) this.f18468a.zzb(), (AbstractC3113jy) this.f18469b.zzb());
    }
}
