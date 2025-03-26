package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class VU implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f19594a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f19595b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f19596c;

    public VU(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f19594a = interfaceC4203ty0;
        this.f19595b = interfaceC4203ty02;
        this.f19596c = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new UU((Context) this.f19594a.zzb(), (QH) this.f19595b.zzb(), (Executor) this.f19596c.zzb());
    }
}
