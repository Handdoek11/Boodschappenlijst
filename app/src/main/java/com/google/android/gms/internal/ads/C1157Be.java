package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Be, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1157Be extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C1157Be zzi;
    private static volatile InterfaceC4633xv0 zzj;
    private int zzk;
    private C1371Hd zzm;
    private int zzn;
    private C1443Jd zzo;
    private int zzp;
    private String zzl = "";
    private int zzu = 1000;
    private int zzv = 1000;
    private int zzw = 1000;

    static {
        C1157Be c1157Be = new C1157Be();
        zzi = c1157Be;
        Qu0.F(C1157Be.class, c1157Be);
    }

    private C1157Be() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(String str) {
        str.getClass();
        this.zzk |= 1;
        this.zzl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(C1443Jd c1443Jd) {
        c1443Jd.getClass();
        this.zzo = c1443Jd;
        this.zzk |= 8;
    }

    public static C1157Be g0() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", EnumC1337Ge.c(), "zzv", EnumC1337Ge.c(), "zzw", EnumC1337Ge.c()});
        }
        if (ordinal == 3) {
            return new C1157Be();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C1121Ae();
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzj;
        if (interfaceC4633xv0 == null) {
            synchronized (C1157Be.class) {
                try {
                    interfaceC4633xv0 = zzj;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzi);
                        zzj = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
