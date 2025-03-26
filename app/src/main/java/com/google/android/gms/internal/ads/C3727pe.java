package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3727pe extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3727pe zzc;
    private static volatile InterfaceC4633xv0 zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C3727pe c3727pe = new C3727pe();
        zzc = c3727pe;
        Qu0.F(C3727pe.class, c3727pe);
    }

    private C3727pe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z7) {
        this.zze |= 1;
        this.zzf = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i8) {
        this.zze |= 2;
        this.zzg = i8;
    }

    public static C3618oe d0() {
        return (C3618oe) zzc.q();
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new C3727pe();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C3618oe();
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzd;
        if (interfaceC4633xv0 == null) {
            synchronized (C3727pe.class) {
                try {
                    interfaceC4633xv0 = zzd;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzc);
                        zzd = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }

    public boolean f0() {
        return this.zzf;
    }
}
