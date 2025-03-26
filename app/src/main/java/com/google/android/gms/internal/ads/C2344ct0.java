package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ct0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2344ct0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C2344ct0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private C2779gt0 zze;

    static {
        C2344ct0 c2344ct0 = new C2344ct0();
        zza = c2344ct0;
        Qu0.F(C2344ct0.class, c2344ct0);
    }

    private C2344ct0() {
    }

    public static C2127at0 c0() {
        return (C2127at0) zza.q();
    }

    public static C2344ct0 e0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (C2344ct0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    static /* synthetic */ void g0(C2344ct0 c2344ct0, C2779gt0 c2779gt0) {
        c2779gt0.getClass();
        c2344ct0.zze = c2779gt0;
        c2344ct0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new C2344ct0();
        }
        AbstractC2236bt0 abstractC2236bt0 = null;
        if (ordinal == 4) {
            return new C2127at0(abstractC2236bt0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C2344ct0.class) {
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

    public final C2779gt0 f0() {
        C2779gt0 c2779gt0 = this.zze;
        return c2779gt0 == null ? C2779gt0.e0() : c2779gt0;
    }
}
