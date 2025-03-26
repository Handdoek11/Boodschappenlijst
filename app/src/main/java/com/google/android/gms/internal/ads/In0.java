package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class In0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Tt0 f15996a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4403vp0 f15997b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC3967rp0 f15998c;

    /* renamed from: d, reason: collision with root package name */
    private static final Jo0 f15999d;

    /* renamed from: e, reason: collision with root package name */
    private static final Fo0 f16000e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f16001f = 0;

    static {
        Tt0 b8 = Wp0.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f15996a = b8;
        f15997b = AbstractC4403vp0.b(new InterfaceC4185tp0() { // from class: com.google.android.gms.internal.ads.En0
            @Override // com.google.android.gms.internal.ads.InterfaceC4185tp0
            public final Pp0 a(AbstractC2763gl0 abstractC2763gl0) {
                return In0.d((C2439dm0) abstractC2763gl0);
            }
        }, C2439dm0.class, Lp0.class);
        f15998c = AbstractC3967rp0.b(new InterfaceC3750pp0() { // from class: com.google.android.gms.internal.ads.Fn0
            @Override // com.google.android.gms.internal.ads.InterfaceC3750pp0
            public final AbstractC2763gl0 a(Pp0 pp0) {
                return In0.b((Lp0) pp0);
            }
        }, b8, Lp0.class);
        f15999d = Jo0.b(new Ho0() { // from class: com.google.android.gms.internal.ads.Gn0
            @Override // com.google.android.gms.internal.ads.Ho0
            public final Pp0 a(Sk0 sk0, C3197kl0 c3197kl0) {
                return In0.c((Ul0) sk0, c3197kl0);
            }
        }, Ul0.class, Kp0.class);
        f16000e = Fo0.b(new Do0() { // from class: com.google.android.gms.internal.ads.Hn0
            @Override // com.google.android.gms.internal.ads.Do0
            public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
                return In0.a((Kp0) pp0, c3197kl0);
            }
        }, b8, Kp0.class);
    }

    public static /* synthetic */ Ul0 a(Kp0 kp0, C3197kl0 c3197kl0) {
        if (!kp0.g().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            Kr0 e02 = Kr0.e0(kp0.e(), Eu0.a());
            if (e02.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C2113am0 c8 = C2439dm0.c();
            c8.b(e02.f0().j());
            c8.a(12);
            c8.c(16);
            c8.d(f(kp0.c()));
            C2439dm0 e8 = c8.e();
            Sl0 a8 = Ul0.a();
            a8.c(e8);
            a8.b(Ut0.b(e02.f0().b(), c3197kl0));
            a8.a(kp0.f());
            return a8.d();
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ C2439dm0 b(Lp0 lp0) {
        if (!lp0.c().h0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(lp0.c().h0())));
        }
        try {
            Nr0 f02 = Nr0.f0(lp0.c().g0(), Eu0.a());
            if (f02.c0() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            C2113am0 c8 = C2439dm0.c();
            c8.b(f02.b0());
            c8.a(12);
            c8.c(16);
            c8.d(f(lp0.c().f0()));
            return c8.e();
        } catch (zzgyg e8) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e8);
        }
    }

    public static /* synthetic */ Kp0 c(Ul0 ul0, C3197kl0 c3197kl0) {
        Ir0 c02 = Kr0.c0();
        byte[] d8 = ul0.d().d(c3197kl0);
        c02.C(AbstractC3542nu0.H(d8, 0, d8.length));
        return Kp0.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((Kr0) c02.x()).g(), EnumC3429ms0.SYMMETRIC, g(ul0.b().d()), ul0.e());
    }

    public static /* synthetic */ Lp0 d(C2439dm0 c2439dm0) {
        C3865qs0 b02 = C4082ss0.b0();
        b02.D("type.googleapis.com/google.crypto.tink.AesGcmKey");
        Lr0 d02 = Nr0.d0();
        d02.C(c2439dm0.b());
        b02.E(((Nr0) d02.x()).g());
        b02.C(g(c2439dm0.d()));
        return Lp0.b((C4082ss0) b02.x());
    }

    public static void e(C3423mp0 c3423mp0) {
        c3423mp0.i(f15997b);
        c3423mp0.h(f15998c);
        c3423mp0.g(f15999d);
        c3423mp0.f(f16000e);
    }

    private static C2222bm0 f(Ts0 ts0) {
        int ordinal = ts0.ordinal();
        if (ordinal == 1) {
            return C2222bm0.f20929b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C2222bm0.f20931d;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ts0.zza());
            }
        }
        return C2222bm0.f20930c;
    }

    private static Ts0 g(C2222bm0 c2222bm0) {
        if (C2222bm0.f20929b.equals(c2222bm0)) {
            return Ts0.TINK;
        }
        if (C2222bm0.f20930c.equals(c2222bm0)) {
            return Ts0.CRUNCHY;
        }
        if (C2222bm0.f20931d.equals(c2222bm0)) {
            return Ts0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c2222bm0)));
    }
}
