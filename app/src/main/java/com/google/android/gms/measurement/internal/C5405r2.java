package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5405r2 {

    /* renamed from: a, reason: collision with root package name */
    public String f31167a;

    /* renamed from: b, reason: collision with root package name */
    public String f31168b;

    /* renamed from: c, reason: collision with root package name */
    private long f31169c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f31170d;

    public C5405r2(String str, String str2, Bundle bundle, long j8) {
        this.f31167a = str;
        this.f31168b = str2;
        this.f31170d = bundle == null ? new Bundle() : bundle;
        this.f31169c = j8;
    }

    public static C5405r2 b(E e8) {
        return new C5405r2(e8.f30332o, e8.f30334t, e8.f30333s.D0(), e8.f30335u);
    }

    public final E a() {
        return new E(this.f31167a, new D(new Bundle(this.f31170d)), this.f31168b, this.f31169c);
    }

    public final String toString() {
        return "origin=" + this.f31168b + ",name=" + this.f31167a + ",params=" + String.valueOf(this.f31170d);
    }
}
