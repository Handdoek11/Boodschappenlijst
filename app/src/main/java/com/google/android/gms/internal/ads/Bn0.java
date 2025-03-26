package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class Bn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Tt0 f13856a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4403vp0 f13857b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC3967rp0 f13858c;

    /* renamed from: d, reason: collision with root package name */
    private static final Jo0 f13859d;

    /* renamed from: e, reason: collision with root package name */
    private static final Fo0 f13860e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13861f = 0;

    static {
        Tt0 b8 = Wp0.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f13856a = b8;
        f13857b = AbstractC4403vp0.b(new InterfaceC4185tp0() { // from class: com.google.android.gms.internal.ads.wn0
            @Override // com.google.android.gms.internal.ads.InterfaceC4185tp0
            public final Pp0 a(AbstractC2763gl0 abstractC2763gl0) {
                return Bn0.d((Rl0) abstractC2763gl0);
            }
        }, Rl0.class, Lp0.class);
        f13858c = AbstractC3967rp0.b(new InterfaceC3750pp0() { // from class: com.google.android.gms.internal.ads.xn0
            @Override // com.google.android.gms.internal.ads.InterfaceC3750pp0
            public final AbstractC2763gl0 a(Pp0 pp0) {
                return Bn0.b((Lp0) pp0);
            }
        }, b8, Lp0.class);
        f13859d = Jo0.b(new Ho0() { // from class: com.google.android.gms.internal.ads.yn0
            @Override // com.google.android.gms.internal.ads.Ho0
            public final Pp0 a(Sk0 sk0, C3197kl0 c3197kl0) {
                return Bn0.c((Kl0) sk0, c3197kl0);
            }
        }, Kl0.class, Kp0.class);
        f13860e = Fo0.b(new Do0() { // from class: com.google.android.gms.internal.ads.An0
            @Override // com.google.android.gms.internal.ads.Do0
            public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
                return Bn0.a((Kp0) pp0, c3197kl0);
            }
        }, b8, Kp0.class);
    }

    public static /* synthetic */ Kl0 a(Kp0 kp0, C3197kl0 c3197kl0) {
        if (!kp0.g().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            Br0 e02 = Br0.e0(kp0.e(), Eu0.a());
            if (e02.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            Ol0 d8 = Rl0.d();
            d8.b(e02.g0().j());
            d8.a(e02.f0().b0());
            d8.c(16);
            d8.d(f(kp0.c()));
            Rl0 e8 = d8.e();
            Il0 a8 = Kl0.a();
            a8.c(e8);
            a8.b(Ut0.b(e02.g0().b(), c3197kl0));
            a8.a(kp0.f());
            return a8.d();
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ Rl0 b(Lp0 lp0) {
        if (!lp0.c().h0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(lp0.c().h0())));
        }
        try {
            Er0 e02 = Er0.e0(lp0.c().g0(), Eu0.a());
            Ol0 d8 = Rl0.d();
            d8.b(e02.b0());
            d8.a(e02.f0().b0());
            d8.c(16);
            d8.d(f(lp0.c().f0()));
            return d8.e();
        } catch (zzgyg e8) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e8);
        }
    }

    public static /* synthetic */ Kp0 c(Kl0 kl0, C3197kl0 c3197kl0) {
        C4843zr0 c02 = Br0.c0();
        c02.D(g(kl0.b()));
        byte[] d8 = kl0.d().d(c3197kl0);
        c02.C(AbstractC3542nu0.H(d8, 0, d8.length));
        return Kp0.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((Br0) c02.x()).g(), EnumC3429ms0.SYMMETRIC, h(kl0.b().e()), kl0.e());
    }

    public static /* synthetic */ Lp0 d(Rl0 rl0) {
        C3865qs0 b02 = C4082ss0.b0();
        b02.D("type.googleapis.com/google.crypto.tink.AesEaxKey");
        Cr0 c02 = Er0.c0();
        c02.D(g(rl0));
        c02.C(rl0.c());
        b02.E(((Er0) c02.x()).g());
        b02.C(h(rl0.e()));
        return Lp0.b((C4082ss0) b02.x());
    }

    public static void e(C3423mp0 c3423mp0) {
        c3423mp0.i(f13857b);
        c3423mp0.h(f13858c);
        c3423mp0.g(f13859d);
        c3423mp0.f(f13860e);
    }

    private static Pl0 f(Ts0 ts0) {
        int ordinal = ts0.ordinal();
        if (ordinal == 1) {
            return Pl0.f18258b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return Pl0.f18260d;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ts0.zza());
            }
        }
        return Pl0.f18259c;
    }

    private static Hr0 g(Rl0 rl0) {
        Fr0 c02 = Hr0.c0();
        c02.C(rl0.b());
        return (Hr0) c02.x();
    }

    private static Ts0 h(Pl0 pl0) {
        if (Pl0.f18258b.equals(pl0)) {
            return Ts0.TINK;
        }
        if (Pl0.f18259c.equals(pl0)) {
            return Ts0.CRUNCHY;
        }
        if (Pl0.f18260d.equals(pl0)) {
            return Ts0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(pl0)));
    }
}
