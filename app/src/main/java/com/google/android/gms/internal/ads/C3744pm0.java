package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.pm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3744pm0 extends AbstractC3742pl0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4288um0 f25505a;

    /* renamed from: b, reason: collision with root package name */
    private final Ut0 f25506b;

    /* renamed from: c, reason: collision with root package name */
    private final Tt0 f25507c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f25508d;

    private C3744pm0(C4288um0 c4288um0, Ut0 ut0, Tt0 tt0, Integer num) {
        this.f25505a = c4288um0;
        this.f25506b = ut0;
        this.f25507c = tt0;
        this.f25508d = num;
    }

    public static C3744pm0 a(C4179tm0 c4179tm0, Ut0 ut0, Integer num) {
        Tt0 b8;
        C4179tm0 c4179tm02 = C4179tm0.f26924d;
        if (c4179tm0 != c4179tm02 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c4179tm0.toString() + " the value of idRequirement must be non-null");
        }
        if (c4179tm0 == c4179tm02 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ut0.a() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + ut0.a());
        }
        C4288um0 c8 = C4288um0.c(c4179tm0);
        if (c8.b() == c4179tm02) {
            b8 = AbstractC3532np0.f25038a;
        } else if (c8.b() == C4179tm0.f26923c) {
            b8 = AbstractC3532np0.a(num.intValue());
        } else {
            if (c8.b() != C4179tm0.f26922b) {
                throw new IllegalStateException("Unknown Variant: ".concat(c8.b().toString()));
            }
            b8 = AbstractC3532np0.b(num.intValue());
        }
        return new C3744pm0(c8, ut0, b8, num);
    }

    public final C4288um0 b() {
        return this.f25505a;
    }

    public final Tt0 c() {
        return this.f25507c;
    }

    public final Ut0 d() {
        return this.f25506b;
    }

    public final Integer e() {
        return this.f25508d;
    }
}
