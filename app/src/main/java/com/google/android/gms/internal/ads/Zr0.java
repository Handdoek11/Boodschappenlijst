package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Zr0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Zr0 zza;
    private static volatile InterfaceC4633xv0 zzb;

    static {
        Zr0 zr0 = new Zr0();
        zza = zr0;
        Qu0.F(Zr0.class, zr0);
    }

    private Zr0() {
    }

    public static Zr0 c0() {
        return zza;
    }

    public static Zr0 d0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (Zr0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        Yr0 yr0 = null;
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new Zr0();
        }
        if (ordinal == 4) {
            return new Xr0(yr0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Zr0.class) {
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
