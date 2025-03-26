package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.qo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3857qo0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Tt0 f25991a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4403vp0 f25992b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC3967rp0 f25993c;

    /* renamed from: d, reason: collision with root package name */
    private static final Jo0 f25994d;

    /* renamed from: e, reason: collision with root package name */
    private static final Fo0 f25995e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f25996f = 0;

    static {
        Tt0 b8 = Wp0.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f25991a = b8;
        f25992b = AbstractC4403vp0.b(new InterfaceC4185tp0() { // from class: com.google.android.gms.internal.ads.mo0
            @Override // com.google.android.gms.internal.ads.InterfaceC4185tp0
            public final Pp0 a(AbstractC2763gl0 abstractC2763gl0) {
                return AbstractC3857qo0.d((C3855qn0) abstractC2763gl0);
            }
        }, C3855qn0.class, Lp0.class);
        f25993c = AbstractC3967rp0.b(new InterfaceC3750pp0() { // from class: com.google.android.gms.internal.ads.no0
            @Override // com.google.android.gms.internal.ads.InterfaceC3750pp0
            public final AbstractC2763gl0 a(Pp0 pp0) {
                return AbstractC3857qo0.b((Lp0) pp0);
            }
        }, b8, Lp0.class);
        f25994d = Jo0.b(new Ho0() { // from class: com.google.android.gms.internal.ads.oo0
            @Override // com.google.android.gms.internal.ads.Ho0
            public final Pp0 a(Sk0 sk0, C3197kl0 c3197kl0) {
                return AbstractC3857qo0.c((C3201kn0) sk0, c3197kl0);
            }
        }, C3201kn0.class, Kp0.class);
        f25995e = Fo0.b(new Do0() { // from class: com.google.android.gms.internal.ads.po0
            @Override // com.google.android.gms.internal.ads.Do0
            public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
                return AbstractC3857qo0.a((Kp0) pp0, c3197kl0);
            }
        }, b8, Kp0.class);
    }

    public static /* synthetic */ C3201kn0 a(Kp0 kp0, C3197kl0 c3197kl0) {
        if (!kp0.g().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            C3104jt0 e02 = C3104jt0.e0(kp0.e(), Eu0.a());
            if (e02.b0() == 0) {
                return C3201kn0.a(f(kp0.c()), Ut0.b(e02.f0().b(), c3197kl0), kp0.f());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ C3855qn0 b(Lp0 lp0) {
        if (!lp0.c().h0().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(lp0.c().h0())));
        }
        try {
            if (C3431mt0.e0(lp0.c().g0(), Eu0.a()).b0() == 0) {
                return C3855qn0.c(f(lp0.c().f0()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzgyg e8) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e8);
        }
    }

    public static /* synthetic */ Kp0 c(C3201kn0 c3201kn0, C3197kl0 c3197kl0) {
        C2888ht0 c02 = C3104jt0.c0();
        byte[] d8 = c3201kn0.d().d(c3197kl0);
        c02.C(AbstractC3542nu0.H(d8, 0, d8.length));
        return Kp0.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((C3104jt0) c02.x()).g(), EnumC3429ms0.SYMMETRIC, g(c3201kn0.b().b()), c3201kn0.e());
    }

    public static /* synthetic */ Lp0 d(C3855qn0 c3855qn0) {
        C3865qs0 b02 = C4082ss0.b0();
        b02.D("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        b02.E(C3431mt0.d0().g());
        b02.C(g(c3855qn0.b()));
        return Lp0.b((C4082ss0) b02.x());
    }

    public static void e(C3423mp0 c3423mp0) {
        c3423mp0.i(f25992b);
        c3423mp0.h(f25993c);
        c3423mp0.g(f25994d);
        c3423mp0.f(f25995e);
    }

    private static C3746pn0 f(Ts0 ts0) {
        int ordinal = ts0.ordinal();
        if (ordinal == 1) {
            return C3746pn0.f25509b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C3746pn0.f25511d;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ts0.zza());
            }
        }
        return C3746pn0.f25510c;
    }

    private static Ts0 g(C3746pn0 c3746pn0) {
        if (C3746pn0.f25509b.equals(c3746pn0)) {
            return Ts0.TINK;
        }
        if (C3746pn0.f25510c.equals(c3746pn0)) {
            return Ts0.CRUNCHY;
        }
        if (C3746pn0.f25511d.equals(c3746pn0)) {
            return Ts0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3746pn0.toString()));
    }
}
