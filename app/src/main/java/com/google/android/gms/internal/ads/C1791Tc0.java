package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1791Tc0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C1791Tc0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private C1651Pc0 zzg;

    static {
        C1791Tc0 c1791Tc0 = new C1791Tc0();
        zza = c1791Tc0;
        Qu0.F(C1791Tc0.class, c1791Tc0);
    }

    private C1791Tc0() {
    }

    public static C1686Qc0 b0() {
        return (C1686Qc0) zza.q();
    }

    static /* synthetic */ void d0(C1791Tc0 c1791Tc0, String str) {
        str.getClass();
        c1791Tc0.zzc |= 2;
        c1791Tc0.zze = str;
    }

    static /* synthetic */ void e0(C1791Tc0 c1791Tc0, C1651Pc0 c1651Pc0) {
        c1651Pc0.getClass();
        c1791Tc0.zzg = c1651Pc0;
        c1791Tc0.zzc |= 8;
    }

    static /* synthetic */ void f0(C1791Tc0 c1791Tc0, int i8) {
        c1791Tc0.zzd = 1;
        c1791Tc0.zzc = 1 | c1791Tc0.zzc;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", C1721Rc0.f18678a, "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new C1791Tc0();
        }
        AbstractC1756Sc0 abstractC1756Sc0 = null;
        if (ordinal == 4) {
            return new C1686Qc0(abstractC1756Sc0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C1791Tc0.class) {
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
