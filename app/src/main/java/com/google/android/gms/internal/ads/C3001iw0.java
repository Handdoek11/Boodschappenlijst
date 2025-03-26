package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3001iw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C3001iw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private Zu0 zzc = Qu0.v();

    static {
        C3001iw0 c3001iw0 = new C3001iw0();
        zza = c3001iw0;
        Qu0.F(C3001iw0.class, c3001iw0);
    }

    private C3001iw0() {
    }

    public static C2894hw0 b0() {
        return (C2894hw0) zza.q();
    }

    static /* synthetic */ void d0(C3001iw0 c3001iw0, C2785gw0 c2785gw0) {
        c2785gw0.getClass();
        Zu0 zu0 = c3001iw0.zzc;
        if (!zu0.a()) {
            c3001iw0.zzc = Qu0.w(zu0);
        }
        c3001iw0.zzc.add(c2785gw0);
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C2785gw0.class});
        }
        if (ordinal == 3) {
            return new C3001iw0();
        }
        AbstractC3110jw0 abstractC3110jw0 = null;
        if (ordinal == 4) {
            return new C2894hw0(abstractC3110jw0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3001iw0.class) {
                try {
                    interfaceC4633xv0 = zzb;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zza);
                        zzb = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
