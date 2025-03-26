package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class A2 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f29678a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29679b;

    A2(Object obj, int i8) {
        this.f29678a = obj;
        this.f29679b = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A2)) {
            return false;
        }
        A2 a22 = (A2) obj;
        return this.f29678a == a22.f29678a && this.f29679b == a22.f29679b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f29678a) * 65535) + this.f29679b;
    }
}
