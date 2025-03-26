package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3548nx0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C3548nx0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private Nw0 zzf;
    private Rw0 zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private Vu0 zzi = Qu0.r();
    private String zzj = "";
    private Zu0 zzl = Qu0.v();

    static {
        C3548nx0 c3548nx0 = new C3548nx0();
        zza = c3548nx0;
        Qu0.F(C3548nx0.class, c3548nx0);
    }

    private C3548nx0() {
    }

    public static C3439mx0 c0() {
        return (C3439mx0) zza.q();
    }

    static /* synthetic */ void f0(C3548nx0 c3548nx0, String str) {
        str.getClass();
        Zu0 zu0 = c3548nx0.zzl;
        if (!zu0.a()) {
            c3548nx0.zzl = Qu0.w(zu0);
        }
        c3548nx0.zzl.add(str);
    }

    static /* synthetic */ void g0(C3548nx0 c3548nx0, int i8) {
        c3548nx0.zzc |= 1;
        c3548nx0.zzd = i8;
    }

    static /* synthetic */ void h0(C3548nx0 c3548nx0, Nw0 nw0) {
        nw0.getClass();
        c3548nx0.zzf = nw0;
        c3548nx0.zzc |= 4;
    }

    static /* synthetic */ void i0(C3548nx0 c3548nx0, String str) {
        str.getClass();
        c3548nx0.zzc |= 2;
        c3548nx0.zze = str;
    }

    static /* synthetic */ void j0(C3548nx0 c3548nx0, int i8) {
        c3548nx0.zzk = i8 - 1;
        c3548nx0.zzc |= 64;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        Ix0 ix0 = null;
        switch (pu0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzm);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzm = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return Qu0.A(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C3112jx0.f23478a, "zzl"});
            case NEW_MUTABLE_INSTANCE:
                return new C3548nx0();
            case NEW_BUILDER:
                return new C3439mx0(ix0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                InterfaceC4633xv0 interfaceC4633xv0 = zzb;
                if (interfaceC4633xv0 == null) {
                    synchronized (C3548nx0.class) {
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

    public final int b0() {
        return this.zzl.size();
    }

    public final String e0() {
        return this.zze;
    }
}
