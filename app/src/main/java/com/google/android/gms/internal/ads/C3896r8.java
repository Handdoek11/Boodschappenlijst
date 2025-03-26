package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3896r8 extends Qu0 implements InterfaceC3979rv0 {
    private static final C3896r8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;
    private int zzf = 1000;

    static {
        C3896r8 c3896r8 = new C3896r8();
        zza = c3896r8;
        Qu0.F(C3896r8.class, c3896r8);
    }

    private C3896r8() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            Uu0 uu0 = L8.f16784a;
            return Qu0.A(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", uu0, "zzf", uu0});
        }
        if (ordinal == 3) {
            return new C3896r8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new C3788q8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3896r8.class) {
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
