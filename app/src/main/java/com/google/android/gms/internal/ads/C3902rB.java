package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.rB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3902rB implements JD, DG {

    /* renamed from: o, reason: collision with root package name */
    private final Context f26131o;

    /* renamed from: s, reason: collision with root package name */
    private final L60 f26132s;

    /* renamed from: t, reason: collision with root package name */
    private final H2.a f26133t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC0611r0 f26134u;

    /* renamed from: v, reason: collision with root package name */
    private final SO f26135v;

    /* renamed from: w, reason: collision with root package name */
    private final RunnableC3791q90 f26136w;

    public C3902rB(Context context, L60 l60, H2.a aVar, InterfaceC0611r0 interfaceC0611r0, SO so, RunnableC3791q90 runnableC3791q90) {
        this.f26131o = context;
        this.f26132s = l60;
        this.f26133t = aVar;
        this.f26134u = interfaceC0611r0;
        this.f26135v = so;
        this.f26136w = runnableC3791q90;
    }

    private final void b() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23852b4)).booleanValue()) {
            InterfaceC0611r0 interfaceC0611r0 = this.f26134u;
            Context context = this.f26131o;
            H2.a aVar = this.f26133t;
            L60 l60 = this.f26132s;
            RunnableC3791q90 runnableC3791q90 = this.f26136w;
            C2.v.d().c(context, aVar, l60.f16768f, interfaceC0611r0.g(), runnableC3791q90);
        }
        this.f26135v.r();
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void E(String str) {
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void Q(C4618xo c4618xo) {
        b();
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void T0(C60 c60) {
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void a(M2.N n8) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23861c4)).booleanValue()) {
            b();
        }
    }
}
