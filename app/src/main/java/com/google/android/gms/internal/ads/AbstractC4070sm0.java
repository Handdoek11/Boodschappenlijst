package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.sm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4070sm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4839zp0 f26731a = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.qm0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            C3744pm0 c3744pm0 = (C3744pm0) sk0;
            int i8 = AbstractC4070sm0.f26734d;
            return Pn0.e() ? Pn0.b(c3744pm0) : C4302ut0.b(c3744pm0);
        }
    }, C3744pm0.class, Ik0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2228bp0 f26732b = new InterfaceC2228bp0() { // from class: com.google.android.gms.internal.ads.rm0
        @Override // com.google.android.gms.internal.ads.InterfaceC2228bp0
        public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
            int i8 = AbstractC4070sm0.f26734d;
            return C3744pm0.a(((C4288um0) abstractC2763gl0).b(), Ut0.c(32), num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Tk0 f26733c = Ko0.c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", Ik0.class, EnumC3429ms0.SYMMETRIC, Wr0.g0());

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f26734d = 0;

    public static void a(boolean z7) {
        if (!AbstractC4183to0.a(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i8 = Un0.f19467f;
        Un0.e(C3423mp0.c());
        C3096jp0.a().e(f26731a);
        C2336cp0.b().c(f26732b, C4288um0.class);
        C2988ip0 b8 = C2988ip0.b();
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", C4288um0.c(C4179tm0.f26922b));
        hashMap.put("CHACHA20_POLY1305_RAW", C4288um0.c(C4179tm0.f26924d));
        b8.d(DesugarCollections.unmodifiableMap(hashMap));
        Ao0.c().d(f26733c, true);
    }
}
