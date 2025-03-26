package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Ww0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Ww0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private Vw0 zze;
    private Vw0 zzf;

    static {
        Ww0 ww0 = new Ww0();
        zza = ww0;
        Qu0.F(Ww0.class, ww0);
    }

    private Ww0() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", Tw0.f19198a, "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new Ww0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new Sw0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Ww0.class) {
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
