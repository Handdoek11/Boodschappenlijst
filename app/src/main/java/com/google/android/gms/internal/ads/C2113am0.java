package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.am0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2113am0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f20757a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f20758b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f20759c = null;

    /* renamed from: d, reason: collision with root package name */
    private C2222bm0 f20760d = C2222bm0.f20931d;

    /* synthetic */ C2113am0(AbstractC2330cm0 abstractC2330cm0) {
    }

    public final C2113am0 a(int i8) {
        this.f20758b = 12;
        return this;
    }

    public final C2113am0 b(int i8) {
        if (i8 != 16 && i8 != 24 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i8)));
        }
        this.f20757a = Integer.valueOf(i8);
        return this;
    }

    public final C2113am0 c(int i8) {
        this.f20759c = 16;
        return this;
    }

    public final C2113am0 d(C2222bm0 c2222bm0) {
        this.f20760d = c2222bm0;
        return this;
    }

    public final C2439dm0 e() {
        Integer num = this.f20757a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f20760d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f20758b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f20759c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        this.f20758b.intValue();
        this.f20759c.intValue();
        return new C2439dm0(intValue, 12, 16, this.f20760d, null);
    }
}
