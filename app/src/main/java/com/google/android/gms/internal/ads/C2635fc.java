package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2635fc {

    /* renamed from: a, reason: collision with root package name */
    final long f22072a;

    /* renamed from: b, reason: collision with root package name */
    final String f22073b;

    /* renamed from: c, reason: collision with root package name */
    final int f22074c;

    C2635fc(long j8, String str, int i8) {
        this.f22072a = j8;
        this.f22073b = str;
        this.f22074c = i8;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2635fc)) {
            C2635fc c2635fc = (C2635fc) obj;
            if (c2635fc.f22072a == this.f22072a && c2635fc.f22074c == this.f22074c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f22072a;
    }
}
