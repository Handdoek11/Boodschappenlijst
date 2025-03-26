package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14616a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14617b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public E0(String str, String str2) {
        this.f14616a = AbstractC2301cW.e(str);
        this.f14617b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E0.class == obj.getClass()) {
            E0 e02 = (E0) obj;
            if (Objects.equals(this.f14616a, e02.f14616a) && Objects.equals(this.f14617b, e02.f14617b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f14617b.hashCode() * 31;
        String str = this.f14616a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
