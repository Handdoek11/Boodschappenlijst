package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Jb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1440Jb0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16272a;

    /* renamed from: b, reason: collision with root package name */
    private C3288lc0 f16273b;

    /* renamed from: c, reason: collision with root package name */
    private long f16274c;

    /* renamed from: d, reason: collision with root package name */
    private int f16275d;

    public AbstractC1440Jb0(String str) {
        b();
        this.f16272a = str;
        this.f16273b = new C3288lc0(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView a() {
        return (WebView) this.f16273b.get();
    }

    public final void b() {
        this.f16274c = System.nanoTime();
        this.f16275d = 1;
    }

    public void c() {
        this.f16273b.clear();
    }

    public final void d(String str, long j8) {
        if (j8 < this.f16274c || this.f16275d == 3) {
            return;
        }
        this.f16275d = 3;
        C4811zb0.a().h(a(), this.f16272a, str);
    }

    public final void e() {
        C4811zb0.a().c(a(), this.f16272a);
    }

    public final void f(C1962Ya0 c1962Ya0) {
        C4811zb0.a().d(a(), this.f16272a, c1962Ya0.b());
    }

    public final void g(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        AbstractC1649Pb0.e(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C4811zb0.a().f(a(), jSONObject);
    }

    public final void h(String str, long j8) {
        if (j8 >= this.f16274c) {
            this.f16275d = 2;
            C4811zb0.a().h(a(), this.f16272a, str);
        }
    }

    public void i(C2200bb0 c2200bb0, C1997Za0 c1997Za0) {
        j(c2200bb0, c1997Za0, null);
    }

    protected final void j(C2200bb0 c2200bb0, C1997Za0 c1997Za0, JSONObject jSONObject) {
        String h8 = c2200bb0.h();
        JSONObject jSONObject2 = new JSONObject();
        AbstractC1649Pb0.e(jSONObject2, "environment", "app");
        AbstractC1649Pb0.e(jSONObject2, "adSessionType", c1997Za0.d());
        JSONObject jSONObject3 = new JSONObject();
        AbstractC1649Pb0.e(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        AbstractC1649Pb0.e(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        AbstractC1649Pb0.e(jSONObject3, "os", "Android");
        AbstractC1649Pb0.e(jSONObject2, "deviceInfo", jSONObject3);
        AbstractC1649Pb0.e(jSONObject2, "deviceCategory", AbstractC1614Ob0.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        AbstractC1649Pb0.e(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        AbstractC1649Pb0.e(jSONObject4, "partnerName", c1997Za0.e().b());
        AbstractC1649Pb0.e(jSONObject4, "partnerVersion", c1997Za0.e().c());
        AbstractC1649Pb0.e(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        AbstractC1649Pb0.e(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        AbstractC1649Pb0.e(jSONObject5, "appId", C4593xb0.b().a().getApplicationContext().getPackageName());
        AbstractC1649Pb0.e(jSONObject2, "app", jSONObject5);
        if (c1997Za0.f() != null) {
            AbstractC1649Pb0.e(jSONObject2, "contentUrl", c1997Za0.f());
        }
        if (c1997Za0.g() != null) {
            AbstractC1649Pb0.e(jSONObject2, "customReferenceData", c1997Za0.g());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = c1997Za0.h().iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.E.a(it.next());
            throw null;
        }
        C4811zb0.a().j(a(), h8, jSONObject2, jSONObject6, jSONObject);
    }

    public final void k(boolean z7) {
        if (p()) {
            C4811zb0.a().i(a(), this.f16272a, true != z7 ? "backgrounded" : "foregrounded");
        }
    }

    public final void l(float f8) {
        C4811zb0.a().e(a(), this.f16272a, f8);
    }

    public final void m(boolean z7) {
        if (p()) {
            C4811zb0.a().g(a(), this.f16272a, true != z7 ? "unlocked" : "locked");
        }
    }

    final void n(WebView webView) {
        this.f16273b = new C3288lc0(webView);
    }

    public void o() {
    }

    public final boolean p() {
        return this.f16273b.get() != 0;
    }
}
