package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class U8 extends Qu0 implements InterfaceC3979rv0 {
    private static final U8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private Zu0 zzd = Qu0.v();
    private AbstractC3542nu0 zze = AbstractC3542nu0.f25048s;
    private int zzf = 1;
    private int zzg = 1;

    static {
        U8 u8 = new U8();
        zza = u8;
        Qu0.F(U8.class, u8);
    }

    private U8() {
    }

    public static T8 b0() {
        return (T8) zza.q();
    }

    static /* synthetic */ void d0(U8 u8, AbstractC3542nu0 abstractC3542nu0) {
        Zu0 zu0 = u8.zzd;
        if (!zu0.a()) {
            u8.zzd = Qu0.w(zu0);
        }
        u8.zzd.add(abstractC3542nu0);
    }

    static /* synthetic */ void e0(U8 u8, AbstractC3542nu0 abstractC3542nu0) {
        u8.zzc |= 1;
        u8.zze = abstractC3542nu0;
    }

    static /* synthetic */ void f0(U8 u8, int i8) {
        u8.zzg = i8 - 1;
        u8.zzc |= 4;
    }

    static /* synthetic */ void g0(U8 u8, int i8) {
        u8.zzf = 4;
        u8.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", O8.f17841a, "zzg", K8.f16523a});
        }
        if (ordinal == 3) {
            return new U8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new T8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (U8.class) {
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
