package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import f3.InterfaceC5781e;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Yx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1993Yx implements InterfaceC4701yb {

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC4410vt f20354o;

    /* renamed from: s, reason: collision with root package name */
    private final Executor f20355s;

    /* renamed from: t, reason: collision with root package name */
    private final C1504Kx f20356t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC5781e f20357u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f20358v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f20359w = false;

    /* renamed from: x, reason: collision with root package name */
    private final C1608Nx f20360x = new C1608Nx();

    public C1993Yx(Executor executor, C1504Kx c1504Kx, InterfaceC5781e interfaceC5781e) {
        this.f20355s = executor;
        this.f20356t = c1504Kx;
        this.f20357u = interfaceC5781e;
    }

    private final void g() {
        try {
            final JSONObject c8 = this.f20356t.c(this.f20360x);
            if (this.f20354o != null) {
                this.f20355s.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Xx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20160o.c(c8);
                    }
                });
            }
        } catch (JSONException e8) {
            AbstractC0608p0.l("Failed to call video active view js", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
    public final void A0(C4592xb c4592xb) {
        boolean z7 = this.f20359w ? false : c4592xb.f27883j;
        C1608Nx c1608Nx = this.f20360x;
        c1608Nx.f17787a = z7;
        c1608Nx.f17790d = this.f20357u.b();
        this.f20360x.f17792f = c4592xb;
        if (this.f20358v) {
            g();
        }
    }

    public final void a() {
        this.f20358v = false;
    }

    public final void b() {
        this.f20358v = true;
        g();
    }

    final /* synthetic */ void c(JSONObject jSONObject) {
        this.f20354o.m1("AFMA_updateActiveView", jSONObject);
    }

    public final void d(boolean z7) {
        this.f20359w = z7;
    }

    public final void e(InterfaceC4410vt interfaceC4410vt) {
        this.f20354o = interfaceC4410vt;
    }
}
