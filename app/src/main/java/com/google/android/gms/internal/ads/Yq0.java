package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class Yq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Tt0 f20332a;

    /* renamed from: b, reason: collision with root package name */
    private static final C4728yo0 f20333b;

    /* renamed from: c, reason: collision with root package name */
    private static final C4728yo0 f20334c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC4403vp0 f20335d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC3967rp0 f20336e;

    /* renamed from: f, reason: collision with root package name */
    private static final Jo0 f20337f;

    /* renamed from: g, reason: collision with root package name */
    private static final Fo0 f20338g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f20339h = 0;

    static {
        Tt0 b8 = Wp0.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f20332a = b8;
        C4510wo0 a8 = C4728yo0.a();
        a8.a(Ts0.RAW, C4514wq0.f27561e);
        a8.a(Ts0.TINK, C4514wq0.f27558b);
        a8.a(Ts0.LEGACY, C4514wq0.f27560d);
        a8.a(Ts0.CRUNCHY, C4514wq0.f27559c);
        f20333b = a8.b();
        C4510wo0 a9 = C4728yo0.a();
        a9.a(EnumC2125as0.SHA1, C4405vq0.f27369b);
        a9.a(EnumC2125as0.SHA224, C4405vq0.f27370c);
        a9.a(EnumC2125as0.SHA256, C4405vq0.f27371d);
        a9.a(EnumC2125as0.SHA384, C4405vq0.f27372e);
        a9.a(EnumC2125as0.SHA512, C4405vq0.f27373f);
        f20334c = a9.b();
        f20335d = AbstractC4403vp0.b(new InterfaceC4185tp0() { // from class: com.google.android.gms.internal.ads.Uq0
            @Override // com.google.android.gms.internal.ads.InterfaceC4185tp0
            public final Pp0 a(AbstractC2763gl0 abstractC2763gl0) {
                return Yq0.b((C4732yq0) abstractC2763gl0);
            }
        }, C4732yq0.class, Lp0.class);
        f20336e = AbstractC3967rp0.b(new InterfaceC3750pp0() { // from class: com.google.android.gms.internal.ads.Vq0
            @Override // com.google.android.gms.internal.ads.InterfaceC3750pp0
            public final AbstractC2763gl0 a(Pp0 pp0) {
                return Yq0.d((Lp0) pp0);
            }
        }, b8, Lp0.class);
        f20337f = Jo0.b(new Ho0() { // from class: com.google.android.gms.internal.ads.Wq0
            @Override // com.google.android.gms.internal.ads.Ho0
            public final Pp0 a(Sk0 sk0, C3197kl0 c3197kl0) {
                return Yq0.a((C3643oq0) sk0, c3197kl0);
            }
        }, C3643oq0.class, Kp0.class);
        f20338g = Fo0.b(new Do0() { // from class: com.google.android.gms.internal.ads.Xq0
            @Override // com.google.android.gms.internal.ads.Do0
            public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
                return Yq0.c((Kp0) pp0, c3197kl0);
            }
        }, b8, Kp0.class);
    }

    public static /* synthetic */ Kp0 a(C3643oq0 c3643oq0, C3197kl0 c3197kl0) {
        C2234bs0 c02 = C2559es0.c0();
        c02.D(f(c3643oq0.b()));
        byte[] d8 = c3643oq0.d().d(c3197kl0);
        c02.C(AbstractC3542nu0.H(d8, 0, d8.length));
        return Kp0.a("type.googleapis.com/google.crypto.tink.HmacKey", ((C2559es0) c02.x()).g(), EnumC3429ms0.SYMMETRIC, (Ts0) f20333b.b(c3643oq0.b().g()), c3643oq0.e());
    }

    public static /* synthetic */ Lp0 b(C4732yq0 c4732yq0) {
        C3865qs0 b02 = C4082ss0.b0();
        b02.D("type.googleapis.com/google.crypto.tink.HmacKey");
        C2668fs0 d02 = C2886hs0.d0();
        d02.D(f(c4732yq0));
        d02.C(c4732yq0.c());
        b02.E(((C2886hs0) d02.x()).g());
        b02.C((Ts0) f20333b.b(c4732yq0.g()));
        return Lp0.b((C4082ss0) b02.x());
    }

    public static /* synthetic */ C3643oq0 c(Kp0 kp0, C3197kl0 c3197kl0) {
        if (!kp0.g().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            C2559es0 f02 = C2559es0.f0(kp0.e(), Eu0.a());
            if (f02.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C4296uq0 e8 = C4732yq0.e();
            e8.b(f02.h0().j());
            e8.c(f02.g0().b0());
            e8.a((C4405vq0) f20334c.c(f02.g0().c0()));
            e8.d((C4514wq0) f20333b.c(kp0.c()));
            C4732yq0 e9 = e8.e();
            C3425mq0 a8 = C3643oq0.a();
            a8.c(e9);
            a8.b(Ut0.b(f02.h0().b(), c3197kl0));
            a8.a(kp0.f());
            return a8.d();
        } catch (zzgyg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ C4732yq0 d(Lp0 lp0) {
        if (!lp0.c().h0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(lp0.c().h0())));
        }
        try {
            C2886hs0 g02 = C2886hs0.g0(lp0.c().g0(), Eu0.a());
            if (g02.c0() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + g02.c0());
            }
            C4296uq0 e8 = C4732yq0.e();
            e8.b(g02.b0());
            e8.c(g02.h0().b0());
            e8.a((C4405vq0) f20334c.c(g02.h0().c0()));
            e8.d((C4514wq0) f20333b.c(lp0.c().f0()));
            return e8.e();
        } catch (zzgyg e9) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e9);
        }
    }

    public static void e(C3423mp0 c3423mp0) {
        c3423mp0.i(f20335d);
        c3423mp0.h(f20336e);
        c3423mp0.g(f20337f);
        c3423mp0.f(f20338g);
    }

    private static C3211ks0 f(C4732yq0 c4732yq0) {
        C2994is0 d02 = C3211ks0.d0();
        d02.D(c4732yq0.b());
        d02.C((EnumC2125as0) f20334c.b(c4732yq0.f()));
        return (C3211ks0) d02.x();
    }
}
