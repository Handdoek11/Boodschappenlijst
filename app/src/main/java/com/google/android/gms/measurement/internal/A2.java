package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class A2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f30260a;

    /* renamed from: b, reason: collision with root package name */
    private final long f30261b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30262c;

    /* renamed from: d, reason: collision with root package name */
    private long f30263d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C5461z2 f30264e;

    public A2(C5461z2 c5461z2, String str, long j8) {
        this.f30264e = c5461z2;
        Z2.r.f(str);
        this.f30260a = str;
        this.f30261b = j8;
    }

    public final long a() {
        if (!this.f30262c) {
            this.f30262c = true;
            this.f30263d = this.f30264e.H().getLong(this.f30260a, this.f30261b);
        }
        return this.f30263d;
    }

    public final void b(long j8) {
        SharedPreferences.Editor edit = this.f30264e.H().edit();
        edit.putLong(this.f30260a, j8);
        edit.apply();
        this.f30263d = j8;
    }
}
