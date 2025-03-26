package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2779gt0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C2779gt0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;

    static {
        C2779gt0 c2779gt0 = new C2779gt0();
        zza = c2779gt0;
        Qu0.F(C2779gt0.class, c2779gt0);
    }

    private C2779gt0() {
    }

    public static C2452dt0 c0() {
        return (C2452dt0) zza.q();
    }

    public static C2779gt0 e0() {
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
            return new C2779gt0();
        }
        AbstractC2670ft0 abstractC2670ft0 = null;
        if (ordinal == 4) {
            return new C2452dt0(abstractC2670ft0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C2779gt0.class) {
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
