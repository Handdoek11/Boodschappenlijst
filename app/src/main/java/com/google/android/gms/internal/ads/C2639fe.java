package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2639fe extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C2639fe zzf;
    private static volatile InterfaceC4633xv0 zzg;
    private int zzh;
    private int zzi = 1000;
    private C1722Rd zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        C2639fe c2639fe = new C2639fe();
        zzf = c2639fe;
        Qu0.F(C2639fe.class, c2639fe);
    }

    private C2639fe() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", EnumC1337Ge.c(), "zzj", "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new C2639fe();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C2530ee();
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzg;
        if (interfaceC4633xv0 == null) {
            synchronized (C2639fe.class) {
                try {
                    interfaceC4633xv0 = zzg;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzf);
                        zzg = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
