package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class As0 extends Qu0 implements InterfaceC3979rv0 {
    private static final As0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private Zu0 zzd = Qu0.v();

    static {
        As0 as0 = new As0();
        zza = as0;
        Qu0.F(As0.class, as0);
    }

    private As0() {
    }

    public static C4518ws0 d0() {
        return (C4518ws0) zza.q();
    }

    public static As0 g0(InputStream inputStream, Eu0 eu0) {
        return (As0) Qu0.O(zza, inputStream, eu0);
    }

    static /* synthetic */ void i0(As0 as0, C4736ys0 c4736ys0) {
        c4736ys0.getClass();
        Zu0 zu0 = as0.zzd;
        if (!zu0.a()) {
            as0.zzd = Qu0.w(zu0);
        }
        as0.zzd.add(c4736ys0);
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", C4736ys0.class});
        }
        if (ordinal == 3) {
            return new As0();
        }
        AbstractC4845zs0 abstractC4845zs0 = null;
        if (ordinal == 4) {
            return new C4518ws0(abstractC4845zs0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (As0.class) {
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
        return this.zzd.size();
    }

    public final int c0() {
        return this.zzc;
    }

    public final C4736ys0 e0(int i8) {
        return (C4736ys0) this.zzd.get(i8);
    }

    public final List h0() {
        return this.zzd;
    }
}
