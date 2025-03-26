package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import w2.C6876b;

/* renamed from: com.google.android.gms.internal.ads.Km, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1493Km implements J2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4287um f16627a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC1457Jl f16628b;

    C1493Km(BinderC1632Om binderC1632Om, InterfaceC4287um interfaceC4287um, InterfaceC1457Jl interfaceC1457Jl) {
        this.f16627a = interfaceC4287um;
        this.f16628b = interfaceC1457Jl;
    }

    @Override // J2.d
    public final void a(C6876b c6876b) {
        try {
            this.f16627a.y(c6876b.d());
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }
}
