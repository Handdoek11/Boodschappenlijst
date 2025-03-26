package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.yq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4732yq0 extends Bq0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f28207a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28208b;

    /* renamed from: c, reason: collision with root package name */
    private final C4514wq0 f28209c;

    /* renamed from: d, reason: collision with root package name */
    private final C4405vq0 f28210d;

    /* synthetic */ C4732yq0(int i8, int i9, C4514wq0 c4514wq0, C4405vq0 c4405vq0, AbstractC4623xq0 abstractC4623xq0) {
        this.f28207a = i8;
        this.f28208b = i9;
        this.f28209c = c4514wq0;
        this.f28210d = c4405vq0;
    }

    public static C4296uq0 e() {
        return new C4296uq0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2763gl0
    public final boolean a() {
        return this.f28209c != C4514wq0.f27561e;
    }

    public final int b() {
        return this.f28208b;
    }

    public final int c() {
        return this.f28207a;
    }

    public final int d() {
        C4514wq0 c4514wq0 = this.f28209c;
        if (c4514wq0 == C4514wq0.f27561e) {
            return this.f28208b;
        }
        if (c4514wq0 == C4514wq0.f27558b || c4514wq0 == C4514wq0.f27559c || c4514wq0 == C4514wq0.f27560d) {
            return this.f28208b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4732yq0)) {
            return false;
        }
        C4732yq0 c4732yq0 = (C4732yq0) obj;
        return c4732yq0.f28207a == this.f28207a && c4732yq0.d() == d() && c4732yq0.f28209c == this.f28209c && c4732yq0.f28210d == this.f28210d;
    }

    public final C4405vq0 f() {
        return this.f28210d;
    }

    public final C4514wq0 g() {
        return this.f28209c;
    }

    public final int hashCode() {
        return Objects.hash(C4732yq0.class, Integer.valueOf(this.f28207a), Integer.valueOf(this.f28208b), this.f28209c, this.f28210d);
    }

    public final String toString() {
        C4405vq0 c4405vq0 = this.f28210d;
        return "HMAC Parameters (variant: " + String.valueOf(this.f28209c) + ", hashType: " + String.valueOf(c4405vq0) + ", " + this.f28208b + "-byte tags, and " + this.f28207a + "-byte key)";
    }
}
