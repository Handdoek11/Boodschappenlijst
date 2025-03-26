package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class S8 extends Qu0 implements InterfaceC3979rv0 {
    private static final S8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private String zzd = "";

    static {
        S8 s8 = new S8();
        zza = s8;
        Qu0.F(S8.class, s8);
    }

    private S8() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new S8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new R8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (S8.class) {
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
