package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class Um0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Tt0 f19456a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4403vp0 f19457b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC3967rp0 f19458c;

    /* renamed from: d, reason: collision with root package name */
    private static final Jo0 f19459d;

    /* renamed from: e, reason: collision with root package name */
    private static final Fo0 f19460e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f19461f = 0;

    static {
        Tt0 b8 = Wp0.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f19456a = b8;
        f19457b = AbstractC4403vp0.b(new InterfaceC4185tp0() { // from class: com.google.android.gms.internal.ads.Qm0
            @Override // com.google.android.gms.internal.ads.InterfaceC4185tp0
            public final Pp0 a(AbstractC2763gl0 abstractC2763gl0) {
                return Um0.d((Pm0) abstractC2763gl0);
            }
        }, Pm0.class, Lp0.class);
        f19458c = AbstractC3967rp0.b(new InterfaceC3750pp0() { // from class: com.google.android.gms.internal.ads.Rm0
            @Override // com.google.android.gms.internal.ads.InterfaceC3750pp0
            public final AbstractC2763gl0 a(Pp0 pp0) {
                return Um0.b((Lp0) pp0);
            }
        }, b8, Lp0.class);
        f19459d = Jo0.b(new Ho0() { // from class: com.google.android.gms.internal.ads.Sm0
            @Override // com.google.android.gms.internal.ads.Ho0
            public final Pp0 a(Sk0 sk0, C3197kl0 c3197kl0) {
                return Um0.c((Km0) sk0, c3197kl0);
            }
        }, Km0.class, Kp0.class);
        f19460e = Fo0.b(new Do0() { // from class: com.google.android.gms.internal.ads.Tm0
            @Override // com.google.android.gms.internal.ads.Do0
            public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
                return Um0.a((Kp0) pp0, c3197kl0);
            }
        }, b8, Kp0.class);
    }

    public static /* synthetic */ Km0 a(Kp0 kp0, C3197kl0 c3197kl0) {
        if (!kp0.g().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            Ps0 e02 = Ps0.e0(kp0.e(), Eu0.a());
            if (e02.b0() == 0) {
                return Km0.a(f(e02.f0(), kp0.c()), kp0.f());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(e02));
        } catch (zzgyg e8) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e8);
        }
    }

    public static /* synthetic */ Pm0 b(Lp0 lp0) {
        if (!lp0.c().h0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(lp0.c().h0())));
        }
        try {
            return f(Ss0.f0(lp0.c().g0(), Eu0.a()), lp0.c().f0());
        } catch (zzgyg e8) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e8);
        }
    }

    public static /* synthetic */ Kp0 c(Km0 km0, C3197kl0 c3197kl0) {
        Ns0 c02 = Ps0.c0();
        c02.C(g(km0.b()));
        return Kp0.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((Ps0) c02.x()).g(), EnumC3429ms0.REMOTE, h(km0.b().c()), km0.c());
    }

    public static /* synthetic */ Lp0 d(Pm0 pm0) {
        C3865qs0 b02 = C4082ss0.b0();
        b02.D("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        b02.E(g(pm0).g());
        b02.C(h(pm0.c()));
        return Lp0.b((C4082ss0) b02.x());
    }

    public static void e(C3423mp0 c3423mp0) {
        c3423mp0.i(f19457b);
        c3423mp0.h(f19458c);
        c3423mp0.g(f19459d);
        c3423mp0.f(f19460e);
    }

    private static Pm0 f(Ss0 ss0, Ts0 ts0) {
        Mm0 mm0;
        Nm0 nm0;
        C3865qs0 b02 = C4082ss0.b0();
        b02.D(ss0.b0().h0());
        b02.E(ss0.b0().g0());
        b02.C(Ts0.RAW);
        AbstractC2763gl0 a8 = AbstractC3415ml0.a(((C4082ss0) b02.x()).m());
        if (a8 instanceof C2439dm0) {
            mm0 = Mm0.f17401b;
        } else if (a8 instanceof C4288um0) {
            mm0 = Mm0.f17403d;
        } else if (a8 instanceof C3855qn0) {
            mm0 = Mm0.f17402c;
        } else if (a8 instanceof Hl0) {
            mm0 = Mm0.f17404e;
        } else if (a8 instanceof Rl0) {
            mm0 = Mm0.f17405f;
        } else {
            if (!(a8 instanceof C3635om0)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(a8.toString()));
            }
            mm0 = Mm0.f17406g;
        }
        Lm0 lm0 = new Lm0(null);
        int ordinal = ts0.ordinal();
        if (ordinal == 1) {
            nm0 = Nm0.f17591b;
        } else {
            if (ordinal != 3) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ts0.zza());
            }
            nm0 = Nm0.f17592c;
        }
        lm0.d(nm0);
        lm0.c(ss0.g0());
        lm0.a((AbstractC3851ql0) a8);
        lm0.b(mm0);
        return lm0.e();
    }

    private static Ss0 g(Pm0 pm0) {
        try {
            C4082ss0 e02 = C4082ss0.e0(AbstractC3415ml0.b(pm0.b()), Eu0.a());
            Qs0 c02 = Ss0.c0();
            c02.D(pm0.d());
            c02.C(e02);
            return (Ss0) c02.x();
        } catch (zzgyg e8) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e8);
        }
    }

    private static Ts0 h(Nm0 nm0) {
        if (Nm0.f17591b.equals(nm0)) {
            return Ts0.TINK;
        }
        if (Nm0.f17592c.equals(nm0)) {
            return Ts0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(nm0)));
    }
}
