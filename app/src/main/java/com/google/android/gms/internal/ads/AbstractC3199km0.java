package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.ads.km0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3199km0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4839zp0 f24085a = AbstractC4839zp0.b(new InterfaceC4621xp0() { // from class: com.google.android.gms.internal.ads.hm0
        @Override // com.google.android.gms.internal.ads.InterfaceC4621xp0
        public final Object a(Sk0 sk0) {
            return C4074so0.b((C2765gm0) sk0);
        }
    }, C2765gm0.class, Ik0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2228bp0 f24086b = new InterfaceC2228bp0() { // from class: com.google.android.gms.internal.ads.im0
        @Override // com.google.android.gms.internal.ads.InterfaceC2228bp0
        public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
            C3635om0 c3635om0 = (C3635om0) abstractC2763gl0;
            C2547em0 c2547em0 = new C2547em0(null);
            c2547em0.c(c3635om0);
            c2547em0.a(num);
            c2547em0.b(Ut0.c(c3635om0.b()));
            return c2547em0.d();
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC2444dp0 f24087c = new InterfaceC2444dp0() { // from class: com.google.android.gms.internal.ads.jm0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Tk0 f24088d = Ko0.c("type.googleapis.com/google.crypto.tink.AesGcmSivKey", Ik0.class, EnumC3429ms0.SYMMETRIC, Qr0.g0());

    public static void a(boolean z7) {
        if (!AbstractC4183to0.a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i8 = Nn0.f17601f;
        Nn0.e(C3423mp0.c());
        if (b()) {
            C3096jp0.a().e(f24085a);
            C2988ip0 b8 = C2988ip0.b();
            HashMap hashMap = new HashMap();
            C3308lm0 c3308lm0 = new C3308lm0(null);
            c3308lm0.a(16);
            C3417mm0 c3417mm0 = C3417mm0.f24563b;
            c3308lm0.b(c3417mm0);
            hashMap.put("AES128_GCM_SIV", c3308lm0.c());
            C3308lm0 c3308lm02 = new C3308lm0(null);
            c3308lm02.a(16);
            C3417mm0 c3417mm02 = C3417mm0.f24565d;
            c3308lm02.b(c3417mm02);
            hashMap.put("AES128_GCM_SIV_RAW", c3308lm02.c());
            C3308lm0 c3308lm03 = new C3308lm0(null);
            c3308lm03.a(32);
            c3308lm03.b(c3417mm0);
            hashMap.put("AES256_GCM_SIV", c3308lm03.c());
            C3308lm0 c3308lm04 = new C3308lm0(null);
            c3308lm04.a(32);
            c3308lm04.b(c3417mm02);
            hashMap.put("AES256_GCM_SIV_RAW", c3308lm04.c());
            b8.d(DesugarCollections.unmodifiableMap(hashMap));
            C2553ep0.a().b(f24087c, C3635om0.class);
            C2336cp0.b().c(f24086b, C3635om0.class);
            Ao0.c().d(f24088d, true);
        }
    }

    private static boolean b() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
