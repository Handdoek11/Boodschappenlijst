package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Xp0 {

    /* renamed from: a, reason: collision with root package name */
    private C2882hq0 f20149a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ut0 f20150b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f20151c = null;

    /* synthetic */ Xp0(Yp0 yp0) {
    }

    public final Xp0 a(Ut0 ut0) {
        this.f20150b = ut0;
        return this;
    }

    public final Xp0 b(Integer num) {
        this.f20151c = num;
        return this;
    }

    public final Xp0 c(C2882hq0 c2882hq0) {
        this.f20149a = c2882hq0;
        return this;
    }

    public final Zp0 d() {
        Ut0 ut0;
        Tt0 a8;
        C2882hq0 c2882hq0 = this.f20149a;
        if (c2882hq0 == null || (ut0 = this.f20150b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c2882hq0.c() != ut0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c2882hq0.a() && this.f20151c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f20149a.a() && this.f20151c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f20149a.f() == C2664fq0.f22119e) {
            a8 = AbstractC3532np0.f25038a;
        } else if (this.f20149a.f() == C2664fq0.f22118d || this.f20149a.f() == C2664fq0.f22117c) {
            a8 = AbstractC3532np0.a(this.f20151c.intValue());
        } else {
            if (this.f20149a.f() != C2664fq0.f22116b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f20149a.f())));
            }
            a8 = AbstractC3532np0.b(this.f20151c.intValue());
        }
        return new Zp0(this.f20149a, this.f20150b, a8, this.f20151c, null);
    }
}
