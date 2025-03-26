package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Mw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Mw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private AbstractC3542nu0 zzd;
    private AbstractC3542nu0 zze;
    private AbstractC3542nu0 zzf;

    static {
        Mw0 mw0 = new Mw0();
        zza = mw0;
        Qu0.F(Mw0.class, mw0);
    }

    private Mw0() {
        AbstractC3542nu0 abstractC3542nu0 = AbstractC3542nu0.f25048s;
        this.zzd = abstractC3542nu0;
        this.zze = abstractC3542nu0;
        this.zzf = abstractC3542nu0;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new Mw0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new Lw0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Mw0.class) {
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
