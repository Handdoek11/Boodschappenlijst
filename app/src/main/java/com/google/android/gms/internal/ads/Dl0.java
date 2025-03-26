package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class Dl0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f14544a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f14545b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f14546c = null;

    /* renamed from: d, reason: collision with root package name */
    private Integer f14547d = null;

    /* renamed from: e, reason: collision with root package name */
    private El0 f14548e = null;

    /* renamed from: f, reason: collision with root package name */
    private Fl0 f14549f = Fl0.f15196d;

    /* synthetic */ Dl0(Gl0 gl0) {
    }

    public final Dl0 a(int i8) {
        if (i8 != 16 && i8 != 24 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i8)));
        }
        this.f14544a = Integer.valueOf(i8);
        return this;
    }

    public final Dl0 b(El0 el0) {
        this.f14548e = el0;
        return this;
    }

    public final Dl0 c(int i8) {
        if (i8 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i8)));
        }
        this.f14545b = Integer.valueOf(i8);
        return this;
    }

    public final Dl0 d(int i8) {
        if (i8 < 12 || i8 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i8)));
        }
        this.f14546c = Integer.valueOf(i8);
        return this;
    }

    public final Dl0 e(int i8) {
        if (i8 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i8)));
        }
        this.f14547d = Integer.valueOf(i8);
        return this;
    }

    public final Dl0 f(Fl0 fl0) {
        this.f14549f = fl0;
        return this;
    }

    public final Hl0 g() {
        if (this.f14544a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.f14545b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f14546c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f14547d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f14548e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f14549f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int intValue = num.intValue();
        El0 el0 = this.f14548e;
        if (el0 == El0.f14770b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (el0 == El0.f14771c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (el0 == El0.f14772d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (el0 == El0.f14773e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (el0 != El0.f14774f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new Hl0(this.f14544a.intValue(), this.f14545b.intValue(), this.f14546c.intValue(), this.f14547d.intValue(), this.f14549f, this.f14548e, null);
    }
}
