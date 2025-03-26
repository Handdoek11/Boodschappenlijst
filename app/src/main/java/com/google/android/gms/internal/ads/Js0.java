package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Js0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Js0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private Ms0 zze;

    static {
        Js0 js0 = new Js0();
        zza = js0;
        Qu0.F(Js0.class, js0);
    }

    private Js0() {
    }

    public static Hs0 c0() {
        return (Hs0) zza.q();
    }

    public static Js0 e0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (Js0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    public static InterfaceC4633xv0 g0() {
        return zza.x();
    }

    static /* synthetic */ void h0(Js0 js0, Ms0 ms0) {
        ms0.getClass();
        js0.zze = ms0;
        js0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new Js0();
        }
        Is0 is0 = null;
        if (ordinal == 4) {
            return new Hs0(is0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Js0.class) {
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
        return this.zzd;
    }

    public final Ms0 f0() {
        Ms0 ms0 = this.zze;
        return ms0 == null ? Ms0.d0() : ms0;
    }
}
