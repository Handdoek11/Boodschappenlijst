package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class DX {

    /* renamed from: a, reason: collision with root package name */
    private final JX f14504a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14505b;

    /* renamed from: c, reason: collision with root package name */
    private D2.U0 f14506c;

    public DX(JX jx, String str) {
        this.f14504a = jx;
        this.f14505b = str;
    }

    public final synchronized String a() {
        D2.U0 u02;
        try {
            u02 = this.f14506c;
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
            return null;
        }
        return u02 != null ? u02.g() : null;
    }

    public final synchronized String b() {
        D2.U0 u02;
        try {
            u02 = this.f14506c;
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
            return null;
        }
        return u02 != null ? u02.g() : null;
    }

    public final synchronized void d(D2.X1 x12, int i8) {
        this.f14506c = null;
        KX kx = new KX(i8);
        CX cx = new CX(this);
        this.f14504a.a(x12, this.f14505b, kx, cx);
    }

    public final synchronized boolean e() {
        return this.f14504a.zza();
    }
}
