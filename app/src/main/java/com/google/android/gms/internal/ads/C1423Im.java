package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import w2.C6876b;

/* renamed from: com.google.android.gms.internal.ads.Im, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1423Im implements J2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3960rm f15993a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC1457Jl f15994b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC1632Om f15995c;

    C1423Im(BinderC1632Om binderC1632Om, InterfaceC3960rm interfaceC3960rm, InterfaceC1457Jl interfaceC1457Jl) {
        this.f15993a = interfaceC3960rm;
        this.f15994b = interfaceC1457Jl;
        this.f15995c = binderC1632Om;
    }

    @Override // J2.d
    public final void a(C6876b c6876b) {
        try {
            this.f15993a.y(c6876b.d());
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }
}
