package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4814zd extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private static final C4814zd zzl;
    private static volatile InterfaceC4633xv0 zzm;
    private int zzA;
    private int zzB;
    private C1155Bd zzC;
    private int zzn;
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        C4814zd c4814zd = new C4814zd();
        zzl = c4814zd;
        Qu0.F(C4814zd.class, c4814zd);
    }

    private C4814zd() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzl, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", EnumC1337Ge.c(), "zzp", EnumC1337Ge.c(), "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
        }
        if (ordinal == 3) {
            return new C4814zd();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C4705yd();
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzm;
        if (interfaceC4633xv0 == null) {
            synchronized (C4814zd.class) {
                try {
                    interfaceC4633xv0 = zzm;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzl);
                        zzm = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
