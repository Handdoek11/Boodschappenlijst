package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4855zx0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4855zx0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    static {
        C4855zx0 c4855zx0 = new C4855zx0();
        zza = c4855zx0;
        Qu0.F(C4855zx0.class, c4855zx0);
    }

    private C4855zx0() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new C4855zx0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new C4746yx0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4855zx0.class) {
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
