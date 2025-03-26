package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.en, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2548en {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4410vt f21887a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21888b;

    public C2548en(InterfaceC4410vt interfaceC4410vt, String str) {
        this.f21887a = interfaceC4410vt;
        this.f21888b = str;
    }

    public final void b(int i8, int i9, int i10, int i11) {
        try {
            this.f21887a.p("onDefaultPositionReceived", new JSONObject().put("x", i8).put("y", i9).put("width", i10).put("height", i11));
        } catch (JSONException e8) {
            H2.p.e("Error occurred while dispatching default position.", e8);
        }
    }

    public final void c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f21888b);
            InterfaceC4410vt interfaceC4410vt = this.f21887a;
            if (interfaceC4410vt != null) {
                interfaceC4410vt.p("onError", put);
            }
        } catch (JSONException e8) {
            H2.p.e("Error occurred while dispatching error event.", e8);
        }
    }

    public final void d(String str) {
        try {
            this.f21887a.p("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e8) {
            H2.p.e("Error occurred while dispatching ready Event.", e8);
        }
    }

    public final void e(int i8, int i9, int i10, int i11, float f8, int i12) {
        try {
            this.f21887a.p("onScreenInfoChanged", new JSONObject().put("width", i8).put("height", i9).put("maxSizeWidth", i10).put("maxSizeHeight", i11).put("density", f8).put("rotation", i12));
        } catch (JSONException e8) {
            H2.p.e("Error occurred while obtaining screen information.", e8);
        }
    }

    public final void f(int i8, int i9, int i10, int i11) {
        try {
            this.f21887a.p("onSizeChanged", new JSONObject().put("x", i8).put("y", i9).put("width", i10).put("height", i11));
        } catch (JSONException e8) {
            H2.p.e("Error occurred while dispatching size change.", e8);
        }
    }

    public final void g(String str) {
        try {
            this.f21887a.p("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e8) {
            H2.p.e("Error occurred while dispatching state change.", e8);
        }
    }
}
