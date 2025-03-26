package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.le, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3291le extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C3291le zzd;
    private static volatile InterfaceC4633xv0 zze;
    private int zzf;
    private int zzg = 1000;
    private C1722Rd zzh;
    private C1371Hd zzi;

    static {
        C3291le c3291le = new C3291le();
        zzd = c3291le;
        Qu0.F(C3291le.class, c3291le);
    }

    private C3291le() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", EnumC1337Ge.c(), "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new C3291le();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C3182ke();
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zze;
        if (interfaceC4633xv0 == null) {
            synchronized (C3291le.class) {
                try {
                    interfaceC4633xv0 = zze;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzd);
                        zze = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
