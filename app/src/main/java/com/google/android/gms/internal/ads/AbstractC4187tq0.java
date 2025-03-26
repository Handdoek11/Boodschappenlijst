package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.tq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4187tq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4839zp0 f26934a = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.pq0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            return new Tq0((C3643oq0) sk0);
        }
    }, C3643oq0.class, InterfaceC2990iq0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4839zp0 f26935b = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.qq0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            return Qt0.b((C3643oq0) sk0);
        }
    }, C3643oq0.class, InterfaceC2654fl0.class);

    /* renamed from: c, reason: collision with root package name */
    private static final Tk0 f26936c = Ko0.c("type.googleapis.com/google.crypto.tink.HmacKey", InterfaceC2654fl0.class, EnumC3429ms0.SYMMETRIC, C2559es0.i0());

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC2444dp0 f26937d = new InterfaceC2444dp0() { // from class: com.google.android.gms.internal.ads.rq0
    };

    /* renamed from: e, reason: collision with root package name */
    private static final InterfaceC2228bp0 f26938e = new InterfaceC2228bp0() { // from class: com.google.android.gms.internal.ads.sq0
        @Override // com.google.android.gms.internal.ads.InterfaceC2228bp0
        public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
            C4732yq0 c4732yq0 = (C4732yq0) abstractC2763gl0;
            C3425mq0 c3425mq0 = new C3425mq0(null);
            c3425mq0.c(c4732yq0);
            c3425mq0.b(Ut0.c(c4732yq0.c()));
            c3425mq0.a(num);
            return c3425mq0.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final int f26939f = 2;

    public static void a(boolean z7) {
        int i8 = f26939f;
        if (!AbstractC4183to0.a(i8)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i9 = Yq0.f20339h;
        Yq0.e(C3423mp0.c());
        C3096jp0.a().e(f26934a);
        C3096jp0.a().e(f26935b);
        C2988ip0 b8 = C2988ip0.b();
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", Lq0.f16893a);
        C4296uq0 c4296uq0 = new C4296uq0(null);
        c4296uq0.b(32);
        c4296uq0.c(16);
        C4514wq0 c4514wq0 = C4514wq0.f27561e;
        c4296uq0.d(c4514wq0);
        C4405vq0 c4405vq0 = C4405vq0.f27371d;
        c4296uq0.a(c4405vq0);
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", c4296uq0.e());
        C4296uq0 c4296uq02 = new C4296uq0(null);
        c4296uq02.b(32);
        c4296uq02.c(32);
        C4514wq0 c4514wq02 = C4514wq0.f27558b;
        c4296uq02.d(c4514wq02);
        c4296uq02.a(c4405vq0);
        hashMap.put("HMAC_SHA256_256BITTAG", c4296uq02.e());
        C4296uq0 c4296uq03 = new C4296uq0(null);
        c4296uq03.b(32);
        c4296uq03.c(32);
        c4296uq03.d(c4514wq0);
        c4296uq03.a(c4405vq0);
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", c4296uq03.e());
        C4296uq0 c4296uq04 = new C4296uq0(null);
        c4296uq04.b(64);
        c4296uq04.c(16);
        c4296uq04.d(c4514wq02);
        C4405vq0 c4405vq02 = C4405vq0.f27373f;
        c4296uq04.a(c4405vq02);
        hashMap.put("HMAC_SHA512_128BITTAG", c4296uq04.e());
        C4296uq0 c4296uq05 = new C4296uq0(null);
        c4296uq05.b(64);
        c4296uq05.c(16);
        c4296uq05.d(c4514wq0);
        c4296uq05.a(c4405vq02);
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", c4296uq05.e());
        C4296uq0 c4296uq06 = new C4296uq0(null);
        c4296uq06.b(64);
        c4296uq06.c(32);
        c4296uq06.d(c4514wq02);
        c4296uq06.a(c4405vq02);
        hashMap.put("HMAC_SHA512_256BITTAG", c4296uq06.e());
        C4296uq0 c4296uq07 = new C4296uq0(null);
        c4296uq07.b(64);
        c4296uq07.c(32);
        c4296uq07.d(c4514wq0);
        c4296uq07.a(c4405vq02);
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", c4296uq07.e());
        hashMap.put("HMAC_SHA512_512BITTAG", Lq0.f16894b);
        C4296uq0 c4296uq08 = new C4296uq0(null);
        c4296uq08.b(64);
        c4296uq08.c(64);
        c4296uq08.d(c4514wq0);
        c4296uq08.a(c4405vq02);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", c4296uq08.e());
        b8.d(DesugarCollections.unmodifiableMap(hashMap));
        C2336cp0.b().c(f26938e, C4732yq0.class);
        C2553ep0.a().b(f26937d, C4732yq0.class);
        Ao0.c().f(f26936c, i8, true);
    }
}
