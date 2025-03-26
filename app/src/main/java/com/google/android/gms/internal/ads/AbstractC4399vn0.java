package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.vn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4399vn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Tt0 f27345a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4403vp0 f27346b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC3967rp0 f27347c;

    /* renamed from: d, reason: collision with root package name */
    private static final Jo0 f27348d;

    /* renamed from: e, reason: collision with root package name */
    private static final Fo0 f27349e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27350f = 0;

    static {
        Tt0 b8 = Wp0.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f27345a = b8;
        f27346b = AbstractC4403vp0.b(new InterfaceC4185tp0() { // from class: com.google.android.gms.internal.ads.rn0
            @Override // com.google.android.gms.internal.ads.InterfaceC4185tp0
            public final Pp0 a(AbstractC2763gl0 abstractC2763gl0) {
                return AbstractC4399vn0.d((Hl0) abstractC2763gl0);
            }
        }, Hl0.class, Lp0.class);
        f27347c = AbstractC3967rp0.b(new InterfaceC3750pp0() { // from class: com.google.android.gms.internal.ads.sn0
            @Override // com.google.android.gms.internal.ads.InterfaceC3750pp0
            public final AbstractC2763gl0 a(Pp0 pp0) {
                return AbstractC4399vn0.b((Lp0) pp0);
            }
        }, b8, Lp0.class);
        f27348d = Jo0.b(new Ho0() { // from class: com.google.android.gms.internal.ads.tn0
            @Override // com.google.android.gms.internal.ads.Ho0
            public final Pp0 a(Sk0 sk0, C3197kl0 c3197kl0) {
                return AbstractC4399vn0.c((C4722yl0) sk0, c3197kl0);
            }
        }, C4722yl0.class, Kp0.class);
        f27349e = Fo0.b(new Do0() { // from class: com.google.android.gms.internal.ads.un0
            @Override // com.google.android.gms.internal.ads.Do0
            public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
                return AbstractC4399vn0.a((Kp0) pp0, c3197kl0);
            }
        }, b8, Kp0.class);
    }

    public static /* synthetic */ C4722yl0 a(Kp0 kp0, C3197kl0 c3197kl0) {
        if (!kp0.g().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            C3427mr0 e02 = C3427mr0.e0(kp0.e(), Eu0.a());
            if (e02.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (e02.f0().b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (e02.g0().b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            Dl0 f8 = Hl0.f();
            f8.a(e02.f0().g0().j());
            f8.c(e02.g0().h0().j());
            f8.d(e02.f0().f0().b0());
            f8.e(e02.g0().g0().b0());
            f8.b(f(e02.g0().g0().c0()));
            f8.f(g(kp0.c()));
            Hl0 g8 = f8.g();
            C4395vl0 a8 = C4722yl0.a();
            a8.d(g8);
            a8.a(Ut0.b(e02.f0().g0().b(), c3197kl0));
            a8.b(Ut0.b(e02.g0().h0().b(), c3197kl0));
            a8.c(kp0.f());
            return a8.e();
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ Hl0 b(Lp0 lp0) {
        if (!lp0.c().h0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(lp0.c().h0())));
        }
        try {
            C3754pr0 d02 = C3754pr0.d0(lp0.c().g0(), Eu0.a());
            if (d02.f0().c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            Dl0 f8 = Hl0.f();
            f8.a(d02.e0().b0());
            f8.c(d02.f0().b0());
            f8.d(d02.e0().f0().b0());
            f8.e(d02.f0().h0().b0());
            f8.b(f(d02.f0().h0().c0()));
            f8.f(g(lp0.c().f0()));
            return f8.g();
        } catch (zzgyg e8) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e8);
        }
    }

    public static /* synthetic */ Kp0 c(C4722yl0 c4722yl0, C3197kl0 c3197kl0) {
        C3209kr0 c02 = C3427mr0.c0();
        C3863qr0 c03 = C4080sr0.c0();
        C4516wr0 c04 = C4734yr0.c0();
        c04.C(c4722yl0.b().d());
        c03.D((C4734yr0) c04.x());
        byte[] d8 = c4722yl0.d().d(c3197kl0);
        c03.C(AbstractC3542nu0.H(d8, 0, d8.length));
        c02.C((C4080sr0) c03.x());
        C2234bs0 c05 = C2559es0.c0();
        c05.D(h(c4722yl0.b()));
        byte[] d9 = c4722yl0.e().d(c3197kl0);
        c05.C(AbstractC3542nu0.H(d9, 0, d9.length));
        c02.D((C2559es0) c05.x());
        return Kp0.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C3427mr0) c02.x()).g(), EnumC3429ms0.SYMMETRIC, i(c4722yl0.b().h()), c4722yl0.f());
    }

    public static /* synthetic */ Lp0 d(Hl0 hl0) {
        C3865qs0 b02 = C4082ss0.b0();
        b02.D("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        C3536nr0 b03 = C3754pr0.b0();
        C4189tr0 c02 = C4407vr0.c0();
        C4516wr0 c03 = C4734yr0.c0();
        c03.C(hl0.d());
        c02.D((C4734yr0) c03.x());
        c02.C(hl0.b());
        b03.C((C4407vr0) c02.x());
        C2668fs0 d02 = C2886hs0.d0();
        d02.D(h(hl0));
        d02.C(hl0.c());
        b03.D((C2886hs0) d02.x());
        b02.E(((C3754pr0) b03.x()).g());
        b02.C(i(hl0.h()));
        return Lp0.b((C4082ss0) b02.x());
    }

    public static void e(C3423mp0 c3423mp0) {
        c3423mp0.i(f27346b);
        c3423mp0.h(f27347c);
        c3423mp0.g(f27348d);
        c3423mp0.f(f27349e);
    }

    private static El0 f(EnumC2125as0 enumC2125as0) {
        int ordinal = enumC2125as0.ordinal();
        if (ordinal == 1) {
            return El0.f14770b;
        }
        if (ordinal == 2) {
            return El0.f14773e;
        }
        if (ordinal == 3) {
            return El0.f14772d;
        }
        if (ordinal == 4) {
            return El0.f14774f;
        }
        if (ordinal == 5) {
            return El0.f14771c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC2125as0.zza());
    }

    private static Fl0 g(Ts0 ts0) {
        int ordinal = ts0.ordinal();
        if (ordinal == 1) {
            return Fl0.f15194b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return Fl0.f15196d;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ts0.zza());
            }
        }
        return Fl0.f15195c;
    }

    private static C3211ks0 h(Hl0 hl0) {
        EnumC2125as0 enumC2125as0;
        C2994is0 d02 = C3211ks0.d0();
        d02.D(hl0.e());
        El0 g8 = hl0.g();
        if (El0.f14770b.equals(g8)) {
            enumC2125as0 = EnumC2125as0.SHA1;
        } else if (El0.f14771c.equals(g8)) {
            enumC2125as0 = EnumC2125as0.SHA224;
        } else if (El0.f14772d.equals(g8)) {
            enumC2125as0 = EnumC2125as0.SHA256;
        } else if (El0.f14773e.equals(g8)) {
            enumC2125as0 = EnumC2125as0.SHA384;
        } else {
            if (!El0.f14774f.equals(g8)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(g8)));
            }
            enumC2125as0 = EnumC2125as0.SHA512;
        }
        d02.C(enumC2125as0);
        return (C3211ks0) d02.x();
    }

    private static Ts0 i(Fl0 fl0) {
        if (Fl0.f15194b.equals(fl0)) {
            return Ts0.TINK;
        }
        if (Fl0.f15195c.equals(fl0)) {
            return Ts0.CRUNCHY;
        }
        if (Fl0.f15196d.equals(fl0)) {
            return Ts0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(fl0)));
    }
}
