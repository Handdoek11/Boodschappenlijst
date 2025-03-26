package com.google.android.gms.internal.ads;

import D2.C0501f1;
import D2.C0555y;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import i3.BinderC5853b;

/* renamed from: com.google.android.gms.internal.ads.mp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3422mp extends P2.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f24585a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2443dp f24586b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f24587c;

    /* renamed from: d, reason: collision with root package name */
    private final BinderC4402vp f24588d;

    /* renamed from: e, reason: collision with root package name */
    private final long f24589e;

    public C3422mp(Context context, String str) {
        this(context.getApplicationContext(), str, C0555y.a().n(context, str, new BinderC4830zl()), new BinderC4402vp());
    }

    @Override // P2.c
    public final w2.u a() {
        D2.U0 u02 = null;
        try {
            InterfaceC2443dp interfaceC2443dp = this.f24586b;
            if (interfaceC2443dp != null) {
                u02 = interfaceC2443dp.a();
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
        return w2.u.e(u02);
    }

    @Override // P2.c
    public final void c(Activity activity, w2.p pVar) {
        this.f24588d.t7(pVar);
        if (activity == null) {
            H2.p.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            InterfaceC2443dp interfaceC2443dp = this.f24586b;
            if (interfaceC2443dp != null) {
                interfaceC2443dp.G3(this.f24588d);
                this.f24586b.t5(BinderC5853b.p2(activity));
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void d(C0501f1 c0501f1, P2.d dVar) {
        try {
            if (this.f24586b != null) {
                c0501f1.o(this.f24589e);
                this.f24586b.n2(D2.b2.f1210a.a(this.f24587c, c0501f1), new BinderC3966rp(dVar, this));
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    protected C3422mp(Context context, String str, InterfaceC2443dp interfaceC2443dp, BinderC4402vp binderC4402vp) {
        this.f24589e = System.currentTimeMillis();
        this.f24587c = context.getApplicationContext();
        this.f24585a = str;
        this.f24586b = interfaceC2443dp;
        this.f24588d = binderC4402vp;
    }
}
