package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Yb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1964Yb0 {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f20292a;

    /* renamed from: b, reason: collision with root package name */
    private final C2636fc0 f20293b;

    public C1964Yb0(C2636fc0 c2636fc0) {
        this.f20293b = c2636fc0;
    }

    public final JSONObject a() {
        return this.f20292a;
    }

    public final void b() {
        this.f20293b.b(new AsyncTaskC2745gc0(this));
    }

    public final void c(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.f20293b.b(new AsyncTaskC2854hc0(this, hashSet, jSONObject, j8));
    }

    public final void d(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.f20293b.b(new AsyncTaskC3070jc0(this, hashSet, jSONObject, j8));
    }

    public final void e(JSONObject jSONObject) {
        this.f20292a = jSONObject;
    }
}
