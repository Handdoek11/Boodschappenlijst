package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4051sd extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final Xu0 zzn = new a();
    private static final C4051sd zzo;
    private static volatile InterfaceC4633xv0 zzp;
    private C3725pd zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private Vu0 zzz = Qu0.r();

    /* renamed from: com.google.android.gms.internal.ads.sd$a */
    class a implements Xu0 {
        a() {
        }
    }

    static {
        C4051sd c4051sd = new C4051sd();
        zzo = c4051sd;
        Qu0.F(C4051sd.class, c4051sd);
    }

    private C4051sd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(long j8) {
        this.zzu |= 2048;
        this.zzH = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(EnumC1337Ge enumC1337Ge) {
        this.zzB = enumC1337Ge.zza();
        this.zzu |= 32;
    }

    public static C4160td E0() {
        return (C4160td) zzo.q();
    }

    public static C4051sd G0(byte[] bArr) {
        return (C4051sd) Qu0.M(zzo, bArr);
    }

    private void c0() {
        Vu0 vu0 = this.zzz;
        if (vu0.a()) {
            return;
        }
        this.zzz = Qu0.s(vu0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(Iterable iterable) {
        c0();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzz.K(((EnumC3836qe) it.next()).zza());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(EnumC1337Ge enumC1337Ge) {
        this.zzC = enumC1337Ge.zza();
        this.zzu |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(EnumC1337Ge enumC1337Ge) {
        this.zzD = enumC1337Ge.zza();
        this.zzu |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(int i8) {
        this.zzu |= 256;
        this.zzE = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(EnumC4378vd enumC4378vd) {
        this.zzG = enumC4378vd.zza();
        this.zzu |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(C3725pd c3725pd) {
        c3725pd.getClass();
        this.zzA = c3725pd;
        this.zzu |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(EnumC1337Ge enumC1337Ge) {
        this.zzF = enumC1337Ge.zza();
        this.zzu |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(long j8) {
        this.zzu |= 8;
        this.zzy = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(long j8) {
        this.zzu |= 4;
        this.zzx = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(EnumC1337Ge enumC1337Ge) {
        this.zzw = enumC1337Ge.zza();
        this.zzu |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(long j8) {
        this.zzu |= 1;
        this.zzv = j8;
    }

    public long C0() {
        return this.zzv;
    }

    public EnumC1337Ge D0() {
        EnumC1337Ge a8 = EnumC1337Ge.a(this.zzw);
        return a8 == null ? EnumC1337Ge.ENUM_FALSE : a8;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", EnumC1337Ge.c(), "zzx", "zzy", "zzz", EnumC3836qe.c(), "zzA", "zzB", EnumC1337Ge.c(), "zzC", EnumC1337Ge.c(), "zzD", EnumC1337Ge.c(), "zzE", "zzF", EnumC1337Ge.c(), "zzG", EnumC4378vd.c(), "zzH"});
        }
        if (ordinal == 3) {
            return new C4051sd();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C4160td();
        }
        if (ordinal == 5) {
            return zzo;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzp;
        if (interfaceC4633xv0 == null) {
            synchronized (C4051sd.class) {
                try {
                    interfaceC4633xv0 = zzp;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzo);
                        zzp = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
