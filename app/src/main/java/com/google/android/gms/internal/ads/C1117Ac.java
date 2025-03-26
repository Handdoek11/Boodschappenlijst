package com.google.android.gms.internal.ads;

import D2.C0501f1;
import D2.C0555y;
import android.content.Context;
import android.os.RemoteException;
import y2.AbstractC6943a;

/* renamed from: com.google.android.gms.internal.ads.Ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117Ac {

    /* renamed from: a, reason: collision with root package name */
    private D2.V f13596a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13597b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13598c;

    /* renamed from: d, reason: collision with root package name */
    private final C0501f1 f13599d;

    /* renamed from: e, reason: collision with root package name */
    private final int f13600e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC6943a.AbstractC0349a f13601f;

    /* renamed from: g, reason: collision with root package name */
    private final BinderC4830zl f13602g = new BinderC4830zl();

    /* renamed from: h, reason: collision with root package name */
    private final D2.b2 f13603h = D2.b2.f1210a;

    public C1117Ac(Context context, String str, C0501f1 c0501f1, int i8, AbstractC6943a.AbstractC0349a abstractC0349a) {
        this.f13597b = context;
        this.f13598c = str;
        this.f13599d = c0501f1;
        this.f13600e = i8;
        this.f13601f = abstractC0349a;
    }

    public final void a() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            D2.V d8 = C0555y.a().d(this.f13597b, D2.c2.B0(), this.f13598c, this.f13602g);
            this.f13596a = d8;
            if (d8 != null) {
                if (this.f13600e != 3) {
                    this.f13596a.y4(new D2.i2(this.f13600e));
                }
                this.f13599d.o(currentTimeMillis);
                this.f13596a.B6(new BinderC3287lc(this.f13601f, this.f13598c));
                this.f13596a.T3(this.f13603h.a(this.f13597b, this.f13599d));
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }
}
