package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2374d8 extends Qu0 implements InterfaceC3979rv0 {
    private static final C2374d8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private boolean zzd;
    private int zze = 5000;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        C2374d8 c2374d8 = new C2374d8();
        zza = c2374d8;
        Qu0.F(C2374d8.class, c2374d8);
    }

    private C2374d8() {
    }

    public static C2374d8 d0() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new C2374d8();
        }
        AbstractC2265c8 abstractC2265c8 = null;
        if (ordinal == 4) {
            return new C2157b8(abstractC2265c8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C2374d8.class) {
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
        return this.zze;
    }

    public final boolean e0() {
        return this.zzd;
    }

    public final boolean f0() {
        return this.zzg;
    }

    public final boolean g0() {
        return this.zzf;
    }

    public final boolean h0() {
        return this.zzh;
    }
}
