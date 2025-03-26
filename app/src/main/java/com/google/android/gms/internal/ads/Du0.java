package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class Du0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14580a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14581b;

    Du0(Object obj, int i8) {
        this.f14580a = obj;
        this.f14581b = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Du0)) {
            return false;
        }
        Du0 du0 = (Du0) obj;
        return this.f14580a == du0.f14580a && this.f14581b == du0.f14581b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f14580a) * 65535) + this.f14581b;
    }
}
