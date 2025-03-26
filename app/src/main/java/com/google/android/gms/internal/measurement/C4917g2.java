package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;

/* renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4917g2 extends AbstractC5010r4 implements Y4 {
    private static final C4917g2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    /* renamed from: com.google.android.gms.internal.measurement.g2$a */
    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a A(String str) {
            v();
            C4917g2.J((C4917g2) this.f29539s, str);
            return this;
        }

        public final long B() {
            return ((C4917g2) this.f29539s).K();
        }

        public final a C(long j8) {
            v();
            C4917g2.M((C4917g2) this.f29539s, j8);
            return this;
        }

        public final a D(String str) {
            v();
            C4917g2.N((C4917g2) this.f29539s, str);
            return this;
        }

        public final a E() {
            v();
            C4917g2.H((C4917g2) this.f29539s);
            return this;
        }

        public final a F(String str) {
            v();
            C4917g2.Q((C4917g2) this.f29539s, str);
            return this;
        }

        public final a G() {
            v();
            C4917g2.L((C4917g2) this.f29539s);
            return this;
        }

        public final a H(String str) {
            v();
            C4917g2.T((C4917g2) this.f29539s, str);
            return this;
        }

        public final a I() {
            v();
            C4917g2.P((C4917g2) this.f29539s);
            return this;
        }

        public final a J(String str) {
            v();
            C4917g2.W((C4917g2) this.f29539s, str);
            return this;
        }

        public final a K() {
            v();
            C4917g2.S((C4917g2) this.f29539s);
            return this;
        }

        public final a L(String str) {
            v();
            C4917g2.Z((C4917g2) this.f29539s, str);
            return this;
        }

        public final a M() {
            v();
            C4917g2.V((C4917g2) this.f29539s);
            return this;
        }

        public final a N() {
            v();
            C4917g2.Y((C4917g2) this.f29539s);
            return this;
        }

        public final long y() {
            return ((C4917g2) this.f29539s).G();
        }

        public final a z(long j8) {
            v();
            C4917g2.I((C4917g2) this.f29539s, j8);
            return this;
        }

        private a() {
            super(C4917g2.zzc);
        }
    }

    static {
        C4917g2 c4917g2 = new C4917g2();
        zzc = c4917g2;
        AbstractC5010r4.u(C4917g2.class, c4917g2);
    }

    private C4917g2() {
    }

    static /* synthetic */ void H(C4917g2 c4917g2) {
        c4917g2.zze &= -5;
        c4917g2.zzh = zzc.zzh;
    }

    static /* synthetic */ void I(C4917g2 c4917g2, long j8) {
        c4917g2.zze |= 8;
        c4917g2.zzi = j8;
    }

    static /* synthetic */ void J(C4917g2 c4917g2, String str) {
        str.getClass();
        c4917g2.zze |= 4;
        c4917g2.zzh = str;
    }

    static /* synthetic */ void L(C4917g2 c4917g2) {
        c4917g2.zze &= -3;
        c4917g2.zzg = zzc.zzg;
    }

    static /* synthetic */ void M(C4917g2 c4917g2, long j8) {
        c4917g2.zze |= 128;
        c4917g2.zzm = j8;
    }

    static /* synthetic */ void N(C4917g2 c4917g2, String str) {
        str.getClass();
        c4917g2.zze |= 2;
        c4917g2.zzg = str;
    }

    public static a O() {
        return (a) zzc.x();
    }

    static /* synthetic */ void P(C4917g2 c4917g2) {
        c4917g2.zze &= -2;
        c4917g2.zzf = zzc.zzf;
    }

    static /* synthetic */ void Q(C4917g2 c4917g2, String str) {
        str.getClass();
        c4917g2.zze |= 1;
        c4917g2.zzf = str;
    }

    static /* synthetic */ void S(C4917g2 c4917g2) {
        c4917g2.zze &= -65;
        c4917g2.zzl = zzc.zzl;
    }

    static /* synthetic */ void T(C4917g2 c4917g2, String str) {
        str.getClass();
        c4917g2.zze |= 64;
        c4917g2.zzl = str;
    }

    public static C4917g2 U() {
        return zzc;
    }

    static /* synthetic */ void V(C4917g2 c4917g2) {
        c4917g2.zze &= -33;
        c4917g2.zzk = zzc.zzk;
    }

    static /* synthetic */ void W(C4917g2 c4917g2, String str) {
        str.getClass();
        c4917g2.zze |= 32;
        c4917g2.zzk = str;
    }

    static /* synthetic */ void Y(C4917g2 c4917g2) {
        c4917g2.zze &= -17;
        c4917g2.zzj = zzc.zzj;
    }

    static /* synthetic */ void Z(C4917g2 c4917g2, String str) {
        str.getClass();
        c4917g2.zze |= 16;
        c4917g2.zzj = str;
    }

    public final long G() {
        return this.zzi;
    }

    public final long K() {
        return this.zzm;
    }

    public final String X() {
        return this.zzh;
    }

    public final String a0() {
        return this.zzg;
    }

    public final String b0() {
        return this.zzf;
    }

    public final String c0() {
        return this.zzl;
    }

    public final String d0() {
        return this.zzk;
    }

    public final String e0() {
        return this.zzj;
    }

    public final boolean f0() {
        return (this.zze & 4) != 0;
    }

    public final boolean g0() {
        return (this.zze & 2) != 0;
    }

    public final boolean h0() {
        return (this.zze & 1) != 0;
    }

    public final boolean i0() {
        return (this.zze & 8) != 0;
    }

    public final boolean j0() {
        return (this.zze & 128) != 0;
    }

    public final boolean k0() {
        return (this.zze & 64) != 0;
    }

    public final boolean l0() {
        return (this.zze & 32) != 0;
    }

    public final boolean m0() {
        return (this.zze & 16) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4908f2.f29289a[i8 - 1]) {
            case 1:
                return new C4917g2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C4917g2.class) {
                        try {
                            interfaceC4893d5 = zzd;
                            if (interfaceC4893d5 == null) {
                                interfaceC4893d5 = new AbstractC5010r4.a(zzc);
                                zzd = interfaceC4893d5;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC4893d5;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
