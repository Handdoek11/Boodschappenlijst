package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3394mb extends Qu0 implements InterfaceC3979rv0 {
    private static final C3394mb zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        C3394mb c3394mb = new C3394mb();
        zza = c3394mb;
        Qu0.F(C3394mb.class, c3394mb);
    }

    private C3394mb() {
    }

    public static C3176kb e0() {
        return (C3176kb) zza.q();
    }

    public static C3394mb g0() {
        return zza;
    }

    public static C3394mb h0(AbstractC3542nu0 abstractC3542nu0) {
        return (C3394mb) Qu0.L(zza, abstractC3542nu0);
    }

    public static C3394mb i0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (C3394mb) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    static /* synthetic */ void l0(C3394mb c3394mb, String str) {
        str.getClass();
        c3394mb.zzc |= 2;
        c3394mb.zze = str;
    }

    static /* synthetic */ void m0(C3394mb c3394mb, long j8) {
        c3394mb.zzc |= 8;
        c3394mb.zzg = j8;
    }

    static /* synthetic */ void n0(C3394mb c3394mb, long j8) {
        c3394mb.zzc |= 4;
        c3394mb.zzf = j8;
    }

    static /* synthetic */ void o0(C3394mb c3394mb, long j8) {
        c3394mb.zzc |= 16;
        c3394mb.zzh = j8;
    }

    static /* synthetic */ void p0(C3394mb c3394mb, String str) {
        str.getClass();
        c3394mb.zzc |= 1;
        c3394mb.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new C3394mb();
        }
        AbstractC3285lb abstractC3285lb = null;
        if (ordinal == 4) {
            return new C3176kb(abstractC3285lb);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3394mb.class) {
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

    public final long b0() {
        return this.zzg;
    }

    public final long c0() {
        return this.zzf;
    }

    public final long d0() {
        return this.zzh;
    }

    public final String j0() {
        return this.zze;
    }

    public final String k0() {
        return this.zzd;
    }
}
