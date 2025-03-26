package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class R1 extends M2 implements InterfaceC5129i3 {
    private static final R1 zzb;
    private int zzd;
    private W1 zze;
    private W1 zzf;
    private int zzg;

    static {
        R1 r12 = new R1();
        zzb = r12;
        M2.x(R1.class, r12);
    }

    private R1() {
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", Z1.a()});
        }
        if (i9 == 3) {
            return new R1();
        }
        U1 u12 = null;
        if (i9 == 4) {
            return new Q1(u12);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
