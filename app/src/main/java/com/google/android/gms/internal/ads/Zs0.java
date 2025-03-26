package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Zs0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Zs0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private C2779gt0 zze;
    private AbstractC3542nu0 zzf = AbstractC3542nu0.f25048s;

    static {
        Zs0 zs0 = new Zs0();
        zza = zs0;
        Qu0.F(Zs0.class, zs0);
    }

    private Zs0() {
    }

    public static Xs0 c0() {
        return (Xs0) zza.q();
    }

    public static Zs0 e0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (Zs0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    static /* synthetic */ void i0(Zs0 zs0, C2779gt0 c2779gt0) {
        c2779gt0.getClass();
        zs0.zze = c2779gt0;
        zs0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new Zs0();
        }
        Ys0 ys0 = null;
        if (ordinal == 4) {
            return new Xs0(ys0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Zs0.class) {
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

    public final int b0() {
        return this.zzd;
    }

    public final C2779gt0 f0() {
        C2779gt0 c2779gt0 = this.zze;
        return c2779gt0 == null ? C2779gt0.e0() : c2779gt0;
    }

    public final AbstractC3542nu0 g0() {
        return this.zzf;
    }
}
