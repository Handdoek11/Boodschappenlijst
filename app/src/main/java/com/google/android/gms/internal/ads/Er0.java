package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Er0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Er0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private Hr0 zzd;
    private int zze;

    static {
        Er0 er0 = new Er0();
        zza = er0;
        Qu0.F(Er0.class, er0);
    }

    private Er0() {
    }

    public static Cr0 c0() {
        return (Cr0) zza.q();
    }

    public static Er0 e0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (Er0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    static /* synthetic */ void h0(Er0 er0, Hr0 hr0) {
        hr0.getClass();
        er0.zzd = hr0;
        er0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new Er0();
        }
        Dr0 dr0 = null;
        if (ordinal == 4) {
            return new Cr0(dr0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Er0.class) {
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
        return this.zze;
    }

    public final Hr0 f0() {
        Hr0 hr0 = this.zzd;
        return hr0 == null ? Hr0.e0() : hr0;
    }
}
