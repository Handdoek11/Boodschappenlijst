package com.google.android.gms.internal.ads;

import D2.C0501f1;
import D2.C0555y;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import i3.BinderC5853b;
import w2.AbstractC6879e;
import x2.AbstractC6904c;

/* renamed from: com.google.android.gms.internal.ads.gk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2760gk extends AbstractC6904c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22426a;

    /* renamed from: b, reason: collision with root package name */
    private final D2.b2 f22427b;

    /* renamed from: c, reason: collision with root package name */
    private final D2.V f22428c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22429d;

    /* renamed from: e, reason: collision with root package name */
    private final BinderC4830zl f22430e;

    /* renamed from: f, reason: collision with root package name */
    private final long f22431f;

    /* renamed from: g, reason: collision with root package name */
    private w2.l f22432g;

    public C2760gk(Context context, String str) {
        BinderC4830zl binderC4830zl = new BinderC4830zl();
        this.f22430e = binderC4830zl;
        this.f22431f = System.currentTimeMillis();
        this.f22426a = context;
        this.f22429d = str;
        this.f22427b = D2.b2.f1210a;
        this.f22428c = C0555y.a().e(context, new D2.c2(), str, binderC4830zl);
    }

    @Override // I2.a
    public final w2.u a() {
        D2.U0 u02 = null;
        try {
            D2.V v7 = this.f22428c;
            if (v7 != null) {
                u02 = v7.i();
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
        return w2.u.e(u02);
    }

    @Override // I2.a
    public final void c(w2.l lVar) {
        try {
            this.f22432g = lVar;
            D2.V v7 = this.f22428c;
            if (v7 != null) {
                v7.v4(new D2.B(lVar));
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // I2.a
    public final void d(boolean z7) {
        try {
            D2.V v7 = this.f22428c;
            if (v7 != null) {
                v7.I5(z7);
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // I2.a
    public final void e(Activity activity) {
        if (activity == null) {
            H2.p.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            D2.V v7 = this.f22428c;
            if (v7 != null) {
                v7.S5(BinderC5853b.p2(activity));
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void f(C0501f1 c0501f1, AbstractC6879e abstractC6879e) {
        try {
            if (this.f22428c != null) {
                c0501f1.o(this.f22431f);
                this.f22428c.R4(this.f22427b.a(this.f22426a, c0501f1), new D2.S1(abstractC6879e, this));
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
            abstractC6879e.a(new w2.m(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
