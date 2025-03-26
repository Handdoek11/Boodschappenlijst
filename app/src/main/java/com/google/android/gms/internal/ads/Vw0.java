package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Vw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Vw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        Vw0 vw0 = new Vw0();
        zza = vw0;
        Qu0.F(Vw0.class, vw0);
    }

    private Vw0() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            Uu0 uu0 = Tw0.f19198a;
            return Qu0.A(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", uu0, "zze", "zzf", uu0});
        }
        if (ordinal == 3) {
            return new Vw0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new Uw0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Vw0.class) {
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
