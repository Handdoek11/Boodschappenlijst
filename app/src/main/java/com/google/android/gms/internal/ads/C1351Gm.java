package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import w2.C6876b;

/* renamed from: com.google.android.gms.internal.ads.Gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1351Gm implements J2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3634om f15434a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC1457Jl f15435b;

    C1351Gm(BinderC1632Om binderC1632Om, InterfaceC3634om interfaceC3634om, InterfaceC1457Jl interfaceC1457Jl) {
        this.f15434a = interfaceC3634om;
        this.f15435b = interfaceC1457Jl;
    }

    @Override // J2.d
    public final void a(C6876b c6876b) {
        try {
            this.f15434a.y(c6876b.d());
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }
}
