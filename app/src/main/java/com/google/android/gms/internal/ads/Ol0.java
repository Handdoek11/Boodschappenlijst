package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class Ol0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f17943a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f17944b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f17945c = null;

    /* renamed from: d, reason: collision with root package name */
    private Pl0 f17946d = Pl0.f18260d;

    /* synthetic */ Ol0(Ql0 ql0) {
    }

    public final Ol0 a(int i8) {
        if (i8 != 12 && i8 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i8)));
        }
        this.f17944b = Integer.valueOf(i8);
        return this;
    }

    public final Ol0 b(int i8) {
        if (i8 != 16 && i8 != 24 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i8)));
        }
        this.f17943a = Integer.valueOf(i8);
        return this;
    }

    public final Ol0 c(int i8) {
        this.f17945c = 16;
        return this;
    }

    public final Ol0 d(Pl0 pl0) {
        this.f17946d = pl0;
        return this;
    }

    public final Rl0 e() {
        Integer num = this.f17943a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f17944b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f17946d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f17945c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        int intValue2 = this.f17944b.intValue();
        this.f17945c.intValue();
        return new Rl0(intValue, intValue2, 16, this.f17946d, null);
    }
}
