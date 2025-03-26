package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.kn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3201kn0 extends AbstractC3742pl0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3855qn0 f24089a;

    /* renamed from: b, reason: collision with root package name */
    private final Ut0 f24090b;

    /* renamed from: c, reason: collision with root package name */
    private final Tt0 f24091c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f24092d;

    private C3201kn0(C3855qn0 c3855qn0, Ut0 ut0, Tt0 tt0, Integer num) {
        this.f24089a = c3855qn0;
        this.f24090b = ut0;
        this.f24091c = tt0;
        this.f24092d = num;
    }

    public static C3201kn0 a(C3746pn0 c3746pn0, Ut0 ut0, Integer num) {
        Tt0 b8;
        C3746pn0 c3746pn02 = C3746pn0.f25511d;
        if (c3746pn0 != c3746pn02 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c3746pn0.toString() + " the value of idRequirement must be non-null");
        }
        if (c3746pn0 == c3746pn02 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ut0.a() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + ut0.a());
        }
        C3855qn0 c8 = C3855qn0.c(c3746pn0);
        if (c8.b() == c3746pn02) {
            b8 = AbstractC3532np0.f25038a;
        } else if (c8.b() == C3746pn0.f25510c) {
            b8 = AbstractC3532np0.a(num.intValue());
        } else {
            if (c8.b() != C3746pn0.f25509b) {
                throw new IllegalStateException("Unknown Variant: ".concat(c8.b().toString()));
            }
            b8 = AbstractC3532np0.b(num.intValue());
        }
        return new C3201kn0(c8, ut0, b8, num);
    }

    public final C3855qn0 b() {
        return this.f24089a;
    }

    public final Tt0 c() {
        return this.f24091c;
    }

    public final Ut0 d() {
        return this.f24090b;
    }

    public final Integer e() {
        return this.f24092d;
    }
}
