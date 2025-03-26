package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;

/* renamed from: com.google.android.gms.internal.measurement.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5032u2 extends AbstractC5010r4 implements Y4 {
    private static final C5032u2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    /* renamed from: com.google.android.gms.internal.measurement.u2$a */
    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a A(long j8) {
            v();
            C5032u2.J((C5032u2) this.f29539s, j8);
            return this;
        }

        public final a B(String str) {
            v();
            C5032u2.K((C5032u2) this.f29539s, str);
            return this;
        }

        public final a C() {
            v();
            C5032u2.M((C5032u2) this.f29539s);
            return this;
        }

        public final a D(long j8) {
            v();
            C5032u2.N((C5032u2) this.f29539s, j8);
            return this;
        }

        public final a E(String str) {
            v();
            C5032u2.O((C5032u2) this.f29539s, str);
            return this;
        }

        public final a F() {
            v();
            C5032u2.Q((C5032u2) this.f29539s);
            return this;
        }

        public final a y() {
            v();
            C5032u2.H((C5032u2) this.f29539s);
            return this;
        }

        public final a z(double d8) {
            v();
            C5032u2.I((C5032u2) this.f29539s, d8);
            return this;
        }

        private a() {
            super(C5032u2.zzc);
        }
    }

    static {
        C5032u2 c5032u2 = new C5032u2();
        zzc = c5032u2;
        AbstractC5010r4.u(C5032u2.class, c5032u2);
    }

    private C5032u2() {
    }

    static /* synthetic */ void H(C5032u2 c5032u2) {
        c5032u2.zze &= -33;
        c5032u2.zzk = 0.0d;
    }

    static /* synthetic */ void I(C5032u2 c5032u2, double d8) {
        c5032u2.zze |= 32;
        c5032u2.zzk = d8;
    }

    static /* synthetic */ void J(C5032u2 c5032u2, long j8) {
        c5032u2.zze |= 8;
        c5032u2.zzi = j8;
    }

    static /* synthetic */ void K(C5032u2 c5032u2, String str) {
        str.getClass();
        c5032u2.zze |= 2;
        c5032u2.zzg = str;
    }

    static /* synthetic */ void M(C5032u2 c5032u2) {
        c5032u2.zze &= -9;
        c5032u2.zzi = 0L;
    }

    static /* synthetic */ void N(C5032u2 c5032u2, long j8) {
        c5032u2.zze |= 1;
        c5032u2.zzf = j8;
    }

    static /* synthetic */ void O(C5032u2 c5032u2, String str) {
        str.getClass();
        c5032u2.zze |= 4;
        c5032u2.zzh = str;
    }

    static /* synthetic */ void Q(C5032u2 c5032u2) {
        c5032u2.zze &= -5;
        c5032u2.zzh = zzc.zzh;
    }

    public static a S() {
        return (a) zzc.x();
    }

    public final double G() {
        return this.zzk;
    }

    public final float L() {
        return this.zzj;
    }

    public final long P() {
        return this.zzi;
    }

    public final long R() {
        return this.zzf;
    }

    public final String U() {
        return this.zzg;
    }

    public final String V() {
        return this.zzh;
    }

    public final boolean W() {
        return (this.zze & 32) != 0;
    }

    public final boolean X() {
        return (this.zze & 16) != 0;
    }

    public final boolean Y() {
        return (this.zze & 8) != 0;
    }

    public final boolean Z() {
        return (this.zze & 1) != 0;
    }

    public final boolean a0() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4908f2.f29289a[i8 - 1]) {
            case 1:
                return new C5032u2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C5032u2.class) {
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
