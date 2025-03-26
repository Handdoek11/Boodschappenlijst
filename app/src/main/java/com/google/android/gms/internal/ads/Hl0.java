package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class Hl0 extends AbstractC3851ql0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15782a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15783b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15784c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15785d;

    /* renamed from: e, reason: collision with root package name */
    private final Fl0 f15786e;

    /* renamed from: f, reason: collision with root package name */
    private final El0 f15787f;

    /* synthetic */ Hl0(int i8, int i9, int i10, int i11, Fl0 fl0, El0 el0, Gl0 gl0) {
        this.f15782a = i8;
        this.f15783b = i9;
        this.f15784c = i10;
        this.f15785d = i11;
        this.f15786e = fl0;
        this.f15787f = el0;
    }

    public static Dl0 f() {
        return new Dl0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2763gl0
    public final boolean a() {
        return this.f15786e != Fl0.f15196d;
    }

    public final int b() {
        return this.f15782a;
    }

    public final int c() {
        return this.f15783b;
    }

    public final int d() {
        return this.f15784c;
    }

    public final int e() {
        return this.f15785d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Hl0)) {
            return false;
        }
        Hl0 hl0 = (Hl0) obj;
        return hl0.f15782a == this.f15782a && hl0.f15783b == this.f15783b && hl0.f15784c == this.f15784c && hl0.f15785d == this.f15785d && hl0.f15786e == this.f15786e && hl0.f15787f == this.f15787f;
    }

    public final El0 g() {
        return this.f15787f;
    }

    public final Fl0 h() {
        return this.f15786e;
    }

    public final int hashCode() {
        return Objects.hash(Hl0.class, Integer.valueOf(this.f15782a), Integer.valueOf(this.f15783b), Integer.valueOf(this.f15784c), Integer.valueOf(this.f15785d), this.f15786e, this.f15787f);
    }

    public final String toString() {
        El0 el0 = this.f15787f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.f15786e) + ", hashType: " + String.valueOf(el0) + ", " + this.f15784c + "-byte IV, and " + this.f15785d + "-byte tags, and " + this.f15782a + "-byte AES key, and " + this.f15783b + "-byte HMAC key)";
    }
}
