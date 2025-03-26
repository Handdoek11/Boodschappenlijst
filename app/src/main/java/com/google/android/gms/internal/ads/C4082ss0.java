package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ss0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4082ss0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4082ss0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private String zzc = "";
    private AbstractC3542nu0 zzd = AbstractC3542nu0.f25048s;
    private int zze;

    static {
        C4082ss0 c4082ss0 = new C4082ss0();
        zza = c4082ss0;
        Qu0.F(C4082ss0.class, c4082ss0);
    }

    private C4082ss0() {
    }

    public static C3865qs0 b0() {
        return (C3865qs0) zza.q();
    }

    public static C4082ss0 d0() {
        return zza;
    }

    public static C4082ss0 e0(byte[] bArr, Eu0 eu0) {
        return (C4082ss0) Qu0.Q(zza, bArr, eu0);
    }

    static /* synthetic */ void j0(C4082ss0 c4082ss0, String str) {
        str.getClass();
        c4082ss0.zzc = str;
    }

    static /* synthetic */ void k0(C4082ss0 c4082ss0, AbstractC3542nu0 abstractC3542nu0) {
        abstractC3542nu0.getClass();
        c4082ss0.zzd = abstractC3542nu0;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new C4082ss0();
        }
        AbstractC3973rs0 abstractC3973rs0 = null;
        if (ordinal == 4) {
            return new C3865qs0(abstractC3973rs0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4082ss0.class) {
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

    public final Ts0 f0() {
        Ts0 a8 = Ts0.a(this.zze);
        return a8 == null ? Ts0.UNRECOGNIZED : a8;
    }

    public final AbstractC3542nu0 g0() {
        return this.zzd;
    }

    public final String h0() {
        return this.zzc;
    }
}
