package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2809h8 extends Qu0 implements InterfaceC3979rv0 {
    public static final /* synthetic */ int zza = 0;
    private static final C2809h8 zzb;
    private static volatile InterfaceC4633xv0 zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        C2809h8 c2809h8 = new C2809h8();
        zzb = c2809h8;
        Qu0.F(C2809h8.class, c2809h8);
    }

    private C2809h8() {
    }

    public static C2809h8 c0() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new C2809h8();
        }
        AbstractC2700g8 abstractC2700g8 = null;
        if (ordinal == 4) {
            return new C2482e8(abstractC2700g8);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzc;
        if (interfaceC4633xv0 == null) {
            synchronized (C2809h8.class) {
                try {
                    interfaceC4633xv0 = zzc;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzb);
                        zzc = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
