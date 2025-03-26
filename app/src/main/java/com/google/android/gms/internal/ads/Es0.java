package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Es0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Es0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        Es0 es0 = new Es0();
        zza = es0;
        Qu0.F(Es0.class, es0);
    }

    private Es0() {
    }

    public static Cs0 b0() {
        return (Cs0) zza.q();
    }

    static /* synthetic */ void f0(Es0 es0, String str) {
        str.getClass();
        es0.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new Es0();
        }
        Fs0 fs0 = null;
        if (ordinal == 4) {
            return new Cs0(fs0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Es0.class) {
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
