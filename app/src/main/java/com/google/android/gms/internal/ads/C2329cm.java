package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import w2.C6876b;

/* renamed from: com.google.android.gms.internal.ads.cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2329cm implements J2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1457Jl f21282a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC2546em f21283b;

    C2329cm(BinderC2546em binderC2546em, InterfaceC1457Jl interfaceC1457Jl) {
        this.f21282a = interfaceC1457Jl;
        this.f21283b = binderC2546em;
    }

    @Override // J2.d
    public final void a(C6876b c6876b) {
        try {
            H2.p.b(this.f21283b.f21877o.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + c6876b.a() + ". ErrorMessage = " + c6876b.c() + ". ErrorDomain = " + c6876b.b());
            this.f21282a.i6(c6876b.d());
            this.f21282a.s1(c6876b.a(), c6876b.c());
            this.f21282a.z(c6876b.a());
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }
}
