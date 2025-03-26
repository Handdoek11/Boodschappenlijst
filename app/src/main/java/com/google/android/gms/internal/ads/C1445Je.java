package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Je, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1445Je extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private static final C1445Je zzn;
    private static volatile InterfaceC4633xv0 zzo;
    private C1157Be zzA;
    private C1301Fe zzB;
    private C3725pd zzC;
    private C3071jd zzD;
    private C4596xd zzE;
    private C3727pe zzF;
    private C2422de zzG;
    private int zzp;
    private int zzu;
    private int zzw;
    private C1443Jd zzy;
    private String zzv = "";
    private int zzx = 1000;
    private Yu0 zzz = Qu0.t();

    static {
        C1445Je c1445Je = new C1445Je();
        zzn = c1445Je;
        Qu0.F(C1445Je.class, c1445Je);
    }

    private C1445Je() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(Iterable iterable) {
        p0();
        Wt0.j(iterable, this.zzz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.zzp |= 2;
        this.zzv = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(C4596xd c4596xd) {
        c4596xd.getClass();
        this.zzE = c4596xd;
        this.zzp |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(C3727pe c3727pe) {
        c3727pe.getClass();
        this.zzF = c3727pe;
        this.zzp |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        this.zzz = Qu0.t();
    }

    private void p0() {
        Yu0 yu0 = this.zzz;
        if (yu0.a()) {
            return;
        }
        this.zzz = Qu0.u(yu0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(C3071jd c3071jd) {
        c3071jd.getClass();
        this.zzD = c3071jd;
        this.zzp |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(C2422de c2422de) {
        c2422de.getClass();
        this.zzG = c2422de;
        this.zzp |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(C1157Be c1157Be) {
        c1157Be.getClass();
        this.zzA = c1157Be;
        this.zzp |= 32;
    }

    public static C1409Ie v0() {
        return (C1409Ie) zzn.q();
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzn, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", EnumC1337Ge.c(), "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
        }
        if (ordinal == 3) {
            return new C1445Je();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C1409Ie();
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzo;
        if (interfaceC4633xv0 == null) {
            synchronized (C1445Je.class) {
                try {
                    interfaceC4633xv0 = zzo;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzn);
                        zzo = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }

    public String k0() {
        return this.zzv;
    }

    public C3071jd t0() {
        C3071jd c3071jd = this.zzD;
        return c3071jd == null ? C3071jd.h0() : c3071jd;
    }

    public C1157Be u0() {
        C1157Be c1157Be = this.zzA;
        return c1157Be == null ? C1157Be.g0() : c1157Be;
    }
}
