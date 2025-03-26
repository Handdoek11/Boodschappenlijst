package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5207v4 extends M2 implements InterfaceC5129i3 {
    private static final C5207v4 zzb;
    private Q2 zzd = M2.s();

    static {
        C5207v4 c5207v4 = new C5207v4();
        zzb = c5207v4;
        M2.x(C5207v4.class, c5207v4);
    }

    private C5207v4() {
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C5195t4.class});
        }
        if (i9 == 3) {
            return new C5207v4();
        }
        AbstractC5201u4 abstractC5201u4 = null;
        if (i9 == 4) {
            return new C5178q4(abstractC5201u4);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
