package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ce, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2313ce extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C2313ce zzd;
    private static volatile InterfaceC4633xv0 zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C2313ce c2313ce = new C2313ce();
        zzd = c2313ce;
        Qu0.F(C2313ce.class, c2313ce);
    }

    private C2313ce() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(boolean z7) {
        this.zzf |= 1;
        this.zzg = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(boolean z7) {
        this.zzf |= 2;
        this.zzh = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i8) {
        this.zzf |= 4;
        this.zzi = i8;
    }

    public static C2205be h0() {
        return (C2205be) zzd.q();
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new C2313ce();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C2205be();
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zze;
        if (interfaceC4633xv0 == null) {
            synchronized (C2313ce.class) {
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
