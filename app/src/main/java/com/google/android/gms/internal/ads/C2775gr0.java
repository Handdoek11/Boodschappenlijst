package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2775gr0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C2775gr0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private C3100jr0 zze;

    static {
        C2775gr0 c2775gr0 = new C2775gr0();
        zza = c2775gr0;
        Qu0.F(C2775gr0.class, c2775gr0);
    }

    private C2775gr0() {
    }

    public static C2557er0 c0() {
        return (C2557er0) zza.q();
    }

    public static C2775gr0 e0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (C2775gr0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    static /* synthetic */ void h0(C2775gr0 c2775gr0, C3100jr0 c3100jr0) {
        c3100jr0.getClass();
        c2775gr0.zze = c3100jr0;
        c2775gr0.zzc |= 1;
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
            return new C2775gr0();
        }
        AbstractC2666fr0 abstractC2666fr0 = null;
        if (ordinal == 4) {
            return new C2557er0(abstractC2666fr0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C2775gr0.class) {
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

    public final C3100jr0 f0() {
        C3100jr0 c3100jr0 = this.zze;
        return c3100jr0 == null ? C3100jr0.e0() : c3100jr0;
    }
}
