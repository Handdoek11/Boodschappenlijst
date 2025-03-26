package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class Y3 extends M2 implements InterfaceC5129i3 {
    private static final Y3 zzb;

    static {
        Y3 y32 = new Y3();
        zzb = y32;
        M2.x(Y3.class, y32);
    }

    private Y3() {
    }

    public static Y3 A() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        X3 x32 = null;
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0000", null);
        }
        if (i9 == 3) {
            return new Y3();
        }
        if (i9 == 4) {
            return new W3(x32);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
