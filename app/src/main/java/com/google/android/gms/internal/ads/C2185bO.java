package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2185bO implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final XN f20859a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f20860b;

    public C2185bO(XN xn, InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f20859a = xn;
        this.f20860b = interfaceC4203ty0;
    }

    public static Set a(XN xn, C2837hO c2837hO, Executor executor) {
        Set d8 = XN.d(c2837hO, executor);
        AbstractC3332ly0.b(d8);
        return d8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a(this.f20859a, (C2837hO) this.f20860b.zzb(), C3244l80.b());
    }
}
