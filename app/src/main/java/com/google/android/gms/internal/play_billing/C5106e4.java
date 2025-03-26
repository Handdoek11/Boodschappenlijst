package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.e4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5106e4 extends M2 implements InterfaceC5129i3 {
    private static final C5106e4 zzb;
    private int zzd;
    private int zzf;
    private V3 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private P2 zzg = M2.r();
    private Q2 zzh = M2.s();

    static {
        C5106e4 c5106e4 = new C5106e4();
        zzb = c5106e4;
        M2.x(C5106e4.class, c5106e4);
    }

    private C5106e4() {
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", C5094c4.f29887a, "zzg", Z3.f29858a, "zzh", B4.class, "zzi", "zzj", "zzk"});
        }
        if (i9 == 3) {
            return new C5106e4();
        }
        AbstractC5100d4 abstractC5100d4 = null;
        if (i9 == 4) {
            return new C5088b4(abstractC5100d4);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
