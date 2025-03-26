package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class O60 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f17839a;

    public O60(JSONObject jSONObject) {
        this.f17839a = jSONObject;
    }

    public final String a() {
        if (c() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean b() {
        return this.f17839a.optBoolean((String) D2.A.c().a(AbstractC3184kf.f23907h5), true);
    }

    public final int c() {
        int optInt = this.f17839a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
