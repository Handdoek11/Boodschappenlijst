package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Ws0 extends Qu0 implements InterfaceC3979rv0 {
    public static final /* synthetic */ int zza = 0;
    private static final Ws0 zzb;
    private static volatile InterfaceC4633xv0 zzc;
    private String zzd = "";
    private Zu0 zze = Qu0.v();

    static {
        Ws0 ws0 = new Ws0();
        zzb = ws0;
        Qu0.F(Ws0.class, ws0);
    }

    private Ws0() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", C4409vs0.class});
        }
        if (ordinal == 3) {
            return new Ws0();
        }
        Vs0 vs0 = null;
        if (ordinal == 4) {
            return new Us0(vs0);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzc;
        if (interfaceC4633xv0 == null) {
            synchronized (Ws0.class) {
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
