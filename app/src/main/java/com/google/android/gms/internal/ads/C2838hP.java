package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2838hP {

    /* renamed from: a, reason: collision with root package name */
    private final String f22543a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22544b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22545c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22546d;

    /* renamed from: e, reason: collision with root package name */
    private final String f22547e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22548f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f22549g;

    public C2838hP(String str, String str2, String str3, int i8, String str4, int i9, boolean z7) {
        this.f22543a = str;
        this.f22544b = str2;
        this.f22545c = str3;
        this.f22546d = i8;
        this.f22547e = str4;
        this.f22548f = i9;
        this.f22549g = z7;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f22543a);
        jSONObject.put("version", this.f22545c);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.k9)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f22544b);
        }
        jSONObject.put("status", this.f22546d);
        jSONObject.put("description", this.f22547e);
        jSONObject.put("initializationLatencyMillis", this.f22548f);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.l9)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f22549g);
        }
        return jSONObject;
    }
}
