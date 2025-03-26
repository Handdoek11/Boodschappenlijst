package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ai, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2104ai {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20742a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20743b;

    /* renamed from: c, reason: collision with root package name */
    public final E7 f20744c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20745d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20746e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20747f;

    /* renamed from: g, reason: collision with root package name */
    public final long f20748g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20749h;

    /* renamed from: i, reason: collision with root package name */
    public final int f20750i;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public C2104ai(Object obj, int i8, E7 e72, Object obj2, int i9, long j8, long j9, int i10, int i11) {
        this.f20742a = obj;
        this.f20743b = i8;
        this.f20744c = e72;
        this.f20745d = obj2;
        this.f20746e = i9;
        this.f20747f = j8;
        this.f20748g = j9;
        this.f20749h = i10;
        this.f20750i = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2104ai.class == obj.getClass()) {
            C2104ai c2104ai = (C2104ai) obj;
            if (this.f20743b == c2104ai.f20743b && this.f20746e == c2104ai.f20746e && this.f20747f == c2104ai.f20747f && this.f20748g == c2104ai.f20748g && this.f20749h == c2104ai.f20749h && this.f20750i == c2104ai.f20750i && AbstractC1657Pf0.a(this.f20744c, c2104ai.f20744c) && AbstractC1657Pf0.a(this.f20742a, c2104ai.f20742a) && AbstractC1657Pf0.a(this.f20745d, c2104ai.f20745d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20742a, Integer.valueOf(this.f20743b), this.f20744c, this.f20745d, Integer.valueOf(this.f20746e), Long.valueOf(this.f20747f), Long.valueOf(this.f20748g), Integer.valueOf(this.f20749h), Integer.valueOf(this.f20750i)});
    }
}
