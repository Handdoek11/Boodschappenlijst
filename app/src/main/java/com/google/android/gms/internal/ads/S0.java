package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: c, reason: collision with root package name */
    public static final S0 f18728c = new S0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f18729a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18730b;

    public S0(long j8, long j9) {
        this.f18729a = j8;
        this.f18730b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S0.class == obj.getClass()) {
            S0 s02 = (S0) obj;
            if (this.f18729a == s02.f18729a && this.f18730b == s02.f18730b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f18729a) * 31) + ((int) this.f18730b);
    }

    public final String toString() {
        return "[timeUs=" + this.f18729a + ", position=" + this.f18730b + "]";
    }
}
