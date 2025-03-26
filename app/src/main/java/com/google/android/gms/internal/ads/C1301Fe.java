package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1301Fe extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final C1301Fe zze;
    private static volatile InterfaceC4633xv0 zzf;
    private int zzg;
    private int zzh;
    private C1443Jd zzi;
    private String zzj = "";
    private String zzk = "";

    static {
        C1301Fe c1301Fe = new C1301Fe();
        zze = c1301Fe;
        Qu0.F(C1301Fe.class, c1301Fe);
    }

    private C1301Fe() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zze, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", EnumC1229De.c(), "zzi", "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new C1301Fe();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C1193Ce();
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzf;
        if (interfaceC4633xv0 == null) {
            synchronized (C1301Fe.class) {
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
