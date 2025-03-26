package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public final S0 f18099a;

    /* renamed from: b, reason: collision with root package name */
    public final S0 f18100b;

    public P0(S0 s02, S0 s03) {
        this.f18099a = s02;
        this.f18100b = s03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P0.class == obj.getClass()) {
            P0 p02 = (P0) obj;
            if (this.f18099a.equals(p02.f18099a) && this.f18100b.equals(p02.f18100b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18099a.hashCode() * 31) + this.f18100b.hashCode();
    }

    public final String toString() {
        S0 s02 = this.f18099a;
        S0 s03 = this.f18100b;
        return "[" + s02.toString() + (s02.equals(s03) ? "" : ", ".concat(this.f18100b.toString())) + "]";
    }
}
