package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.T1;
import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes.dex */
public final class U1 extends AbstractC5010r4 implements Y4 {
    private static final U1 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private R1 zzr;
    private W1 zzs;
    private Z1 zzt;
    private X1 zzu;
    private V1 zzv;
    private String zzg = "";
    private A4 zzi = AbstractC5010r4.C();
    private A4 zzj = AbstractC5010r4.C();
    private A4 zzk = AbstractC5010r4.C();
    private String zzl = "";
    private A4 zzn = AbstractC5010r4.C();
    private A4 zzo = AbstractC5010r4.C();
    private String zzp = "";
    private String zzq = "";

    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a A(int i8, T1.a aVar) {
            v();
            U1.I((U1) this.f29539s, i8, (T1) ((AbstractC5010r4) aVar.u()));
            return this;
        }

        public final a B() {
            v();
            U1.H((U1) this.f29539s);
            return this;
        }

        public final String C() {
            return ((U1) this.f29539s).R();
        }

        public final List D() {
            return DesugarCollections.unmodifiableList(((U1) this.f29539s).S());
        }

        public final List E() {
            return DesugarCollections.unmodifiableList(((U1) this.f29539s).T());
        }

        public final int y() {
            return ((U1) this.f29539s).J();
        }

        public final T1 z(int i8) {
            return ((U1) this.f29539s).G(i8);
        }

        private a() {
            super(U1.zzc);
        }
    }

    static {
        U1 u12 = new U1();
        zzc = u12;
        AbstractC5010r4.u(U1.class, u12);
    }

    private U1() {
    }

    static /* synthetic */ void H(U1 u12) {
        u12.zzk = AbstractC5010r4.C();
    }

    static /* synthetic */ void I(U1 u12, int i8, T1 t12) {
        t12.getClass();
        A4 a42 = u12.zzj;
        if (!a42.a()) {
            u12.zzj = AbstractC5010r4.q(a42);
        }
        u12.zzj.set(i8, t12);
    }

    public static a M() {
        return (a) zzc.x();
    }

    public static U1 O() {
        return zzc;
    }

    public final T1 G(int i8) {
        return (T1) this.zzj.get(i8);
    }

    public final int J() {
        return this.zzj.size();
    }

    public final long K() {
        return this.zzf;
    }

    public final R1 L() {
        R1 r12 = this.zzr;
        return r12 == null ? R1.H() : r12;
    }

    public final Z1 P() {
        Z1 z12 = this.zzt;
        return z12 == null ? Z1.H() : z12;
    }

    public final String Q() {
        return this.zzg;
    }

    public final String R() {
        return this.zzp;
    }

    public final List S() {
        return this.zzk;
    }

    public final List T() {
        return this.zzo;
    }

    public final List U() {
        return this.zzn;
    }

    public final List V() {
        return this.zzi;
    }

    public final boolean W() {
        return (this.zze & 128) != 0;
    }

    public final boolean X() {
        return (this.zze & 2) != 0;
    }

    public final boolean Y() {
        return (this.zze & 512) != 0;
    }

    public final boolean Z() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzn.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4872b2.f29230a[i8 - 1]) {
            case 1:
                return new U1();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", Y1.class, "zzj", T1.class, "zzk", J1.class, "zzl", "zzm", "zzn", C2.class, "zzo", S1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (U1.class) {
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
