package com.google.android.gms.internal.ads;

import D2.C0555y;
import G2.AbstractC0608p0;
import android.content.Context;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4065sk implements InterfaceC3194kk, InterfaceC3085jk {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC4410vt f26728o;

    public C4065sk(Context context, H2.a aVar, N9 n9, C2.a aVar2) {
        C2.v.a();
        InterfaceC4410vt a8 = C1500Kt.a(context, C3976ru.a(), "", false, false, null, null, aVar, null, null, null, C2000Zc.a(), null, null, null, null);
        this.f26728o = a8;
        a8.M().setWillNotDraw(true);
    }

    private static final void x(Runnable runnable) {
        C0555y.b();
        if (H2.g.y()) {
            AbstractC0608p0.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            AbstractC0608p0.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (G2.D0.f2566l.post(runnable)) {
                return;
            }
            H2.p.g("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2869hk
    public final /* synthetic */ void D0(String str, Map map) {
        AbstractC2977ik.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194kk
    public final void E(final String str) {
        AbstractC0608p0.k("loadHtml on adWebView from html");
        x(new Runnable() { // from class: com.google.android.gms.internal.ads.pk
            @Override // java.lang.Runnable
            public final void run() {
                this.f25500o.d(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1735Rk
    public final void H0(String str, InterfaceC1662Pi interfaceC1662Pi) {
        this.f26728o.Z0(str, new C3956rk(this, interfaceC1662Pi));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1735Rk
    public final void M0(String str, final InterfaceC1662Pi interfaceC1662Pi) {
        this.f26728o.z0(str, new f3.n() { // from class: com.google.android.gms.internal.ads.lk
            @Override // f3.n
            public final boolean apply(Object obj) {
                InterfaceC1662Pi interfaceC1662Pi2 = (InterfaceC1662Pi) obj;
                if (interfaceC1662Pi2 instanceof C3956rk) {
                    return ((C3956rk) interfaceC1662Pi2).f26214a.equals(interfaceC1662Pi);
                }
                return false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194kk
    public final void N(final C4392vk c4392vk) {
        InterfaceC3759pu L7 = this.f26728o.L();
        Objects.requireNonNull(c4392vk);
        L7.v0(new InterfaceC3650ou() { // from class: com.google.android.gms.internal.ads.nk
            @Override // com.google.android.gms.internal.ads.InterfaceC3650ou
            public final void zza() {
                long a8 = C2.v.c().a();
                C4392vk c4392vk2 = c4392vk;
                final long j8 = c4392vk2.f27327c;
                final ArrayList arrayList = c4392vk2.f27326b;
                arrayList.add(Long.valueOf(a8 - j8));
                AbstractC0608p0.k("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                HandlerC1968Yd0 handlerC1968Yd0 = G2.D0.f2566l;
                final C1700Qk c1700Qk = c4392vk2.f27325a;
                final C1665Pk c1665Pk = c4392vk2.f27328d;
                final InterfaceC3194kk interfaceC3194kk = c4392vk2.f27329e;
                handlerC1968Yd0.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.wk
                    @Override // java.lang.Runnable
                    public final void run() {
                        c1700Qk.j(c1665Pk, interfaceC3194kk, arrayList, j8);
                    }
                }, ((Integer) D2.A.c().a(AbstractC3184kf.f23847b)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194kk
    public final void Q(final String str) {
        AbstractC0608p0.k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        x(new Runnable() { // from class: com.google.android.gms.internal.ads.mk
            @Override // java.lang.Runnable
            public final void run() {
                this.f24559o.j(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194kk
    public final void a() {
        this.f26728o.destroy();
    }

    final /* synthetic */ void b(String str) {
        this.f26728o.n(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194kk
    public final void b0(String str) {
        AbstractC0608p0.k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        x(new Runnable() { // from class: com.google.android.gms.internal.ads.qk
            @Override // java.lang.Runnable
            public final void run() {
                this.f25985o.t(format);
            }
        });
    }

    final /* synthetic */ void d(String str) {
        this.f26728o.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194kk
    public final boolean f() {
        return this.f26728o.f0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3194kk
    public final C1770Sk h() {
        return new C1770Sk(this);
    }

    final /* synthetic */ void j(String str) {
        this.f26728o.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174tk
    public final /* synthetic */ void m(String str, String str2) {
        AbstractC2977ik.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174tk
    public final /* synthetic */ void m1(String str, JSONObject jSONObject) {
        AbstractC2977ik.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174tk
    public final void n(final String str) {
        AbstractC0608p0.k("invokeJavascript on adWebView from js");
        x(new Runnable() { // from class: com.google.android.gms.internal.ads.ok
            @Override // java.lang.Runnable
            public final void run() {
                this.f25263o.b(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2869hk
    public final /* synthetic */ void p(String str, JSONObject jSONObject) {
        AbstractC2977ik.b(this, str, jSONObject);
    }

    final /* synthetic */ void t(String str) {
        this.f26728o.loadData(str, "text/html", "UTF-8");
    }
}
