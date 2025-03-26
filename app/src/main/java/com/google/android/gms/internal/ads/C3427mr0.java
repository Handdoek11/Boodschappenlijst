package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3427mr0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C3427mr0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private C4080sr0 zze;
    private C2559es0 zzf;

    static {
        C3427mr0 c3427mr0 = new C3427mr0();
        zza = c3427mr0;
        Qu0.F(C3427mr0.class, c3427mr0);
    }

    private C3427mr0() {
    }

    public static C3209kr0 c0() {
        return (C3209kr0) zza.q();
    }

    public static C3427mr0 e0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (C3427mr0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    public static InterfaceC4633xv0 h0() {
        return zza.x();
    }

    static /* synthetic */ void i0(C3427mr0 c3427mr0, C4080sr0 c4080sr0) {
        c4080sr0.getClass();
        c3427mr0.zze = c4080sr0;
        c3427mr0.zzc |= 1;
    }

    static /* synthetic */ void j0(C3427mr0 c3427mr0, C2559es0 c2559es0) {
        c2559es0.getClass();
        c3427mr0.zzf = c2559es0;
        c3427mr0.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new C3427mr0();
        }
        AbstractC3318lr0 abstractC3318lr0 = null;
        if (ordinal == 4) {
            return new C3209kr0(abstractC3318lr0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3427mr0.class) {
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

    public final C4080sr0 f0() {
        C4080sr0 c4080sr0 = this.zze;
        return c4080sr0 == null ? C4080sr0.e0() : c4080sr0;
    }

    public final C2559es0 g0() {
        C2559es0 c2559es0 = this.zzf;
        return c2559es0 == null ? C2559es0.e0() : c2559es0;
    }
}
