package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.je, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3073je extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final C3073je zzg;
    private static volatile InterfaceC4633xv0 zzh;
    private int zzi;
    private int zzj = 1000;
    private C1722Rd zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;

    static {
        C3073je c3073je = new C3073je();
        zzg = c3073je;
        Qu0.F(C3073je.class, c3073je);
    }

    private C3073je() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", EnumC1337Ge.c(), "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (ordinal == 3) {
            return new C3073je();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C2966ie();
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzh;
        if (interfaceC4633xv0 == null) {
            synchronized (C3073je.class) {
                try {
                    interfaceC4633xv0 = zzh;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzg);
                        zzh = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
