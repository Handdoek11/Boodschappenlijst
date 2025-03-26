package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ve, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4380ve extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C4380ve zzd;
    private static volatile InterfaceC4633xv0 zze;
    private int zzf;
    private String zzg = "";
    private Zu0 zzh = Qu0.v();
    private int zzi;

    static {
        C4380ve c4380ve = new C4380ve();
        zzd = c4380ve;
        Qu0.F(C4380ve.class, c4380ve);
    }

    private C4380ve() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzf", "zzg", "zzh", C4162te.class, "zzi", EnumC1337Ge.c()});
        }
        if (ordinal == 3) {
            return new C4380ve();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C4271ue();
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zze;
        if (interfaceC4633xv0 == null) {
            synchronized (C4380ve.class) {
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
