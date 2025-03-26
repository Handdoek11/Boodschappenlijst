package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2336cp0 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2228bp0 f21289b = new InterfaceC2228bp0() { // from class: com.google.android.gms.internal.ads.ap0
        @Override // com.google.android.gms.internal.ads.InterfaceC2228bp0
        public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
            int i8 = C2336cp0.f21291d;
            C4082ss0 c8 = ((No0) abstractC2763gl0).b().c();
            Tk0 b8 = Ao0.c().b(c8.h0());
            if (!Ao0.c().e(c8.h0())) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            C3647os0 a8 = b8.a(c8.g0());
            return new Mo0(Kp0.a(a8.g0(), a8.f0(), a8.c0(), c8.f0(), num), Rk0.a());
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final C2336cp0 f21290c = e();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f21291d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f21292a = new HashMap();

    public static C2336cp0 b() {
        return f21290c;
    }

    private final synchronized Sk0 d(AbstractC2763gl0 abstractC2763gl0, Integer num) {
        InterfaceC2228bp0 interfaceC2228bp0;
        interfaceC2228bp0 = (InterfaceC2228bp0) this.f21292a.get(abstractC2763gl0.getClass());
        if (interfaceC2228bp0 == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + abstractC2763gl0.toString() + ": no key creator for this class was registered.");
        }
        return interfaceC2228bp0.a(abstractC2763gl0, num);
    }

    private static C2336cp0 e() {
        C2336cp0 c2336cp0 = new C2336cp0();
        try {
            c2336cp0.c(f21289b, No0.class);
            return c2336cp0;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException("unexpected error.", e8);
        }
    }

    public final Sk0 a(AbstractC2763gl0 abstractC2763gl0, Integer num) {
        return d(abstractC2763gl0, num);
    }

    public final synchronized void c(InterfaceC2228bp0 interfaceC2228bp0, Class cls) {
        try {
            InterfaceC2228bp0 interfaceC2228bp02 = (InterfaceC2228bp0) this.f21292a.get(cls);
            if (interfaceC2228bp02 != null && !interfaceC2228bp02.equals(interfaceC2228bp0)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.f21292a.put(cls, interfaceC2228bp0);
        } catch (Throwable th) {
            throw th;
        }
    }
}
