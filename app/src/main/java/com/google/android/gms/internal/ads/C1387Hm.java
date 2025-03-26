package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import w2.C6876b;

/* renamed from: com.google.android.gms.internal.ads.Hm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1387Hm implements J2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3634om f15788a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC1457Jl f15789b;

    C1387Hm(BinderC1632Om binderC1632Om, InterfaceC3634om interfaceC3634om, InterfaceC1457Jl interfaceC1457Jl) {
        this.f15788a = interfaceC3634om;
        this.f15789b = interfaceC1457Jl;
    }

    @Override // J2.d
    public final void a(C6876b c6876b) {
        try {
            this.f15788a.y(c6876b.d());
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }
}
