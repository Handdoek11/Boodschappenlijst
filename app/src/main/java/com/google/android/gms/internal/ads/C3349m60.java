package com.google.android.gms.internal.ads;

import D2.InterfaceC0485a0;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.m60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3349m60 implements P2.a {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ InterfaceC0485a0 f24458o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ BinderC3458n60 f24459s;

    C3349m60(BinderC3458n60 binderC3458n60, InterfaceC0485a0 interfaceC0485a0) {
        this.f24458o = interfaceC0485a0;
        this.f24459s = binderC3458n60;
    }

    @Override // P2.a
    public final void i() {
        if (this.f24459s.f24881u != null) {
            try {
                this.f24458o.b();
            } catch (RemoteException e8) {
                H2.p.i("#007 Could not call remote method.", e8);
            }
        }
    }
}
