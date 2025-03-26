package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Cm0 extends AbstractC3742pl0 {

    /* renamed from: a, reason: collision with root package name */
    private final Em0 f14226a;

    /* renamed from: b, reason: collision with root package name */
    private final Tt0 f14227b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f14228c;

    private Cm0(Em0 em0, Tt0 tt0, Integer num) {
        this.f14226a = em0;
        this.f14227b = tt0;
        this.f14228c = num;
    }

    public static Cm0 a(Em0 em0, Integer num) {
        Tt0 b8;
        if (em0.b() == Dm0.f14550b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b8 = Tt0.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (em0.b() != Dm0.f14551c) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(em0.b().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b8 = Tt0.b(new byte[0]);
        }
        return new Cm0(em0, b8, num);
    }

    public final Em0 b() {
        return this.f14226a;
    }

    public final Integer c() {
        return this.f14228c;
    }
}
