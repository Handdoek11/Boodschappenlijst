package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4771z90 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4771z90 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private Zu0 zzc = Qu0.v();

    static {
        C4771z90 c4771z90 = new C4771z90();
        zza = c4771z90;
        Qu0.F(C4771z90.class, c4771z90);
    }

    private C4771z90() {
    }

    public static C4335v90 c0() {
        return (C4335v90) zza.q();
    }

    static /* synthetic */ void e0(C4771z90 c4771z90, C4553x90 c4553x90) {
        c4553x90.getClass();
        Zu0 zu0 = c4771z90.zzc;
        if (!zu0.a()) {
            c4771z90.zzc = Qu0.w(zu0);
        }
        c4771z90.zzc.add(c4553x90);
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C4553x90.class});
        }
        if (ordinal == 3) {
            return new C4771z90();
        }
        AbstractC4662y90 abstractC4662y90 = null;
        if (ordinal == 4) {
            return new C4335v90(abstractC4662y90);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4771z90.class) {
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

    public final int b0() {
        return this.zzc.size();
    }
}
