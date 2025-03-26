package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class Nn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Tt0 f17596a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4403vp0 f17597b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC3967rp0 f17598c;

    /* renamed from: d, reason: collision with root package name */
    private static final Jo0 f17599d;

    /* renamed from: e, reason: collision with root package name */
    private static final Fo0 f17600e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f17601f = 0;

    static {
        Tt0 b8 = Wp0.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f17596a = b8;
        f17597b = AbstractC4403vp0.b(new InterfaceC4185tp0() { // from class: com.google.android.gms.internal.ads.Jn0
            @Override // com.google.android.gms.internal.ads.InterfaceC4185tp0
            public final Pp0 a(AbstractC2763gl0 abstractC2763gl0) {
                return Nn0.d((C3635om0) abstractC2763gl0);
            }
        }, C3635om0.class, Lp0.class);
        f17598c = AbstractC3967rp0.b(new InterfaceC3750pp0() { // from class: com.google.android.gms.internal.ads.Kn0
            @Override // com.google.android.gms.internal.ads.InterfaceC3750pp0
            public final AbstractC2763gl0 a(Pp0 pp0) {
                return Nn0.b((Lp0) pp0);
            }
        }, b8, Lp0.class);
        f17599d = Jo0.b(new Ho0() { // from class: com.google.android.gms.internal.ads.Ln0
            @Override // com.google.android.gms.internal.ads.Ho0
            public final Pp0 a(Sk0 sk0, C3197kl0 c3197kl0) {
                return Nn0.c((C2765gm0) sk0, c3197kl0);
            }
        }, C2765gm0.class, Kp0.class);
        f17600e = Fo0.b(new Do0() { // from class: com.google.android.gms.internal.ads.Mn0
            @Override // com.google.android.gms.internal.ads.Do0
            public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
                return Nn0.a((Kp0) pp0, c3197kl0);
            }
        }, b8, Kp0.class);
    }

    public static /* synthetic */ C2765gm0 a(Kp0 kp0, C3197kl0 c3197kl0) {
        if (!kp0.g().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            Qr0 e02 = Qr0.e0(kp0.e(), Eu0.a());
            if (e02.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C3308lm0 c8 = C3635om0.c();
            c8.a(e02.f0().j());
            c8.b(f(kp0.c()));
            C3635om0 c9 = c8.c();
            C2547em0 a8 = C2765gm0.a();
            a8.c(c9);
            a8.b(Ut0.b(e02.f0().b(), c3197kl0));
            a8.a(kp0.f());
            return a8.d();
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ C3635om0 b(Lp0 lp0) {
        if (!lp0.c().h0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(lp0.c().h0())));
        }
        try {
            Tr0 f02 = Tr0.f0(lp0.c().g0(), Eu0.a());
            if (f02.c0() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            C3308lm0 c8 = C3635om0.c();
            c8.a(f02.b0());
            c8.b(f(lp0.c().f0()));
            return c8.c();
        } catch (zzgyg e8) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e8);
        }
    }

    public static /* synthetic */ Kp0 c(C2765gm0 c2765gm0, C3197kl0 c3197kl0) {
        Or0 c02 = Qr0.c0();
        byte[] d8 = c2765gm0.d().d(c3197kl0);
        c02.C(AbstractC3542nu0.H(d8, 0, d8.length));
        return Kp0.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((Qr0) c02.x()).g(), EnumC3429ms0.SYMMETRIC, g(c2765gm0.b().d()), c2765gm0.e());
    }

    public static /* synthetic */ Lp0 d(C3635om0 c3635om0) {
        C3865qs0 b02 = C4082ss0.b0();
        b02.D("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        Rr0 d02 = Tr0.d0();
        d02.C(c3635om0.b());
        b02.E(((Tr0) d02.x()).g());
        b02.C(g(c3635om0.d()));
        return Lp0.b((C4082ss0) b02.x());
    }

    public static void e(C3423mp0 c3423mp0) {
        c3423mp0.i(f17597b);
        c3423mp0.h(f17598c);
        c3423mp0.g(f17599d);
        c3423mp0.f(f17600e);
    }

    private static C3417mm0 f(Ts0 ts0) {
        int ordinal = ts0.ordinal();
        if (ordinal == 1) {
            return C3417mm0.f24563b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C3417mm0.f24565d;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ts0.zza());
            }
        }
        return C3417mm0.f24564c;
    }

    private static Ts0 g(C3417mm0 c3417mm0) {
        if (C3417mm0.f24563b.equals(c3417mm0)) {
            return Ts0.TINK;
        }
        if (C3417mm0.f24564c.equals(c3417mm0)) {
            return Ts0.CRUNCHY;
        }
        if (C3417mm0.f24565d.equals(c3417mm0)) {
            return Ts0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3417mm0)));
    }
}
