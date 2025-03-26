package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2448dr0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C2448dr0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private AbstractC3542nu0 zze = AbstractC3542nu0.f25048s;
    private C3100jr0 zzf;

    static {
        C2448dr0 c2448dr0 = new C2448dr0();
        zza = c2448dr0;
        Qu0.F(C2448dr0.class, c2448dr0);
    }

    private C2448dr0() {
    }

    public static C2232br0 c0() {
        return (C2232br0) zza.q();
    }

    public static C2448dr0 e0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (C2448dr0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    public static InterfaceC4633xv0 h0() {
        return zza.x();
    }

    static /* synthetic */ void j0(C2448dr0 c2448dr0, C3100jr0 c3100jr0) {
        c3100jr0.getClass();
        c2448dr0.zzf = c3100jr0;
        c2448dr0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new C2448dr0();
        }
        AbstractC2340cr0 abstractC2340cr0 = null;
        if (ordinal == 4) {
            return new C2232br0(abstractC2340cr0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C2448dr0.class) {
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
        C3100jr0 c3100jr0 = this.zzf;
        return c3100jr0 == null ? C3100jr0.e0() : c3100jr0;
    }

    public final AbstractC3542nu0 g0() {
        return this.zze;
    }
}
