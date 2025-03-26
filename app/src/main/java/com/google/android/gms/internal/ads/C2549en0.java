package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.en0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2549en0 extends AbstractC3742pl0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3092jn0 f21889a;

    /* renamed from: b, reason: collision with root package name */
    private final Ut0 f21890b;

    /* renamed from: c, reason: collision with root package name */
    private final Tt0 f21891c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f21892d;

    private C2549en0(C3092jn0 c3092jn0, Ut0 ut0, Tt0 tt0, Integer num) {
        this.f21889a = c3092jn0;
        this.f21890b = ut0;
        this.f21891c = tt0;
        this.f21892d = num;
    }

    public static C2549en0 a(C3092jn0 c3092jn0, Ut0 ut0, Integer num) {
        Tt0 b8;
        C2984in0 c8 = c3092jn0.c();
        C2984in0 c2984in0 = C2984in0.f23066c;
        if (c8 != c2984in0 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c3092jn0.c().toString() + " the value of idRequirement must be non-null");
        }
        if (c3092jn0.c() == c2984in0 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ut0.a() != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + ut0.a());
        }
        if (c3092jn0.c() == c2984in0) {
            b8 = AbstractC3532np0.f25038a;
        } else {
            if (c3092jn0.c() != C2984in0.f23065b) {
                throw new IllegalStateException("Unknown Variant: ".concat(c3092jn0.c().toString()));
            }
            b8 = AbstractC3532np0.b(num.intValue());
        }
        return new C2549en0(c3092jn0, ut0, b8, num);
    }

    public final C3092jn0 b() {
        return this.f21889a;
    }

    public final Tt0 c() {
        return this.f21891c;
    }

    public final Ut0 d() {
        return this.f21890b;
    }

    public final Integer e() {
        return this.f21892d;
    }
}
