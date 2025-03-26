package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4596xd extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C4596xd zzi;
    private static volatile InterfaceC4633xv0 zzj;
    private int zzk;
    private int zzm;
    private int zzn;
    private long zzo;
    private long zzv;
    private int zzw;
    private Zu0 zzl = Qu0.v();
    private String zzp = "";
    private String zzu = "";

    static {
        C4596xd c4596xd = new C4596xd();
        zzi = c4596xd;
        Qu0.F(C4596xd.class, c4596xd);
    }

    private C4596xd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(int i8) {
        this.zzk |= 1;
        this.zzm = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(long j8) {
        this.zzk |= 32;
        this.zzv = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i8) {
        this.zzk |= 2;
        this.zzn = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(long j8) {
        this.zzk |= 4;
        this.zzo = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(Iterable iterable) {
        o0();
        Wt0.j(iterable, this.zzl);
    }

    private void o0() {
        Zu0 zu0 = this.zzl;
        if (zu0.a()) {
            return;
        }
        this.zzl = Qu0.w(zu0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(String str) {
        str.getClass();
        this.zzk |= 8;
        this.zzp = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(int i8) {
        this.zzk |= 64;
        this.zzw = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(String str) {
        str.getClass();
        this.zzk |= 16;
        this.zzu = str;
    }

    public static C4269ud s0() {
        return (C4269ud) zzi.q();
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", C4051sd.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
        }
        if (ordinal == 3) {
            return new C4596xd();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C4269ud();
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzj;
        if (interfaceC4633xv0 == null) {
            synchronized (C4596xd.class) {
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
