package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.xm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4615xm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4839zp0 f27907a = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.vm0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            int i8 = AbstractC4615xm0.f27910d;
            AbstractC2545el0.a(((Cm0) sk0).b().d());
            throw null;
        }
    }, Cm0.class, Ik0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Tk0 f27908b = Ko0.c("type.googleapis.com/google.crypto.tink.KmsAeadKey", Ik0.class, EnumC3429ms0.REMOTE, Js0.g0());

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC2228bp0 f27909c = new InterfaceC2228bp0() { // from class: com.google.android.gms.internal.ads.wm0
        @Override // com.google.android.gms.internal.ads.InterfaceC2228bp0
        public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
            return Cm0.a((Em0) abstractC2763gl0, num);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27910d = 0;

    public static void a(boolean z7) {
        if (!AbstractC4183to0.a(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i8 = Jm0.f16306f;
        Jm0.e(C3423mp0.c());
        C3096jp0.a().e(f27907a);
        C2336cp0.b().c(f27909c, Em0.class);
        Ao0.c().d(f27908b, true);
    }
}
