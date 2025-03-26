package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3546nw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C3546nw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private AbstractC3542nu0 zzf = AbstractC3542nu0.f25048s;

    static {
        C3546nw0 c3546nw0 = new C3546nw0();
        zza = c3546nw0;
        Qu0.F(C3546nw0.class, c3546nw0);
    }

    private C3546nw0() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", C3437mw0.f24833a, "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new C3546nw0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new C3328lw0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3546nw0.class) {
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
