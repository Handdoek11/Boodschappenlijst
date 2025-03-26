package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4550x8 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4550x8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private long zze = -1;

    static {
        C4550x8 c4550x8 = new C4550x8();
        zza = c4550x8;
        Qu0.F(C4550x8.class, c4550x8);
    }

    private C4550x8() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", C3352m8.f24464a, "zze"});
        }
        if (ordinal == 3) {
            return new C4550x8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new C4441w8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4550x8.class) {
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
