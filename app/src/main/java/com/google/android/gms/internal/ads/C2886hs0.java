package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2886hs0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C2886hs0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private C3211ks0 zzd;
    private int zze;
    private int zzf;

    static {
        C2886hs0 c2886hs0 = new C2886hs0();
        zza = c2886hs0;
        Qu0.F(C2886hs0.class, c2886hs0);
    }

    private C2886hs0() {
    }

    public static C2668fs0 d0() {
        return (C2668fs0) zza.q();
    }

    public static C2886hs0 f0() {
        return zza;
    }

    public static C2886hs0 g0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (C2886hs0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    static /* synthetic */ void j0(C2886hs0 c2886hs0, C3211ks0 c3211ks0) {
        c3211ks0.getClass();
        c2886hs0.zzd = c3211ks0;
        c2886hs0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new C2886hs0();
        }
        AbstractC2777gs0 abstractC2777gs0 = null;
        if (ordinal == 4) {
            return new C2668fs0(abstractC2777gs0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C2886hs0.class) {
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
        return this.zze;
    }

    public final int c0() {
        return this.zzf;
    }

    public final C3211ks0 h0() {
        C3211ks0 c3211ks0 = this.zzd;
        return c3211ks0 == null ? C3211ks0.f0() : c3211ks0;
    }
}
