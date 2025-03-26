package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Br0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Br0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private Hr0 zze;
    private AbstractC3542nu0 zzf = AbstractC3542nu0.f25048s;

    static {
        Br0 br0 = new Br0();
        zza = br0;
        Qu0.F(Br0.class, br0);
    }

    private Br0() {
    }

    public static C4843zr0 c0() {
        return (C4843zr0) zza.q();
    }

    public static Br0 e0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (Br0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    public static InterfaceC4633xv0 h0() {
        return zza.x();
    }

    static /* synthetic */ void j0(Br0 br0, Hr0 hr0) {
        hr0.getClass();
        br0.zze = hr0;
        br0.zzc |= 1;
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
            return new Br0();
        }
        Ar0 ar0 = null;
        if (ordinal == 4) {
            return new C4843zr0(ar0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Br0.class) {
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

    public final Hr0 f0() {
        Hr0 hr0 = this.zze;
        return hr0 == null ? Hr0.e0() : hr0;
    }

    public final AbstractC3542nu0 g0() {
        return this.zzf;
    }
}
