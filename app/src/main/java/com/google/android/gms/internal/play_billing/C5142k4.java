package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5142k4 extends M2 implements InterfaceC5129i3 {
    private static final C5142k4 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C5142k4 c5142k4 = new C5142k4();
        zzb = c5142k4;
        M2.x(C5142k4.class, c5142k4);
    }

    private C5142k4() {
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new C5142k4();
        }
        AbstractC5136j4 abstractC5136j4 = null;
        if (i9 == 4) {
            return new C5130i4(abstractC5136j4);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
