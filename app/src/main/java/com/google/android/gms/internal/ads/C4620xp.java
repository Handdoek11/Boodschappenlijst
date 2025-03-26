package com.google.android.gms.internal.ads;

import D2.C0501f1;
import D2.C0555y;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import i3.BinderC5853b;

/* renamed from: com.google.android.gms.internal.ads.xp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4620xp extends Q2.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f27925a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2443dp f27926b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f27927c;

    /* renamed from: e, reason: collision with root package name */
    private final long f27929e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final BinderC4402vp f27928d = new BinderC4402vp();

    public C4620xp(Context context, String str) {
        this.f27925a = str;
        this.f27927c = context.getApplicationContext();
        this.f27926b = C0555y.a().n(context, str, new BinderC4830zl());
    }

    @Override // Q2.a
    public final w2.u a() {
        D2.U0 u02 = null;
        try {
            InterfaceC2443dp interfaceC2443dp = this.f27926b;
            if (interfaceC2443dp != null) {
                u02 = interfaceC2443dp.a();
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
        return w2.u.e(u02);
    }

    @Override // Q2.a
    public final void c(Activity activity, w2.p pVar) {
        this.f27928d.t7(pVar);
        try {
            InterfaceC2443dp interfaceC2443dp = this.f27926b;
            if (interfaceC2443dp != null) {
                interfaceC2443dp.G3(this.f27928d);
                this.f27926b.t5(BinderC5853b.p2(activity));
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void d(C0501f1 c0501f1, Q2.b bVar) {
        try {
            if (this.f27926b != null) {
                c0501f1.o(this.f27929e);
                this.f27926b.k3(D2.b2.f1210a.a(this.f27927c, c0501f1), new BinderC4511wp(bVar, this));
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }
}
