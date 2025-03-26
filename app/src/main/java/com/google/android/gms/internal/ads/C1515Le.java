package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Le, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1515Le extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C1515Le zze;
    private static volatile InterfaceC4633xv0 zzf;
    private int zzg;
    private int zzi;
    private C1371Hd zzk;
    private String zzh = "";
    private Vu0 zzj = Qu0.r();

    static {
        C1515Le c1515Le = new C1515Le();
        zze = c1515Le;
        Qu0.F(C1515Le.class, c1515Le);
    }

    private C1515Le() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", EnumC1337Ge.c(), "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new C1515Le();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C1480Ke();
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzf;
        if (interfaceC4633xv0 == null) {
            synchronized (C1515Le.class) {
                try {
                    interfaceC4633xv0 = zzf;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zze);
                        zzf = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
