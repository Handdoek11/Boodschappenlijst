package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4553x90 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4553x90 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private C4226u90 zzd;

    static {
        C4553x90 c4553x90 = new C4553x90();
        zza = c4553x90;
        Qu0.F(C4553x90.class, c4553x90);
    }

    private C4553x90() {
    }

    public static C4444w90 b0() {
        return (C4444w90) zza.q();
    }

    static /* synthetic */ void d0(C4553x90 c4553x90, C4226u90 c4226u90) {
        c4226u90.getClass();
        c4553x90.zzd = c4226u90;
        c4553x90.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new C4553x90();
        }
        AbstractC4662y90 abstractC4662y90 = null;
        if (ordinal == 4) {
            return new C4444w90(abstractC4662y90);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4553x90.class) {
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
