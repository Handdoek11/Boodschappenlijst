package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class Q3 extends M2 implements InterfaceC5129i3 {
    private static final Q3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        Q3 q32 = new Q3();
        zzb = q32;
        M2.x(Q3.class, q32);
    }

    private Q3() {
    }

    static /* synthetic */ void B(Q3 q32, L4 l42) {
        l42.getClass();
        q32.zzf = l42;
        q32.zze = 3;
    }

    static /* synthetic */ void C(Q3 q32, int i8) {
        q32.zzg = i8 - 1;
        q32.zzd |= 1;
    }

    public static O3 D() {
        return (O3) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", N3.f29793a, C5172p4.class, L4.class, C5207v4.class});
        }
        if (i9 == 3) {
            return new Q3();
        }
        P3 p32 = null;
        if (i9 == 4) {
            return new O3(p32);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
