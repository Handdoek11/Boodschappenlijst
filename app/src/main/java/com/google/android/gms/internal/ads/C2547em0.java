package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.em0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2547em0 {

    /* renamed from: a, reason: collision with root package name */
    private C3635om0 f21884a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ut0 f21885b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f21886c = null;

    /* synthetic */ C2547em0(AbstractC2656fm0 abstractC2656fm0) {
    }

    public final C2547em0 a(Integer num) {
        this.f21886c = num;
        return this;
    }

    public final C2547em0 b(Ut0 ut0) {
        this.f21885b = ut0;
        return this;
    }

    public final C2547em0 c(C3635om0 c3635om0) {
        this.f21884a = c3635om0;
        return this;
    }

    public final C2765gm0 d() {
        Ut0 ut0;
        Tt0 b8;
        C3635om0 c3635om0 = this.f21884a;
        if (c3635om0 == null || (ut0 = this.f21885b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c3635om0.b() != ut0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c3635om0.a() && this.f21886c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f21884a.a() && this.f21886c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f21884a.d() == C3417mm0.f24565d) {
            b8 = AbstractC3532np0.f25038a;
        } else if (this.f21884a.d() == C3417mm0.f24564c) {
            b8 = AbstractC3532np0.a(this.f21886c.intValue());
        } else {
            if (this.f21884a.d() != C3417mm0.f24563b) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f21884a.d())));
            }
            b8 = AbstractC3532np0.b(this.f21886c.intValue());
        }
        return new C2765gm0(this.f21884a, this.f21885b, b8, this.f21886c, null);
    }
}
