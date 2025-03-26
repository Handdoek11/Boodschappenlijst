package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.mq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3425mq0 {

    /* renamed from: a, reason: collision with root package name */
    private C4732yq0 f24592a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ut0 f24593b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f24594c = null;

    /* synthetic */ C3425mq0(AbstractC3534nq0 abstractC3534nq0) {
    }

    public final C3425mq0 a(Integer num) {
        this.f24594c = num;
        return this;
    }

    public final C3425mq0 b(Ut0 ut0) {
        this.f24593b = ut0;
        return this;
    }

    public final C3425mq0 c(C4732yq0 c4732yq0) {
        this.f24592a = c4732yq0;
        return this;
    }

    public final C3643oq0 d() {
        Ut0 ut0;
        Tt0 a8;
        C4732yq0 c4732yq0 = this.f24592a;
        if (c4732yq0 == null || (ut0 = this.f24593b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c4732yq0.c() != ut0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c4732yq0.a() && this.f24594c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f24592a.a() && this.f24594c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f24592a.g() == C4514wq0.f27561e) {
            a8 = AbstractC3532np0.f25038a;
        } else if (this.f24592a.g() == C4514wq0.f27560d || this.f24592a.g() == C4514wq0.f27559c) {
            a8 = AbstractC3532np0.a(this.f24594c.intValue());
        } else {
            if (this.f24592a.g() != C4514wq0.f27558b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f24592a.g())));
            }
            a8 = AbstractC3532np0.b(this.f24594c.intValue());
        }
        return new C3643oq0(this.f24592a, this.f24593b, a8, this.f24594c, null);
    }
}
