package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2785gw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C2785gw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        C2785gw0 c2785gw0 = new C2785gw0();
        zza = c2785gw0;
        Qu0.F(C2785gw0.class, c2785gw0);
    }

    private C2785gw0() {
    }

    public static C2567ew0 b0() {
        return (C2567ew0) zza.q();
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new C2785gw0();
        }
        AbstractC3110jw0 abstractC3110jw0 = null;
        if (ordinal == 4) {
            return new C2567ew0(abstractC3110jw0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C2785gw0.class) {
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
