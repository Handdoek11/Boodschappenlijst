package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class Un0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Tt0 f19462a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4403vp0 f19463b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC3967rp0 f19464c;

    /* renamed from: d, reason: collision with root package name */
    private static final Jo0 f19465d;

    /* renamed from: e, reason: collision with root package name */
    private static final Fo0 f19466e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f19467f = 0;

    static {
        Tt0 b8 = Wp0.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f19462a = b8;
        f19463b = AbstractC4403vp0.b(new InterfaceC4185tp0() { // from class: com.google.android.gms.internal.ads.Qn0
            @Override // com.google.android.gms.internal.ads.InterfaceC4185tp0
            public final Pp0 a(AbstractC2763gl0 abstractC2763gl0) {
                return Un0.d((C4288um0) abstractC2763gl0);
            }
        }, C4288um0.class, Lp0.class);
        f19464c = AbstractC3967rp0.b(new InterfaceC3750pp0() { // from class: com.google.android.gms.internal.ads.Rn0
            @Override // com.google.android.gms.internal.ads.InterfaceC3750pp0
            public final AbstractC2763gl0 a(Pp0 pp0) {
                return Un0.b((Lp0) pp0);
            }
        }, b8, Lp0.class);
        f19465d = Jo0.b(new Ho0() { // from class: com.google.android.gms.internal.ads.Sn0
            @Override // com.google.android.gms.internal.ads.Ho0
            public final Pp0 a(Sk0 sk0, C3197kl0 c3197kl0) {
                return Un0.c((C3744pm0) sk0, c3197kl0);
            }
        }, C3744pm0.class, Kp0.class);
        f19466e = Fo0.b(new Do0() { // from class: com.google.android.gms.internal.ads.Tn0
            @Override // com.google.android.gms.internal.ads.Do0
            public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
                return Un0.a((Kp0) pp0, c3197kl0);
            }
        }, b8, Kp0.class);
    }

    public static /* synthetic */ C3744pm0 a(Kp0 kp0, C3197kl0 c3197kl0) {
        if (!kp0.g().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            Wr0 e02 = Wr0.e0(kp0.e(), Eu0.a());
            if (e02.b0() == 0) {
                return C3744pm0.a(f(kp0.c()), Ut0.b(e02.f0().b(), c3197kl0), kp0.f());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ C4288um0 b(Lp0 lp0) {
        if (!lp0.c().h0().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(lp0.c().h0())));
        }
        try {
            Zr0.d0(lp0.c().g0(), Eu0.a());
            return C4288um0.c(f(lp0.c().f0()));
        } catch (zzgyg e8) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e8);
        }
    }

    public static /* synthetic */ Kp0 c(C3744pm0 c3744pm0, C3197kl0 c3197kl0) {
        Ur0 c02 = Wr0.c0();
        byte[] d8 = c3744pm0.d().d(c3197kl0);
        c02.C(AbstractC3542nu0.H(d8, 0, d8.length));
        return Kp0.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((Wr0) c02.x()).g(), EnumC3429ms0.SYMMETRIC, g(c3744pm0.b().b()), c3744pm0.e());
    }

    public static /* synthetic */ Lp0 d(C4288um0 c4288um0) {
        C3865qs0 b02 = C4082ss0.b0();
        b02.D("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        b02.E(Zr0.c0().g());
        b02.C(g(c4288um0.b()));
        return Lp0.b((C4082ss0) b02.x());
    }

    public static void e(C3423mp0 c3423mp0) {
        c3423mp0.i(f19463b);
        c3423mp0.h(f19464c);
        c3423mp0.g(f19465d);
        c3423mp0.f(f19466e);
    }

    private static C4179tm0 f(Ts0 ts0) {
        int ordinal = ts0.ordinal();
        if (ordinal == 1) {
            return C4179tm0.f26922b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C4179tm0.f26924d;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ts0.zza());
            }
        }
        return C4179tm0.f26923c;
    }

    private static Ts0 g(C4179tm0 c4179tm0) {
        if (C4179tm0.f26922b.equals(c4179tm0)) {
            return Ts0.TINK;
        }
        if (C4179tm0.f26923c.equals(c4179tm0)) {
            return Ts0.CRUNCHY;
        }
        if (C4179tm0.f26924d.equals(c4179tm0)) {
            return Ts0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c4179tm0.toString()));
    }
}
