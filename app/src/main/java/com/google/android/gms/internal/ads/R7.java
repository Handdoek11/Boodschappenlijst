package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class R7 extends Qu0 implements InterfaceC3979rv0 {
    private static final R7 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private Zu0 zzo = Qu0.v();

    static {
        R7 r72 = new R7();
        zza = r72;
        Qu0.F(R7.class, r72);
    }

    private R7() {
    }

    public static N7 b0() {
        return (N7) zza.q();
    }

    static /* synthetic */ void d0(R7 r72, String str) {
        str.getClass();
        r72.zzc |= 1;
        r72.zzd = str;
    }

    static /* synthetic */ void e0(R7 r72, String str) {
        r72.zzc |= 16;
        r72.zzh = str;
    }

    static /* synthetic */ void f0(R7 r72, String str) {
        r72.zzc |= 1024;
        r72.zzn = str;
    }

    static /* synthetic */ void g0(R7 r72, String str) {
        str.getClass();
        r72.zzc |= 8;
        r72.zzg = str;
    }

    static /* synthetic */ void h0(R7 r72, long j8) {
        r72.zzc |= 2;
        r72.zze = j8;
    }

    static /* synthetic */ void i0(R7 r72, String str) {
        str.getClass();
        r72.zzc |= 4;
        r72.zzf = str;
    }

    static /* synthetic */ void j0(R7 r72, int i8) {
        r72.zzp = i8 - 1;
        r72.zzc |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", P7.class, "zzp", Q7.f18377a});
        }
        if (ordinal == 3) {
            return new R7();
        }
        S7 s72 = null;
        if (ordinal == 4) {
            return new N7(s72);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (R7.class) {
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
