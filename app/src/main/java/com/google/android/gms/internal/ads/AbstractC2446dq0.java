package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.dq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2446dq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2228bp0 f21672a = new InterfaceC2228bp0() { // from class: com.google.android.gms.internal.ads.aq0
        @Override // com.google.android.gms.internal.ads.InterfaceC2228bp0
        public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
            return AbstractC2446dq0.b((C2882hq0) abstractC2763gl0, num);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4839zp0 f21673b = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.bq0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            return AbstractC2446dq0.c((Zp0) sk0);
        }
    }, Zp0.class, InterfaceC2990iq0.class);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4839zp0 f21674c = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.cq0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            return AbstractC2446dq0.a((Zp0) sk0);
        }
    }, Zp0.class, InterfaceC2654fl0.class);

    /* renamed from: d, reason: collision with root package name */
    private static final Tk0 f21675d = Ko0.c("type.googleapis.com/google.crypto.tink.AesCmacKey", InterfaceC2654fl0.class, EnumC3429ms0.SYMMETRIC, C2448dr0.h0());

    public static /* synthetic */ InterfaceC2654fl0 a(Zp0 zp0) {
        e(zp0.b());
        return Qt0.a(zp0);
    }

    public static /* synthetic */ Zp0 b(C2882hq0 c2882hq0, Integer num) {
        e(c2882hq0);
        Xp0 xp0 = new Xp0(null);
        xp0.c(c2882hq0);
        xp0.a(Ut0.c(c2882hq0.c()));
        xp0.b(num);
        return xp0.d();
    }

    public static /* synthetic */ InterfaceC2990iq0 c(Zp0 zp0) {
        e(zp0.b());
        return new Sq0(zp0);
    }

    public static void d(boolean z7) {
        if (!AbstractC4183to0.a(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i8 = Qq0.f18551f;
        Qq0.e(C3423mp0.c());
        C2336cp0.b().c(f21672a, C2882hq0.class);
        C3096jp0.a().e(f21673b);
        C3096jp0.a().e(f21674c);
        C2988ip0 b8 = C2988ip0.b();
        HashMap hashMap = new HashMap();
        C2882hq0 c2882hq0 = Lq0.f16895c;
        hashMap.put("AES_CMAC", c2882hq0);
        hashMap.put("AES256_CMAC", c2882hq0);
        C2555eq0 c2555eq0 = new C2555eq0(null);
        c2555eq0.a(32);
        c2555eq0.b(16);
        c2555eq0.c(C2664fq0.f22119e);
        hashMap.put("AES256_CMAC_RAW", c2555eq0.d());
        b8.d(DesugarCollections.unmodifiableMap(hashMap));
        Ao0.c().d(f21675d, true);
    }

    private static void e(C2882hq0 c2882hq0) {
        if (c2882hq0.c() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
