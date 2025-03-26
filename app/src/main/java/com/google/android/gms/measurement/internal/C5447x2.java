package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.measurement.internal.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5447x2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f31253a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31254b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31255c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31256d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C5461z2 f31257e;

    public C5447x2(C5461z2 c5461z2, String str, boolean z7) {
        this.f31257e = c5461z2;
        Z2.r.f(str);
        this.f31253a = str;
        this.f31254b = z7;
    }

    public final void a(boolean z7) {
        SharedPreferences.Editor edit = this.f31257e.H().edit();
        edit.putBoolean(this.f31253a, z7);
        edit.apply();
        this.f31256d = z7;
    }

    public final boolean b() {
        if (!this.f31255c) {
            this.f31255c = true;
            this.f31256d = this.f31257e.H().getBoolean(this.f31253a, this.f31254b);
        }
        return this.f31256d;
    }
}
