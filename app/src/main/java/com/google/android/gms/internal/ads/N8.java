package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class N8 extends Qu0 implements InterfaceC3979rv0 {
    private static final N8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private long zzf;
    private long zzh;
    private String zzd = "";
    private String zze = "";
    private String zzg = "D";

    static {
        N8 n8 = new N8();
        zza = n8;
        Qu0.F(N8.class, n8);
    }

    private N8() {
    }

    public static M8 b0() {
        return (M8) zza.q();
    }

    static /* synthetic */ void d0(N8 n8, String str) {
        n8.zzc |= 1;
        n8.zzd = "1.671910402";
    }

    static /* synthetic */ void e0(N8 n8, String str) {
        str.getClass();
        n8.zzc |= 2;
        n8.zze = str;
    }

    static /* synthetic */ void f0(N8 n8, String str) {
        str.getClass();
        n8.zzc |= 8;
        n8.zzg = str;
    }

    static /* synthetic */ void g0(N8 n8, long j8) {
        n8.zzc |= 4;
        n8.zzf = j8;
    }

    static /* synthetic */ void h0(N8 n8, long j8) {
        n8.zzc |= 16;
        n8.zzh = j8;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new N8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new M8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (N8.class) {
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
