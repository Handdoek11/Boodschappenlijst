package com.google.android.gms.common;

import android.util.Log;

/* loaded from: classes.dex */
class J {

    /* renamed from: e, reason: collision with root package name */
    private static final J f13202e = new J(true, 3, 1, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f13203a;

    /* renamed from: b, reason: collision with root package name */
    final String f13204b;

    /* renamed from: c, reason: collision with root package name */
    final Throwable f13205c;

    /* renamed from: d, reason: collision with root package name */
    final int f13206d;

    private J(boolean z7, int i8, int i9, String str, Throwable th) {
        this.f13203a = z7;
        this.f13206d = i8;
        this.f13204b = str;
        this.f13205c = th;
    }

    static J b() {
        return f13202e;
    }

    static J c(String str) {
        return new J(false, 1, 5, str, null);
    }

    static J d(String str, Throwable th) {
        return new J(false, 1, 5, str, th);
    }

    static J f(int i8) {
        return new J(true, i8, 1, null, null);
    }

    static J g(int i8, int i9, String str, Throwable th) {
        return new J(false, i8, i9, str, th);
    }

    String a() {
        return this.f13204b;
    }

    final void e() {
        if (this.f13203a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f13205c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f13205c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
