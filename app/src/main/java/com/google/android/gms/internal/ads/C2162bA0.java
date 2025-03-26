package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.bA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2162bA0 {

    /* renamed from: a, reason: collision with root package name */
    public final GG0 f20826a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20827b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20828c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20829d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20830e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20831f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20832g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20833h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20834i;

    C2162bA0(GG0 gg0, long j8, long j9, long j10, long j11, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11 = true;
        AbstractC3796qC.d(!z10 || z8);
        if (z9 && !z8) {
            z11 = false;
        }
        AbstractC3796qC.d(z11);
        this.f20826a = gg0;
        this.f20827b = j8;
        this.f20828c = j9;
        this.f20829d = j10;
        this.f20830e = j11;
        this.f20831f = false;
        this.f20832g = z8;
        this.f20833h = z9;
        this.f20834i = z10;
    }

    public final C2162bA0 a(long j8) {
        return j8 == this.f20828c ? this : new C2162bA0(this.f20826a, this.f20827b, j8, this.f20829d, this.f20830e, false, this.f20832g, this.f20833h, this.f20834i);
    }

    public final C2162bA0 b(long j8) {
        return j8 == this.f20827b ? this : new C2162bA0(this.f20826a, j8, this.f20828c, this.f20829d, this.f20830e, false, this.f20832g, this.f20833h, this.f20834i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2162bA0.class == obj.getClass()) {
            C2162bA0 c2162bA0 = (C2162bA0) obj;
            if (this.f20827b == c2162bA0.f20827b && this.f20828c == c2162bA0.f20828c && this.f20829d == c2162bA0.f20829d && this.f20830e == c2162bA0.f20830e && this.f20832g == c2162bA0.f20832g && this.f20833h == c2162bA0.f20833h && this.f20834i == c2162bA0.f20834i && Objects.equals(this.f20826a, c2162bA0.f20826a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f20826a.hashCode() + 527;
        long j8 = this.f20830e;
        long j9 = this.f20829d;
        return (((((((((((((hashCode * 31) + ((int) this.f20827b)) * 31) + ((int) this.f20828c)) * 31) + ((int) j9)) * 31) + ((int) j8)) * 961) + (this.f20832g ? 1 : 0)) * 31) + (this.f20833h ? 1 : 0)) * 31) + (this.f20834i ? 1 : 0);
    }
}
