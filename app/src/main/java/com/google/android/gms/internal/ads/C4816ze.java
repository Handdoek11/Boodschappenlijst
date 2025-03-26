package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ze, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4816ze extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final C4816ze zzg;
    private static volatile InterfaceC4633xv0 zzh;
    private int zzi;
    private int zzj;
    private C1371Hd zzk;
    private C1371Hd zzl;
    private C1371Hd zzm;
    private Zu0 zzn = Qu0.v();
    private int zzo;

    static {
        C4816ze c4816ze = new C4816ze();
        zzg = c4816ze;
        Qu0.F(C4816ze.class, c4816ze);
    }

    private C4816ze() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", C1371Hd.class, "zzo"});
        }
        if (ordinal == 3) {
            return new C4816ze();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C4707ye();
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzh;
        if (interfaceC4633xv0 == null) {
            synchronized (C4816ze.class) {
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
