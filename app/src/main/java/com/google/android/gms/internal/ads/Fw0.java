package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Fw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Fw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private AbstractC3542nu0 zzd;
    private AbstractC3542nu0 zze;
    private byte zzf = 2;

    static {
        Fw0 fw0 = new Fw0();
        zza = fw0;
        Qu0.F(Fw0.class, fw0);
    }

    private Fw0() {
        AbstractC3542nu0 abstractC3542nu0 = AbstractC3542nu0.f25048s;
        this.zzd = abstractC3542nu0;
        this.zze = abstractC3542nu0;
    }

    public static Ew0 b0() {
        return (Ew0) zza.q();
    }

    static /* synthetic */ void d0(Fw0 fw0, AbstractC3542nu0 abstractC3542nu0) {
        fw0.zzc |= 1;
        fw0.zzd = abstractC3542nu0;
    }

    static /* synthetic */ void e0(Fw0 fw0, AbstractC3542nu0 abstractC3542nu0) {
        fw0.zzc |= 2;
        fw0.zze = abstractC3542nu0;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        Ix0 ix0 = null;
        switch (pu0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return Qu0.A(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new Fw0();
            case NEW_BUILDER:
                return new Ew0(ix0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                InterfaceC4633xv0 interfaceC4633xv0 = zzb;
                if (interfaceC4633xv0 == null) {
                    synchronized (Fw0.class) {
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
            default:
                throw null;
        }
    }
}
