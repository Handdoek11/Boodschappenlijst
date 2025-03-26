package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3067jb extends Qu0 implements InterfaceC3979rv0 {
    private static final C3067jb zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private C3394mb zzd;
    private AbstractC3542nu0 zze;
    private AbstractC3542nu0 zzf;

    static {
        C3067jb c3067jb = new C3067jb();
        zza = c3067jb;
        Qu0.F(C3067jb.class, c3067jb);
    }

    private C3067jb() {
        AbstractC3542nu0 abstractC3542nu0 = AbstractC3542nu0.f25048s;
        this.zze = abstractC3542nu0;
        this.zzf = abstractC3542nu0;
    }

    public static C3067jb c0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (C3067jb) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new C3067jb();
        }
        AbstractC2960ib abstractC2960ib = null;
        if (ordinal == 4) {
            return new C2851hb(abstractC2960ib);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3067jb.class) {
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

    public final C3394mb d0() {
        C3394mb c3394mb = this.zzd;
        return c3394mb == null ? C3394mb.g0() : c3394mb;
    }

    public final AbstractC3542nu0 e0() {
        return this.zzf;
    }

    public final AbstractC3542nu0 f0() {
        return this.zze;
    }
}
