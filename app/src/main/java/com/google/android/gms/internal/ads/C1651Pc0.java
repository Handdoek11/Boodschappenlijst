package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1651Pc0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C1651Pc0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private Vu0 zzd = Qu0.r();
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        C1651Pc0 c1651Pc0 = new C1651Pc0();
        zza = c1651Pc0;
        Qu0.F(C1651Pc0.class, c1651Pc0);
    }

    private C1651Pc0() {
    }

    public static C1581Nc0 b0() {
        return (C1581Nc0) zza.q();
    }

    static /* synthetic */ void d0(C1651Pc0 c1651Pc0, String str) {
        str.getClass();
        c1651Pc0.zzc |= 1;
        c1651Pc0.zze = str;
    }

    static /* synthetic */ void e0(C1651Pc0 c1651Pc0, int i8) {
        Vu0 vu0 = c1651Pc0.zzd;
        if (!vu0.a()) {
            c1651Pc0.zzd = Qu0.s(vu0);
        }
        c1651Pc0.zzd.K(2);
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", C1546Mc0.f17375a, "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new C1651Pc0();
        }
        AbstractC1616Oc0 abstractC1616Oc0 = null;
        if (ordinal == 4) {
            return new C1581Nc0(abstractC1616Oc0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C1651Pc0.class) {
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
