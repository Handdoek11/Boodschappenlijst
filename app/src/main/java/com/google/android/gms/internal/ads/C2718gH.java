package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.gH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2718gH implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final TG f22284a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f22285b;

    public C2718gH(TG tg, InterfaceC4203ty0 interfaceC4203ty0) {
        this.f22284a = tg;
        this.f22285b = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set f8 = this.f22284a.f((DB) this.f22285b.zzb());
        AbstractC3332ly0.b(f8);
        return f8;
    }
}
