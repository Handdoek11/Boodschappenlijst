package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class GV implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f15392a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f15393b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f15394c;

    public GV(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f15392a = interfaceC4203ty0;
        this.f15393b = interfaceC4203ty02;
        this.f15394c = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new FV((Context) this.f15392a.zzb(), (Executor) this.f15393b.zzb(), (NL) this.f15394c.zzb());
    }
}
