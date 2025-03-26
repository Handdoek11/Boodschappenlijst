package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class JA implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f16141a;

    public JA(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f16141a = interfaceC4203ty0;
    }

    public static C3041jG a(C1218Cx c1218Cx, Executor executor) {
        return new C3041jG(c1218Cx, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a((C1218Cx) this.f16141a.zzb(), C3244l80.b());
    }
}
