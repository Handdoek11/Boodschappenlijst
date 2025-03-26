package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3754pr0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C3754pr0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private C4407vr0 zzd;
    private C2886hs0 zze;

    static {
        C3754pr0 c3754pr0 = new C3754pr0();
        zza = c3754pr0;
        Qu0.F(C3754pr0.class, c3754pr0);
    }

    private C3754pr0() {
    }

    public static C3536nr0 b0() {
        return (C3536nr0) zza.q();
    }

    public static C3754pr0 d0(AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        return (C3754pr0) Qu0.N(zza, abstractC3542nu0, eu0);
    }

    static /* synthetic */ void g0(C3754pr0 c3754pr0, C4407vr0 c4407vr0) {
        c4407vr0.getClass();
        c3754pr0.zzd = c4407vr0;
        c3754pr0.zzc |= 1;
    }

    static /* synthetic */ void h0(C3754pr0 c3754pr0, C2886hs0 c2886hs0) {
        c2886hs0.getClass();
        c3754pr0.zze = c2886hs0;
        c3754pr0.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new C3754pr0();
        }
        AbstractC3645or0 abstractC3645or0 = null;
        if (ordinal == 4) {
            return new C3536nr0(abstractC3645or0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3754pr0.class) {
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

    public final C4407vr0 e0() {
        C4407vr0 c4407vr0 = this.zzd;
        return c4407vr0 == null ? C4407vr0.e0() : c4407vr0;
    }

    public final C2886hs0 f0() {
        C2886hs0 c2886hs0 = this.zze;
        return c2886hs0 == null ? C2886hs0.f0() : c2886hs0;
    }
}
