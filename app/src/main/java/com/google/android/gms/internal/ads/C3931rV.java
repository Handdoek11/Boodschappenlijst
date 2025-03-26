package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.rV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3931rV {

    /* renamed from: a, reason: collision with root package name */
    final String f26181a;

    /* renamed from: b, reason: collision with root package name */
    final String f26182b;

    /* renamed from: c, reason: collision with root package name */
    int f26183c;

    /* renamed from: d, reason: collision with root package name */
    long f26184d;

    /* renamed from: e, reason: collision with root package name */
    final Integer f26185e;

    C3931rV(String str, String str2, int i8, long j8, Integer num) {
        this.f26181a = str;
        this.f26182b = str2;
        this.f26183c = i8;
        this.f26184d = j8;
        this.f26185e = num;
    }

    public final String toString() {
        String str = this.f26181a + "." + this.f26183c + "." + this.f26184d;
        if (!TextUtils.isEmpty(this.f26182b)) {
            str = str + "." + this.f26182b;
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23712K1)).booleanValue() || this.f26185e == null || TextUtils.isEmpty(this.f26182b)) {
            return str;
        }
        return str + "." + this.f26185e;
    }
}
