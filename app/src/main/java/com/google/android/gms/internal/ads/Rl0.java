package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class Rl0 extends AbstractC3851ql0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f18692a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18693b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18694c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final Pl0 f18695d;

    /* synthetic */ Rl0(int i8, int i9, int i10, Pl0 pl0, Ql0 ql0) {
        this.f18692a = i8;
        this.f18693b = i9;
        this.f18695d = pl0;
    }

    public static Ol0 d() {
        return new Ol0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2763gl0
    public final boolean a() {
        return this.f18695d != Pl0.f18260d;
    }

    public final int b() {
        return this.f18693b;
    }

    public final int c() {
        return this.f18692a;
    }

    public final Pl0 e() {
        return this.f18695d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Rl0)) {
            return false;
        }
        Rl0 rl0 = (Rl0) obj;
        return rl0.f18692a == this.f18692a && rl0.f18693b == this.f18693b && rl0.f18695d == this.f18695d;
    }

    public final int hashCode() {
        return Objects.hash(Rl0.class, Integer.valueOf(this.f18692a), Integer.valueOf(this.f18693b), 16, this.f18695d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.f18695d) + ", " + this.f18693b + "-byte IV, 16-byte tag, and " + this.f18692a + "-byte key)";
    }
}
