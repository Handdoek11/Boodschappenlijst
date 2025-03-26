package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2937iH0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f22939a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22940b;

    public C2937iH0(int i8, boolean z7) {
        this.f22939a = i8;
        this.f22940b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2937iH0.class == obj.getClass()) {
            C2937iH0 c2937iH0 = (C2937iH0) obj;
            if (this.f22939a == c2937iH0.f22939a && this.f22940b == c2937iH0.f22940b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f22939a * 31) + (this.f22940b ? 1 : 0);
    }
}
