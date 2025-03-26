package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4768z8 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4768z8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;

    static {
        C4768z8 c4768z8 = new C4768z8();
        zza = c4768z8;
        Qu0.F(C4768z8.class, c4768z8);
    }

    private C4768z8() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", "zze", L8.f16784a});
        }
        if (ordinal == 3) {
            return new C4768z8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new C4659y8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4768z8.class) {
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
