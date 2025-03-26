package com.google.android.gms.internal.ads;

import D2.BinderC0534q1;
import G2.AbstractC0608p0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w2.C6882h;

/* renamed from: com.google.android.gms.internal.ads.uK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4247uK {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27024a;

    /* renamed from: b, reason: collision with root package name */
    private final XJ f27025b;

    /* renamed from: c, reason: collision with root package name */
    private final N9 f27026c;

    /* renamed from: d, reason: collision with root package name */
    private final H2.a f27027d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.a f27028e;

    /* renamed from: f, reason: collision with root package name */
    private final C2000Zc f27029f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f27030g;

    /* renamed from: h, reason: collision with root package name */
    private final C1553Mg f27031h;

    /* renamed from: i, reason: collision with root package name */
    private final NK f27032i;

    /* renamed from: j, reason: collision with root package name */
    private final C2508eM f27033j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f27034k;

    /* renamed from: l, reason: collision with root package name */
    private final C4684yL f27035l;

    /* renamed from: m, reason: collision with root package name */
    private final HN f27036m;

    /* renamed from: n, reason: collision with root package name */
    private final C2959ia0 f27037n;

    /* renamed from: o, reason: collision with root package name */
    private final JS f27038o;

    /* renamed from: p, reason: collision with root package name */
    private final US f27039p;

    /* renamed from: q, reason: collision with root package name */
    private final P60 f27040q;

    public C4247uK(Context context, XJ xj, N9 n9, H2.a aVar, C2.a aVar2, C2000Zc c2000Zc, Executor executor, L60 l60, NK nk, C2508eM c2508eM, ScheduledExecutorService scheduledExecutorService, HN hn, C2959ia0 c2959ia0, JS js, C4684yL c4684yL, US us, P60 p60) {
        this.f27024a = context;
        this.f27025b = xj;
        this.f27026c = n9;
        this.f27027d = aVar;
        this.f27028e = aVar2;
        this.f27029f = c2000Zc;
        this.f27030g = executor;
        this.f27031h = l60.f16771i;
        this.f27032i = nk;
        this.f27033j = c2508eM;
        this.f27034k = scheduledExecutorService;
        this.f27036m = hn;
        this.f27037n = c2959ia0;
        this.f27038o = js;
        this.f27035l = c4684yL;
        this.f27039p = us;
        this.f27040q = p60;
    }

    public static final BinderC0534q1 i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return r(optJSONObject);
    }

    public static final List j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return AbstractC4169th0.w();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return AbstractC4169th0.w();
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            BinderC0534q1 r8 = r(optJSONArray.optJSONObject(i8));
            if (r8 != null) {
                arrayList.add(r8);
            }
        }
        return AbstractC4169th0.t(arrayList);
    }

    private final D2.c2 k(int i8, int i9) {
        if (i8 == 0) {
            if (i9 == 0) {
                return D2.c2.C0();
            }
            i8 = 0;
        }
        return new D2.c2(this.f27024a, new C6882h(i8, i9));
    }

    private static com.google.common.util.concurrent.d l(com.google.common.util.concurrent.d dVar, Object obj) {
        final Object obj2 = null;
        return AbstractC2326ck0.f(dVar, Exception.class, new InterfaceC1420Ij0(obj2) { // from class: com.google.android.gms.internal.ads.pK
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj3) {
                AbstractC0608p0.l("Error during loading assets.", (Exception) obj3);
                return AbstractC2326ck0.h(null);
            }
        }, AbstractC1497Kq.f16650g);
    }

    private static com.google.common.util.concurrent.d m(boolean z7, final com.google.common.util.concurrent.d dVar, Object obj) {
        return z7 ? AbstractC2326ck0.n(dVar, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.qK
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj2) {
                return obj2 != null ? dVar : AbstractC2326ck0.g(new zzegu(1, "Retrieve required value in native ad response failed."));
            }
        }, AbstractC1497Kq.f16650g) : l(dVar, null);
    }

    private final com.google.common.util.concurrent.d n(JSONObject jSONObject, boolean z7) {
        if (jSONObject == null) {
            return AbstractC2326ck0.h(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return AbstractC2326ck0.h(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z7) {
            return AbstractC2326ck0.h(new BinderC1484Kg(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m(jSONObject.optBoolean("require"), AbstractC2326ck0.m(this.f27025b.b(optString, optDouble, optBoolean), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.iK
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return new BinderC1484Kg(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.f27030g), null);
    }

    private final com.google.common.util.concurrent.d o(JSONArray jSONArray, boolean z7, boolean z8) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return AbstractC2326ck0.h(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z8 ? jSONArray.length() : 1;
        for (int i8 = 0; i8 < length; i8++) {
            arrayList.add(n(jSONArray.optJSONObject(i8), z7));
        }
        return AbstractC2326ck0.m(AbstractC2326ck0.d(arrayList), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.nK
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (BinderC1484Kg binderC1484Kg : (List) obj) {
                    if (binderC1484Kg != null) {
                        arrayList2.add(binderC1484Kg);
                    }
                }
                return arrayList2;
            }
        }, this.f27030g);
    }

    private final com.google.common.util.concurrent.d p(JSONObject jSONObject, C3785q60 c3785q60, C4111t60 c4111t60) {
        final com.google.common.util.concurrent.d b8 = this.f27032i.b(jSONObject.optString("base_url"), jSONObject.optString("html"), c3785q60, c4111t60, k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return AbstractC2326ck0.n(b8, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.kK
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
                if (interfaceC4410vt == null || interfaceC4410vt.q() == null) {
                    throw new zzegu(1, "Retrieve video view in html5 ad response failed.");
                }
                return b8;
            }
        }, AbstractC1497Kq.f16650g);
    }

    private static Integer q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final BinderC0534q1 r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new BinderC0534q1(optString, optString2);
    }

    final /* synthetic */ BinderC1377Hg a(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer q8 = q(jSONObject, "bg_color");
        Integer q9 = q(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new BinderC1377Hg(optString, list, q8, q9, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.f27031h.f17391v, optBoolean);
    }

    final /* synthetic */ com.google.common.util.concurrent.d b(D2.c2 c2Var, C3785q60 c3785q60, C4111t60 c4111t60, String str, String str2, Object obj) {
        InterfaceC4410vt a8 = this.f27033j.a(c2Var, c3785q60, c4111t60);
        final C1776Sq e8 = C1776Sq.e(a8);
        C4357vL b8 = this.f27035l.b();
        a8.L().e1(b8, b8, b8, b8, b8, false, null, new C2.b(this.f27024a, null, null), null, null, this.f27038o, this.f27037n, this.f27036m, null, b8, null, null, null, null);
        a8.Z0("/getNativeAdViewSignals", AbstractC1627Oi.f17933s);
        a8.Z0("/getNativeClickMeta", AbstractC1627Oi.f17934t);
        a8.L().L0(true);
        a8.L().i0(new InterfaceC3541nu() { // from class: com.google.android.gms.internal.ads.rK
            @Override // com.google.android.gms.internal.ads.InterfaceC3541nu
            public final void a(boolean z7, int i8, String str3, String str4) {
                C1776Sq c1776Sq = e8;
                if (z7) {
                    c1776Sq.h();
                    return;
                }
                c1776Sq.d(new zzegu(1, "Image Web View failed to load. Error code: " + i8 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        a8.S0(str, str2, null);
        return e8;
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(String str, Object obj) {
        C2.v.a();
        InterfaceC4410vt a8 = C1500Kt.a(this.f27024a, C3976ru.a(), "native-omid", false, false, this.f27026c, null, this.f27027d, null, null, this.f27028e, this.f27029f, null, null, this.f27039p, this.f27040q);
        final C1776Sq e8 = C1776Sq.e(a8);
        a8.L().i0(new InterfaceC3541nu() { // from class: com.google.android.gms.internal.ads.hK
            @Override // com.google.android.gms.internal.ads.InterfaceC3541nu
            public final void a(boolean z7, int i8, String str2, String str3) {
                e8.h();
            }
        });
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23916i5)).booleanValue()) {
            a8.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            a8.loadData(str, "text/html", "UTF-8");
        }
        return e8;
    }

    public final com.google.common.util.concurrent.d d(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return AbstractC2326ck0.h(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m(optJSONObject.optBoolean("require"), AbstractC2326ck0.m(o(optJSONArray, false, true), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.oK
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return this.f25155a.a(optJSONObject, (List) obj);
            }
        }, this.f27030g), null);
    }

    public final com.google.common.util.concurrent.d e(JSONObject jSONObject, String str) {
        return n(jSONObject.optJSONObject(str), this.f27031h.f17388s);
    }

    public final com.google.common.util.concurrent.d f(JSONObject jSONObject, String str) {
        C1553Mg c1553Mg = this.f27031h;
        return o(jSONObject.optJSONArray("images"), c1553Mg.f17388s, c1553Mg.f17390u);
    }

    public final com.google.common.util.concurrent.d g(JSONObject jSONObject, String str, final C3785q60 c3785q60, final C4111t60 c4111t60) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.T9)).booleanValue()) {
            return AbstractC2326ck0.h(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return AbstractC2326ck0.h(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return AbstractC2326ck0.h(null);
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final D2.c2 k8 = k(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return AbstractC2326ck0.h(null);
        }
        final com.google.common.util.concurrent.d n8 = AbstractC2326ck0.n(AbstractC2326ck0.h(null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.lK
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f24302a.b(k8, c3785q60, c4111t60, optString, optString2, obj);
            }
        }, AbstractC1497Kq.f16649f);
        return AbstractC2326ck0.n(n8, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.mK
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                if (((InterfaceC4410vt) obj) != null) {
                    return n8;
                }
                throw new zzegu(1, "Retrieve Web View from image ad response failed.");
            }
        }, AbstractC1497Kq.f16650g);
    }

    public final com.google.common.util.concurrent.d h(JSONObject jSONObject, C3785q60 c3785q60, C4111t60 c4111t60) {
        com.google.common.util.concurrent.d a8;
        JSONObject h8 = G2.U.h(jSONObject, "html_containers", "instream");
        if (h8 != null) {
            return p(h8, c3785q60, c4111t60);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return AbstractC2326ck0.h(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z7 = false;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.S9)).booleanValue() && optJSONObject.has("html")) {
            z7 = true;
        }
        if (!TextUtils.isEmpty(optString)) {
            if (!z7) {
                a8 = this.f27032i.a(optJSONObject);
            }
            return l(AbstractC2326ck0.o(a8, ((Integer) D2.A.c().a(AbstractC3184kf.f23778S3)).intValue(), TimeUnit.SECONDS, this.f27034k), null);
        }
        if (!z7) {
            H2.p.g("Required field 'vast_xml' or 'html' is missing");
            return AbstractC2326ck0.h(null);
        }
        a8 = p(optJSONObject, c3785q60, c4111t60);
        return l(AbstractC2326ck0.o(a8, ((Integer) D2.A.c().a(AbstractC3184kf.f23778S3)).intValue(), TimeUnit.SECONDS, this.f27034k), null);
    }
}
