package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Km0 extends AbstractC3742pl0 {

    /* renamed from: a, reason: collision with root package name */
    private final Pm0 f16629a;

    /* renamed from: b, reason: collision with root package name */
    private final Tt0 f16630b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f16631c;

    private Km0(Pm0 pm0, Tt0 tt0, Integer num) {
        this.f16629a = pm0;
        this.f16630b = tt0;
        this.f16631c = num;
    }

    public static Km0 a(Pm0 pm0, Integer num) {
        Tt0 b8;
        if (pm0.c() == Nm0.f17592c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b8 = AbstractC3532np0.f25038a;
        } else {
            if (pm0.c() != Nm0.f17591b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(pm0.c())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b8 = AbstractC3532np0.b(num.intValue());
        }
        return new Km0(pm0, b8, num);
    }

    public final Pm0 b() {
        return this.f16629a;
    }

    public final Integer c() {
        return this.f16631c;
    }
}
