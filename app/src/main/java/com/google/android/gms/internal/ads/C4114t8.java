package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4114t8 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4114t8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private long zzd = -1;

    static {
        C4114t8 c4114t8 = new C4114t8();
        zza = c4114t8;
        Qu0.F(C4114t8.class, c4114t8);
    }

    private C4114t8() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new C4114t8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new C4005s8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4114t8.class) {
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
