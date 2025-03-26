package com.google.android.gms.internal.ads;

import android.content.Context;
import f3.InterfaceC5781e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3481nI implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f24918a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f24919b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f24920c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f24921d;

    public C3481nI(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f24918a = interfaceC4203ty0;
        this.f24919b = interfaceC4203ty02;
        this.f24920c = interfaceC4203ty03;
        this.f24921d = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C4265ub c4265ub = (C4265ub) this.f24918a.zzb();
        Executor executor = (Executor) this.f24919b.zzb();
        Context context = (Context) this.f24920c.zzb();
        return new C1993Yx(executor, new C1504Kx(context, c4265ub), (InterfaceC5781e) this.f24921d.zzb());
    }
}
