package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ae, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2096ae extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C2096ae zzc;
    private static volatile InterfaceC4633xv0 zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C2096ae c2096ae = new C2096ae();
        zzc = c2096ae;
        Qu0.F(C2096ae.class, c2096ae);
    }

    private C2096ae() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z7) {
        this.zze |= 1;
        this.zzf = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i8) {
        this.zze |= 2;
        this.zzg = i8;
    }

    public static C2002Zd d0() {
        return (C2002Zd) zzc.q();
    }

    public static C2096ae f0() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new C2096ae();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C2002Zd();
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzd;
        if (interfaceC4633xv0 == null) {
            synchronized (C2096ae.class) {
                try {
                    interfaceC4633xv0 = zzd;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzc);
                        zzd = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
