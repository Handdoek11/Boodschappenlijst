package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.h4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5124h4 extends M2 implements InterfaceC5129i3 {
    private static final C5124h4 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        C5124h4 c5124h4 = new C5124h4();
        zzb = c5124h4;
        M2.x(C5124h4.class, c5124h4);
    }

    private C5124h4() {
    }

    static /* synthetic */ void B(C5124h4 c5124h4, int i8) {
        c5124h4.zzd |= 4;
        c5124h4.zzg = i8;
    }

    static /* synthetic */ void C(C5124h4 c5124h4, long j8) {
        c5124h4.zzd |= 8;
        c5124h4.zzh = j8;
    }

    static /* synthetic */ void D(C5124h4 c5124h4, String str) {
        str.getClass();
        c5124h4.zzd |= 2;
        c5124h4.zzf = str;
    }

    static /* synthetic */ void E(C5124h4 c5124h4, String str) {
        str.getClass();
        c5124h4.zzd |= 1;
        c5124h4.zze = str;
    }

    public static C5112f4 G() {
        return (C5112f4) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new C5124h4();
        }
        AbstractC5118g4 abstractC5118g4 = null;
        if (i9 == 4) {
            return new C5112f4(abstractC5118g4);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
