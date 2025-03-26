package com.google.android.gms.internal.ads;

import D2.C0555y;
import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2186bP implements InterfaceC3360mC, JD, InterfaceC2384dD {

    /* renamed from: B, reason: collision with root package name */
    private JSONObject f20862B;

    /* renamed from: C, reason: collision with root package name */
    private JSONObject f20863C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f20864D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f20865E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f20866F;

    /* renamed from: o, reason: collision with root package name */
    private final C3490nP f20867o;

    /* renamed from: s, reason: collision with root package name */
    private final String f20868s;

    /* renamed from: t, reason: collision with root package name */
    private final String f20869t;

    /* renamed from: w, reason: collision with root package name */
    private BinderC2273cC f20872w;

    /* renamed from: x, reason: collision with root package name */
    private D2.W0 f20873x;

    /* renamed from: y, reason: collision with root package name */
    private String f20874y = "";

    /* renamed from: z, reason: collision with root package name */
    private String f20875z = "";

    /* renamed from: A, reason: collision with root package name */
    private String f20861A = "";

    /* renamed from: u, reason: collision with root package name */
    private int f20870u = 0;

    /* renamed from: v, reason: collision with root package name */
    private EnumC2077aP f20871v = EnumC2077aP.AD_REQUESTED;

    C2186bP(C3490nP c3490nP, L60 l60, String str) {
        this.f20867o = c3490nP;
        this.f20869t = str;
        this.f20868s = l60.f16768f;
    }

    private static JSONObject f(D2.W0 w02) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", w02.f1164t);
        jSONObject.put("errorCode", w02.f1162o);
        jSONObject.put("errorDescription", w02.f1163s);
        D2.W0 w03 = w02.f1165u;
        jSONObject.put("underlyingError", w03 == null ? null : f(w03));
        return jSONObject;
    }

    private final JSONObject g(BinderC2273cC binderC2273cC) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", binderC2273cC.g());
        jSONObject.put("responseSecsSinceEpoch", binderC2273cC.a());
        jSONObject.put("responseId", binderC2273cC.f());
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f9)).booleanValue()) {
            String d8 = binderC2273cC.d();
            if (!TextUtils.isEmpty(d8)) {
                H2.p.b("Bidding data: ".concat(String.valueOf(d8)));
                jSONObject.put("biddingData", new JSONObject(d8));
            }
        }
        if (!TextUtils.isEmpty(this.f20874y)) {
            jSONObject.put("adRequestUrl", this.f20874y);
        }
        if (!TextUtils.isEmpty(this.f20875z)) {
            jSONObject.put("postBody", this.f20875z);
        }
        if (!TextUtils.isEmpty(this.f20861A)) {
            jSONObject.put("adResponseBody", this.f20861A);
        }
        Object obj = this.f20862B;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f20863C;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.i9)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f20866F);
        }
        JSONArray jSONArray = new JSONArray();
        for (D2.g2 g2Var : binderC2273cC.h()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", g2Var.f1269o);
            jSONObject2.put("latencyMillis", g2Var.f1270s);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.g9)).booleanValue()) {
                jSONObject2.put("credentials", C0555y.b().m(g2Var.f1272u));
            }
            D2.W0 w02 = g2Var.f1271t;
            jSONObject2.put("error", w02 == null ? null : f(w02));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void Q(C4618xo c4618xo) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.m9)).booleanValue() || !this.f20867o.r()) {
            return;
        }
        this.f20867o.g(this.f20868s, this);
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void T0(C60 c60) {
        if (this.f20867o.r()) {
            if (!c60.f14101b.f13519a.isEmpty()) {
                this.f20870u = ((C3785q60) c60.f14101b.f13519a.get(0)).f25780b;
            }
            if (!TextUtils.isEmpty(c60.f14101b.f13520b.f26842l)) {
                this.f20874y = c60.f14101b.f13520b.f26842l;
            }
            if (!TextUtils.isEmpty(c60.f14101b.f13520b.f26843m)) {
                this.f20875z = c60.f14101b.f13520b.f26843m;
            }
            if (c60.f14101b.f13520b.f26846p.length() > 0) {
                this.f20863C = c60.f14101b.f13520b.f26846p;
            }
            if (((Boolean) D2.A.c().a(AbstractC3184kf.i9)).booleanValue()) {
                if (!this.f20867o.t()) {
                    this.f20866F = true;
                    return;
                }
                if (!TextUtils.isEmpty(c60.f14101b.f13520b.f26844n)) {
                    this.f20861A = c60.f14101b.f13520b.f26844n;
                }
                if (c60.f14101b.f13520b.f26845o.length() > 0) {
                    this.f20862B = c60.f14101b.f13520b.f26845o;
                }
                C3490nP c3490nP = this.f20867o;
                JSONObject jSONObject = this.f20862B;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f20861A)) {
                    length += this.f20861A.length();
                }
                c3490nP.l(length);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2384dD
    public final void V0(AbstractC1506Kz abstractC1506Kz) {
        if (this.f20867o.r()) {
            this.f20872w = abstractC1506Kz.c();
            this.f20871v = EnumC2077aP.AD_LOADED;
            if (((Boolean) D2.A.c().a(AbstractC3184kf.m9)).booleanValue()) {
                this.f20867o.g(this.f20868s, this);
            }
        }
    }

    public final String a() {
        return this.f20869t;
    }

    public final JSONObject b() {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.f20871v);
        jSONObject2.put("format", C3785q60.a(this.f20870u));
        if (((Boolean) D2.A.c().a(AbstractC3184kf.m9)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.f20864D);
            if (this.f20864D) {
                jSONObject2.put("shown", this.f20865E);
            }
        }
        BinderC2273cC binderC2273cC = this.f20872w;
        if (binderC2273cC != null) {
            jSONObject = g(binderC2273cC);
        } else {
            D2.W0 w02 = this.f20873x;
            JSONObject jSONObject3 = null;
            if (w02 != null && (iBinder = w02.f1166v) != null) {
                BinderC2273cC binderC2273cC2 = (BinderC2273cC) iBinder;
                jSONObject3 = g(binderC2273cC2);
                if (binderC2273cC2.h().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(f(this.f20873x));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final void c() {
        this.f20864D = true;
    }

    public final void d() {
        this.f20865E = true;
    }

    public final boolean e() {
        return this.f20871v != EnumC2077aP.AD_REQUESTED;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360mC
    public final void r0(D2.W0 w02) {
        if (this.f20867o.r()) {
            this.f20871v = EnumC2077aP.AD_LOAD_FAILED;
            this.f20873x = w02;
            if (((Boolean) D2.A.c().a(AbstractC3184kf.m9)).booleanValue()) {
                this.f20867o.g(this.f20868s, this);
            }
        }
    }
}
