package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Iy0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16076a;

    /* renamed from: b, reason: collision with root package name */
    public final D f16077b;

    /* renamed from: c, reason: collision with root package name */
    public final D f16078c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16079d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16080e;

    public Iy0(String str, D d8, D d9, int i8, int i9) {
        boolean z7 = true;
        if (i8 != 0) {
            if (i9 == 0) {
                i9 = 0;
            } else {
                z7 = false;
            }
        }
        AbstractC3796qC.d(z7);
        AbstractC3796qC.c(str);
        this.f16076a = str;
        this.f16077b = d8;
        d9.getClass();
        this.f16078c = d9;
        this.f16079d = i8;
        this.f16080e = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Iy0.class == obj.getClass()) {
            Iy0 iy0 = (Iy0) obj;
            if (this.f16079d == iy0.f16079d && this.f16080e == iy0.f16080e && this.f16076a.equals(iy0.f16076a) && this.f16077b.equals(iy0.f16077b) && this.f16078c.equals(iy0.f16078c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f16079d + 527) * 31) + this.f16080e) * 31) + this.f16076a.hashCode()) * 31) + this.f16077b.hashCode()) * 31) + this.f16078c.hashCode();
    }
}
