package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Ps0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Ps0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private Ss0 zze;

    static {
        Ps0 ps0 = new Ps0();
        zza = ps0;
        Qu0.F(Ps0.class, ps0);
    }

    private Ps0() {
    }

    public static Ns0 c0() {
        return (Ns0) zza.q();
    }

    public static Ps0 e0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (Ps0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    public static InterfaceC4633xv0 g0() {
        return zza.x();
    }

    static /* synthetic */ void h0(Ps0 ps0, Ss0 ss0) {
        ss0.getClass();
        ps0.zze = ss0;
        ps0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new Ps0();
        }
        Os0 os0 = null;
        if (ordinal == 4) {
            return new Ns0(os0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Ps0.class) {
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

    public final Ss0 f0() {
        Ss0 ss0 = this.zze;
        return ss0 == null ? Ss0.e0() : ss0;
    }
}
