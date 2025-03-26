package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Ms0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Ms0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private String zzc = "";

    static {
        Ms0 ms0 = new Ms0();
        zza = ms0;
        Qu0.F(Ms0.class, ms0);
    }

    private Ms0() {
    }

    public static Ks0 b0() {
        return (Ks0) zza.q();
    }

    public static Ms0 d0() {
        return zza;
    }

    public static Ms0 e0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (Ms0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    static /* synthetic */ void g0(Ms0 ms0, String str) {
        str.getClass();
        ms0.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        if (ordinal == 3) {
            return new Ms0();
        }
        Ls0 ls0 = null;
        if (ordinal == 4) {
            return new Ks0(ls0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Ms0.class) {
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

    public final String f0() {
        return this.zzc;
    }
}
