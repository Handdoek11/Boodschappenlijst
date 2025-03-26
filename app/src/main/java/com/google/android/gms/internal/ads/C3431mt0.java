package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3431mt0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C3431mt0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;

    static {
        C3431mt0 c3431mt0 = new C3431mt0();
        zza = c3431mt0;
        Qu0.F(C3431mt0.class, c3431mt0);
    }

    private C3431mt0() {
    }

    public static C3431mt0 d0() {
        return zza;
    }

    public static C3431mt0 e0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (C3431mt0) Qu0.N(zza, abstractC3542nu0, eu0);
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
            return new C3431mt0();
        }
        AbstractC3322lt0 abstractC3322lt0 = null;
        if (ordinal == 4) {
            return new C3213kt0(abstractC3322lt0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3431mt0.class) {
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
