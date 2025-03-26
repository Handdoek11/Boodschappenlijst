package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class Bm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Tk0 f13852a = Ko0.c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", Ik0.class, EnumC3429ms0.SYMMETRIC, Ps0.g0());

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2228bp0 f13853b = new InterfaceC2228bp0() { // from class: com.google.android.gms.internal.ads.zm0
        @Override // com.google.android.gms.internal.ads.InterfaceC2228bp0
        public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
            return Km0.a((Pm0) abstractC2763gl0, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4839zp0 f13854c = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.Am0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            Km0 km0 = (Km0) sk0;
            int i8 = Bm0.f13855d;
            String d8 = km0.b().d();
            km0.b().b();
            AbstractC2545el0.a(d8);
            throw null;
        }
    }, Km0.class, Ik0.class);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f13855d = 0;

    public static void a(boolean z7) {
        if (!AbstractC4183to0.a(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i8 = Um0.f19461f;
        Um0.e(C3423mp0.c());
        C2336cp0.b().c(f13853b, Pm0.class);
        C3096jp0.a().e(f13854c);
        Ao0.c().d(f13852a, true);
    }
}
