package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2758gj implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final Object f22422a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f22423b = new HashMap();

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.f22422a) {
            try {
                InterfaceC2649fj interfaceC2649fj = (InterfaceC2649fj) this.f22423b.remove(str);
                if (interfaceC2649fj == null) {
                    H2.p.g("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    interfaceC2649fj.n(str3 + concat);
                    return;
                }
                if (str5 == null) {
                    interfaceC2649fj.a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (AbstractC0608p0.m()) {
                        AbstractC0608p0.k("Result GMSG: " + jSONObject.toString(2));
                    }
                    interfaceC2649fj.a(jSONObject);
                } catch (JSONException e8) {
                    interfaceC2649fj.n(e8.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.common.util.concurrent.d b(InterfaceC4174tk interfaceC4174tk, String str, JSONObject jSONObject) {
        C1811Tq c1811Tq = new C1811Tq();
        C2.v.t();
        String uuid = UUID.randomUUID().toString();
        c(uuid, new C2540ej(this, c1811Tq));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            interfaceC4174tk.m1(str, jSONObject2);
        } catch (Exception e8) {
            c1811Tq.d(e8);
        }
        return c1811Tq;
    }

    public final void c(String str, InterfaceC2649fj interfaceC2649fj) {
        synchronized (this.f22422a) {
            this.f22423b.put(str, interfaceC2649fj);
        }
    }
}
