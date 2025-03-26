package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class Zl0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4839zp0 f20539a = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.Vl0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            return C4084st0.b((Ul0) sk0);
        }
    }, Ul0.class, Ik0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Tk0 f20540b = Ko0.c("type.googleapis.com/google.crypto.tink.AesGcmKey", Ik0.class, EnumC3429ms0.SYMMETRIC, Kr0.g0());

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC2444dp0 f20541c = new InterfaceC2444dp0() { // from class: com.google.android.gms.internal.ads.Wl0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC2228bp0 f20542d = new InterfaceC2228bp0() { // from class: com.google.android.gms.internal.ads.Yl0
        @Override // com.google.android.gms.internal.ads.InterfaceC2228bp0
        public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
            C2439dm0 c2439dm0 = (C2439dm0) abstractC2763gl0;
            int i8 = Zl0.f20544f;
            if (c2439dm0.b() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            Sl0 sl0 = new Sl0(null);
            sl0.c(c2439dm0);
            sl0.a(num);
            sl0.b(Ut0.c(c2439dm0.b()));
            return sl0.d();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final int f20543e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f20544f = 0;

    public static void a(boolean z7) {
        int i8 = f20543e;
        if (!AbstractC4183to0.a(i8)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i9 = In0.f16001f;
        In0.e(C3423mp0.c());
        C3096jp0.a().e(f20539a);
        C2988ip0 b8 = C2988ip0.b();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", AbstractC2441dn0.f21661a);
        C2113am0 c2113am0 = new C2113am0(null);
        c2113am0.a(12);
        c2113am0.b(16);
        c2113am0.c(16);
        C2222bm0 c2222bm0 = C2222bm0.f20931d;
        c2113am0.d(c2222bm0);
        hashMap.put("AES128_GCM_RAW", c2113am0.e());
        hashMap.put("AES256_GCM", AbstractC2441dn0.f21662b);
        C2113am0 c2113am02 = new C2113am0(null);
        c2113am02.a(12);
        c2113am02.b(32);
        c2113am02.c(16);
        c2113am02.d(c2222bm0);
        hashMap.put("AES256_GCM_RAW", c2113am02.e());
        b8.d(DesugarCollections.unmodifiableMap(hashMap));
        C2553ep0.a().b(f20541c, C2439dm0.class);
        C2336cp0.b().c(f20542d, C2439dm0.class);
        Ao0.c().f(f20540b, i8, true);
    }
}
