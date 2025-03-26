package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import java.util.List;

/* loaded from: classes.dex */
public final class K1 extends AbstractC5010r4 implements Y4 {
    private static final K1 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private A4 zzh = AbstractC5010r4.C();
    private boolean zzi;
    private M1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a A(String str) {
            v();
            K1.I((K1) this.f29539s, str);
            return this;
        }

        public final L1 B(int i8) {
            return ((K1) this.f29539s).G(i8);
        }

        public final String C() {
            return ((K1) this.f29539s).N();
        }

        public final int y() {
            return ((K1) this.f29539s).k();
        }

        public final a z(int i8, L1 l12) {
            v();
            K1.H((K1) this.f29539s, i8, l12);
            return this;
        }

        private a() {
            super(K1.zzc);
        }
    }

    static {
        K1 k12 = new K1();
        zzc = k12;
        AbstractC5010r4.u(K1.class, k12);
    }

    private K1() {
    }

    static /* synthetic */ void H(K1 k12, int i8, L1 l12) {
        l12.getClass();
        A4 a42 = k12.zzh;
        if (!a42.a()) {
            k12.zzh = AbstractC5010r4.q(a42);
        }
        k12.zzh.set(i8, l12);
    }

    static /* synthetic */ void I(K1 k12, String str) {
        str.getClass();
        k12.zze |= 2;
        k12.zzg = str;
    }

    public static a K() {
        return (a) zzc.x();
    }

    public final L1 G(int i8) {
        return (L1) this.zzh.get(i8);
    }

    public final int J() {
        return this.zzf;
    }

    public final M1 M() {
        M1 m12 = this.zzj;
        return m12 == null ? M1.I() : m12;
    }

    public final String N() {
        return this.zzg;
    }

    public final List O() {
        return this.zzh;
    }

    public final boolean P() {
        return this.zzk;
    }

    public final boolean Q() {
        return this.zzl;
    }

    public final boolean R() {
        return this.zzm;
    }

    public final boolean S() {
        return (this.zze & 8) != 0;
    }

    public final boolean T() {
        return (this.zze & 1) != 0;
    }

    public final boolean U() {
        return (this.zze & 64) != 0;
    }

    public final int k() {
        return this.zzh.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (I1.f28889a[i8 - 1]) {
            case 1:
                return new K1();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", L1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (K1.class) {
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
