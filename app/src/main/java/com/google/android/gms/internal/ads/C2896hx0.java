package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2896hx0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C2896hx0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private AbstractC3542nu0 zzf;
    private AbstractC3542nu0 zzg;

    static {
        C2896hx0 c2896hx0 = new C2896hx0();
        zza = c2896hx0;
        Qu0.F(C2896hx0.class, c2896hx0);
    }

    private C2896hx0() {
        AbstractC3542nu0 abstractC3542nu0 = AbstractC3542nu0.f25048s;
        this.zzf = abstractC3542nu0;
        this.zzg = abstractC3542nu0;
    }

    public static C2678fx0 b0() {
        return (C2678fx0) zza.q();
    }

    static /* synthetic */ void d0(C2896hx0 c2896hx0, AbstractC3542nu0 abstractC3542nu0) {
        abstractC3542nu0.getClass();
        c2896hx0.zzc |= 4;
        c2896hx0.zzf = abstractC3542nu0;
    }

    static /* synthetic */ void e0(C2896hx0 c2896hx0, String str) {
        c2896hx0.zzc |= 2;
        c2896hx0.zze = "image/png";
    }

    static /* synthetic */ void f0(C2896hx0 c2896hx0, int i8) {
        c2896hx0.zzd = 1;
        c2896hx0.zzc = 1 | c2896hx0.zzc;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", C2787gx0.f22463a, "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new C2896hx0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new C2678fx0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C2896hx0.class) {
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
