package com.google.android.gms.internal.ads;

import D2.InterfaceC0489b1;
import android.os.RemoteException;
import w2.w;

/* loaded from: classes.dex */
public final class CL extends w.a {

    /* renamed from: a, reason: collision with root package name */
    private final HI f14157a;

    public CL(HI hi) {
        this.f14157a = hi;
    }

    private static InterfaceC0489b1 f(HI hi) {
        D2.Y0 W7 = hi.W();
        if (W7 == null) {
            return null;
        }
        try {
            return W7.f();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // w2.w.a
    public final void a() {
        InterfaceC0489b1 f8 = f(this.f14157a);
        if (f8 == null) {
            return;
        }
        try {
            f8.b();
        } catch (RemoteException e8) {
            H2.p.h("Unable to call onVideoEnd()", e8);
        }
    }

    @Override // w2.w.a
    public final void c() {
        InterfaceC0489b1 f8 = f(this.f14157a);
        if (f8 == null) {
            return;
        }
        try {
            f8.g();
        } catch (RemoteException e8) {
            H2.p.h("Unable to call onVideoEnd()", e8);
        }
    }

    @Override // w2.w.a
    public final void e() {
        InterfaceC0489b1 f8 = f(this.f14157a);
        if (f8 == null) {
            return;
        }
        try {
            f8.f();
        } catch (RemoteException e8) {
            H2.p.h("Unable to call onVideoEnd()", e8);
        }
    }
}
