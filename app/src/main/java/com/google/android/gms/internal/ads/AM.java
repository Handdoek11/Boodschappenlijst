package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AM {

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f13544b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f13545c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13546d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f13547e;

    /* renamed from: a, reason: collision with root package name */
    private final Map f13543a = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f13548f = new AtomicBoolean(false);

    public AM(Executor executor) {
        this.f13545c = executor;
    }

    private final void g() {
        if (this.f13548f.getAndSet(true)) {
            return;
        }
        C2.v.s().j().a0(new Runnable() { // from class: com.google.android.gms.internal.ads.yM
            @Override // java.lang.Runnable
            public final void run() {
                this.f28108o.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized void e() {
        JSONObject f8;
        Map map;
        try {
            this.f13546d = true;
            C4404vq g8 = C2.v.s().j().g();
            if (g8 != null && (f8 = g8.f()) != null) {
                this.f13544b = ((Boolean) D2.A.c().a(AbstractC3184kf.f23888f4)).booleanValue() ? f8.optJSONObject("common_settings") : null;
                this.f13547e = f8.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = f8.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                if (this.f13543a.containsKey(optString2)) {
                                    map = (Map) this.f13543a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f13543a.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }

    public final JSONObject a() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23888f4)).booleanValue()) {
            return this.f13544b;
        }
        return null;
    }

    public final JSONObject b(String str, String str2) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23870d4)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f13546d) {
            e();
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23879e4)).booleanValue()) {
                g();
            }
        }
        Map map = (Map) this.f13543a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String a8 = CM.a(this.f13547e, str, str2);
        if (a8 != null) {
            return (JSONObject) map.get(a8);
        }
        return null;
    }

    public final void d() {
        g();
        this.f13545c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xM
            @Override // java.lang.Runnable
            public final void run() {
                this.f27853o.e();
            }
        });
    }

    final /* synthetic */ void f() {
        this.f13545c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zM
            @Override // java.lang.Runnable
            public final void run() {
                this.f28606o.e();
            }
        });
    }
}
