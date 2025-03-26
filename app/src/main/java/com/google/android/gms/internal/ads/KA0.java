package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class KA0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f16541a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1981Yl f16542b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16543c;

    /* renamed from: d, reason: collision with root package name */
    public final GG0 f16544d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16545e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1981Yl f16546f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16547g;

    /* renamed from: h, reason: collision with root package name */
    public final GG0 f16548h;

    /* renamed from: i, reason: collision with root package name */
    public final long f16549i;

    /* renamed from: j, reason: collision with root package name */
    public final long f16550j;

    public KA0(long j8, AbstractC1981Yl abstractC1981Yl, int i8, GG0 gg0, long j9, AbstractC1981Yl abstractC1981Yl2, int i9, GG0 gg02, long j10, long j11) {
        this.f16541a = j8;
        this.f16542b = abstractC1981Yl;
        this.f16543c = i8;
        this.f16544d = gg0;
        this.f16545e = j9;
        this.f16546f = abstractC1981Yl2;
        this.f16547g = i9;
        this.f16548h = gg02;
        this.f16549i = j10;
        this.f16550j = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && KA0.class == obj.getClass()) {
            KA0 ka0 = (KA0) obj;
            if (this.f16541a == ka0.f16541a && this.f16543c == ka0.f16543c && this.f16545e == ka0.f16545e && this.f16547g == ka0.f16547g && this.f16549i == ka0.f16549i && this.f16550j == ka0.f16550j && AbstractC1657Pf0.a(this.f16542b, ka0.f16542b) && AbstractC1657Pf0.a(this.f16544d, ka0.f16544d) && AbstractC1657Pf0.a(this.f16546f, ka0.f16546f) && AbstractC1657Pf0.a(this.f16548h, ka0.f16548h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f16541a), this.f16542b, Integer.valueOf(this.f16543c), this.f16544d, Long.valueOf(this.f16545e), this.f16546f, Integer.valueOf(this.f16547g), this.f16548h, Long.valueOf(this.f16549i), Long.valueOf(this.f16550j)});
    }
}
