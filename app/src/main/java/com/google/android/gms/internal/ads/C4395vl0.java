package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.vl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4395vl0 {

    /* renamed from: a, reason: collision with root package name */
    private Hl0 f27341a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ut0 f27342b = null;

    /* renamed from: c, reason: collision with root package name */
    private Ut0 f27343c = null;

    /* renamed from: d, reason: collision with root package name */
    private Integer f27344d = null;

    /* synthetic */ C4395vl0(AbstractC4613xl0 abstractC4613xl0) {
    }

    public final C4395vl0 a(Ut0 ut0) {
        this.f27342b = ut0;
        return this;
    }

    public final C4395vl0 b(Ut0 ut0) {
        this.f27343c = ut0;
        return this;
    }

    public final C4395vl0 c(Integer num) {
        this.f27344d = num;
        return this;
    }

    public final C4395vl0 d(Hl0 hl0) {
        this.f27341a = hl0;
        return this;
    }

    public final C4722yl0 e() {
        Tt0 b8;
        Hl0 hl0 = this.f27341a;
        if (hl0 == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        Ut0 ut0 = this.f27342b;
        if (ut0 == null || this.f27343c == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (hl0.b() != ut0.a()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (hl0.c() != this.f27343c.a()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.f27341a.a() && this.f27344d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f27341a.a() && this.f27344d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f27341a.h() == Fl0.f15196d) {
            b8 = AbstractC3532np0.f25038a;
        } else if (this.f27341a.h() == Fl0.f15195c) {
            b8 = AbstractC3532np0.a(this.f27344d.intValue());
        } else {
            if (this.f27341a.h() != Fl0.f15194b) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f27341a.h())));
            }
            b8 = AbstractC3532np0.b(this.f27344d.intValue());
        }
        return new C4722yl0(this.f27341a, this.f27342b, this.f27343c, b8, this.f27344d, null);
    }
}
