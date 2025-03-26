package com.google.android.gms.internal.ads;

import D2.C0555y;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ik, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2977ik {
    public static void a(InterfaceC3085jk interfaceC3085jk, String str, Map map) {
        try {
            interfaceC3085jk.p(str, C0555y.b().n(map));
        } catch (JSONException unused) {
            H2.p.g("Could not convert parameters to JSON.");
        }
    }

    public static void b(InterfaceC3085jk interfaceC3085jk, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        H2.p.b("Dispatching AFMA event: ".concat(sb.toString()));
        interfaceC3085jk.n(sb.toString());
    }

    public static void c(InterfaceC3085jk interfaceC3085jk, String str, String str2) {
        interfaceC3085jk.n(str + "(" + str2 + ");");
    }

    public static void d(InterfaceC3085jk interfaceC3085jk, String str, JSONObject jSONObject) {
        interfaceC3085jk.m(str, jSONObject.toString());
    }
}
