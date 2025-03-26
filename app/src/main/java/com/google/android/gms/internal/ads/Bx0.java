package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Bx0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Bx0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private Vu0 zzf = Qu0.r();
    private Zu0 zzh = Qu0.v();
    private AbstractC3542nu0 zzi = AbstractC3542nu0.f25048s;

    static {
        Bx0 bx0 = new Bx0();
        zza = bx0;
        Qu0.F(Bx0.class, bx0);
    }

    private Bx0() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", C4855zx0.class, "zzi"});
        }
        if (ordinal == 3) {
            return new Bx0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new Ax0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Bx0.class) {
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
