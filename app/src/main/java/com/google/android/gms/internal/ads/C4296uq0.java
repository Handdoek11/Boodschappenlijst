package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.uq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4296uq0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f27117a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f27118b = null;

    /* renamed from: c, reason: collision with root package name */
    private C4405vq0 f27119c = null;

    /* renamed from: d, reason: collision with root package name */
    private C4514wq0 f27120d = C4514wq0.f27561e;

    /* synthetic */ C4296uq0(AbstractC4623xq0 abstractC4623xq0) {
    }

    public final C4296uq0 a(C4405vq0 c4405vq0) {
        this.f27119c = c4405vq0;
        return this;
    }

    public final C4296uq0 b(int i8) {
        this.f27117a = Integer.valueOf(i8);
        return this;
    }

    public final C4296uq0 c(int i8) {
        this.f27118b = Integer.valueOf(i8);
        return this;
    }

    public final C4296uq0 d(C4514wq0 c4514wq0) {
        this.f27120d = c4514wq0;
        return this;
    }

    public final C4732yq0 e() {
        Integer num = this.f27117a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f27118b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f27119c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f27120d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f27117a));
        }
        Integer num2 = this.f27118b;
        int intValue = num2.intValue();
        C4405vq0 c4405vq0 = this.f27119c;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (c4405vq0 == C4405vq0.f27369b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (c4405vq0 == C4405vq0.f27370c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (c4405vq0 == C4405vq0.f27371d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (c4405vq0 == C4405vq0.f27372e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (c4405vq0 != C4405vq0.f27373f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new C4732yq0(this.f27117a.intValue(), this.f27118b.intValue(), this.f27120d, this.f27119c, null);
    }
}
