package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Kp0 implements Pp0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16638a;

    /* renamed from: b, reason: collision with root package name */
    private final Tt0 f16639b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3542nu0 f16640c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC3429ms0 f16641d;

    /* renamed from: e, reason: collision with root package name */
    private final Ts0 f16642e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f16643f;

    private Kp0(String str, Tt0 tt0, AbstractC3542nu0 abstractC3542nu0, EnumC3429ms0 enumC3429ms0, Ts0 ts0, Integer num) {
        this.f16638a = str;
        this.f16639b = tt0;
        this.f16640c = abstractC3542nu0;
        this.f16641d = enumC3429ms0;
        this.f16642e = ts0;
        this.f16643f = num;
    }

    public static Kp0 a(String str, AbstractC3542nu0 abstractC3542nu0, EnumC3429ms0 enumC3429ms0, Ts0 ts0, Integer num) {
        if (ts0 == Ts0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new Kp0(str, Wp0.a(str), abstractC3542nu0, enumC3429ms0, ts0, num);
    }

    public final EnumC3429ms0 b() {
        return this.f16641d;
    }

    public final Ts0 c() {
        return this.f16642e;
    }

    @Override // com.google.android.gms.internal.ads.Pp0
    public final Tt0 d() {
        return this.f16639b;
    }

    public final AbstractC3542nu0 e() {
        return this.f16640c;
    }

    public final Integer f() {
        return this.f16643f;
    }

    public final String g() {
        return this.f16638a;
    }
}
