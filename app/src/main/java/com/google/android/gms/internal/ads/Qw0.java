package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Qw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Qw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private AbstractC3542nu0 zze;
    private AbstractC3542nu0 zzf;

    static {
        Qw0 qw0 = new Qw0();
        zza = qw0;
        Qu0.F(Qw0.class, qw0);
    }

    private Qw0() {
        AbstractC3542nu0 abstractC3542nu0 = AbstractC3542nu0.f25048s;
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
            return Qu0.A(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new Qw0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new Pw0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Qw0.class) {
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
