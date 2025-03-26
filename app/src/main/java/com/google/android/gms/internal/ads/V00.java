package com.google.android.gms.internal.ads;

import android.content.Intent;

/* loaded from: classes.dex */
public final class V00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f19509a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f19510b;

    public V00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f19509a = interfaceC4203ty0;
        this.f19510b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T00 zzb() {
        return new T00(((C1323Fu) this.f19509a).a(), (Intent) this.f19510b.zzb());
    }
}
