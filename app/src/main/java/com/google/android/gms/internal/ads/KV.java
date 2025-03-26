package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class KV implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f16593a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f16594b;

    public KV(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f16593a = interfaceC4203ty0;
        this.f16594b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JV zzb() {
        return new JV((Context) this.f16593a.zzb(), (NL) this.f16594b.zzb());
    }
}
