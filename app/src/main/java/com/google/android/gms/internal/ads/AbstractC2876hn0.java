package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.hn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2876hn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2228bp0 f22622a = new InterfaceC2228bp0() { // from class: com.google.android.gms.internal.ads.fn0
        @Override // com.google.android.gms.internal.ads.InterfaceC2228bp0
        public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
            return C2549en0.a((C3092jn0) abstractC2763gl0, Ut0.c(32), num);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4839zp0 f22623b = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.gn0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            return C2660fo0.b((C2549en0) sk0);
        }
    }, C2549en0.class, Ik0.class);

    public static void a(boolean z7) {
        int i8 = AbstractC3203ko0.f24098f;
        AbstractC3203ko0.e(C3423mp0.c());
        C2988ip0 b8 = C2988ip0.b();
        HashMap hashMap = new HashMap();
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", AbstractC2441dn0.f21667g);
        b8.d(DesugarCollections.unmodifiableMap(hashMap));
        C3096jp0.a().e(f22623b);
        C2336cp0.b().c(f22622a, C3092jn0.class);
    }
}
