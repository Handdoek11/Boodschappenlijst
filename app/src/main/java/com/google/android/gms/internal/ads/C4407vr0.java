package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4407vr0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4407vr0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private C4734yr0 zzd;
    private int zze;

    static {
        C4407vr0 c4407vr0 = new C4407vr0();
        zza = c4407vr0;
        Qu0.F(C4407vr0.class, c4407vr0);
    }

    private C4407vr0() {
    }

    public static C4189tr0 c0() {
        return (C4189tr0) zza.q();
    }

    public static C4407vr0 e0() {
        return zza;
    }

    static /* synthetic */ void h0(C4407vr0 c4407vr0, C4734yr0 c4734yr0) {
        c4734yr0.getClass();
        c4407vr0.zzd = c4734yr0;
        c4407vr0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new C4407vr0();
        }
        AbstractC4298ur0 abstractC4298ur0 = null;
        if (ordinal == 4) {
            return new C4189tr0(abstractC4298ur0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4407vr0.class) {
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
        return this.zze;
    }

    public final C4734yr0 f0() {
        C4734yr0 c4734yr0 = this.zzd;
        return c4734yr0 == null ? C4734yr0.e0() : c4734yr0;
    }
}
