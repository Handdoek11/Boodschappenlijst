package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.cP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2294cP implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f21184a;

    public C2294cP(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f21184a = interfaceC4203ty0;
    }

    public static C3041jG a(C2186bP c2186bP, Executor executor) {
        return new C3041jG(c2186bP, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a((C2186bP) this.f21184a.zzb(), C3244l80.b());
    }
}
