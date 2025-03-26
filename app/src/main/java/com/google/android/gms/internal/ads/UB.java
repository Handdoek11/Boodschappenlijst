package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class UB implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final SB f19315a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f19316b;

    public UB(SB sb, InterfaceC4203ty0 interfaceC4203ty0) {
        this.f19315a = sb;
        this.f19316b = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context b8 = this.f19315a.b(((C1323Fu) this.f19316b).a());
        AbstractC3332ly0.b(b8);
        return b8;
    }
}
