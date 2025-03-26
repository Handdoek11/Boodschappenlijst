package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.om0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3635om0 extends AbstractC3851ql0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f25267a;

    /* renamed from: b, reason: collision with root package name */
    private final C3417mm0 f25268b;

    /* synthetic */ C3635om0(int i8, C3417mm0 c3417mm0, AbstractC3526nm0 abstractC3526nm0) {
        this.f25267a = i8;
        this.f25268b = c3417mm0;
    }

    public static C3308lm0 c() {
        return new C3308lm0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2763gl0
    public final boolean a() {
        return this.f25268b != C3417mm0.f24565d;
    }

    public final int b() {
        return this.f25267a;
    }

    public final C3417mm0 d() {
        return this.f25268b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3635om0)) {
            return false;
        }
        C3635om0 c3635om0 = (C3635om0) obj;
        return c3635om0.f25267a == this.f25267a && c3635om0.f25268b == this.f25268b;
    }

    public final int hashCode() {
        return Objects.hash(C3635om0.class, Integer.valueOf(this.f25267a), this.f25268b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.f25268b) + ", " + this.f25267a + "-byte key)";
    }
}
