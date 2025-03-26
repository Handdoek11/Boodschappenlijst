package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class I4 extends M2 implements InterfaceC5129i3 {
    private static final I4 zzb;
    private int zzd;
    private int zze;

    static {
        I4 i42 = new I4();
        zzb = i42;
        M2.x(I4.class, i42);
    }

    private I4() {
    }

    public static I4 A() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", G4.f29760a});
        }
        if (i9 == 3) {
            return new I4();
        }
        H4 h42 = null;
        if (i9 == 4) {
            return new F4(h42);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
