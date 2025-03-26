package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3479nH implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final TG f24912a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f24913b;

    public C3479nH(TG tg, InterfaceC4203ty0 interfaceC4203ty0) {
        this.f24912a = tg;
        this.f24913b = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.f24912a.d((Executor) this.f24913b.zzb());
    }
}
