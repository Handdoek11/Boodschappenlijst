package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5235c0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f30118a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30119b;

    C5235c0(Object obj, int i8) {
        this.f30118a = obj;
        this.f30119b = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5235c0)) {
            return false;
        }
        C5235c0 c5235c0 = (C5235c0) obj;
        return this.f30118a == c5235c0.f30118a && this.f30119b == c5235c0.f30119b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f30118a) * 65535) + this.f30119b;
    }
}
