package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;
import q1.AbstractC6414a;
import q1.AbstractC6418e;
import q1.C6416c;

/* renamed from: com.google.android.gms.internal.ads.hb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2852hb0 implements AbstractC6418e.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3068jb0 f22586a;

    C2852hb0(C3068jb0 c3068jb0) {
        this.f22586a = c3068jb0;
    }

    @Override // q1.AbstractC6418e.a
    public final void a(WebView webView, C6416c c6416c, Uri uri, boolean z7, AbstractC6414a abstractC6414a) {
        try {
            JSONObject jSONObject = new JSONObject(c6416c.b());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                C3068jb0.e(this.f22586a, string2);
            } else if (string.equals("finishSession")) {
                C3068jb0.c(this.f22586a, string2);
            } else {
                AbstractC1822Ua0.f19418a.booleanValue();
            }
        } catch (JSONException e8) {
            AbstractC1684Qb0.a("Error parsing JS message in JavaScriptSessionService.", e8);
        }
    }
}
