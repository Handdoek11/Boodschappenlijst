package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3243l8 extends Qu0 implements InterfaceC3979rv0 {
    private static final C3243l8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;

    static {
        C3243l8 c3243l8 = new C3243l8();
        zza = c3243l8;
        Qu0.F(C3243l8.class, c3243l8);
    }

    private C3243l8() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzc", "zzd", C3679p8.f25355a});
        }
        if (ordinal == 3) {
            return new C3243l8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new C3134k8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3243l8.class) {
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
