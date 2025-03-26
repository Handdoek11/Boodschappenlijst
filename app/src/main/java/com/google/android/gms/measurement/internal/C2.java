package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class C2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f30303a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30304b;

    /* renamed from: c, reason: collision with root package name */
    private String f30305c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C5461z2 f30306d;

    public C2(C5461z2 c5461z2, String str, String str2) {
        this.f30306d = c5461z2;
        Z2.r.f(str);
        this.f30303a = str;
    }

    public final String a() {
        if (!this.f30304b) {
            this.f30304b = true;
            this.f30305c = this.f30306d.H().getString(this.f30303a, null);
        }
        return this.f30305c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f30306d.H().edit();
        edit.putString(this.f30303a, str);
        edit.apply();
        this.f30305c = str;
    }
}
