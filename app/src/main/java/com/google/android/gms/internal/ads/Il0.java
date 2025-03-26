package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Il0 {

    /* renamed from: a, reason: collision with root package name */
    private Rl0 f15990a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ut0 f15991b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f15992c = null;

    /* synthetic */ Il0(Jl0 jl0) {
    }

    public final Il0 a(Integer num) {
        this.f15992c = num;
        return this;
    }

    public final Il0 b(Ut0 ut0) {
        this.f15991b = ut0;
        return this;
    }

    public final Il0 c(Rl0 rl0) {
        this.f15990a = rl0;
        return this;
    }

    public final Kl0 d() {
        Ut0 ut0;
        Tt0 b8;
        Rl0 rl0 = this.f15990a;
        if (rl0 == null || (ut0 = this.f15991b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (rl0.c() != ut0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (rl0.a() && this.f15992c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f15990a.a() && this.f15992c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f15990a.e() == Pl0.f18260d) {
            b8 = AbstractC3532np0.f25038a;
        } else if (this.f15990a.e() == Pl0.f18259c) {
            b8 = AbstractC3532np0.a(this.f15992c.intValue());
        } else {
            if (this.f15990a.e() != Pl0.f18258b) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f15990a.e())));
            }
            b8 = AbstractC3532np0.b(this.f15992c.intValue());
        }
        return new Kl0(this.f15990a, this.f15991b, b8, this.f15992c, null);
    }
}
