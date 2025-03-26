package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    final String f30282a;

    /* renamed from: b, reason: collision with root package name */
    final String f30283b;

    /* renamed from: c, reason: collision with root package name */
    final String f30284c;

    /* renamed from: d, reason: collision with root package name */
    final long f30285d;

    /* renamed from: e, reason: collision with root package name */
    final long f30286e;

    /* renamed from: f, reason: collision with root package name */
    final D f30287f;

    B(S2 s22, String str, String str2, String str3, long j8, long j9, Bundle bundle) {
        D d8;
        Z2.r.f(str2);
        Z2.r.f(str3);
        this.f30282a = str2;
        this.f30283b = str3;
        this.f30284c = TextUtils.isEmpty(str) ? null : str;
        this.f30285d = j8;
        this.f30286e = j9;
        if (j9 != 0 && j9 > j8) {
            s22.h().J().b("Event created with reverse previous/current timestamps. appId", C5378n2.t(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            d8 = new D(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    s22.h().E().a("Param name can't be null");
                    it.remove();
                } else {
                    Object q02 = s22.J().q0(next, bundle2.get(next));
                    if (q02 == null) {
                        s22.h().J().b("Param value can't be null", s22.B().f(next));
                        it.remove();
                    } else {
                        s22.J().M(bundle2, next, q02);
                    }
                }
            }
            d8 = new D(bundle2);
        }
        this.f30287f = d8;
    }

    final B a(S2 s22, long j8) {
        return new B(s22, this.f30284c, this.f30282a, this.f30283b, this.f30285d, j8, this.f30287f);
    }

    public final String toString() {
        return "Event{appId='" + this.f30282a + "', name='" + this.f30283b + "', params=" + String.valueOf(this.f30287f) + "}";
    }

    private B(S2 s22, String str, String str2, String str3, long j8, long j9, D d8) {
        Z2.r.f(str2);
        Z2.r.f(str3);
        Z2.r.l(d8);
        this.f30282a = str2;
        this.f30283b = str3;
        this.f30284c = TextUtils.isEmpty(str) ? null : str;
        this.f30285d = j8;
        this.f30286e = j9;
        if (j9 != 0 && j9 > j8) {
            s22.h().J().c("Event created with reverse previous/current timestamps. appId, name", C5378n2.t(str2), C5378n2.t(str3));
        }
        this.f30287f = d8;
    }
}
