package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class Qq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Tt0 f18546a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4403vp0 f18547b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC3967rp0 f18548c;

    /* renamed from: d, reason: collision with root package name */
    private static final Jo0 f18549d;

    /* renamed from: e, reason: collision with root package name */
    private static final Fo0 f18550e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f18551f = 0;

    static {
        Tt0 b8 = Wp0.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f18546a = b8;
        f18547b = AbstractC4403vp0.b(new InterfaceC4185tp0() { // from class: com.google.android.gms.internal.ads.Mq0
            @Override // com.google.android.gms.internal.ads.InterfaceC4185tp0
            public final Pp0 a(AbstractC2763gl0 abstractC2763gl0) {
                return Qq0.b((C2882hq0) abstractC2763gl0);
            }
        }, C2882hq0.class, Lp0.class);
        f18548c = AbstractC3967rp0.b(new InterfaceC3750pp0() { // from class: com.google.android.gms.internal.ads.Nq0
            @Override // com.google.android.gms.internal.ads.InterfaceC3750pp0
            public final AbstractC2763gl0 a(Pp0 pp0) {
                return Qq0.d((Lp0) pp0);
            }
        }, b8, Lp0.class);
        f18549d = Jo0.b(new Ho0() { // from class: com.google.android.gms.internal.ads.Oq0
            @Override // com.google.android.gms.internal.ads.Ho0
            public final Pp0 a(Sk0 sk0, C3197kl0 c3197kl0) {
                return Qq0.a((Zp0) sk0, c3197kl0);
            }
        }, Zp0.class, Kp0.class);
        f18550e = Fo0.b(new Do0() { // from class: com.google.android.gms.internal.ads.Pq0
            @Override // com.google.android.gms.internal.ads.Do0
            public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
                return Qq0.c((Kp0) pp0, c3197kl0);
            }
        }, b8, Kp0.class);
    }

    public static /* synthetic */ Kp0 a(Zp0 zp0, C3197kl0 c3197kl0) {
        C2232br0 c02 = C2448dr0.c0();
        c02.D(g(zp0.b()));
        byte[] d8 = zp0.d().d(c3197kl0);
        c02.C(AbstractC3542nu0.H(d8, 0, d8.length));
        return Kp0.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((C2448dr0) c02.x()).g(), EnumC3429ms0.SYMMETRIC, h(zp0.b().f()), zp0.e());
    }

    public static /* synthetic */ Lp0 b(C2882hq0 c2882hq0) {
        C3865qs0 b02 = C4082ss0.b0();
        b02.D("type.googleapis.com/google.crypto.tink.AesCmacKey");
        C2557er0 c02 = C2775gr0.c0();
        c02.D(g(c2882hq0));
        c02.C(c2882hq0.c());
        b02.E(((C2775gr0) c02.x()).g());
        b02.C(h(c2882hq0.f()));
        return Lp0.b((C4082ss0) b02.x());
    }

    public static /* synthetic */ Zp0 c(Kp0 kp0, C3197kl0 c3197kl0) {
        if (!kp0.g().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            C2448dr0 e02 = C2448dr0.e0(kp0.e(), Eu0.a());
            if (e02.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C2555eq0 e8 = C2882hq0.e();
            e8.a(e02.g0().j());
            e8.b(e02.f0().b0());
            e8.c(f(kp0.c()));
            C2882hq0 d8 = e8.d();
            Xp0 a8 = Zp0.a();
            a8.c(d8);
            a8.a(Ut0.b(e02.g0().b(), c3197kl0));
            a8.b(kp0.f());
            return a8.d();
        } catch (zzgyg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ C2882hq0 d(Lp0 lp0) {
        if (!lp0.c().h0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(lp0.c().h0())));
        }
        try {
            C2775gr0 e02 = C2775gr0.e0(lp0.c().g0(), Eu0.a());
            C2555eq0 e8 = C2882hq0.e();
            e8.a(e02.b0());
            e8.b(e02.f0().b0());
            e8.c(f(lp0.c().f0()));
            return e8.d();
        } catch (zzgyg e9) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e9);
        }
    }

    public static void e(C3423mp0 c3423mp0) {
        c3423mp0.i(f18547b);
        c3423mp0.h(f18548c);
        c3423mp0.g(f18549d);
        c3423mp0.f(f18550e);
    }

    private static C2664fq0 f(Ts0 ts0) {
        int ordinal = ts0.ordinal();
        if (ordinal == 1) {
            return C2664fq0.f22116b;
        }
        if (ordinal == 2) {
            return C2664fq0.f22118d;
        }
        if (ordinal == 3) {
            return C2664fq0.f22119e;
        }
        if (ordinal == 4) {
            return C2664fq0.f22117c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ts0.zza());
    }

    private static C3100jr0 g(C2882hq0 c2882hq0) {
        C2884hr0 c02 = C3100jr0.c0();
        c02.C(c2882hq0.b());
        return (C3100jr0) c02.x();
    }

    private static Ts0 h(C2664fq0 c2664fq0) {
        if (C2664fq0.f22116b.equals(c2664fq0)) {
            return Ts0.TINK;
        }
        if (C2664fq0.f22117c.equals(c2664fq0)) {
            return Ts0.CRUNCHY;
        }
        if (C2664fq0.f22119e.equals(c2664fq0)) {
            return Ts0.RAW;
        }
        if (C2664fq0.f22118d.equals(c2664fq0)) {
            return Ts0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c2664fq0)));
    }
}
