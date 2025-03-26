package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class L3 extends M2 implements InterfaceC5129i3 {
    private static final L3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private V3 zzh;

    static {
        L3 l32 = new L3();
        zzb = l32;
        M2.x(L3.class, l32);
    }

    private L3() {
    }

    public static L3 B(byte[] bArr, B2 b22) {
        return (L3) M2.q(zzb, bArr, b22);
    }

    static /* synthetic */ void C(L3 l32, V3 v32) {
        v32.getClass();
        l32.zzh = v32;
        l32.zzd |= 2;
    }

    static /* synthetic */ void D(L3 l32, int i8) {
        l32.zzg = i8 - 1;
        l32.zzd |= 1;
    }

    public static J3 E() {
        return (J3) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", N3.f29793a, "zzh", C5172p4.class});
        }
        if (i9 == 3) {
            return new L3();
        }
        K3 k32 = null;
        if (i9 == 4) {
            return new J3(k32);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
