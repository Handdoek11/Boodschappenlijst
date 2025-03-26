package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Bu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1179Bu {

    /* renamed from: a, reason: collision with root package name */
    private final H2.a f13915a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13916b;

    /* renamed from: c, reason: collision with root package name */
    private final long f13917c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference f13918d;

    /* synthetic */ C1179Bu(C4739yu c4739yu, AbstractC4848zu abstractC4848zu) {
        this.f13915a = c4739yu.f28222a;
        this.f13916b = c4739yu.f28223b;
        this.f13918d = c4739yu.f28225d;
        this.f13917c = c4739yu.f28224c;
    }

    final long a() {
        return this.f13917c;
    }

    final Context b() {
        return this.f13916b;
    }

    public final C2.k c() {
        return new C2.k(this.f13916b, this.f13915a);
    }

    final C1305Fg d() {
        return new C1305Fg(this.f13916b);
    }

    final H2.a e() {
        return this.f13915a;
    }

    final String f() {
        return C2.v.t().H(this.f13916b, this.f13915a.f2914o);
    }

    final WeakReference g() {
        return this.f13918d;
    }
}
