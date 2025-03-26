package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import w2.C6876b;

/* renamed from: com.google.android.gms.internal.ads.Vl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1876Vl implements J2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1457Jl f19649a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J2.a f19650b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC2546em f19651c;

    C1876Vl(BinderC2546em binderC2546em, InterfaceC1457Jl interfaceC1457Jl, J2.a aVar) {
        this.f19649a = interfaceC1457Jl;
        this.f19650b = aVar;
        this.f19651c = binderC2546em;
    }

    @Override // J2.d
    public final void a(C6876b c6876b) {
        try {
            H2.p.b(this.f19650b.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + c6876b.a() + ". ErrorMessage = " + c6876b.c() + ". ErrorDomain = " + c6876b.b());
            this.f19649a.i6(c6876b.d());
            this.f19649a.s1(c6876b.a(), c6876b.c());
            this.f19649a.z(c6876b.a());
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }
}
