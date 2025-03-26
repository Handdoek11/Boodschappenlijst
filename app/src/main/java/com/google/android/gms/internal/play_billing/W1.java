package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class W1 extends M2 implements InterfaceC5129i3 {
    private static final W1 zzb;
    private int zzd;
    private String zze = "";

    static {
        W1 w12 = new W1();
        zzb = w12;
        M2.x(W1.class, w12);
    }

    private W1() {
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new W1();
        }
        X1 x12 = null;
        if (i9 == 4) {
            return new V1(x12);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
