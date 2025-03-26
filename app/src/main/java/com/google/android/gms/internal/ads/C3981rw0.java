package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3981rw0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C3981rw0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzv;
    private long zzw;
    private boolean zzy;
    private String zzf = "";
    private Zu0 zzg = Qu0.v();
    private String zzl = "";
    private Zu0 zzu = Qu0.v();
    private Vu0 zzx = Qu0.r();
    private Vu0 zzz = Qu0.r();

    static {
        C3981rw0 c3981rw0 = new C3981rw0();
        zza = c3981rw0;
        Qu0.F(C3981rw0.class, c3981rw0);
    }

    private C3981rw0() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zzc", "zzd", C3873qw0.f26021a, "zze", "zzf", "zzg", "zzh", C3655ow0.f25304a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", C3546nw0.class, "zzv", "zzw", "zzx", AbstractC2458dw0.a(), "zzy", "zzz", C3764pw0.f25668a});
        }
        if (ordinal == 3) {
            return new C3981rw0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new C3219kw0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C3981rw0.class) {
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
