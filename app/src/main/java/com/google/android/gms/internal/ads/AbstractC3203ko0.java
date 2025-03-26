package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ko0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3203ko0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Tt0 f24093a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4403vp0 f24094b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC3967rp0 f24095c;

    /* renamed from: d, reason: collision with root package name */
    private static final Jo0 f24096d;

    /* renamed from: e, reason: collision with root package name */
    private static final Fo0 f24097e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f24098f = 0;

    static {
        Tt0 b8 = Wp0.b("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f24093a = b8;
        f24094b = AbstractC4403vp0.b(new InterfaceC4185tp0() { // from class: com.google.android.gms.internal.ads.go0
            @Override // com.google.android.gms.internal.ads.InterfaceC4185tp0
            public final Pp0 a(AbstractC2763gl0 abstractC2763gl0) {
                return AbstractC3203ko0.d((C3092jn0) abstractC2763gl0);
            }
        }, C3092jn0.class, Lp0.class);
        f24095c = AbstractC3967rp0.b(new InterfaceC3750pp0() { // from class: com.google.android.gms.internal.ads.ho0
            @Override // com.google.android.gms.internal.ads.InterfaceC3750pp0
            public final AbstractC2763gl0 a(Pp0 pp0) {
                return AbstractC3203ko0.b((Lp0) pp0);
            }
        }, b8, Lp0.class);
        f24096d = Jo0.b(new Ho0() { // from class: com.google.android.gms.internal.ads.io0
            @Override // com.google.android.gms.internal.ads.Ho0
            public final Pp0 a(Sk0 sk0, C3197kl0 c3197kl0) {
                return AbstractC3203ko0.c((C2549en0) sk0, c3197kl0);
            }
        }, C2549en0.class, Kp0.class);
        f24097e = Fo0.b(new Do0() { // from class: com.google.android.gms.internal.ads.jo0
            @Override // com.google.android.gms.internal.ads.Do0
            public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
                return AbstractC3203ko0.a((Kp0) pp0, c3197kl0);
            }
        }, b8, Kp0.class);
    }

    public static /* synthetic */ C2549en0 a(Kp0 kp0, C3197kl0 c3197kl0) {
        if (!kp0.g().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            Zs0 e02 = Zs0.e0(kp0.e(), Eu0.a());
            if (e02.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (e02.g0().j() == 32) {
                return C2549en0.a(C3092jn0.d(f(kp0.c()), e02.f0().b0()), Ut0.b(e02.g0().b(), c3197kl0), kp0.f());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static /* synthetic */ C3092jn0 b(Lp0 lp0) {
        if (!lp0.c().h0().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(lp0.c().h0())));
        }
        try {
            C2344ct0 e02 = C2344ct0.e0(lp0.c().g0(), Eu0.a());
            if (e02.b0() == 0) {
                return C3092jn0.d(f(lp0.c().f0()), e02.f0().b0());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzgyg e8) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e8);
        }
    }

    public static /* synthetic */ Kp0 c(C2549en0 c2549en0, C3197kl0 c3197kl0) {
        Xs0 c02 = Zs0.c0();
        byte[] d8 = c2549en0.d().d(c3197kl0);
        c02.C(AbstractC3542nu0.H(d8, 0, d8.length));
        C2452dt0 c03 = C2779gt0.c0();
        c03.C(c2549en0.b().b());
        c02.D((C2779gt0) c03.x());
        return Kp0.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((Zs0) c02.x()).g(), EnumC3429ms0.SYMMETRIC, g(c2549en0.b().c()), c2549en0.e());
    }

    public static /* synthetic */ Lp0 d(C3092jn0 c3092jn0) {
        C3865qs0 b02 = C4082ss0.b0();
        b02.D("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        C2127at0 c02 = C2344ct0.c0();
        C2452dt0 c03 = C2779gt0.c0();
        c03.C(c3092jn0.b());
        c02.C((C2779gt0) c03.x());
        b02.E(((C2344ct0) c02.x()).g());
        b02.C(g(c3092jn0.c()));
        return Lp0.b((C4082ss0) b02.x());
    }

    public static void e(C3423mp0 c3423mp0) {
        c3423mp0.i(f24094b);
        c3423mp0.h(f24095c);
        c3423mp0.g(f24096d);
        c3423mp0.f(f24097e);
    }

    private static C2984in0 f(Ts0 ts0) {
        int ordinal = ts0.ordinal();
        if (ordinal == 1) {
            return C2984in0.f23065b;
        }
        if (ordinal == 3) {
            return C2984in0.f23066c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ts0.zza());
    }

    private static Ts0 g(C2984in0 c2984in0) {
        if (Objects.equals(c2984in0, C2984in0.f23065b)) {
            return Ts0.TINK;
        }
        if (Objects.equals(c2984in0, C2984in0.f23066c)) {
            return Ts0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c2984in0.toString()));
    }
}
