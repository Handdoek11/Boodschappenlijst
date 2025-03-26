package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class J90 extends Qu0 implements InterfaceC3979rv0 {
    private static final J90 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private String zzc = "";

    static {
        J90 j90 = new J90();
        zza = j90;
        Qu0.F(J90.class, j90);
    }

    private J90() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        if (ordinal == 3) {
            return new J90();
        }
        I90 i90 = null;
        if (ordinal == 4) {
            return new H90(i90);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (J90.class) {
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
