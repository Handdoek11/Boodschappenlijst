package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4744yw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4744yw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private AbstractC3542nu0 zzd = AbstractC3542nu0.f25048s;

    static {
        C4744yw0 c4744yw0 = new C4744yw0();
        zza = c4744yw0;
        Qu0.F(C4744yw0.class, c4744yw0);
    }

    private C4744yw0() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new C4744yw0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new C4635xw0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4744yw0.class) {
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
