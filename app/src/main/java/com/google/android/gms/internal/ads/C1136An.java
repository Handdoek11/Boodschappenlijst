package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.An, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1136An {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13624a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13625b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13626c;

    public C1136An(boolean z7, String str, boolean z8) {
        this.f13624a = z7;
        this.f13625b = str;
        this.f13626c = z8;
    }

    public static C1136An a(JSONObject jSONObject) {
        return new C1136An(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
