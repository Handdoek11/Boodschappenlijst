package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class N20 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f17453a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f17454b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f17455c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f17456d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4203ty0 f17457e;

    public N20(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04, InterfaceC4203ty0 interfaceC4203ty05, InterfaceC4203ty0 interfaceC4203ty06, InterfaceC4203ty0 interfaceC4203ty07) {
        this.f17453a = interfaceC4203ty02;
        this.f17454b = interfaceC4203ty03;
        this.f17455c = interfaceC4203ty05;
        this.f17456d = interfaceC4203ty06;
        this.f17457e = interfaceC4203ty07;
    }

    public static L20 a(C4077sq c4077sq, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i8, boolean z7, boolean z8) {
        return new L20(c4077sq, context, scheduledExecutorService, executor, i8, z7, z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new L20(C4634xw.a(), ((C1323Fu) this.f17453a).a(), (ScheduledExecutorService) this.f17454b.zzb(), C3244l80.b(), ((C4214u30) this.f17455c).zzb().intValue(), ((C4432w30) this.f17456d).zzb().booleanValue(), ((C4650y30) this.f17457e).zzb().booleanValue());
    }
}
