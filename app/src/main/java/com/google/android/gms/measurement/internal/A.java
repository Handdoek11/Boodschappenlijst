package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class A {

    /* renamed from: a, reason: collision with root package name */
    final String f30249a;

    /* renamed from: b, reason: collision with root package name */
    final String f30250b;

    /* renamed from: c, reason: collision with root package name */
    final long f30251c;

    /* renamed from: d, reason: collision with root package name */
    final long f30252d;

    /* renamed from: e, reason: collision with root package name */
    final long f30253e;

    /* renamed from: f, reason: collision with root package name */
    final long f30254f;

    /* renamed from: g, reason: collision with root package name */
    final long f30255g;

    /* renamed from: h, reason: collision with root package name */
    final Long f30256h;

    /* renamed from: i, reason: collision with root package name */
    final Long f30257i;

    /* renamed from: j, reason: collision with root package name */
    final Long f30258j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f30259k;

    A(String str, String str2, long j8, long j9, long j10, long j11, Long l8, Long l9, Long l10, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j10, 0L, null, null, null, null);
    }

    final A a(long j8) {
        return new A(this.f30249a, this.f30250b, this.f30251c, this.f30252d, this.f30253e, j8, this.f30255g, this.f30256h, this.f30257i, this.f30258j, this.f30259k);
    }

    final A b(long j8, long j9) {
        return new A(this.f30249a, this.f30250b, this.f30251c, this.f30252d, this.f30253e, this.f30254f, j8, Long.valueOf(j9), this.f30257i, this.f30258j, this.f30259k);
    }

    final A c(Long l8, Long l9, Boolean bool) {
        return new A(this.f30249a, this.f30250b, this.f30251c, this.f30252d, this.f30253e, this.f30254f, this.f30255g, this.f30256h, l8, l9, (bool == null || bool.booleanValue()) ? bool : null);
    }

    A(String str, String str2, long j8, long j9, long j10, long j11, long j12, Long l8, Long l9, Long l10, Boolean bool) {
        Z2.r.f(str);
        Z2.r.f(str2);
        Z2.r.a(j8 >= 0);
        Z2.r.a(j9 >= 0);
        Z2.r.a(j10 >= 0);
        Z2.r.a(j12 >= 0);
        this.f30249a = str;
        this.f30250b = str2;
        this.f30251c = j8;
        this.f30252d = j9;
        this.f30253e = j10;
        this.f30254f = j11;
        this.f30255g = j12;
        this.f30256h = l8;
        this.f30257i = l9;
        this.f30258j = l10;
        this.f30259k = bool;
    }
}
