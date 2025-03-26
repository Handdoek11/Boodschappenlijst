package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NW {

    /* renamed from: a, reason: collision with root package name */
    private final Map f17544a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f17545b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f17546c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f17547d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f17548e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Executor f17549f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f17550g;

    NW(Executor executor) {
        this.f17549f = executor;
    }

    private final synchronized AbstractC4496wh0 h(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(C2.v.s().j().g().c())) {
                boolean matches = Pattern.matches((String) D2.A.c().a(AbstractC3184kf.f23959n3), str);
                boolean matches2 = Pattern.matches((String) D2.A.c().a(AbstractC3184kf.f23968o3), str);
                if (matches) {
                    hashMap = new HashMap(this.f17548e);
                } else if (matches2) {
                    hashMap = new HashMap(this.f17547d);
                }
                return AbstractC4496wh0.d(hashMap);
            }
            return AbstractC4496wh0.e();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List i(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle o8 = o(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        String optString = optJSONArray.optString(i8, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        String str2 = (String) arrayList2.get(i9);
                        g(str2);
                        if (((PW) this.f17544a.get(str2)) != null) {
                            arrayList.add(new PW(str2, str, o8));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void j() {
        this.f17545b.clear();
        this.f17544a.clear();
        this.f17548e.clear();
        this.f17547d.clear();
        m();
        n();
        k();
    }

    private final synchronized void k() {
        JSONObject f8;
        try {
            if (!((Boolean) AbstractC3948rg.f26206b.e()).booleanValue()) {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23792U1)).booleanValue() && (f8 = C2.v.s().j().g().f()) != null) {
                    JSONArray jSONArray = f8.getJSONArray("adapter_settings");
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i8);
                        String optString = jSONObject.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i9);
                                boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject2.optString("platform");
                                RW rw = new RW(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.f17547d.put(optString, rw);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.f17548e.put(optString, rw);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e8) {
            AbstractC0608p0.l("Malformed config loading JSON.", e8);
        } finally {
        }
    }

    private final synchronized void l(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.f17546c.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.f17546c.put(str, map);
            List list2 = (List) map.get(str2);
            if (list2 == null) {
                list2 = new ArrayList();
            }
            list2.addAll(list);
            map.put(str2, list2);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void m() {
        JSONArray optJSONArray;
        try {
            JSONObject f8 = C2.v.s().j().g().f();
            if (f8 != null) {
                try {
                    JSONArray optJSONArray2 = f8.optJSONArray("ad_unit_id_settings");
                    this.f17550g = f8.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i8 = 0; i8 < optJSONArray2.length(); i8++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i8);
                            String lowerCase = ((Boolean) D2.A.c().a(AbstractC3184kf.Na)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String optString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                                    arrayList.addAll(i(optJSONArray.getJSONObject(i9), optString));
                                }
                            }
                            l(optString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e8) {
                    AbstractC0608p0.l("Malformed config loading JSON.", e8);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void n() {
        JSONObject f8;
        if (!((Boolean) AbstractC3948rg.f26209e.e()).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23784T1)).booleanValue() && (f8 = C2.v.s().j().g().f()) != null) {
                try {
                    JSONArray jSONArray = f8.getJSONArray("signal_adapters");
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i8);
                        Bundle o8 = o(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f17545b.put(optString, new RW(optString, optBoolean2, optBoolean, true, o8));
                        }
                    }
                } catch (JSONException e8) {
                    AbstractC0608p0.l("Malformed config loading JSON.", e8);
                }
            }
        }
    }

    private static final Bundle o(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map a(String str, String str2) {
        HashMap hashMap;
        try {
            Map b8 = b(str, str2);
            AbstractC4496wh0 h8 = h(str2);
            hashMap = new HashMap();
            for (Map.Entry entry : ((AbstractC4496wh0) b8).entrySet()) {
                String str3 = (String) entry.getKey();
                if (h8.containsKey(str3)) {
                    RW rw = (RW) h8.get(str3);
                    List list = (List) entry.getValue();
                    hashMap.put(str3, new RW(str3, rw.f18657b, rw.f18658c, rw.f18659d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            AbstractC4825zi0 j8 = h8.entrySet().j();
            while (j8.hasNext()) {
                Map.Entry entry2 = (Map.Entry) j8.next();
                String str4 = (String) entry2.getKey();
                if (!hashMap.containsKey(str4) && ((RW) entry2.getValue()).f18659d) {
                    hashMap.put(str4, (RW) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    public final synchronized Map b(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(C2.v.s().j().g().c()) && (map = (Map) this.f17546c.get(str)) != null) {
                List<PW> list = (List) map.get(str2);
                if (list == null) {
                    String a8 = CM.a(this.f17550g, str2, str);
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.Na)).booleanValue()) {
                        a8 = a8.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(a8);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (PW pw : list) {
                        String str3 = pw.f18195a;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(pw.f18196b);
                    }
                    return AbstractC4496wh0.d(hashMap);
                }
            }
            return AbstractC4496wh0.e();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map c() {
        if (TextUtils.isEmpty(C2.v.s().j().g().c())) {
            return AbstractC4496wh0.e();
        }
        return AbstractC4496wh0.d(this.f17545b);
    }

    public final void e() {
        C2.v.s().j().a0(new Runnable() { // from class: com.google.android.gms.internal.ads.MW
            @Override // java.lang.Runnable
            public final void run() {
                this.f17367o.f();
            }
        });
        this.f17549f.execute(new LW(this));
    }

    final /* synthetic */ void f() {
        this.f17549f.execute(new LW(this));
    }

    public final synchronized void g(String str) {
        if (!TextUtils.isEmpty(str) && !this.f17544a.containsKey(str)) {
            this.f17544a.put(str, new PW(str, "", new Bundle()));
        }
    }
}
