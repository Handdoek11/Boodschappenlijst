package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Gs0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Gs0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private Zu0 zzd = Qu0.v();

    static {
        Gs0 gs0 = new Gs0();
        zza = gs0;
        Qu0.F(Gs0.class, gs0);
    }

    private Gs0() {
    }

    public static Bs0 b0() {
        return (Bs0) zza.q();
    }

    static /* synthetic */ void d0(Gs0 gs0, Es0 es0) {
        es0.getClass();
        Zu0 zu0 = gs0.zzd;
        if (!zu0.a()) {
            gs0.zzd = Qu0.w(zu0);
        }
        gs0.zzd.add(es0);
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", Es0.class});
        }
        if (ordinal == 3) {
            return new Gs0();
        }
        Fs0 fs0 = null;
        if (ordinal == 4) {
            return new Bs0(fs0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Gs0.class) {
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
