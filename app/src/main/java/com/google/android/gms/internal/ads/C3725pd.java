package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3725pd extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3725pd zzc;
    private static volatile InterfaceC4633xv0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C3725pd c3725pd = new C3725pd();
        zzc = c3725pd;
        Qu0.F(C3725pd.class, c3725pd);
    }

    private C3725pd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(EnumC3289ld enumC3289ld) {
        this.zzg = enumC3289ld.zza();
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(EnumC3507nd enumC3507nd) {
        this.zzf = enumC3507nd.zza();
        this.zze |= 1;
    }

    public static C3180kd d0() {
        return (C3180kd) zzc.q();
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", EnumC3507nd.c(), "zzg", EnumC3289ld.c()});
        }
        if (ordinal == 3) {
            return new C3725pd();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C3180kd();
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzd;
        if (interfaceC4633xv0 == null) {
            synchronized (C3725pd.class) {
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
}
