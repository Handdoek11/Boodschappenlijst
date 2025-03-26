package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4977n2 extends AbstractC5010r4 implements Y4 {
    private static final C4977n2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private A4 zzk = AbstractC5010r4.C();

    /* renamed from: com.google.android.gms.internal.measurement.n2$a */
    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a A(long j8) {
            v();
            C4977n2.J((C4977n2) this.f29539s, j8);
            return this;
        }

        public final a B(a aVar) {
            v();
            C4977n2.K((C4977n2) this.f29539s, (C4977n2) ((AbstractC5010r4) aVar.u()));
            return this;
        }

        public final a C(Iterable iterable) {
            v();
            C4977n2.L((C4977n2) this.f29539s, iterable);
            return this;
        }

        public final a D(String str) {
            v();
            C4977n2.M((C4977n2) this.f29539s, str);
            return this;
        }

        public final a E() {
            v();
            C4977n2.H((C4977n2) this.f29539s);
            return this;
        }

        public final a F(String str) {
            v();
            C4977n2.P((C4977n2) this.f29539s, str);
            return this;
        }

        public final a G() {
            v();
            C4977n2.O((C4977n2) this.f29539s);
            return this;
        }

        public final a H() {
            v();
            C4977n2.R((C4977n2) this.f29539s);
            return this;
        }

        public final a I() {
            v();
            C4977n2.T((C4977n2) this.f29539s);
            return this;
        }

        public final String J() {
            return ((C4977n2) this.f29539s).W();
        }

        public final String K() {
            return ((C4977n2) this.f29539s).X();
        }

        public final int y() {
            return ((C4977n2) this.f29539s).Q();
        }

        public final a z(double d8) {
            v();
            C4977n2.I((C4977n2) this.f29539s, d8);
            return this;
        }

        private a() {
            super(C4977n2.zzc);
        }
    }

    static {
        C4977n2 c4977n2 = new C4977n2();
        zzc = c4977n2;
        AbstractC5010r4.u(C4977n2.class, c4977n2);
    }

    private C4977n2() {
    }

    static /* synthetic */ void H(C4977n2 c4977n2) {
        c4977n2.zze &= -17;
        c4977n2.zzj = 0.0d;
    }

    static /* synthetic */ void I(C4977n2 c4977n2, double d8) {
        c4977n2.zze |= 16;
        c4977n2.zzj = d8;
    }

    static /* synthetic */ void J(C4977n2 c4977n2, long j8) {
        c4977n2.zze |= 4;
        c4977n2.zzh = j8;
    }

    static /* synthetic */ void K(C4977n2 c4977n2, C4977n2 c4977n22) {
        c4977n22.getClass();
        c4977n2.e0();
        c4977n2.zzk.add(c4977n22);
    }

    static /* synthetic */ void L(C4977n2 c4977n2, Iterable iterable) {
        c4977n2.e0();
        C3.e(iterable, c4977n2.zzk);
    }

    static /* synthetic */ void M(C4977n2 c4977n2, String str) {
        str.getClass();
        c4977n2.zze |= 1;
        c4977n2.zzf = str;
    }

    static /* synthetic */ void O(C4977n2 c4977n2) {
        c4977n2.zze &= -5;
        c4977n2.zzh = 0L;
    }

    static /* synthetic */ void P(C4977n2 c4977n2, String str) {
        str.getClass();
        c4977n2.zze |= 2;
        c4977n2.zzg = str;
    }

    static /* synthetic */ void R(C4977n2 c4977n2) {
        c4977n2.zzk = AbstractC5010r4.C();
    }

    static /* synthetic */ void T(C4977n2 c4977n2) {
        c4977n2.zze &= -3;
        c4977n2.zzg = zzc.zzg;
    }

    public static a U() {
        return (a) zzc.x();
    }

    private final void e0() {
        A4 a42 = this.zzk;
        if (a42.a()) {
            return;
        }
        this.zzk = AbstractC5010r4.q(a42);
    }

    public final double G() {
        return this.zzj;
    }

    public final float N() {
        return this.zzi;
    }

    public final int Q() {
        return this.zzk.size();
    }

    public final long S() {
        return this.zzh;
    }

    public final String W() {
        return this.zzf;
    }

    public final String X() {
        return this.zzg;
    }

    public final List Y() {
        return this.zzk;
    }

    public final boolean Z() {
        return (this.zze & 16) != 0;
    }

    public final boolean a0() {
        return (this.zze & 8) != 0;
    }

    public final boolean b0() {
        return (this.zze & 4) != 0;
    }

    public final boolean c0() {
        return (this.zze & 1) != 0;
    }

    public final boolean d0() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4908f2.f29289a[i8 - 1]) {
            case 1:
                return new C4977n2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C4977n2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C4977n2.class) {
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
