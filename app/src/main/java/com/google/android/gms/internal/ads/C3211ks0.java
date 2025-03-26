package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ks0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3211ks0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C3211ks0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;

    static {
        C3211ks0 c3211ks0 = new C3211ks0();
        zza = c3211ks0;
        Qu0.F(C3211ks0.class, c3211ks0);
    }

    private C3211ks0() {
    }

    public static C2994is0 d0() {
        return (C2994is0) zza.q();
    }

    public static C3211ks0 f0() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new C3211ks0();
        }
        AbstractC3102js0 abstractC3102js0 = null;
        if (ordinal == 4) {
            return new C2994is0(abstractC3102js0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3211ks0.class) {
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
        return this.zzd;
    }

    public final EnumC2125as0 c0() {
        int i8 = this.zzc;
        EnumC2125as0 enumC2125as0 = i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? null : EnumC2125as0.SHA224 : EnumC2125as0.SHA512 : EnumC2125as0.SHA256 : EnumC2125as0.SHA384 : EnumC2125as0.SHA1 : EnumC2125as0.UNKNOWN_HASH;
        return enumC2125as0 == null ? EnumC2125as0.UNRECOGNIZED : enumC2125as0;
    }
}
