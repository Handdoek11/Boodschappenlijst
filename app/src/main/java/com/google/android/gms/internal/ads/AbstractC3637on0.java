package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.on0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3637on0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4839zp0 f25269a = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.ln0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            C3201kn0 c3201kn0 = (C3201kn0) sk0;
            int i8 = AbstractC3637on0.f25273e;
            return C3312lo0.c() ? C3312lo0.b(c3201kn0) : St0.b(c3201kn0);
        }
    }, C3201kn0.class, Ik0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Tk0 f25270b = Ko0.c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", Ik0.class, EnumC3429ms0.SYMMETRIC, C3104jt0.g0());

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC2444dp0 f25271c = new InterfaceC2444dp0() { // from class: com.google.android.gms.internal.ads.mn0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC2228bp0 f25272d = new InterfaceC2228bp0() { // from class: com.google.android.gms.internal.ads.nn0
        @Override // com.google.android.gms.internal.ads.InterfaceC2228bp0
        public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
            int i8 = AbstractC3637on0.f25273e;
            return C3201kn0.a(((C3855qn0) abstractC2763gl0).b(), Ut0.c(32), num);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25273e = 0;

    public static void a(boolean z7) {
        if (!AbstractC4183to0.a(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i8 = AbstractC3857qo0.f25996f;
        AbstractC3857qo0.e(C3423mp0.c());
        C3096jp0.a().e(f25269a);
        C2988ip0 b8 = C2988ip0.b();
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", C3855qn0.c(C3746pn0.f25509b));
        hashMap.put("XCHACHA20_POLY1305_RAW", C3855qn0.c(C3746pn0.f25511d));
        b8.d(DesugarCollections.unmodifiableMap(hashMap));
        C2336cp0.b().c(f25272d, C3855qn0.class);
        C2553ep0.a().b(f25271c, C3855qn0.class);
        Ao0.c().d(f25270b, true);
    }
}
