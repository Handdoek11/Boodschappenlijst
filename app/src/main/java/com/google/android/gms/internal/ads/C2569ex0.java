package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ex0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2569ex0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C2569ex0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        C2569ex0 c2569ex0 = new C2569ex0();
        zza = c2569ex0;
        Qu0.F(C2569ex0.class, c2569ex0);
    }

    private C2569ex0() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzc", "zzd", C2460dx0.f21703a, "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new C2569ex0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new C2352cx0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C2569ex0.class) {
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
