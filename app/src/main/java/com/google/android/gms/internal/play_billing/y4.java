package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class y4 extends M2 implements InterfaceC5129i3 {
    private static final y4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C5124h4 zzg;
    private C5142k4 zzh;

    static {
        y4 y4Var = new y4();
        zzb = y4Var;
        M2.x(y4.class, y4Var);
    }

    private y4() {
    }

    static /* synthetic */ void B(y4 y4Var, L3 l32) {
        y4Var.zzf = l32;
        y4Var.zze = 2;
    }

    static /* synthetic */ void C(y4 y4Var, Q3 q32) {
        y4Var.zzf = q32;
        y4Var.zze = 3;
    }

    static /* synthetic */ void D(y4 y4Var, Y3 y32) {
        y32.getClass();
        y4Var.zzf = y32;
        y4Var.zze = 7;
    }

    static /* synthetic */ void E(y4 y4Var, C5124h4 c5124h4) {
        c5124h4.getClass();
        y4Var.zzg = c5124h4;
        y4Var.zzd |= 1;
    }

    static /* synthetic */ void G(y4 y4Var, E4 e42) {
        e42.getClass();
        y4Var.zzf = e42;
        y4Var.zze = 8;
    }

    static /* synthetic */ void H(y4 y4Var, I4 i42) {
        y4Var.zzf = i42;
        y4Var.zze = 4;
    }

    public static w4 I() {
        return (w4) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", L3.class, Q3.class, I4.class, C5106e4.class, "zzh", Y3.class, E4.class});
        }
        if (i9 == 3) {
            return new y4();
        }
        x4 x4Var = null;
        if (i9 == 4) {
            return new w4(x4Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
