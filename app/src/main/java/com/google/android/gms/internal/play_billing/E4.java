package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class E4 extends M2 implements InterfaceC5129i3 {
    private static final E4 zzb;
    private int zzd;
    private V3 zze;

    static {
        E4 e42 = new E4();
        zzb = e42;
        M2.x(E4.class, e42);
    }

    private E4() {
    }

    static /* synthetic */ void B(E4 e42, V3 v32) {
        v32.getClass();
        e42.zze = v32;
        e42.zzd |= 1;
    }

    public static C4 C() {
        return (C4) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new E4();
        }
        D4 d42 = null;
        if (i9 == 4) {
            return new C4(d42);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
