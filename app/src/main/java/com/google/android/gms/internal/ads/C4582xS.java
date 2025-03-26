package com.google.android.gms.internal.ads;

import android.app.Activity;

/* renamed from: com.google.android.gms.internal.ads.xS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4582xS extends VS {

    /* renamed from: a, reason: collision with root package name */
    private Activity f27858a;

    /* renamed from: b, reason: collision with root package name */
    private F2.x f27859b;

    /* renamed from: c, reason: collision with root package name */
    private String f27860c;

    /* renamed from: d, reason: collision with root package name */
    private String f27861d;

    C4582xS() {
    }

    @Override // com.google.android.gms.internal.ads.VS
    public final VS a(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.f27858a = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.VS
    public final VS b(F2.x xVar) {
        this.f27859b = xVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.VS
    public final VS c(String str) {
        this.f27860c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.VS
    public final VS d(String str) {
        this.f27861d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.VS
    public final WS e() {
        Activity activity = this.f27858a;
        if (activity != null) {
            return new AS(activity, this.f27859b, this.f27860c, this.f27861d, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
