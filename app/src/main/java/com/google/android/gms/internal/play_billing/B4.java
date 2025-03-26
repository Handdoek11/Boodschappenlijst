package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class B4 extends M2 implements InterfaceC5129i3 {
    private static final B4 zzb;
    private int zzd;
    private int zzf;
    private Q2 zze = M2.s();
    private String zzg = "";

    static {
        B4 b42 = new B4();
        zzb = b42;
        M2.x(B4.class, b42);
    }

    private B4() {
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new B4();
        }
        A4 a42 = null;
        if (i9 == 4) {
            return new z4(a42);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
