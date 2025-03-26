package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
abstract class Jm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Tt0 f16301a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4403vp0 f16302b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC3967rp0 f16303c;

    /* renamed from: d, reason: collision with root package name */
    private static final Jo0 f16304d;

    /* renamed from: e, reason: collision with root package name */
    private static final Fo0 f16305e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f16306f = 0;

    static {
        Tt0 b8 = Wp0.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f16301a = b8;
        f16302b = AbstractC4403vp0.b(new InterfaceC4185tp0() { // from class: com.google.android.gms.internal.ads.Fm0
            @Override // com.google.android.gms.internal.ads.InterfaceC4185tp0
            public final Pp0 a(AbstractC2763gl0 abstractC2763gl0) {
                return Jm0.d((Em0) abstractC2763gl0);
            }
        }, Em0.class, Lp0.class);
        f16303c = AbstractC3967rp0.b(new InterfaceC3750pp0() { // from class: com.google.android.gms.internal.ads.Gm0
            @Override // com.google.android.gms.internal.ads.InterfaceC3750pp0
            public final AbstractC2763gl0 a(Pp0 pp0) {
                return Jm0.b((Lp0) pp0);
            }
        }, b8, Lp0.class);
        f16304d = Jo0.b(new Ho0() { // from class: com.google.android.gms.internal.ads.Hm0
            @Override // com.google.android.gms.internal.ads.Ho0
            public final Pp0 a(Sk0 sk0, C3197kl0 c3197kl0) {
                return Jm0.c((Cm0) sk0, c3197kl0);
            }
        }, Cm0.class, Kp0.class);
        f16305e = Fo0.b(new Do0() { // from class: com.google.android.gms.internal.ads.Im0
            @Override // com.google.android.gms.internal.ads.Do0
            public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
                return Jm0.a((Kp0) pp0, c3197kl0);
            }
        }, b8, Kp0.class);
    }

    public static /* synthetic */ Cm0 a(Kp0 kp0, C3197kl0 c3197kl0) {
        if (!kp0.g().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            Js0 e02 = Js0.e0(kp0.e(), Eu0.a());
            if (e02.b0() == 0) {
                return Cm0.a(Em0.c(e02.f0().f0(), f(kp0.c())), kp0.f());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(e02));
        } catch (zzgyg e8) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e8);
        }
    }

    public static /* synthetic */ Em0 b(Lp0 lp0) {
        if (!lp0.c().h0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(lp0.c().h0())));
        }
        try {
            return Em0.c(Ms0.e0(lp0.c().g0(), Eu0.a()).f0(), f(lp0.c().f0()));
        } catch (zzgyg e8) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e8);
        }
    }

    public static /* synthetic */ Kp0 c(Cm0 cm0, C3197kl0 c3197kl0) {
        Hs0 c02 = Js0.c0();
        Ks0 b02 = Ms0.b0();
        b02.C(cm0.b().d());
        c02.C((Ms0) b02.x());
        return Kp0.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((Js0) c02.x()).g(), EnumC3429ms0.REMOTE, g(cm0.b().b()), cm0.c());
    }

    public static /* synthetic */ Lp0 d(Em0 em0) {
        C3865qs0 b02 = C4082ss0.b0();
        b02.D("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        Ks0 b03 = Ms0.b0();
        b03.C(em0.d());
        b02.E(((Ms0) b03.x()).g());
        b02.C(g(em0.b()));
        return Lp0.b((C4082ss0) b02.x());
    }

    public static void e(C3423mp0 c3423mp0) {
        c3423mp0.i(f16302b);
        c3423mp0.h(f16303c);
        c3423mp0.g(f16304d);
        c3423mp0.f(f16305e);
    }

    private static Dm0 f(Ts0 ts0) {
        int ordinal = ts0.ordinal();
        if (ordinal == 1) {
            return Dm0.f14550b;
        }
        if (ordinal == 3) {
            return Dm0.f14551c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ts0.zza());
    }

    private static Ts0 g(Dm0 dm0) {
        if (Dm0.f14550b.equals(dm0)) {
            return Ts0.TINK;
        }
        if (Dm0.f14551c.equals(dm0)) {
            return Ts0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(dm0.toString()));
    }
}
