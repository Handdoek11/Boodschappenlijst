package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4598xe extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C4598xe zzf;
    private static volatile InterfaceC4633xv0 zzg;
    private int zzh;
    private String zzi = "";
    private Zu0 zzj = Qu0.v();
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        C4598xe c4598xe = new C4598xe();
        zzf = c4598xe;
        Qu0.F(C4598xe.class, c4598xe);
    }

    private C4598xe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(String str) {
        str.getClass();
        this.zzh |= 1;
        this.zzi = str;
    }

    public static C4598xe e0() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", C4162te.class, "zzk", EnumC1337Ge.c(), "zzl", EnumC1337Ge.c(), "zzm", EnumC1337Ge.c()});
        }
        if (ordinal == 3) {
            return new C4598xe();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C4489we();
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzg;
        if (interfaceC4633xv0 == null) {
            synchronized (C4598xe.class) {
                try {
                    interfaceC4633xv0 = zzg;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzf);
                        zzg = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
