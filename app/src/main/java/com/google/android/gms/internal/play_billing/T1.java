package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class T1 extends M2 implements InterfaceC5129i3 {
    private static final T1 zzb;
    private Q2 zzd = M2.s();

    static {
        T1 t12 = new T1();
        zzb = t12;
        M2.x(T1.class, t12);
    }

    private T1() {
    }

    public static S1 A() {
        return (S1) zzb.m();
    }

    static /* synthetic */ void C(T1 t12, Iterable iterable) {
        Q2 q22 = t12.zzd;
        if (!q22.a()) {
            int size = q22.size();
            t12.zzd = q22.f(size + size);
        }
        AbstractC5086b2.c(iterable, t12.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", R1.class});
        }
        if (i9 == 3) {
            return new T1();
        }
        U1 u12 = null;
        if (i9 == 4) {
            return new S1(u12);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
