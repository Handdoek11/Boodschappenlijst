package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class Em0 extends AbstractC3851ql0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14776a;

    /* renamed from: b, reason: collision with root package name */
    private final Dm0 f14777b;

    private Em0(String str, Dm0 dm0) {
        this.f14776a = str;
        this.f14777b = dm0;
    }

    public static Em0 c(String str, Dm0 dm0) {
        return new Em0(str, dm0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2763gl0
    public final boolean a() {
        return this.f14777b != Dm0.f14551c;
    }

    public final Dm0 b() {
        return this.f14777b;
    }

    public final String d() {
        return this.f14776a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Em0)) {
            return false;
        }
        Em0 em0 = (Em0) obj;
        return em0.f14776a.equals(this.f14776a) && em0.f14777b.equals(this.f14777b);
    }

    public final int hashCode() {
        return Objects.hash(Em0.class, this.f14776a, this.f14777b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f14776a + ", variant: " + this.f14777b.toString() + ")";
    }
}
