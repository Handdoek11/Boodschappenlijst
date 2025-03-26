package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Sl0 {

    /* renamed from: a, reason: collision with root package name */
    private C2439dm0 f18950a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ut0 f18951b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f18952c = null;

    /* synthetic */ Sl0(Tl0 tl0) {
    }

    public final Sl0 a(Integer num) {
        this.f18952c = num;
        return this;
    }

    public final Sl0 b(Ut0 ut0) {
        this.f18951b = ut0;
        return this;
    }

    public final Sl0 c(C2439dm0 c2439dm0) {
        this.f18950a = c2439dm0;
        return this;
    }

    public final Ul0 d() {
        Ut0 ut0;
        Tt0 b8;
        C2439dm0 c2439dm0 = this.f18950a;
        if (c2439dm0 == null || (ut0 = this.f18951b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c2439dm0.b() != ut0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c2439dm0.a() && this.f18952c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f18950a.a() && this.f18952c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f18950a.d() == C2222bm0.f20931d) {
            b8 = AbstractC3532np0.f25038a;
        } else if (this.f18950a.d() == C2222bm0.f20930c) {
            b8 = AbstractC3532np0.a(this.f18952c.intValue());
        } else {
            if (this.f18950a.d() != C2222bm0.f20929b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f18950a.d())));
            }
            b8 = AbstractC3532np0.b(this.f18952c.intValue());
        }
        return new Ul0(this.f18950a, this.f18951b, b8, this.f18952c, null);
    }
}
