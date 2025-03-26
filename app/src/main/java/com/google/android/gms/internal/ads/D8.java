package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class D8 extends Qu0 implements InterfaceC3979rv0 {
    private static final D8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        D8 d8 = new D8();
        zza = d8;
        Qu0.F(D8.class, d8);
    }

    private D8() {
    }

    public static C8 b0() {
        return (C8) zza.q();
    }

    static /* synthetic */ void d0(D8 d8, long j8) {
        d8.zzc |= 32;
        d8.zzi = j8;
    }

    static /* synthetic */ void e0(D8 d8, long j8) {
        d8.zzc |= 4;
        d8.zzf = j8;
    }

    static /* synthetic */ void f0(D8 d8, long j8) {
        d8.zzc |= 1;
        d8.zzd = j8;
    }

    static /* synthetic */ void g0(D8 d8, long j8) {
        d8.zzc |= 8;
        d8.zzg = j8;
    }

    static /* synthetic */ void h0(D8 d8, long j8) {
        d8.zzc |= 16;
        d8.zzh = j8;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new D8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new C8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (D8.class) {
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
