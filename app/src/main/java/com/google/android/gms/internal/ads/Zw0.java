package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Zw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Zw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        Zw0 zw0 = new Zw0();
        zza = zw0;
        Qu0.F(Zw0.class, zw0);
    }

    private Zw0() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzc", "zzd", Yw0.f20353a, "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new Zw0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new Xw0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Zw0.class) {
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
