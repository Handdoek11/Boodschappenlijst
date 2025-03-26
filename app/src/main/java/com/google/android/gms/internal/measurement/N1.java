package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;

/* loaded from: classes.dex */
public final class N1 extends AbstractC5010r4 implements Y4 {
    private static final N1 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private L1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a y(String str) {
            v();
            N1.G((N1) this.f29539s, str);
            return this;
        }

        private a() {
            super(N1.zzc);
        }
    }

    static {
        N1 n12 = new N1();
        zzc = n12;
        AbstractC5010r4.u(N1.class, n12);
    }

    private N1() {
    }

    static /* synthetic */ void G(N1 n12, String str) {
        str.getClass();
        n12.zze |= 2;
        n12.zzg = str;
    }

    public static a I() {
        return (a) zzc.x();
    }

    public final L1 H() {
        L1 l12 = this.zzh;
        return l12 == null ? L1.I() : l12;
    }

    public final String K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        return this.zzk;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final boolean P() {
        return (this.zze & 32) != 0;
    }

    public final int k() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (I1.f28889a[i8 - 1]) {
            case 1:
                return new N1();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (N1.class) {
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
