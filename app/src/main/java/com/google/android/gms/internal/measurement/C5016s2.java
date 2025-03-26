package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5016s2 extends AbstractC5010r4 implements Y4 {
    private static final C5016s2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private InterfaceC5058x4 zze = AbstractC5010r4.B();
    private InterfaceC5058x4 zzf = AbstractC5010r4.B();
    private A4 zzg = AbstractC5010r4.C();
    private A4 zzh = AbstractC5010r4.C();

    /* renamed from: com.google.android.gms.internal.measurement.s2$a */
    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a A() {
            v();
            C5016s2.J((C5016s2) this.f29539s);
            return this;
        }

        public final a B(Iterable iterable) {
            v();
            C5016s2.K((C5016s2) this.f29539s, iterable);
            return this;
        }

        public final a C() {
            v();
            C5016s2.M((C5016s2) this.f29539s);
            return this;
        }

        public final a D(Iterable iterable) {
            v();
            C5016s2.N((C5016s2) this.f29539s, iterable);
            return this;
        }

        public final a E() {
            v();
            C5016s2.P((C5016s2) this.f29539s);
            return this;
        }

        public final a F(Iterable iterable) {
            v();
            C5016s2.Q((C5016s2) this.f29539s, iterable);
            return this;
        }

        public final a y() {
            v();
            C5016s2.G((C5016s2) this.f29539s);
            return this;
        }

        public final a z(Iterable iterable) {
            v();
            C5016s2.H((C5016s2) this.f29539s, iterable);
            return this;
        }

        private a() {
            super(C5016s2.zzc);
        }
    }

    static {
        C5016s2 c5016s2 = new C5016s2();
        zzc = c5016s2;
        AbstractC5010r4.u(C5016s2.class, c5016s2);
    }

    private C5016s2() {
    }

    static /* synthetic */ void G(C5016s2 c5016s2) {
        c5016s2.zzg = AbstractC5010r4.C();
    }

    static /* synthetic */ void H(C5016s2 c5016s2, Iterable iterable) {
        A4 a42 = c5016s2.zzg;
        if (!a42.a()) {
            c5016s2.zzg = AbstractC5010r4.q(a42);
        }
        C3.e(iterable, c5016s2.zzg);
    }

    static /* synthetic */ void J(C5016s2 c5016s2) {
        c5016s2.zzf = AbstractC5010r4.B();
    }

    static /* synthetic */ void K(C5016s2 c5016s2, Iterable iterable) {
        InterfaceC5058x4 interfaceC5058x4 = c5016s2.zzf;
        if (!interfaceC5058x4.a()) {
            c5016s2.zzf = AbstractC5010r4.p(interfaceC5058x4);
        }
        C3.e(iterable, c5016s2.zzf);
    }

    static /* synthetic */ void M(C5016s2 c5016s2) {
        c5016s2.zzh = AbstractC5010r4.C();
    }

    static /* synthetic */ void N(C5016s2 c5016s2, Iterable iterable) {
        A4 a42 = c5016s2.zzh;
        if (!a42.a()) {
            c5016s2.zzh = AbstractC5010r4.q(a42);
        }
        C3.e(iterable, c5016s2.zzh);
    }

    static /* synthetic */ void P(C5016s2 c5016s2) {
        c5016s2.zze = AbstractC5010r4.B();
    }

    static /* synthetic */ void Q(C5016s2 c5016s2, Iterable iterable) {
        InterfaceC5058x4 interfaceC5058x4 = c5016s2.zze;
        if (!interfaceC5058x4.a()) {
            c5016s2.zze = AbstractC5010r4.p(interfaceC5058x4);
        }
        C3.e(iterable, c5016s2.zze);
    }

    public static a R() {
        return (a) zzc.x();
    }

    public static C5016s2 T() {
        return zzc;
    }

    public final int I() {
        return this.zzf.size();
    }

    public final int L() {
        return this.zzh.size();
    }

    public final int O() {
        return this.zze.size();
    }

    public final List U() {
        return this.zzg;
    }

    public final List V() {
        return this.zzf;
    }

    public final List W() {
        return this.zzh;
    }

    public final List X() {
        return this.zze;
    }

    public final int k() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4908f2.f29289a[i8 - 1]) {
            case 1:
                return new C5016s2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C4953k2.class, "zzh", C5024t2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C5016s2.class) {
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
