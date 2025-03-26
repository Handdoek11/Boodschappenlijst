package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.kI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3154kI implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f23573a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f23574b;

    public C3154kI(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f23573a = interfaceC4203ty0;
        this.f23574b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3259lG((Context) this.f23573a.zzb(), new HashSet(), ((C2269cA) this.f23574b).a());
    }
}
