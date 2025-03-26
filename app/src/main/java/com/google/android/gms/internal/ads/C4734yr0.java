package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4734yr0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4734yr0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;

    static {
        C4734yr0 c4734yr0 = new C4734yr0();
        zza = c4734yr0;
        Qu0.F(C4734yr0.class, c4734yr0);
    }

    private C4734yr0() {
    }

    public static C4516wr0 c0() {
        return (C4516wr0) zza.q();
    }

    public static C4734yr0 e0() {
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
            return new C4734yr0();
        }
        AbstractC4625xr0 abstractC4625xr0 = null;
        if (ordinal == 4) {
            return new C4516wr0(abstractC4625xr0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4734yr0.class) {
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
