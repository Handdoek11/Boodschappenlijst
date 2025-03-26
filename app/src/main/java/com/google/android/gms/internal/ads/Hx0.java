package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Hx0 extends Qu0 implements InterfaceC3979rv0 {
    private static final Hx0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzc;
    private boolean zzj;
    private double zzk;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;
    private String zzd = "";
    private String zze = "";
    private int zzf = 4;
    private Zu0 zzg = Qu0.v();
    private String zzh = "";
    private String zzi = "";
    private Zu0 zzl = Qu0.v();

    static {
        Hx0 hx0 = new Hx0();
        zza = hx0;
        Qu0.F(Hx0.class, hx0);
    }

    private Hx0() {
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzc", "zzd", "zzf", Gx0.f15505a, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", Fx0.class, "zze", "zzm", Dx0.f14606a, "zzn", "zzo", "zzp", "zzu"});
        }
        if (ordinal == 3) {
            return new Hx0();
        }
        Ix0 ix0 = null;
        if (ordinal == 4) {
            return new Cx0(ix0);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (Hx0.class) {
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
