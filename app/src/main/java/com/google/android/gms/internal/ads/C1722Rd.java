package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1722Rd extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    private static final C1722Rd zzb;
    private static volatile InterfaceC4633xv0 zzc;
    private int zzd;
    private int zze;

    static {
        C1722Rd c1722Rd = new C1722Rd();
        zzb = c1722Rd;
        Qu0.F(C1722Rd.class, c1722Rd);
    }

    private C1722Rd() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", EnumC1652Pd.c()});
        }
        if (ordinal == 3) {
            return new C1722Rd();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C1617Od();
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzc;
        if (interfaceC4633xv0 == null) {
            synchronized (C1722Rd.class) {
                try {
                    interfaceC4633xv0 = zzc;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzb);
                        zzc = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
