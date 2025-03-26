package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class L70 implements J70 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16783a;

    public L70(String str) {
        this.f16783a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof L70) {
            return this.f16783a.equals(((L70) obj).f16783a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16783a.hashCode();
    }

    public final String toString() {
        return this.f16783a;
    }
}
