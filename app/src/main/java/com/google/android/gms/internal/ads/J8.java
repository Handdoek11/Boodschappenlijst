package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class J8 extends Qu0 implements InterfaceC3979rv0 {
    private static final J8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private AbstractC3542nu0 zzd;
    private AbstractC3542nu0 zze;
    private AbstractC3542nu0 zzf;
    private AbstractC3542nu0 zzg;

    static {
        J8 j8 = new J8();
        zza = j8;
        Qu0.F(J8.class, j8);
    }

    private J8() {
        AbstractC3542nu0 abstractC3542nu0 = AbstractC3542nu0.f25048s;
        this.zzd = abstractC3542nu0;
        this.zze = abstractC3542nu0;
        this.zzf = abstractC3542nu0;
        this.zzg = abstractC3542nu0;
    }

    public static I8 b0() {
        return (I8) zza.q();
    }

    public static J8 d0(byte[] bArr, Eu0 eu0) {
        return (J8) Qu0.Q(zza, bArr, eu0);
    }

    static /* synthetic */ void i0(J8 j8, AbstractC3542nu0 abstractC3542nu0) {
        j8.zzc |= 1;
        j8.zzd = abstractC3542nu0;
    }

    static /* synthetic */ void j0(J8 j8, AbstractC3542nu0 abstractC3542nu0) {
        j8.zzc |= 2;
        j8.zze = abstractC3542nu0;
    }

    static /* synthetic */ void k0(J8 j8, AbstractC3542nu0 abstractC3542nu0) {
        j8.zzc |= 8;
        j8.zzg = abstractC3542nu0;
    }

    static /* synthetic */ void l0(J8 j8, AbstractC3542nu0 abstractC3542nu0) {
        j8.zzc |= 4;
        j8.zzf = abstractC3542nu0;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new J8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new I8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (J8.class) {
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

    public final AbstractC3542nu0 e0() {
        return this.zzd;
    }

    public final AbstractC3542nu0 f0() {
        return this.zze;
    }

    public final AbstractC3542nu0 g0() {
        return this.zzg;
    }

    public final AbstractC3542nu0 h0() {
        return this.zzf;
    }
}
