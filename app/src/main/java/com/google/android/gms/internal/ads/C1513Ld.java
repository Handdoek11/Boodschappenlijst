package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513Ld extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private static final C1513Ld zzu;
    private static volatile InterfaceC4633xv0 zzv;
    private C3509ne zzA;
    private C1582Nd zzB;
    private C2857he zzC;
    private C1792Td zzD;
    private int zzE;
    private int zzF;
    private C1371Hd zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzM;
    private int zzw;
    private C2639fe zzx;
    private C3073je zzy;
    private C3291le zzz;

    static {
        C1513Ld c1513Ld = new C1513Ld();
        zzu = c1513Ld;
        Qu0.F(C1513Ld.class, c1513Ld);
    }

    private C1513Ld() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzu, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
        }
        if (ordinal == 3) {
            return new C1513Ld();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C1478Kd();
        }
        if (ordinal == 5) {
            return zzu;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzv;
        if (interfaceC4633xv0 == null) {
            synchronized (C1513Ld.class) {
                try {
                    interfaceC4633xv0 = zzv;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzu);
                        zzv = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
