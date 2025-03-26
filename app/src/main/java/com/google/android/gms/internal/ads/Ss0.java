package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Ss0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Ss0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private String zzd = "";
    private C4082ss0 zze;

    static {
        Ss0 ss0 = new Ss0();
        zza = ss0;
        Qu0.F(Ss0.class, ss0);
    }

    private Ss0() {
    }

    public static Qs0 c0() {
        return (Qs0) zza.q();
    }

    public static Ss0 e0() {
        return zza;
    }

    public static Ss0 f0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (Ss0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    static /* synthetic */ void h0(Ss0 ss0, C4082ss0 c4082ss0) {
        c4082ss0.getClass();
        ss0.zze = c4082ss0;
        ss0.zzc |= 1;
    }

    static /* synthetic */ void i0(Ss0 ss0, String str) {
        str.getClass();
        ss0.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new Ss0();
        }
        Rs0 rs0 = null;
        if (ordinal == 4) {
            return new Qs0(rs0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Ss0.class) {
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

    public final C4082ss0 b0() {
        C4082ss0 c4082ss0 = this.zze;
        return c4082ss0 == null ? C4082ss0.d0() : c4082ss0;
    }

    public final String g0() {
        return this.zzd;
    }
}
