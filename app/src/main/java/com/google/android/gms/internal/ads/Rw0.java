package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Rw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Rw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private Qw0 zzd;
    private AbstractC3542nu0 zzf;
    private AbstractC3542nu0 zzg;
    private int zzh;
    private AbstractC3542nu0 zzi;
    private byte zzj = 2;
    private Zu0 zze = Qu0.v();

    static {
        Rw0 rw0 = new Rw0();
        zza = rw0;
        Qu0.F(Rw0.class, rw0);
    }

    private Rw0() {
        AbstractC3542nu0 abstractC3542nu0 = AbstractC3542nu0.f25048s;
        this.zzf = abstractC3542nu0;
        this.zzg = abstractC3542nu0;
        this.zzi = abstractC3542nu0;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        Ix0 ix0 = null;
        switch (pu0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzj);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzj = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return Qu0.A(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", Fw0.class, "zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new Rw0();
            case NEW_BUILDER:
                return new Ow0(ix0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                InterfaceC4633xv0 interfaceC4633xv0 = zzb;
                if (interfaceC4633xv0 == null) {
                    synchronized (Rw0.class) {
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
