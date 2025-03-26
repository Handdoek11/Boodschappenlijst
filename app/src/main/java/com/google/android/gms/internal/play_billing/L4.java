package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class L4 extends M2 implements InterfaceC5129i3 {
    private static final L4 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        L4 l42 = new L4();
        zzb = l42;
        M2.x(L4.class, l42);
    }

    private L4() {
    }

    static /* synthetic */ void B(L4 l42, boolean z7) {
        l42.zzd |= 2;
        l42.zzf = true;
    }

    public static J4 C() {
        return (J4) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new L4();
        }
        K4 k42 = null;
        if (i9 == 4) {
            return new J4(k42);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
