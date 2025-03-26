package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Q8 extends Qu0 implements InterfaceC3979rv0 {
    private static final Q8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private AbstractC3542nu0 zzf = AbstractC3542nu0.f25048s;

    static {
        Q8 q8 = new Q8();
        zza = q8;
        Qu0.F(Q8.class, q8);
    }

    private Q8() {
    }

    public static Q8 d0() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new Q8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new P8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Q8.class) {
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

    public final long b0() {
        return this.zzd;
    }

    public final AbstractC3542nu0 e0() {
        return this.zzf;
    }

    public final String f0() {
        return this.zze;
    }

    public final boolean g0() {
        return (this.zzc & 1) != 0;
    }
}
