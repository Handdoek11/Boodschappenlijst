package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.p4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5172p4 extends M2 implements InterfaceC5129i3 {
    private static final C5172p4 zzb;
    private int zzd;
    private int zze;

    static {
        C5172p4 c5172p4 = new C5172p4();
        zzb = c5172p4;
        M2.x(C5172p4.class, c5172p4);
    }

    private C5172p4() {
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C5154m4.f29949a});
        }
        if (i9 == 3) {
            return new C5172p4();
        }
        AbstractC5166o4 abstractC5166o4 = null;
        if (i9 == 4) {
            return new C5148l4(abstractC5166o4);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
