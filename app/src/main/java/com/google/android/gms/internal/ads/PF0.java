package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class PF0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18158a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18159b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18160c;

    public PF0(String str, boolean z7, boolean z8) {
        this.f18158a = str;
        this.f18159b = z7;
        this.f18160c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == PF0.class) {
            PF0 pf0 = (PF0) obj;
            if (TextUtils.equals(this.f18158a, pf0.f18158a) && this.f18159b == pf0.f18159b && this.f18160c == pf0.f18160c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f18158a.hashCode() + 31) * 31) + (true != this.f18159b ? 1237 : 1231)) * 31) + (true != this.f18160c ? 1237 : 1231);
    }
}
