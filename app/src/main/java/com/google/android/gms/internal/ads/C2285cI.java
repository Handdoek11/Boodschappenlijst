package com.google.android.gms.internal.ads;

import D2.C0555y;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import f3.InterfaceC5781e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2285cI implements PI {

    /* renamed from: C, reason: collision with root package name */
    private D2.A0 f21127C;

    /* renamed from: D, reason: collision with root package name */
    private final C3156kJ f21128D;

    /* renamed from: a, reason: collision with root package name */
    private final Context f21129a;

    /* renamed from: b, reason: collision with root package name */
    private final SI f21130b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f21131c;

    /* renamed from: d, reason: collision with root package name */
    private final C4030sL f21132d;

    /* renamed from: e, reason: collision with root package name */
    private final HI f21133e;

    /* renamed from: f, reason: collision with root package name */
    private final N9 f21134f;

    /* renamed from: g, reason: collision with root package name */
    private final CC f21135g;

    /* renamed from: h, reason: collision with root package name */
    private final C2817hC f21136h;

    /* renamed from: i, reason: collision with root package name */
    private final C3695pG f21137i;

    /* renamed from: j, reason: collision with root package name */
    private final C3785q60 f21138j;

    /* renamed from: k, reason: collision with root package name */
    private final H2.a f21139k;

    /* renamed from: l, reason: collision with root package name */
    private final L60 f21140l;

    /* renamed from: m, reason: collision with root package name */
    private final C1643Ox f21141m;

    /* renamed from: n, reason: collision with root package name */
    private final ViewOnClickListenerC3592oJ f21142n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC5781e f21143o;

    /* renamed from: p, reason: collision with root package name */
    private final C3259lG f21144p;

    /* renamed from: q, reason: collision with root package name */
    private final C2959ia0 f21145q;

    /* renamed from: r, reason: collision with root package name */
    private final C3160kM f21146r;

    /* renamed from: s, reason: collision with root package name */
    private final RunnableC3464n90 f21147s;

    /* renamed from: t, reason: collision with root package name */
    private final US f21148t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f21150v;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21149u = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21151w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f21152x = false;

    /* renamed from: y, reason: collision with root package name */
    private Point f21153y = new Point();

    /* renamed from: z, reason: collision with root package name */
    private Point f21154z = new Point();

    /* renamed from: A, reason: collision with root package name */
    private long f21125A = 0;

    /* renamed from: B, reason: collision with root package name */
    private long f21126B = 0;

    public C2285cI(Context context, SI si, JSONObject jSONObject, C4030sL c4030sL, HI hi, N9 n9, CC cc, C2817hC c2817hC, C3695pG c3695pG, C3785q60 c3785q60, H2.a aVar, L60 l60, C1643Ox c1643Ox, ViewOnClickListenerC3592oJ viewOnClickListenerC3592oJ, InterfaceC5781e interfaceC5781e, C3259lG c3259lG, C2959ia0 c2959ia0, RunnableC3464n90 runnableC3464n90, US us, C3160kM c3160kM, C3156kJ c3156kJ) {
        this.f21129a = context;
        this.f21130b = si;
        this.f21131c = jSONObject;
        this.f21132d = c4030sL;
        this.f21133e = hi;
        this.f21134f = n9;
        this.f21135g = cc;
        this.f21136h = c2817hC;
        this.f21137i = c3695pG;
        this.f21138j = c3785q60;
        this.f21139k = aVar;
        this.f21140l = l60;
        this.f21141m = c1643Ox;
        this.f21142n = viewOnClickListenerC3592oJ;
        this.f21143o = interfaceC5781e;
        this.f21144p = c3259lG;
        this.f21145q = c2959ia0;
        this.f21147s = runnableC3464n90;
        this.f21148t = us;
        this.f21146r = c3160kM;
        this.f21128D = c3156kJ;
    }

    private final boolean A(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z7, View view) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f21131c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23666E3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z7);
            Context context = this.f21129a;
            JSONObject jSONObject7 = new JSONObject();
            C2.v.t();
            DisplayMetrics Z7 = G2.D0.Z((WindowManager) context.getSystemService("window"));
            AbstractC2177bI abstractC2177bI = null;
            try {
                jSONObject7.put("width", C0555y.b().f(context, Z7.widthPixels));
                jSONObject7.put("height", C0555y.b().f(context, Z7.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.y8)).booleanValue()) {
                this.f21132d.l("/clickRecorded", new YH(this, abstractC2177bI));
            } else {
                this.f21132d.l("/logScionEvent", new XH(this, abstractC2177bI));
            }
            this.f21132d.l("/nativeImpression", new ZH(this, view, abstractC2177bI));
            AbstractC1601Nq.a(this.f21132d.g("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f21149u) {
                return true;
            }
            C3785q60 c3785q60 = this.f21138j;
            this.f21149u = C2.v.w().n(this.f21129a, this.f21139k.f2914o, c3785q60.f25754C.toString(), this.f21140l.f16768f);
            return true;
        } catch (JSONException e8) {
            H2.p.e("Unable to create impression JSON.", e8);
            return false;
        }
    }

    private final String v(View view) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23666E3)).booleanValue()) {
            return null;
        }
        try {
            return this.f21134f.c().i(this.f21129a, view, null);
        } catch (Exception unused) {
            H2.p.d("Exception getting data.");
            return null;
        }
    }

    private final String x(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int P7 = this.f21133e.P();
        if (P7 == 1) {
            return "1099";
        }
        if (P7 == 2) {
            return "2099";
        }
        if (P7 != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean y(String str) {
        JSONObject optJSONObject = this.f21131c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final boolean z() {
        return this.f21131c.optBoolean("allow_custom_click_gesture", false);
    }

    protected final void F(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z7, boolean z8) {
        String str2;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f21131c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f21130b.c(this.f21133e.a()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f21133e.P());
            jSONObject8.put("view_aware_api_used", z7);
            C1553Mg c1553Mg = this.f21140l.f16771i;
            jSONObject8.put("custom_mute_requested", c1553Mg != null && c1553Mg.f17393x);
            jSONObject8.put("custom_mute_enabled", (this.f21133e.h().isEmpty() || this.f21133e.X() == null) ? false : true);
            if (this.f21142n.a() != null && this.f21131c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f21143o.a());
            if (this.f21152x && z()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z8) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f21130b.c(this.f21133e.a()) != null);
            try {
                JSONObject optJSONObject = this.f21131c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f21134f.c().e(this.f21129a, optJSONObject.optString("click_string"), view);
            } catch (Exception e8) {
                H2.p.e("Exception obtaining click signals", e8);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            jSONObject8.put("open_chrome_custom_tab", true);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.C8)).booleanValue() && f3.m.l()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) D2.A.c().a(AbstractC3184kf.D8)).booleanValue() && f3.m.l()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a8 = this.f21143o.a();
            jSONObject9.put("time_from_last_touch_down", a8 - this.f21125A);
            jSONObject9.put("time_from_last_touch", a8 - this.f21126B);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.f21138j.b()) {
                JSONObject jSONObject10 = (JSONObject) this.f21131c.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.f21148t.C7(string, this.f21133e);
                }
            }
            AbstractC1601Nq.a(this.f21132d.g("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e9) {
            H2.p.e("Unable to create click JSON.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void a(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f21129a;
        A(G2.X.g(context, view), G2.X.d(context, map, map2, view, scaleType), G2.X.f(view), G2.X.e(context, view), v(view), null, G2.X.h(context, this.f21138j), view);
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void b(View view) {
        if (!this.f21131c.optBoolean("custom_one_point_five_click_enabled", false)) {
            H2.p.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ViewOnClickListenerC3592oJ viewOnClickListenerC3592oJ = this.f21142n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(viewOnClickListenerC3592oJ);
        view.setClickable(true);
        viewOnClickListenerC3592oJ.f25151x = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final boolean c(Bundle bundle) {
        if (y("impression_reporting")) {
            return A(null, null, null, null, ((Boolean) D2.A.c().a(AbstractC3184kf.pb)).booleanValue() ? v(null) : null, C0555y.b().o(bundle, null), false, null);
        }
        H2.p.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final boolean c0() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.tb)).booleanValue()) {
            return this.f21140l.f16771i.f17385A;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void d(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f21153y = new Point();
        this.f21154z = new Point();
        if (!this.f21150v) {
            this.f21144p.m1(view);
            this.f21150v = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f21141m.c(this);
        boolean i8 = G2.X.i(this.f21139k.f2916t);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (i8) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (i8) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void e() {
        try {
            D2.A0 a02 = this.f21127C;
            if (a02 != null) {
                a02.b();
            }
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void f() {
        if (this.f21131c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f21142n.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void g(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType) {
        Context context = this.f21129a;
        JSONObject d8 = G2.X.d(context, map, map2, view2, scaleType);
        JSONObject g8 = G2.X.g(context, view2);
        JSONObject f8 = G2.X.f(view2);
        JSONObject e8 = G2.X.e(context, view2);
        String x7 = x(view, map);
        F(true == ((Boolean) D2.A.c().a(AbstractC3184kf.f23722L3)).booleanValue() ? view2 : view, g8, d8, f8, e8, x7, G2.X.c(x7, context, this.f21154z, this.f21153y), null, z7, false);
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void h() {
        this.f21132d.i();
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void i(Bundle bundle) {
        if (bundle == null) {
            H2.p.b("Click data is null. No click is reported.");
        } else if (!y("click_reporting")) {
            H2.p.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            F(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, C0555y.b().o(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void j(D2.D0 d02) {
        try {
            if (this.f21151w) {
                return;
            }
            if (d02 == null) {
                HI hi = this.f21133e;
                if (hi.X() != null) {
                    this.f21151w = true;
                    this.f21145q.d(hi.X().c(), this.f21138j.f25825x0, this.f21147s);
                    e();
                    return;
                }
            }
            this.f21151w = true;
            this.f21145q.d(d02.c(), this.f21138j.f25825x0, this.f21147s);
            e();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void k(View view, Map map) {
        this.f21153y = new Point();
        this.f21154z = new Point();
        if (view != null) {
            this.f21144p.p1(view);
        }
        this.f21150v = false;
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void l(Bundle bundle) {
        if (bundle == null) {
            H2.p.b("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!y("touch_reporting")) {
            H2.p.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f21134f.c().g((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void m(D2.A0 a02) {
        this.f21127C = a02;
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void n(View view, MotionEvent motionEvent, View view2) {
        this.f21153y = G2.X.a(motionEvent, view2);
        long a8 = this.f21143o.a();
        this.f21126B = a8;
        if (motionEvent.getAction() == 0) {
            this.f21146r.b(motionEvent);
            this.f21125A = a8;
            this.f21154z = this.f21153y;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f21153y;
        obtain.setLocation(point.x, point.y);
        this.f21134f.d(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void o(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType, int i8) {
        JSONObject jSONObject;
        boolean z8 = false;
        if (this.f21131c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.tb)).booleanValue()) {
                z8 = true;
            }
        }
        if (!z8) {
            if (!this.f21152x) {
                H2.p.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!z()) {
                H2.p.b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject d8 = G2.X.d(this.f21129a, map, map2, view2, scaleType);
        JSONObject g8 = G2.X.g(this.f21129a, view2);
        JSONObject f8 = G2.X.f(view2);
        JSONObject e8 = G2.X.e(this.f21129a, view2);
        String x7 = x(view, map);
        JSONObject c8 = G2.X.c(x7, this.f21129a, this.f21154z, this.f21153y);
        if (z8) {
            try {
                JSONObject jSONObject2 = this.f21131c;
                Point point = this.f21154z;
                Point point2 = this.f21153y;
                try {
                    jSONObject = new JSONObject();
                } catch (Exception e9) {
                    e = e9;
                    jSONObject = null;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    if (point != null) {
                        jSONObject3.put("x", point.x);
                        jSONObject3.put("y", point.y);
                    }
                    if (point2 != null) {
                        jSONObject4.put("x", point2.x);
                        jSONObject4.put("y", point2.y);
                    }
                    jSONObject.put("start_point", jSONObject3);
                    jSONObject.put("end_point", jSONObject4);
                    jSONObject.put("duration_ms", i8);
                } catch (Exception e10) {
                    e = e10;
                    H2.p.e("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    F(view2, g8, d8, f8, e8, x7, c8, null, z7, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e11) {
                H2.p.e("Error occurred while adding CustomClickGestureSignals to adJson.", e11);
                C2.v.s().x(e11, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        F(view2, g8, d8, f8, e8, x7, c8, null, z7, true);
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void p(InterfaceC1695Qh interfaceC1695Qh) {
        if (this.f21131c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f21142n.d(interfaceC1695Qh);
        } else {
            H2.p.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void q() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f21131c);
            AbstractC1601Nq.a(this.f21132d.g("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e8) {
            H2.p.e("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final JSONObject r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f21129a;
        JSONObject d8 = G2.X.d(context, map, map2, view, scaleType);
        JSONObject g8 = G2.X.g(context, view);
        JSONObject f8 = G2.X.f(view);
        JSONObject e8 = G2.X.e(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", d8);
            jSONObject.put("ad_view_signal", g8);
            jSONObject.put("scroll_view_signal", f8);
            jSONObject.put("lock_screen_signal", e8);
            return jSONObject;
        } catch (JSONException e9) {
            H2.p.e("Unable to create native ad view signals JSON.", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void r0(String str) {
        F(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void s() {
        A(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final boolean t() {
        return z();
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final JSONObject u(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject r8 = r(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f21152x && z()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (r8 != null) {
                jSONObject.put("nas", r8);
            }
        } catch (JSONException e8) {
            H2.p.e("Unable to create native click meta data JSON.", e8);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final void w() {
        this.f21152x = true;
    }

    @Override // com.google.android.gms.internal.ads.PI
    public final int zza() {
        if (this.f21140l.f16771i == null) {
            return 0;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.tb)).booleanValue()) {
            return this.f21140l.f16771i.f17395z;
        }
        return 0;
    }
}
