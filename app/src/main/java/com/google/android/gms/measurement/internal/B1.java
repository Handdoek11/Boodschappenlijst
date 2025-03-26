package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* loaded from: classes2.dex */
final class B1 {

    /* renamed from: a, reason: collision with root package name */
    private final w3.p f30288a;

    B1(w3.p pVar) {
        this.f30288a = pVar;
    }

    static B1 a(String str) {
        return new B1((TextUtils.isEmpty(str) || str.length() > 1) ? w3.p.UNINITIALIZED : A3.i(str.charAt(0)));
    }

    final w3.p b() {
        return this.f30288a;
    }

    final String c() {
        return String.valueOf(A3.a(this.f30288a));
    }
}
