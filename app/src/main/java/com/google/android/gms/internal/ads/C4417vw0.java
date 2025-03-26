package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4417vw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4417vw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private String zzd = "";

    static {
        C4417vw0 c4417vw0 = new C4417vw0();
        zza = c4417vw0;
        Qu0.F(C4417vw0.class, c4417vw0);
    }

    private C4417vw0() {
    }

    public static C4308uw0 b0() {
        return (C4308uw0) zza.q();
    }

    static /* synthetic */ void d0(C4417vw0 c4417vw0, String str) {
        c4417vw0.zzc |= 1;
        c4417vw0.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new C4417vw0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new C4308uw0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4417vw0.class) {
                try {
                    interfaceC4633xv0 = zzb;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zza);
                        zzb = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
