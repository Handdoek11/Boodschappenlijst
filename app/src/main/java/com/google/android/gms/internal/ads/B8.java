package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class B8 extends Qu0 implements InterfaceC3979rv0 {
    private static final B8 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        B8 b8 = new B8();
        zza = b8;
        Qu0.F(B8.class, b8);
    }

    private B8() {
    }

    public static A8 b0() {
        return (A8) zza.q();
    }

    static /* synthetic */ void d0(B8 b8) {
        b8.zzc &= -9;
        b8.zzg = -1L;
    }

    static /* synthetic */ void e0(B8 b8, long j8) {
        b8.zzc |= 8;
        b8.zzg = j8;
    }

    static /* synthetic */ void f0(B8 b8, long j8) {
        b8.zzc |= 32;
        b8.zzi = j8;
    }

    static /* synthetic */ void g0(B8 b8, long j8) {
        b8.zzc |= 4096;
        b8.zzp = j8;
    }

    static /* synthetic */ void h0(B8 b8, long j8) {
        b8.zzc |= 512;
        b8.zzm = j8;
    }

    static /* synthetic */ void i0(B8 b8, long j8) {
        b8.zzc |= 2048;
        b8.zzo = j8;
    }

    static /* synthetic */ void j0(B8 b8, long j8) {
        b8.zzc |= 4;
        b8.zzf = j8;
    }

    static /* synthetic */ void k0(B8 b8, long j8) {
        b8.zzc |= 16;
        b8.zzh = j8;
    }

    static /* synthetic */ void l0(B8 b8, long j8) {
        b8.zzc |= 128;
        b8.zzk = j8;
    }

    static /* synthetic */ void m0(B8 b8, long j8) {
        b8.zzc |= 131072;
        b8.zzy = j8;
    }

    static /* synthetic */ void n0(B8 b8, long j8) {
        b8.zzc |= 1;
        b8.zzd = j8;
    }

    static /* synthetic */ void o0(B8 b8, long j8) {
        b8.zzc |= 262144;
        b8.zzz = j8;
    }

    static /* synthetic */ void p0(B8 b8, long j8) {
        b8.zzc |= 2;
        b8.zze = j8;
    }

    static /* synthetic */ void q0(B8 b8, long j8) {
        b8.zzc |= 256;
        b8.zzl = j8;
    }

    static /* synthetic */ void r0(B8 b8, long j8) {
        b8.zzc |= 32768;
        b8.zzw = j8;
    }

    static /* synthetic */ void s0(B8 b8, long j8) {
        b8.zzc |= 65536;
        b8.zzx = j8;
    }

    static /* synthetic */ void t0(B8 b8, long j8) {
        b8.zzc |= 8192;
        b8.zzu = j8;
    }

    static /* synthetic */ void u0(B8 b8, long j8) {
        b8.zzc |= 16384;
        b8.zzv = j8;
    }

    static /* synthetic */ void v0(B8 b8, int i8) {
        b8.zzn = i8 - 1;
        b8.zzc |= 1024;
    }

    static /* synthetic */ void w0(B8 b8, int i8) {
        b8.zzj = i8 - 1;
        b8.zzc |= 64;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            Uu0 uu0 = L8.f16784a;
            return Qu0.A(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", uu0, "zzk", "zzl", "zzm", "zzn", uu0, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
        }
        if (ordinal == 3) {
            return new B8();
        }
        V8 v8 = null;
        if (ordinal == 4) {
            return new A8(v8);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (B8.class) {
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
