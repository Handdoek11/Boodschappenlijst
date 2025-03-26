package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4030sL {

    /* renamed from: b, reason: collision with root package name */
    private final C2.a f26638b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f26639c;

    /* renamed from: d, reason: collision with root package name */
    private final HN f26640d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f26641e;

    /* renamed from: f, reason: collision with root package name */
    private final N9 f26642f;

    /* renamed from: g, reason: collision with root package name */
    private final H2.a f26643g;

    /* renamed from: i, reason: collision with root package name */
    private final JS f26645i;

    /* renamed from: j, reason: collision with root package name */
    private final C2959ia0 f26646j;

    /* renamed from: k, reason: collision with root package name */
    private final US f26647k;

    /* renamed from: l, reason: collision with root package name */
    private final P60 f26648l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.common.util.concurrent.d f26649m;

    /* renamed from: a, reason: collision with root package name */
    private final C2507eL f26637a = new C2507eL();

    /* renamed from: h, reason: collision with root package name */
    private final C2758gj f26644h = new C2758gj();

    C4030sL(CallableC3704pL callableC3704pL) {
        this.f26639c = callableC3704pL.f25391s;
        this.f26641e = callableC3704pL.f25394v;
        this.f26642f = callableC3704pL.f25395w;
        this.f26643g = callableC3704pL.f25396x;
        this.f26638b = callableC3704pL.f25390o;
        this.f26645i = callableC3704pL.f25393u;
        this.f26646j = callableC3704pL.f25397y;
        this.f26640d = callableC3704pL.f25392t;
        this.f26647k = callableC3704pL.f25398z;
        this.f26648l = callableC3704pL.f25389A;
    }

    final /* synthetic */ InterfaceC4410vt a(InterfaceC4410vt interfaceC4410vt) {
        interfaceC4410vt.Z0("/result", this.f26644h);
        InterfaceC3759pu L7 = interfaceC4410vt.L();
        C2.b bVar = new C2.b(this.f26639c, null, null);
        JS js = this.f26645i;
        C2959ia0 c2959ia0 = this.f26646j;
        HN hn = this.f26640d;
        C2507eL c2507eL = this.f26637a;
        L7.e1(null, c2507eL, c2507eL, c2507eL, c2507eL, false, null, bVar, null, null, js, c2959ia0, hn, null, null, null, null, null, null);
        return interfaceC4410vt;
    }

    final /* synthetic */ com.google.common.util.concurrent.d f(String str, JSONObject jSONObject, InterfaceC4410vt interfaceC4410vt) {
        return this.f26644h.b(interfaceC4410vt, str, jSONObject);
    }

    public final synchronized com.google.common.util.concurrent.d g(final String str, final JSONObject jSONObject) {
        com.google.common.util.concurrent.d dVar = this.f26649m;
        if (dVar == null) {
            return AbstractC2326ck0.h(null);
        }
        return AbstractC2326ck0.n(dVar, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.fL
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f22009a.f(str, jSONObject, (InterfaceC4410vt) obj);
            }
        }, this.f26641e);
    }

    public final synchronized void h(C3785q60 c3785q60, C4111t60 c4111t60, C3874qx c3874qx) {
        com.google.common.util.concurrent.d dVar = this.f26649m;
        if (dVar == null) {
            return;
        }
        AbstractC2326ck0.r(dVar, new C3377mL(this, c3785q60, c4111t60, c3874qx), this.f26641e);
    }

    public final synchronized void i() {
        com.google.common.util.concurrent.d dVar = this.f26649m;
        if (dVar == null) {
            return;
        }
        AbstractC2326ck0.r(dVar, new C2943iL(this), this.f26641e);
        this.f26649m = null;
    }

    public final synchronized void j(String str, Map map) {
        com.google.common.util.concurrent.d dVar = this.f26649m;
        if (dVar == null) {
            return;
        }
        AbstractC2326ck0.r(dVar, new C3268lL(this, "sendMessageToNativeJs", map), this.f26641e);
    }

    public final synchronized void k() {
        final String str = (String) D2.A.c().a(AbstractC3184kf.f23762Q3);
        final Context context = this.f26639c;
        final N9 n9 = this.f26642f;
        final H2.a aVar = this.f26643g;
        final C2.a aVar2 = this.f26638b;
        final US us = this.f26647k;
        final P60 p60 = this.f26648l;
        com.google.common.util.concurrent.d m8 = AbstractC2326ck0.m(AbstractC2326ck0.k(new InterfaceC1384Hj0() { // from class: com.google.android.gms.internal.ads.Jt
            @Override // com.google.android.gms.internal.ads.InterfaceC1384Hj0
            public final com.google.common.util.concurrent.d zza() {
                C2.v.a();
                Context context2 = context;
                C3976ru a8 = C3976ru.a();
                N9 n92 = n9;
                US us2 = us;
                C2.a aVar3 = aVar2;
                InterfaceC4410vt a9 = C1500Kt.a(context2, a8, "", false, false, n92, null, aVar, null, null, aVar3, C2000Zc.a(), null, null, us2, p60);
                final C1776Sq e8 = C1776Sq.e(a9);
                a9.L().i0(new InterfaceC3541nu() { // from class: com.google.android.gms.internal.ads.It
                    @Override // com.google.android.gms.internal.ads.InterfaceC3541nu
                    public final void a(boolean z7, int i8, String str2, String str3) {
                        e8.h();
                    }
                });
                a9.loadUrl(str);
                return e8;
            }
        }, AbstractC1497Kq.f16649f), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.hL
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
                this.f22535a.a(interfaceC4410vt);
                return interfaceC4410vt;
            }
        }, this.f26641e);
        this.f26649m = m8;
        AbstractC1601Nq.a(m8, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void l(String str, InterfaceC1662Pi interfaceC1662Pi) {
        com.google.common.util.concurrent.d dVar = this.f26649m;
        if (dVar == null) {
            return;
        }
        AbstractC2326ck0.r(dVar, new C3050jL(this, str, interfaceC1662Pi), this.f26641e);
    }

    public final void m(WeakReference weakReference, String str, InterfaceC1662Pi interfaceC1662Pi) {
        l(str, new C3813qL(this, weakReference, str, interfaceC1662Pi, null));
    }

    public final synchronized void n(String str, InterfaceC1662Pi interfaceC1662Pi) {
        com.google.common.util.concurrent.d dVar = this.f26649m;
        if (dVar == null) {
            return;
        }
        AbstractC2326ck0.r(dVar, new C3159kL(this, str, interfaceC1662Pi), this.f26641e);
    }
}
