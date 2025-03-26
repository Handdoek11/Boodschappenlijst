package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1654Pe extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C1654Pe zze;
    private static volatile InterfaceC4633xv0 zzf;
    private int zzg;
    private C1515Le zzh;
    private Zu0 zzi = Qu0.v();
    private int zzj;
    private C1371Hd zzk;

    static {
        C1654Pe c1654Pe = new C1654Pe();
        zze = c1654Pe;
        Qu0.F(C1654Pe.class, c1654Pe);
    }

    private C1654Pe() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", C1299Fd.class, "zzj", EnumC1337Ge.c(), "zzk"});
        }
        if (ordinal == 3) {
            return new C1654Pe();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C1619Oe();
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzf;
        if (interfaceC4633xv0 == null) {
            synchronized (C1654Pe.class) {
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
