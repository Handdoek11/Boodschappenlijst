package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3509ne extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3509ne zzc;
    private static volatile InterfaceC4633xv0 zzd;
    private int zze;
    private int zzf = 1000;
    private C1722Rd zzg;

    static {
        C3509ne c3509ne = new C3509ne();
        zzc = c3509ne;
        Qu0.F(C3509ne.class, c3509ne);
    }

    private C3509ne() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", EnumC1337Ge.c(), "zzg"});
        }
        if (ordinal == 3) {
            return new C3509ne();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C3400me();
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzd;
        if (interfaceC4633xv0 == null) {
            synchronized (C3509ne.class) {
                try {
                    interfaceC4633xv0 = zzd;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzc);
                        zzd = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
