package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import w2.C6876b;

/* renamed from: com.google.android.gms.internal.ads.Jm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1458Jm implements J2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4287um f16299a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC1457Jl f16300b;

    C1458Jm(BinderC1632Om binderC1632Om, InterfaceC4287um interfaceC4287um, InterfaceC1457Jl interfaceC1457Jl) {
        this.f16299a = interfaceC4287um;
        this.f16300b = interfaceC1457Jl;
    }

    @Override // J2.d
    public final void a(C6876b c6876b) {
        try {
            this.f16299a.y(c6876b.d());
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }
}
