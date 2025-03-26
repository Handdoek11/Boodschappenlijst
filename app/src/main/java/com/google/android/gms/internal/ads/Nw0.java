package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Nw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Nw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private Mw0 zzd;
    private AbstractC3542nu0 zzf;
    private AbstractC3542nu0 zzg;
    private int zzh;
    private byte zzi = 2;
    private Zu0 zze = Qu0.v();

    static {
        Nw0 nw0 = new Nw0();
        zza = nw0;
        Qu0.F(Nw0.class, nw0);
    }

    private Nw0() {
        AbstractC3542nu0 abstractC3542nu0 = AbstractC3542nu0.f25048s;
        this.zzf = abstractC3542nu0;
        this.zzg = abstractC3542nu0;
    }

    public static Kw0 b0() {
        return (Kw0) zza.q();
    }

    static /* synthetic */ void d0(Nw0 nw0, Fw0 fw0) {
        fw0.getClass();
        Zu0 zu0 = nw0.zze;
        if (!zu0.a()) {
            nw0.zze = Qu0.w(zu0);
        }
        nw0.zze.add(fw0);
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        Ix0 ix0 = null;
        switch (pu0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzi);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzi = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return Qu0.A(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", Fw0.class, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new Nw0();
            case NEW_BUILDER:
                return new Kw0(ix0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                InterfaceC4633xv0 interfaceC4633xv0 = zzb;
                if (interfaceC4633xv0 == null) {
                    synchronized (Nw0.class) {
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
