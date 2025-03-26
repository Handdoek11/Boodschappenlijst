package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.N1;
import java.util.List;

/* loaded from: classes.dex */
public final class J1 extends AbstractC5010r4 implements Y4 {
    private static final J1 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private int zzf;
    private A4 zzg = AbstractC5010r4.C();
    private A4 zzh = AbstractC5010r4.C();
    private boolean zzi;
    private boolean zzj;

    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a A(int i8, N1.a aVar) {
            v();
            J1.I((J1) this.f29539s, i8, (N1) ((AbstractC5010r4) aVar.u()));
            return this;
        }

        public final K1 B(int i8) {
            return ((J1) this.f29539s).G(i8);
        }

        public final int C() {
            return ((J1) this.f29539s).L();
        }

        public final N1 D(int i8) {
            return ((J1) this.f29539s).K(i8);
        }

        public final int y() {
            return ((J1) this.f29539s).J();
        }

        public final a z(int i8, K1.a aVar) {
            v();
            J1.H((J1) this.f29539s, i8, (K1) ((AbstractC5010r4) aVar.u()));
            return this;
        }

        private a() {
            super(J1.zzc);
        }
    }

    static {
        J1 j12 = new J1();
        zzc = j12;
        AbstractC5010r4.u(J1.class, j12);
    }

    private J1() {
    }

    static /* synthetic */ void H(J1 j12, int i8, K1 k12) {
        k12.getClass();
        A4 a42 = j12.zzh;
        if (!a42.a()) {
            j12.zzh = AbstractC5010r4.q(a42);
        }
        j12.zzh.set(i8, k12);
    }

    static /* synthetic */ void I(J1 j12, int i8, N1 n12) {
        n12.getClass();
        A4 a42 = j12.zzg;
        if (!a42.a()) {
            j12.zzg = AbstractC5010r4.q(a42);
        }
        j12.zzg.set(i8, n12);
    }

    public final K1 G(int i8) {
        return (K1) this.zzh.get(i8);
    }

    public final int J() {
        return this.zzh.size();
    }

    public final N1 K(int i8) {
        return (N1) this.zzg.get(i8);
    }

    public final int L() {
        return this.zzg.size();
    }

    public final List N() {
        return this.zzh;
    }

    public final List O() {
        return this.zzg;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (I1.f28889a[i8 - 1]) {
            case 1:
                return new J1();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", N1.class, "zzh", K1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (J1.class) {
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
