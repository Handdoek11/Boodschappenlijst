package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class VJ implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f19579a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f19580b;

    public VJ(OJ oj, InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f19579a = interfaceC4203ty0;
        this.f19580b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3041jG(((DL) this.f19579a).zzb(), (Executor) this.f19580b.zzb());
    }
}
