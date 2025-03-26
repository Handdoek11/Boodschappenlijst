package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.pT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3712pT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25443a;

    /* renamed from: b, reason: collision with root package name */
    private final H2.a f25444b;

    /* renamed from: c, reason: collision with root package name */
    private final C3785q60 f25445c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4410vt f25446d;

    /* renamed from: e, reason: collision with root package name */
    private final HN f25447e;

    /* renamed from: f, reason: collision with root package name */
    private C3068jb0 f25448f;

    C3712pT(Context context, H2.a aVar, C3785q60 c3785q60, InterfaceC4410vt interfaceC4410vt, HN hn) {
        this.f25443a = context;
        this.f25444b = aVar;
        this.f25445c = c3785q60;
        this.f25446d = interfaceC4410vt;
        this.f25447e = hn;
    }

    public final synchronized void a(View view) {
        C3068jb0 c3068jb0 = this.f25448f;
        if (c3068jb0 != null) {
            C2.v.b().b(c3068jb0, view);
        }
    }

    public final synchronized void b() {
        InterfaceC4410vt interfaceC4410vt;
        if (this.f25448f == null || (interfaceC4410vt = this.f25446d) == null) {
            return;
        }
        interfaceC4410vt.D0("onSdkImpression", AbstractC4496wh0.e());
    }

    public final synchronized void c() {
        InterfaceC4410vt interfaceC4410vt;
        try {
            C3068jb0 c3068jb0 = this.f25448f;
            if (c3068jb0 == null || (interfaceC4410vt = this.f25446d) == null) {
                return;
            }
            Iterator it = interfaceC4410vt.E0().iterator();
            while (it.hasNext()) {
                C2.v.b().b(c3068jb0, (View) it.next());
            }
            this.f25446d.D0("onSdkLoaded", AbstractC4496wh0.e());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d() {
        return this.f25448f != null;
    }

    public final synchronized boolean e(boolean z7) {
        if (this.f25445c.f25771T) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23862c5)).booleanValue()) {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23889f5)).booleanValue() && this.f25446d != null) {
                    if (this.f25448f != null) {
                        H2.p.g("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!C2.v.b().f(this.f25443a)) {
                        H2.p.g("Unable to initialize omid.");
                        return false;
                    }
                    if (this.f25445c.f25773V.b()) {
                        C3068jb0 h8 = C2.v.b().h(this.f25444b, this.f25446d.A(), true);
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23898g5)).booleanValue()) {
                            HN hn = this.f25447e;
                            String str = h8 != null ? "1" : "0";
                            GN a8 = hn.a();
                            a8.b("omid_js_session_success", str);
                            a8.g();
                        }
                        if (h8 == null) {
                            H2.p.g("Unable to create javascript session service.");
                            return false;
                        }
                        H2.p.f("Created omid javascript session service.");
                        this.f25448f = h8;
                        this.f25446d.R0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void f(C1639Ot c1639Ot) {
        C3068jb0 c3068jb0 = this.f25448f;
        if (c3068jb0 == null || this.f25446d == null) {
            return;
        }
        C2.v.b().j(c3068jb0, c1639Ot);
        this.f25448f = null;
        this.f25446d.R0(null);
    }
}
