package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Kp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1496Kp implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f16636a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f16637b;

    public C1496Kp(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f16636a = interfaceC4203ty0;
        this.f16637b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new SharedPreferencesOnSharedPreferenceChangeListenerC1461Jp((Context) this.f16636a.zzb(), (InterfaceC0611r0) this.f16637b.zzb());
    }
}
