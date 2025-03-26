package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4080sr0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4080sr0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private C4734yr0 zze;
    private AbstractC3542nu0 zzf = AbstractC3542nu0.f25048s;

    static {
        C4080sr0 c4080sr0 = new C4080sr0();
        zza = c4080sr0;
        Qu0.F(C4080sr0.class, c4080sr0);
    }

    private C4080sr0() {
    }

    public static C3863qr0 c0() {
        return (C3863qr0) zza.q();
    }

    public static C4080sr0 e0() {
        return zza;
    }

    static /* synthetic */ void i0(C4080sr0 c4080sr0, C4734yr0 c4734yr0) {
        c4734yr0.getClass();
        c4080sr0.zze = c4734yr0;
        c4080sr0.zzc |= 1;
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
            return new C4080sr0();
        }
        AbstractC3971rr0 abstractC3971rr0 = null;
        if (ordinal == 4) {
            return new C3863qr0(abstractC3971rr0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4080sr0.class) {
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

    public final C4734yr0 f0() {
        C4734yr0 c4734yr0 = this.zze;
        return c4734yr0 == null ? C4734yr0.e0() : c4734yr0;
    }

    public final AbstractC3542nu0 g0() {
        return this.zzf;
    }
}
