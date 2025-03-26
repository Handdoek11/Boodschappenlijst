package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4409vs0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4409vs0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zze;
    private boolean zzf;
    private String zzc = "";
    private String zzd = "";
    private String zzg = "";

    static {
        C4409vs0 c4409vs0 = new C4409vs0();
        zza = c4409vs0;
        Qu0.F(C4409vs0.class, c4409vs0);
    }

    private C4409vs0() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new C4409vs0();
        }
        AbstractC4300us0 abstractC4300us0 = null;
        if (ordinal == 4) {
            return new C4191ts0(abstractC4300us0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4409vs0.class) {
                try {
                    interfaceC4633xv0 = zzb;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zza);
                        zzb = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
