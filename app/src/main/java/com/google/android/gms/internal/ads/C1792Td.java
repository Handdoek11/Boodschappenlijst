package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Td, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1792Td extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C1792Td zze;
    private static volatile InterfaceC4633xv0 zzf;
    private int zzg;
    private C1443Jd zzh;
    private int zzi = 1000;
    private C1722Rd zzj;
    private C1371Hd zzk;

    static {
        C1792Td c1792Td = new C1792Td();
        zze = c1792Td;
        Qu0.F(C1792Td.class, c1792Td);
    }

    private C1792Td() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", EnumC1337Ge.c(), "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new C1792Td();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C1757Sd();
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzf;
        if (interfaceC4633xv0 == null) {
            synchronized (C1792Td.class) {
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
