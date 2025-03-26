package com.google.firebase;

import Z2.AbstractC0777p;
import Z2.C0781u;
import Z2.r;
import android.content.Context;
import android.text.TextUtils;
import f3.q;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final String f33030a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33031b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33032c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33033d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33034e;

    /* renamed from: f, reason: collision with root package name */
    private final String f33035f;

    /* renamed from: g, reason: collision with root package name */
    private final String f33036g;

    private n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        r.q(!q.a(str), "ApplicationId must be set.");
        this.f33031b = str;
        this.f33030a = str2;
        this.f33032c = str3;
        this.f33033d = str4;
        this.f33034e = str5;
        this.f33035f = str6;
        this.f33036g = str7;
    }

    public static n a(Context context) {
        C0781u c0781u = new C0781u(context);
        String a8 = c0781u.a("google_app_id");
        if (TextUtils.isEmpty(a8)) {
            return null;
        }
        return new n(a8, c0781u.a("google_api_key"), c0781u.a("firebase_database_url"), c0781u.a("ga_trackingId"), c0781u.a("gcm_defaultSenderId"), c0781u.a("google_storage_bucket"), c0781u.a("project_id"));
    }

    public String b() {
        return this.f33030a;
    }

    public String c() {
        return this.f33031b;
    }

    public String d() {
        return this.f33034e;
    }

    public String e() {
        return this.f33036g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC0777p.a(this.f33031b, nVar.f33031b) && AbstractC0777p.a(this.f33030a, nVar.f33030a) && AbstractC0777p.a(this.f33032c, nVar.f33032c) && AbstractC0777p.a(this.f33033d, nVar.f33033d) && AbstractC0777p.a(this.f33034e, nVar.f33034e) && AbstractC0777p.a(this.f33035f, nVar.f33035f) && AbstractC0777p.a(this.f33036g, nVar.f33036g);
    }

    public int hashCode() {
        return AbstractC0777p.b(this.f33031b, this.f33030a, this.f33032c, this.f33033d, this.f33034e, this.f33035f, this.f33036g);
    }

    public String toString() {
        return AbstractC0777p.c(this).a("applicationId", this.f33031b).a("apiKey", this.f33030a).a("databaseUrl", this.f33032c).a("gcmSenderId", this.f33034e).a("storageBucket", this.f33035f).a("projectId", this.f33036g).toString();
    }
}
