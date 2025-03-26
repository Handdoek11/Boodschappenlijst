package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Kr0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Kr0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private AbstractC3542nu0 zzd = AbstractC3542nu0.f25048s;

    static {
        Kr0 kr0 = new Kr0();
        zza = kr0;
        Qu0.F(Kr0.class, kr0);
    }

    private Kr0() {
    }

    public static Ir0 c0() {
        return (Ir0) zza.q();
    }

    public static Kr0 e0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (Kr0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    public static InterfaceC4633xv0 g0() {
        return zza.x();
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new Kr0();
        }
        Jr0 jr0 = null;
        if (ordinal == 4) {
            return new Ir0(jr0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Kr0.class) {
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

    public final AbstractC3542nu0 f0() {
        return this.zzd;
    }
}
