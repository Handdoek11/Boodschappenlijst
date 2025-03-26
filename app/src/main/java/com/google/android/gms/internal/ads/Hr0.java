package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Hr0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Hr0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;

    static {
        Hr0 hr0 = new Hr0();
        zza = hr0;
        Qu0.F(Hr0.class, hr0);
    }

    private Hr0() {
    }

    public static Fr0 c0() {
        return (Fr0) zza.q();
    }

    public static Hr0 e0() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        if (ordinal == 3) {
            return new Hr0();
        }
        Gr0 gr0 = null;
        if (ordinal == 4) {
            return new Fr0(gr0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Hr0.class) {
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
}
