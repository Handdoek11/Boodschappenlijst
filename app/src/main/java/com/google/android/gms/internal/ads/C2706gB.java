package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2706gB implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f22262a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f22263b;

    public C2706gB(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f22262a = interfaceC4203ty0;
        this.f22263b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3041jG((C4671yE) this.f22262a.zzb(), (Executor) this.f22263b.zzb());
    }
}
