package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2410dW implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f21578a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f21579b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f21580c;

    public C2410dW(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f21578a = interfaceC4203ty0;
        this.f21579b = interfaceC4203ty02;
        this.f21580c = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2193bW((Context) this.f21578a.zzb(), (Executor) this.f21579b.zzb(), (NL) this.f21580c.zzb());
    }
}
