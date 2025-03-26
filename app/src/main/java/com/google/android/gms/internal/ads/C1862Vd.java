package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1862Vd extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C1862Vd zzd;
    private static volatile InterfaceC4633xv0 zze;
    private int zzf;
    private int zzg;
    private C2096ae zzh;
    private C2313ce zzi;

    static {
        C1862Vd c1862Vd = new C1862Vd();
        zzd = c1862Vd;
        Qu0.F(C1862Vd.class, c1862Vd);
    }

    private C1862Vd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(EnumC1932Xd enumC1932Xd) {
        this.zzg = enumC1932Xd.zza();
        this.zzf |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(C2096ae c2096ae) {
        c2096ae.getClass();
        this.zzh = c2096ae;
        this.zzf |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(C2313ce c2313ce) {
        c2313ce.getClass();
        this.zzi = c2313ce;
        this.zzf |= 4;
    }

    public static C1827Ud h0() {
        return (C1827Ud) zzd.q();
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", EnumC1932Xd.c(), "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new C1862Vd();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C1827Ud();
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zze;
        if (interfaceC4633xv0 == null) {
            synchronized (C1862Vd.class) {
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
