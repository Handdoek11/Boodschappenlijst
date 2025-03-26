package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ys0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4736ys0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4736ys0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private C3647os0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C4736ys0 c4736ys0 = new C4736ys0();
        zza = c4736ys0;
        Qu0.F(C4736ys0.class, c4736ys0);
    }

    private C4736ys0() {
    }

    public static C4627xs0 d0() {
        return (C4627xs0) zza.q();
    }

    static /* synthetic */ void g0(C4736ys0 c4736ys0, C3647os0 c3647os0) {
        c3647os0.getClass();
        c4736ys0.zzd = c3647os0;
        c4736ys0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new C4736ys0();
        }
        AbstractC4845zs0 abstractC4845zs0 = null;
        if (ordinal == 4) {
            return new C4627xs0(abstractC4845zs0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4736ys0.class) {
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
        return this.zzf;
    }

    public final C3647os0 c0() {
        C3647os0 c3647os0 = this.zzd;
        return c3647os0 == null ? C3647os0.e0() : c3647os0;
    }

    public final Ts0 f0() {
        Ts0 a8 = Ts0.a(this.zzg);
        return a8 == null ? Ts0.UNRECOGNIZED : a8;
    }

    public final boolean j0() {
        return (this.zzc & 1) != 0;
    }

    public final int k0() {
        int i8 = this.zze;
        int i9 = i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i9 == 0) {
            return 1;
        }
        return i9;
    }
}
