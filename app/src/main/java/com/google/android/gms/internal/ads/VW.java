package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class VW extends D2.M {

    /* renamed from: o, reason: collision with root package name */
    private final DX f19608o;

    public VW(Context context, AbstractC4630xu abstractC4630xu, J60 j60, SI si, D2.H h8) {
        GX gx = new GX(si, abstractC4630xu.q());
        gx.e(h8);
        this.f19608o = new DX(new QX(abstractC4630xu, context, gx, j60), j60.l());
    }

    @Override // D2.N
    public final void K6(D2.X1 x12) {
        this.f19608o.d(x12, 1);
    }

    @Override // D2.N
    public final synchronized String b() {
        return this.f19608o.a();
    }

    @Override // D2.N
    public final synchronized String c() {
        return this.f19608o.b();
    }

    @Override // D2.N
    public final synchronized boolean f() {
        return this.f19608o.e();
    }

    @Override // D2.N
    public final synchronized void m7(D2.X1 x12, int i8) {
        this.f19608o.d(x12, i8);
    }
}
