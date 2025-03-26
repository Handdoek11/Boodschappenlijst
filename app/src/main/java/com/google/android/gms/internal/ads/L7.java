package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class L7 extends Qu0 implements InterfaceC3979rv0 {
    private static final L7 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private C2374d8 zzi;
    private C2809h8 zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        L7 l72 = new L7();
        zza = l72;
        Qu0.F(L7.class, l72);
    }

    private L7() {
    }

    public static J7 b0() {
        return (J7) zza.q();
    }

    static /* synthetic */ void g0(L7 l72, boolean z7) {
        l72.zzc |= 8;
        l72.zzg = z7;
    }

    static /* synthetic */ void h0(L7 l72, String str) {
        str.getClass();
        l72.zzc |= 4;
        l72.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", M7.f17232a, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new L7();
        }
        K7 k72 = null;
        if (ordinal == 4) {
            return new J7(k72);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (L7.class) {
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

    public final C2374d8 d0() {
        C2374d8 c2374d8 = this.zzi;
        return c2374d8 == null ? C2374d8.d0() : c2374d8;
    }

    public final C2809h8 e0() {
        C2809h8 c2809h8 = this.zzj;
        return c2809h8 == null ? C2809h8.c0() : c2809h8;
    }

    public final String f0() {
        return this.zzf;
    }

    public final boolean i0() {
        return this.zzg;
    }
}
