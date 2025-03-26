package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.t4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5195t4 extends M2 implements InterfaceC5129i3 {
    private static final C5195t4 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C5195t4 c5195t4 = new C5195t4();
        zzb = c5195t4;
        M2.x(C5195t4.class, c5195t4);
    }

    private C5195t4() {
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C5189s4.f30007a, "zzf"});
        }
        if (i9 == 3) {
            return new C5195t4();
        }
        AbstractC5201u4 abstractC5201u4 = null;
        if (i9 == 4) {
            return new C5183r4(abstractC5201u4);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
