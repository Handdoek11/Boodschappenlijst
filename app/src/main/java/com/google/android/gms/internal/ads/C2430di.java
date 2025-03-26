package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.di, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2430di implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2538ei f21637a;

    public C2430di(InterfaceC2538ei interfaceC2538ei) {
        this.f21637a = interfaceC2538ei;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        if (this.f21637a == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            H2.p.f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = G2.U.a(new JSONObject((String) map.get("info")));
            } catch (JSONException e8) {
                H2.p.e("Failed to convert ad metadata to JSON.", e8);
            }
        }
        if (bundle == null) {
            H2.p.d("Failed to convert ad metadata to Bundle.");
        } else {
            this.f21637a.E(str, bundle);
        }
    }
}
