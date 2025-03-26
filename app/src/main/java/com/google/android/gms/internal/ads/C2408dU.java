package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2408dU implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f21563a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f21564b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f21565c;

    public C2408dU(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f21563a = interfaceC4203ty0;
        this.f21564b = interfaceC4203ty02;
        this.f21565c = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2299cU((Context) this.f21563a.zzb(), (AbstractC2138az) this.f21564b.zzb(), (Executor) this.f21565c.zzb());
    }
}
