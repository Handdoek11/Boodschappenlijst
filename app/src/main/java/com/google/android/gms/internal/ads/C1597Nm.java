package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import w2.C6876b;

/* renamed from: com.google.android.gms.internal.ads.Nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1597Nm implements J2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4723ym f17588a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC1457Jl f17589b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC1632Om f17590c;

    C1597Nm(BinderC1632Om binderC1632Om, InterfaceC4723ym interfaceC4723ym, InterfaceC1457Jl interfaceC1457Jl) {
        this.f17588a = interfaceC4723ym;
        this.f17589b = interfaceC1457Jl;
        this.f17590c = binderC1632Om;
    }

    @Override // J2.d
    public final void a(C6876b c6876b) {
        try {
            this.f17588a.y(c6876b.d());
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }
}
