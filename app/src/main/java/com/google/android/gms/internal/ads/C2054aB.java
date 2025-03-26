package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.aB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2054aB implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f20664a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f20665b;

    public C2054aB(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f20664a = interfaceC4203ty0;
        this.f20665b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3041jG((C4671yE) this.f20664a.zzb(), (Executor) this.f20665b.zzb());
    }
}
