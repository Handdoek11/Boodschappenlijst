package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import i3.BinderC5853b;
import y2.AbstractC6943a;

/* renamed from: com.google.android.gms.internal.ads.mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3396mc extends AbstractC6943a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4049sc f24536a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24537b;

    /* renamed from: c, reason: collision with root package name */
    private final BinderC3723pc f24538c = new BinderC3723pc();

    public C3396mc(InterfaceC4049sc interfaceC4049sc, String str) {
        this.f24536a = interfaceC4049sc;
        this.f24537b = str;
    }

    @Override // y2.AbstractC6943a
    public final w2.u a() {
        D2.U0 u02;
        try {
            u02 = this.f24536a.c();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
            u02 = null;
        }
        return w2.u.e(u02);
    }

    @Override // y2.AbstractC6943a
    public final void c(Activity activity) {
        try {
            this.f24536a.q5(BinderC5853b.p2(activity), this.f24538c);
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }
}
