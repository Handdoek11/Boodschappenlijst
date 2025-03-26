package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.f60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2588f60 implements P2.a {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ D2.K0 f21950o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ BinderC2806h60 f21951s;

    C2588f60(BinderC2806h60 binderC2806h60, D2.K0 k02) {
        this.f21950o = k02;
        this.f21951s = binderC2806h60;
    }

    @Override // P2.a
    public final void i() {
        if (this.f21951s.f22489z != null) {
            try {
                this.f21950o.b();
            } catch (RemoteException e8) {
                H2.p.i("#007 Could not call remote method.", e8);
            }
        }
    }
}
