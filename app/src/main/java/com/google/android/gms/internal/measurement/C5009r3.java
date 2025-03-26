package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5009r3 {

    /* renamed from: a, reason: collision with root package name */
    final String f29529a;

    /* renamed from: b, reason: collision with root package name */
    final Uri f29530b;

    /* renamed from: c, reason: collision with root package name */
    final String f29531c;

    /* renamed from: d, reason: collision with root package name */
    final String f29532d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f29533e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f29534f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f29535g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f29536h;

    /* renamed from: i, reason: collision with root package name */
    final b4.c f29537i;

    public C5009r3(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final AbstractC4945j3 a(String str, double d8) {
        return AbstractC4945j3.c(this, str, Double.valueOf(-3.0d), true);
    }

    public final AbstractC4945j3 b(String str, long j8) {
        return AbstractC4945j3.d(this, str, Long.valueOf(j8), true);
    }

    public final AbstractC4945j3 c(String str, String str2) {
        return AbstractC4945j3.e(this, str, str2, true);
    }

    public final AbstractC4945j3 d(String str, boolean z7) {
        return AbstractC4945j3.b(this, str, Boolean.valueOf(z7), true);
    }

    public final C5009r3 e() {
        return new C5009r3(this.f29529a, this.f29530b, this.f29531c, this.f29532d, this.f29533e, this.f29534f, true, this.f29536h, this.f29537i);
    }

    public final C5009r3 f() {
        if (!this.f29531c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        b4.c cVar = this.f29537i;
        if (cVar == null) {
            return new C5009r3(this.f29529a, this.f29530b, this.f29531c, this.f29532d, true, this.f29534f, this.f29535g, this.f29536h, cVar);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }

    private C5009r3(String str, Uri uri, String str2, String str3, boolean z7, boolean z8, boolean z9, boolean z10, b4.c cVar) {
        this.f29529a = str;
        this.f29530b = uri;
        this.f29531c = str2;
        this.f29532d = str3;
        this.f29533e = z7;
        this.f29534f = z8;
        this.f29535g = z9;
        this.f29536h = z10;
        this.f29537i = cVar;
    }
}
