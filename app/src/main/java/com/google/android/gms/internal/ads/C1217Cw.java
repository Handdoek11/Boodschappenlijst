package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Cw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1217Cw {

    /* renamed from: a, reason: collision with root package name */
    private final Map f14281a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f14282b;

    C1217Cw(Map map, Map map2) {
        this.f14281a = map;
        this.f14282b = map2;
    }

    public final void a(C60 c60) {
        for (C4765z60 c4765z60 : c60.f14101b.f13521c) {
            if (this.f14281a.containsKey(c4765z60.f28299a) && c4765z60.f28300b != null) {
                ((InterfaceC1361Gw) this.f14281a.get(c4765z60.f28299a)).a(c4765z60.f28300b);
            } else if (this.f14282b.containsKey(c4765z60.f28299a) && c4765z60.f28300b != null) {
                InterfaceC1325Fw interfaceC1325Fw = (InterfaceC1325Fw) this.f14282b.get(c4765z60.f28299a);
                JSONObject jSONObject = c4765z60.f28300b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                interfaceC1325Fw.a(hashMap);
            }
        }
    }
}
