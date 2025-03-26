package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;

/* loaded from: classes.dex */
public final class L1 extends AbstractC5010r4 implements Y4 {
    private static final L1 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private O1 zzf;
    private M1 zzg;
    private boolean zzh;
    private String zzi = "";

    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a y(String str) {
            v();
            L1.H((L1) this.f29539s, str);
            return this;
        }

        private a() {
            super(L1.zzc);
        }
    }

    static {
        L1 l12 = new L1();
        zzc = l12;
        AbstractC5010r4.u(L1.class, l12);
    }

    private L1() {
    }

    static /* synthetic */ void H(L1 l12, String str) {
        str.getClass();
        l12.zze |= 8;
        l12.zzi = str;
    }

    public static L1 I() {
        return zzc;
    }

    public final M1 J() {
        M1 m12 = this.zzg;
        return m12 == null ? M1.I() : m12;
    }

    public final O1 K() {
        O1 o12 = this.zzf;
        return o12 == null ? O1.I() : o12;
    }

    public final String L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzh;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final boolean P() {
        return (this.zze & 8) != 0;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (I1.f28889a[i8 - 1]) {
            case 1:
                return new L1();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (L1.class) {
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
