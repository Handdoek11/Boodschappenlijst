package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.es0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2559es0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C2559es0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private C3211ks0 zze;
    private AbstractC3542nu0 zzf = AbstractC3542nu0.f25048s;

    static {
        C2559es0 c2559es0 = new C2559es0();
        zza = c2559es0;
        Qu0.F(C2559es0.class, c2559es0);
    }

    private C2559es0() {
    }

    public static C2234bs0 c0() {
        return (C2234bs0) zza.q();
    }

    public static C2559es0 e0() {
        return zza;
    }

    public static C2559es0 f0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (C2559es0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    public static InterfaceC4633xv0 i0() {
        return zza.x();
    }

    static /* synthetic */ void k0(C2559es0 c2559es0, C3211ks0 c3211ks0) {
        c3211ks0.getClass();
        c2559es0.zze = c3211ks0;
        c2559es0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new C2559es0();
        }
        AbstractC2450ds0 abstractC2450ds0 = null;
        if (ordinal == 4) {
            return new C2234bs0(abstractC2450ds0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C2559es0.class) {
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

    public final C3211ks0 g0() {
        C3211ks0 c3211ks0 = this.zze;
        return c3211ks0 == null ? C3211ks0.f0() : c3211ks0;
    }

    public final AbstractC3542nu0 h0() {
        return this.zzf;
    }
}
