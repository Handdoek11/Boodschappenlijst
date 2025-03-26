package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class U7 extends Qu0 implements InterfaceC3979rv0 {
    private static final U7 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private W7 zzd;
    private Z7 zze;

    static {
        U7 u7 = new U7();
        zza = u7;
        Qu0.F(U7.class, u7);
    }

    private U7() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new U7();
        }
        AbstractC2048a8 abstractC2048a8 = null;
        if (ordinal == 4) {
            return new T7(abstractC2048a8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (U7.class) {
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
