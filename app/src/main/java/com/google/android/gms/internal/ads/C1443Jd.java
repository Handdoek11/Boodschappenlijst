package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1443Jd extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C1443Jd zzd;
    private static volatile InterfaceC4633xv0 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        C1443Jd c1443Jd = new C1443Jd();
        zzd = c1443Jd;
        Qu0.F(C1443Jd.class, c1443Jd);
    }

    private C1443Jd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i8) {
        this.zzf |= 1;
        this.zzg = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i8) {
        this.zzf |= 4;
        this.zzi = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i8) {
        this.zzf |= 2;
        this.zzh = i8;
    }

    public static C1407Id h0() {
        return (C1407Id) zzd.q();
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new C1443Jd();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C1407Id();
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zze;
        if (interfaceC4633xv0 == null) {
            synchronized (C1443Jd.class) {
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
