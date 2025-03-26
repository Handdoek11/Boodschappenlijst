package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.px0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3766px0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C3766px0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C3766px0 c3766px0 = new C3766px0();
        zza = c3766px0;
        Qu0.F(C3766px0.class, c3766px0);
    }

    private C3766px0() {
    }

    public static C3657ox0 b0() {
        return (C3657ox0) zza.q();
    }

    static /* synthetic */ void d0(C3766px0 c3766px0, String str) {
        c3766px0.zzc |= 1;
        c3766px0.zzd = str;
    }

    static /* synthetic */ void e0(C3766px0 c3766px0, long j8) {
        c3766px0.zzc |= 2;
        c3766px0.zze = j8;
    }

    static /* synthetic */ void f0(C3766px0 c3766px0, boolean z7) {
        c3766px0.zzc |= 4;
        c3766px0.zzf = z7;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", C3875qx0.f26031a, "zzh", "zzi", "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new C3766px0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new C3657ox0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3766px0.class) {
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
