package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;

/* loaded from: classes2.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f30311a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30312b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30313c;

    /* renamed from: d, reason: collision with root package name */
    private final long f30314d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C5461z2 f30315e;

    private final long c() {
        return this.f30315e.H().getLong(this.f30311a, 0L);
    }

    private final void d() {
        this.f30315e.l();
        long a8 = this.f30315e.zzb().a();
        SharedPreferences.Editor edit = this.f30315e.H().edit();
        edit.remove(this.f30312b);
        edit.remove(this.f30313c);
        edit.putLong(this.f30311a, a8);
        edit.apply();
    }

    public final Pair a() {
        long abs;
        this.f30315e.l();
        this.f30315e.l();
        long c8 = c();
        if (c8 == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c8 - this.f30315e.zzb().a());
        }
        long j8 = this.f30314d;
        if (abs < j8) {
            return null;
        }
        if (abs > (j8 << 1)) {
            d();
            return null;
        }
        String string = this.f30315e.H().getString(this.f30313c, null);
        long j9 = this.f30315e.H().getLong(this.f30312b, 0L);
        d();
        return (string == null || j9 <= 0) ? C5461z2.f31282B : new Pair(string, Long.valueOf(j9));
    }

    public final void b(String str, long j8) {
        this.f30315e.l();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j9 = this.f30315e.H().getLong(this.f30312b, 0L);
        if (j9 <= 0) {
            SharedPreferences.Editor edit = this.f30315e.H().edit();
            edit.putString(this.f30313c, str);
            edit.putLong(this.f30312b, 1L);
            edit.apply();
            return;
        }
        long j10 = j9 + 1;
        boolean z7 = (this.f30315e.g().U0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j10;
        SharedPreferences.Editor edit2 = this.f30315e.H().edit();
        if (z7) {
            edit2.putString(this.f30313c, str);
        }
        edit2.putLong(this.f30312b, j10);
        edit2.apply();
    }

    private D2(C5461z2 c5461z2, String str, long j8) {
        this.f30315e = c5461z2;
        Z2.r.f(str);
        Z2.r.a(j8 > 0);
        this.f30311a = str + ":start";
        this.f30312b = str + ":count";
        this.f30313c = str + ":value";
        this.f30314d = j8;
    }
}
