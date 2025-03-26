package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.C4977n2;
import j$.util.DesugarCollections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4961l2 extends AbstractC5010r4 implements Y4 {
    private static final C4961l2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private A4 zzf = AbstractC5010r4.C();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* renamed from: com.google.android.gms.internal.measurement.l2$a */
    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a A(int i8, C4977n2.a aVar) {
            v();
            C4961l2.J((C4961l2) this.f29539s, i8, (C4977n2) ((AbstractC5010r4) aVar.u()));
            return this;
        }

        public final a B(int i8, C4977n2 c4977n2) {
            v();
            C4961l2.J((C4961l2) this.f29539s, i8, c4977n2);
            return this;
        }

        public final a C(long j8) {
            v();
            C4961l2.K((C4961l2) this.f29539s, j8);
            return this;
        }

        public final a D(C4977n2.a aVar) {
            v();
            C4961l2.L((C4961l2) this.f29539s, (C4977n2) ((AbstractC5010r4) aVar.u()));
            return this;
        }

        public final a E(C4977n2 c4977n2) {
            v();
            C4961l2.L((C4961l2) this.f29539s, c4977n2);
            return this;
        }

        public final a F(Iterable iterable) {
            v();
            C4961l2.M((C4961l2) this.f29539s, iterable);
            return this;
        }

        public final a G(String str) {
            v();
            C4961l2.N((C4961l2) this.f29539s, str);
            return this;
        }

        public final long H() {
            return ((C4961l2) this.f29539s).Q();
        }

        public final a I(long j8) {
            v();
            C4961l2.P((C4961l2) this.f29539s, j8);
            return this;
        }

        public final C4977n2 J(int i8) {
            return ((C4961l2) this.f29539s).G(i8);
        }

        public final long K() {
            return ((C4961l2) this.f29539s).R();
        }

        public final a L() {
            v();
            C4961l2.H((C4961l2) this.f29539s);
            return this;
        }

        public final String M() {
            return ((C4961l2) this.f29539s).U();
        }

        public final List N() {
            return DesugarCollections.unmodifiableList(((C4961l2) this.f29539s).V());
        }

        public final boolean O() {
            return ((C4961l2) this.f29539s).Y();
        }

        public final int y() {
            return ((C4961l2) this.f29539s).O();
        }

        public final a z(int i8) {
            v();
            C4961l2.I((C4961l2) this.f29539s, i8);
            return this;
        }

        private a() {
            super(C4961l2.zzc);
        }
    }

    static {
        C4961l2 c4961l2 = new C4961l2();
        zzc = c4961l2;
        AbstractC5010r4.u(C4961l2.class, c4961l2);
    }

    private C4961l2() {
    }

    static /* synthetic */ void H(C4961l2 c4961l2) {
        c4961l2.zzf = AbstractC5010r4.C();
    }

    static /* synthetic */ void I(C4961l2 c4961l2, int i8) {
        c4961l2.Z();
        c4961l2.zzf.remove(i8);
    }

    static /* synthetic */ void J(C4961l2 c4961l2, int i8, C4977n2 c4977n2) {
        c4977n2.getClass();
        c4961l2.Z();
        c4961l2.zzf.set(i8, c4977n2);
    }

    static /* synthetic */ void K(C4961l2 c4961l2, long j8) {
        c4961l2.zze |= 4;
        c4961l2.zzi = j8;
    }

    static /* synthetic */ void L(C4961l2 c4961l2, C4977n2 c4977n2) {
        c4977n2.getClass();
        c4961l2.Z();
        c4961l2.zzf.add(c4977n2);
    }

    static /* synthetic */ void M(C4961l2 c4961l2, Iterable iterable) {
        c4961l2.Z();
        C3.e(iterable, c4961l2.zzf);
    }

    static /* synthetic */ void N(C4961l2 c4961l2, String str) {
        str.getClass();
        c4961l2.zze |= 1;
        c4961l2.zzg = str;
    }

    static /* synthetic */ void P(C4961l2 c4961l2, long j8) {
        c4961l2.zze |= 2;
        c4961l2.zzh = j8;
    }

    public static a S() {
        return (a) zzc.x();
    }

    private final void Z() {
        A4 a42 = this.zzf;
        if (a42.a()) {
            return;
        }
        this.zzf = AbstractC5010r4.q(a42);
    }

    public final C4977n2 G(int i8) {
        return (C4977n2) this.zzf.get(i8);
    }

    public final int O() {
        return this.zzf.size();
    }

    public final long Q() {
        return this.zzi;
    }

    public final long R() {
        return this.zzh;
    }

    public final String U() {
        return this.zzg;
    }

    public final List V() {
        return this.zzf;
    }

    public final boolean W() {
        return (this.zze & 8) != 0;
    }

    public final boolean X() {
        return (this.zze & 4) != 0;
    }

    public final boolean Y() {
        return (this.zze & 2) != 0;
    }

    public final int k() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4908f2.f29289a[i8 - 1]) {
            case 1:
                return new C4961l2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C4977n2.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C4961l2.class) {
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
