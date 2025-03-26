package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.os0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3647os0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C3647os0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private String zzc = "";
    private AbstractC3542nu0 zzd = AbstractC3542nu0.f25048s;
    private int zze;

    static {
        C3647os0 c3647os0 = new C3647os0();
        zza = c3647os0;
        Qu0.F(C3647os0.class, c3647os0);
    }

    private C3647os0() {
    }

    public static C3320ls0 b0() {
        return (C3320ls0) zza.q();
    }

    public static C3647os0 e0() {
        return zza;
    }

    static /* synthetic */ void i0(C3647os0 c3647os0, String str) {
        str.getClass();
        c3647os0.zzc = str;
    }

    static /* synthetic */ void j0(C3647os0 c3647os0, AbstractC3542nu0 abstractC3542nu0) {
        abstractC3542nu0.getClass();
        c3647os0.zzd = abstractC3542nu0;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new C3647os0();
        }
        AbstractC3538ns0 abstractC3538ns0 = null;
        if (ordinal == 4) {
            return new C3320ls0(abstractC3538ns0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3647os0.class) {
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

    public final EnumC3429ms0 c0() {
        int i8 = this.zze;
        EnumC3429ms0 enumC3429ms0 = i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? null : EnumC3429ms0.REMOTE : EnumC3429ms0.ASYMMETRIC_PUBLIC : EnumC3429ms0.ASYMMETRIC_PRIVATE : EnumC3429ms0.SYMMETRIC : EnumC3429ms0.UNKNOWN_KEYMATERIAL;
        return enumC3429ms0 == null ? EnumC3429ms0.UNRECOGNIZED : enumC3429ms0;
    }

    public final AbstractC3542nu0 f0() {
        return this.zzd;
    }

    public final String g0() {
        return this.zzc;
    }
}
