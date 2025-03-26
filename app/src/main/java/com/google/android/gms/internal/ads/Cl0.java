package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class Cl0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4839zp0 f14220a = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.zl0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            return C4411vt0.b((C4722yl0) sk0);
        }
    }, C4722yl0.class, Ik0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Tk0 f14221b = Ko0.c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", Ik0.class, EnumC3429ms0.SYMMETRIC, C3427mr0.h0());

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC2444dp0 f14222c = new InterfaceC2444dp0() { // from class: com.google.android.gms.internal.ads.Al0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC2228bp0 f14223d = new InterfaceC2228bp0() { // from class: com.google.android.gms.internal.ads.Bl0
        @Override // com.google.android.gms.internal.ads.InterfaceC2228bp0
        public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
            Hl0 hl0 = (Hl0) abstractC2763gl0;
            int i8 = Cl0.f14225f;
            if (hl0.b() != 16 && hl0.b() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            C4395vl0 c4395vl0 = new C4395vl0(null);
            c4395vl0.d(hl0);
            c4395vl0.c(num);
            c4395vl0.a(Ut0.c(hl0.b()));
            c4395vl0.b(Ut0.c(hl0.c()));
            return c4395vl0.e();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final int f14224e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f14225f = 0;

    public static void a(boolean z7) {
        int i8 = f14224e;
        if (!AbstractC4183to0.a(i8)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i9 = AbstractC4399vn0.f27350f;
        AbstractC4399vn0.e(C3423mp0.c());
        C3096jp0.a().e(f14220a);
        C2988ip0 b8 = C2988ip0.b();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", AbstractC2441dn0.f21665e);
        Dl0 dl0 = new Dl0(null);
        dl0.a(16);
        dl0.c(32);
        dl0.e(16);
        dl0.d(16);
        El0 el0 = El0.f14772d;
        dl0.b(el0);
        Fl0 fl0 = Fl0.f15196d;
        dl0.f(fl0);
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", dl0.g());
        hashMap.put("AES256_CTR_HMAC_SHA256", AbstractC2441dn0.f21666f);
        Dl0 dl02 = new Dl0(null);
        dl02.a(32);
        dl02.c(32);
        dl02.e(32);
        dl02.d(16);
        dl02.b(el0);
        dl02.f(fl0);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", dl02.g());
        b8.d(DesugarCollections.unmodifiableMap(hashMap));
        C2553ep0.a().b(f14222c, Hl0.class);
        C2336cp0.b().c(f14223d, Hl0.class);
        Ao0.c().f(f14221b, i8, true);
    }
}
