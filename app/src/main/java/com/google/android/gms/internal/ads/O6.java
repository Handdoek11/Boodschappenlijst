package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class O6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17837a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17838b;

    public O6(String str, String str2) {
        this.f17837a = str;
        this.f17838b = str2;
    }

    public final String a() {
        return this.f17837a;
    }

    public final String b() {
        return this.f17838b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O6.class == obj.getClass()) {
            O6 o62 = (O6) obj;
            if (TextUtils.equals(this.f17837a, o62.f17837a) && TextUtils.equals(this.f17838b, o62.f17838b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17837a.hashCode() * 31) + this.f17838b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f17837a + ",value=" + this.f17838b + "]";
    }
}
