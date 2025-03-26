package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import M2.AbstractC0656c;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.adadapted.android.sdk.core.event.AdEventTypes;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.lN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3270lN implements JE, InterfaceC0484a, EC, InterfaceC3469nC {

    /* renamed from: o, reason: collision with root package name */
    private final Context f24311o;

    /* renamed from: s, reason: collision with root package name */
    private final C2373d70 f24312s;

    /* renamed from: t, reason: collision with root package name */
    private final HN f24313t;

    /* renamed from: u, reason: collision with root package name */
    private final C60 f24314u;

    /* renamed from: v, reason: collision with root package name */
    private final C3785q60 f24315v;

    /* renamed from: w, reason: collision with root package name */
    private final JS f24316w;

    /* renamed from: x, reason: collision with root package name */
    private final String f24317x;

    /* renamed from: y, reason: collision with root package name */
    private Boolean f24318y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f24319z = ((Boolean) D2.A.c().a(AbstractC3184kf.f23677F6)).booleanValue();

    public C3270lN(Context context, C2373d70 c2373d70, HN hn, C60 c60, C3785q60 c3785q60, JS js, String str) {
        this.f24311o = context;
        this.f24312s = c2373d70;
        this.f24313t = hn;
        this.f24314u = c60;
        this.f24315v = c3785q60;
        this.f24316w = js;
        this.f24317x = str;
    }

    private final GN a(String str) {
        A60 a60 = this.f24314u.f14101b;
        GN a8 = this.f24313t.a();
        a8.d(a60.f13520b);
        a8.c(this.f24315v);
        a8.b("action", str);
        a8.b("ad_format", this.f24317x.toUpperCase(Locale.ROOT));
        if (!this.f24315v.f25816t.isEmpty()) {
            a8.b("ancn", (String) this.f24315v.f25816t.get(0));
        }
        if (this.f24315v.b()) {
            a8.b("device_connectivity", true != C2.v.s().a(this.f24311o) ? "offline" : "online");
            a8.b("event_timestamp", String.valueOf(C2.v.c().a()));
            a8.b("offline_ad", "1");
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23733M6)).booleanValue()) {
            boolean z7 = AbstractC0656c.f(this.f24314u.f14100a.f28044a) != 1;
            a8.b("scar", String.valueOf(z7));
            if (z7) {
                D2.X1 x12 = this.f24314u.f14100a.f28044a.f16766d;
                a8.b("ragent", x12.f1175G);
                a8.b("rtype", AbstractC0656c.b(AbstractC0656c.c(x12)));
            }
        }
        return a8;
    }

    private final void c(GN gn) {
        if (!this.f24315v.b()) {
            gn.g();
            return;
        }
        this.f24316w.g(new LS(C2.v.c().a(), this.f24314u.f14101b.f13520b.f26832b, gn.e(), 2));
    }

    private final boolean e() {
        String str;
        if (this.f24318y == null) {
            synchronized (this) {
                if (this.f24318y == null) {
                    String str2 = (String) D2.A.c().a(AbstractC3184kf.f23640B1);
                    C2.v.t();
                    try {
                        str = G2.D0.V(this.f24311o);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z7 = false;
                    if (str2 != null && str != null) {
                        try {
                            z7 = Pattern.matches(str2, str);
                        } catch (RuntimeException e8) {
                            C2.v.s().x(e8, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f24318y = Boolean.valueOf(z7);
                }
            }
        }
        return this.f24318y.booleanValue();
    }

    @Override // D2.InterfaceC0484a
    public final void I0() {
        if (this.f24315v.b()) {
            c(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3469nC
    public final void T(zzdgb zzdgbVar) {
        if (this.f24319z) {
            GN a8 = a("ifts");
            a8.b("reason", "exception");
            if (!TextUtils.isEmpty(zzdgbVar.getMessage())) {
                a8.b("msg", zzdgbVar.getMessage());
            }
            a8.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.JE
    public final void f() {
        if (e()) {
            a("adapter_shown").g();
        }
    }

    @Override // com.google.android.gms.internal.ads.JE
    public final void h() {
        if (e()) {
            a("adapter_impression").g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3469nC
    public final void o(D2.W0 w02) {
        D2.W0 w03;
        if (this.f24319z) {
            GN a8 = a("ifts");
            a8.b("reason", "adapter");
            int i8 = w02.f1162o;
            String str = w02.f1163s;
            if (w02.f1164t.equals("com.google.android.gms.ads") && (w03 = w02.f1165u) != null && !w03.f1164t.equals("com.google.android.gms.ads")) {
                D2.W0 w04 = w02.f1165u;
                i8 = w04.f1162o;
                str = w04.f1163s;
            }
            if (i8 >= 0) {
                a8.b("arec", String.valueOf(i8));
            }
            String a9 = this.f24312s.a(str);
            if (a9 != null) {
                a8.b("areec", a9);
            }
            a8.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void r() {
        if (e() || this.f24315v.b()) {
            c(a(AdEventTypes.IMPRESSION));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3469nC
    public final void zzb() {
        if (this.f24319z) {
            GN a8 = a("ifts");
            a8.b("reason", "blocked");
            a8.g();
        }
    }
}
