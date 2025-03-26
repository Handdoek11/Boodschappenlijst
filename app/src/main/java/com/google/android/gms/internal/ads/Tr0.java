package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Tr0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Tr0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;

    static {
        Tr0 tr0 = new Tr0();
        zza = tr0;
        Qu0.F(Tr0.class, tr0);
    }

    private Tr0() {
    }

    public static Rr0 d0() {
        return (Rr0) zza.q();
    }

    public static Tr0 f0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (Tr0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
        }
        if (ordinal == 3) {
            return new Tr0();
        }
        Sr0 sr0 = null;
        if (ordinal == 4) {
            return new Rr0(sr0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Tr0.class) {
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

    public final int b0() {
        return this.zzc;
    }

    public final int c0() {
        return this.zzd;
    }
}
