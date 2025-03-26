package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class H8 extends Qu0 implements InterfaceC3979rv0 {
    private static final H8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private boolean zzf;
    private Vu0 zzg = Qu0.r();
    private long zzh;

    static {
        H8 h8 = new H8();
        zza = h8;
        Qu0.F(H8.class, h8);
    }

    private H8() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new H8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new F8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (H8.class) {
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
}
