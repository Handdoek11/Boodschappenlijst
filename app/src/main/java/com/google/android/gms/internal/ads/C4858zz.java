package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.zz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4858zz implements ZC, InterfaceC4701yb {

    /* renamed from: o, reason: collision with root package name */
    private final C3785q60 f28745o;

    /* renamed from: s, reason: collision with root package name */
    private final CC f28746s;

    /* renamed from: t, reason: collision with root package name */
    private final C2928iD f28747t;

    /* renamed from: u, reason: collision with root package name */
    private final AtomicBoolean f28748u = new AtomicBoolean();

    /* renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f28749v = new AtomicBoolean();

    public C4858zz(C3785q60 c3785q60, CC cc, C2928iD c2928iD) {
        this.f28745o = c3785q60;
        this.f28746s = cc;
        this.f28747t = c2928iD;
    }

    private final void a() {
        if (this.f28748u.compareAndSet(false, true)) {
            this.f28746s.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
    public final void A0(C4592xb c4592xb) {
        if (this.f28745o.f25786e == 1 && c4592xb.f27883j) {
            a();
        }
        if (c4592xb.f27883j && this.f28749v.compareAndSet(false, true)) {
            this.f28747t.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final synchronized void s() {
        if (this.f28745o.f25786e != 1) {
            a();
        }
    }
}
