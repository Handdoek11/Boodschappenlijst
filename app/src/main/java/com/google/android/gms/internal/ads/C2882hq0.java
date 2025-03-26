package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.hq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2882hq0 extends Bq0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f22627a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22628b;

    /* renamed from: c, reason: collision with root package name */
    private final C2664fq0 f22629c;

    /* synthetic */ C2882hq0(int i8, int i9, C2664fq0 c2664fq0, AbstractC2773gq0 abstractC2773gq0) {
        this.f22627a = i8;
        this.f22628b = i9;
        this.f22629c = c2664fq0;
    }

    public static C2555eq0 e() {
        return new C2555eq0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2763gl0
    public final boolean a() {
        return this.f22629c != C2664fq0.f22119e;
    }

    public final int b() {
        return this.f22628b;
    }

    public final int c() {
        return this.f22627a;
    }

    public final int d() {
        C2664fq0 c2664fq0 = this.f22629c;
        if (c2664fq0 == C2664fq0.f22119e) {
            return this.f22628b;
        }
        if (c2664fq0 == C2664fq0.f22116b || c2664fq0 == C2664fq0.f22117c || c2664fq0 == C2664fq0.f22118d) {
            return this.f22628b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2882hq0)) {
            return false;
        }
        C2882hq0 c2882hq0 = (C2882hq0) obj;
        return c2882hq0.f22627a == this.f22627a && c2882hq0.d() == d() && c2882hq0.f22629c == this.f22629c;
    }

    public final C2664fq0 f() {
        return this.f22629c;
    }

    public final int hashCode() {
        return Objects.hash(C2882hq0.class, Integer.valueOf(this.f22627a), Integer.valueOf(this.f22628b), this.f22629c);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.f22629c) + ", " + this.f22628b + "-byte tags, and " + this.f22627a + "-byte key)";
    }
}
