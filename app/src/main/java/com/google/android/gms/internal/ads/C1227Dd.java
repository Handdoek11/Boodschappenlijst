package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1227Dd extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C1227Dd zzc;
    private static volatile InterfaceC4633xv0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C1227Dd c1227Dd = new C1227Dd();
        zzc = c1227Dd;
        Qu0.F(C1227Dd.class, c1227Dd);
    }

    private C1227Dd() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new C1227Dd();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C1191Cd();
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzd;
        if (interfaceC4633xv0 == null) {
            synchronized (C1227Dd.class) {
                try {
                    interfaceC4633xv0 = zzd;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzc);
                        zzd = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
