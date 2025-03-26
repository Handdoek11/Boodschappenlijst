package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.eq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2555eq0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f21897a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f21898b = null;

    /* renamed from: c, reason: collision with root package name */
    private C2664fq0 f21899c = C2664fq0.f22119e;

    /* synthetic */ C2555eq0(AbstractC2773gq0 abstractC2773gq0) {
    }

    public final C2555eq0 a(int i8) {
        if (i8 != 16 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i8 * 8)));
        }
        this.f21897a = Integer.valueOf(i8);
        return this;
    }

    public final C2555eq0 b(int i8) {
        if (i8 >= 10 && i8 <= 16) {
            this.f21898b = Integer.valueOf(i8);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i8);
    }

    public final C2555eq0 c(C2664fq0 c2664fq0) {
        this.f21899c = c2664fq0;
        return this;
    }

    public final C2882hq0 d() {
        Integer num = this.f21897a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.f21898b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.f21899c != null) {
            return new C2882hq0(num.intValue(), this.f21898b.intValue(), this.f21899c, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
