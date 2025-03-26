package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3071jd extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private static final C3071jd zzl;
    private static volatile InterfaceC4633xv0 zzm;
    private C1584Ne zzA;
    private C1654Pe zzB;
    private int zzn;
    private int zzo;
    private C4380ve zzu;
    private C4598xe zzv;
    private C4816ze zzx;
    private C4814zd zzy;
    private C3942rd zzz;
    private int zzp = 1000;
    private Zu0 zzw = Qu0.v();
    private Zu0 zzC = Qu0.v();

    static {
        C3071jd c3071jd = new C3071jd();
        zzl = c3071jd;
        Qu0.F(C3071jd.class, c3071jd);
    }

    private C3071jd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(EnumC2746gd enumC2746gd) {
        this.zzo = enumC2746gd.zza();
        this.zzn |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(C4598xe c4598xe) {
        c4598xe.getClass();
        this.zzv = c4598xe;
        this.zzn |= 8;
    }

    public static C3071jd h0() {
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzl, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", EnumC2746gd.c(), "zzp", EnumC1337Ge.c(), "zzu", "zzv", "zzw", C4162te.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", C1513Ld.class});
        }
        if (ordinal == 3) {
            return new C3071jd();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C2964id();
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzm;
        if (interfaceC4633xv0 == null) {
            synchronized (C3071jd.class) {
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

    public C4598xe d0() {
        C4598xe c4598xe = this.zzv;
        return c4598xe == null ? C4598xe.e0() : c4598xe;
    }
}
