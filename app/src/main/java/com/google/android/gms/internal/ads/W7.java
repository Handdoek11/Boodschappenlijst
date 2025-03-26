package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class W7 extends Qu0 implements InterfaceC3979rv0 {
    private static final W7 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd = 2;

    static {
        W7 w7 = new W7();
        zza = w7;
        Qu0.F(W7.class, w7);
    }

    private W7() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzc", "zzd", X7.f19985a});
        }
        if (ordinal == 3) {
            return new W7();
        }
        AbstractC2048a8 abstractC2048a8 = null;
        if (ordinal == 4) {
            return new V7(abstractC2048a8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (W7.class) {
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
