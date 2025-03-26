package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.lm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3308lm0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f24384a = null;

    /* renamed from: b, reason: collision with root package name */
    private C3417mm0 f24385b = C3417mm0.f24565d;

    /* synthetic */ C3308lm0(AbstractC3526nm0 abstractC3526nm0) {
    }

    public final C3308lm0 a(int i8) {
        if (i8 != 16 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i8)));
        }
        this.f24384a = Integer.valueOf(i8);
        return this;
    }

    public final C3308lm0 b(C3417mm0 c3417mm0) {
        this.f24385b = c3417mm0;
        return this;
    }

    public final C3635om0 c() {
        Integer num = this.f24384a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f24385b != null) {
            return new C3635om0(num.intValue(), this.f24385b, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
