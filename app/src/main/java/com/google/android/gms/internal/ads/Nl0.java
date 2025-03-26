package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class Nl0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4839zp0 f17584a = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.Ll0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            return C3975rt0.b((Kl0) sk0);
        }
    }, Kl0.class, Ik0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Tk0 f17585b = Ko0.c("type.googleapis.com/google.crypto.tink.AesEaxKey", Ik0.class, EnumC3429ms0.SYMMETRIC, Br0.h0());

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC2228bp0 f17586c = new InterfaceC2228bp0() { // from class: com.google.android.gms.internal.ads.Ml0
        @Override // com.google.android.gms.internal.ads.InterfaceC2228bp0
        public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
            Rl0 rl0 = (Rl0) abstractC2763gl0;
            int i8 = Nl0.f17587d;
            if (rl0.c() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            Il0 il0 = new Il0(null);
            il0.c(rl0);
            il0.a(num);
            il0.b(Ut0.c(rl0.c()));
            return il0.d();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f17587d = 0;

    public static void a(boolean z7) {
        if (!AbstractC4183to0.a(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i8 = Bn0.f13861f;
        Bn0.e(C3423mp0.c());
        C3096jp0.a().e(f17584a);
        C2988ip0 b8 = C2988ip0.b();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", AbstractC2441dn0.f21663c);
        Ol0 ol0 = new Ol0(null);
        ol0.a(16);
        ol0.b(16);
        ol0.c(16);
        Pl0 pl0 = Pl0.f18260d;
        ol0.d(pl0);
        hashMap.put("AES128_EAX_RAW", ol0.e());
        hashMap.put("AES256_EAX", AbstractC2441dn0.f21664d);
        Ol0 ol02 = new Ol0(null);
        ol02.a(16);
        ol02.b(32);
        ol02.c(16);
        ol02.d(pl0);
        hashMap.put("AES256_EAX_RAW", ol02.e());
        b8.d(DesugarCollections.unmodifiableMap(hashMap));
        C2336cp0.b().c(f17586c, Rl0.class);
        Ao0.c().d(f17585b, true);
    }
}
