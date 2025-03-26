package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import w2.C6876b;

/* renamed from: com.google.android.gms.internal.ads.Lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1528Lm implements J2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3307lm f16875a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC1457Jl f16876b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC1632Om f16877c;

    C1528Lm(BinderC1632Om binderC1632Om, InterfaceC3307lm interfaceC3307lm, InterfaceC1457Jl interfaceC1457Jl) {
        this.f16875a = interfaceC3307lm;
        this.f16876b = interfaceC1457Jl;
        this.f16877c = binderC1632Om;
    }

    @Override // J2.d
    public final void a(C6876b c6876b) {
        try {
            this.f16875a.y(c6876b.d());
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }
}
