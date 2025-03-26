package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.C5001q2;
import j$.util.DesugarCollections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4993p2 extends AbstractC5010r4 implements Y4 {
    private static final C4993p2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private A4 zzf = AbstractC5010r4.C();
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* renamed from: com.google.android.gms.internal.measurement.p2$a */
    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a A(Iterable iterable) {
            v();
            C4993p2.J((C4993p2) this.f29539s, iterable);
            return this;
        }

        public final a B(String str) {
            v();
            C4993p2.K((C4993p2) this.f29539s, str);
            return this;
        }

        public final C5001q2 C(int i8) {
            return ((C4993p2) this.f29539s).H(0);
        }

        public final a D() {
            v();
            C4993p2.M((C4993p2) this.f29539s);
            return this;
        }

        public final a E(String str) {
            v();
            C4993p2.N((C4993p2) this.f29539s, str);
            return this;
        }

        public final String F() {
            return ((C4993p2) this.f29539s).P();
        }

        public final List G() {
            return DesugarCollections.unmodifiableList(((C4993p2) this.f29539s).R());
        }

        public final int y() {
            return ((C4993p2) this.f29539s).k();
        }

        public final a z(C5001q2.a aVar) {
            v();
            C4993p2.I((C4993p2) this.f29539s, (C5001q2) ((AbstractC5010r4) aVar.u()));
            return this;
        }

        private a() {
            super(C4993p2.zzc);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.p2$b */
    public enum b implements InterfaceC5050w4 {
        SDK(0),
        SGTM(1);


        /* renamed from: o, reason: collision with root package name */
        private final int f29499o;

        b(int i8) {
            this.f29499o = i8;
        }

        public static b a(int i8) {
            if (i8 == 0) {
                return SDK;
            }
            if (i8 != 1) {
                return null;
            }
            return SGTM;
        }

        public static InterfaceC5042v4 c() {
            return C5064y2.f29649a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f29499o + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC5050w4
        public final int zza() {
            return this.f29499o;
        }
    }

    static {
        C4993p2 c4993p2 = new C4993p2();
        zzc = c4993p2;
        AbstractC5010r4.u(C4993p2.class, c4993p2);
    }

    private C4993p2() {
    }

    public static a G(C4993p2 c4993p2) {
        return (a) zzc.l(c4993p2);
    }

    static /* synthetic */ void I(C4993p2 c4993p2, C5001q2 c5001q2) {
        c5001q2.getClass();
        c4993p2.U();
        c4993p2.zzf.add(c5001q2);
    }

    static /* synthetic */ void J(C4993p2 c4993p2, Iterable iterable) {
        c4993p2.U();
        C3.e(iterable, c4993p2.zzf);
    }

    static /* synthetic */ void K(C4993p2 c4993p2, String str) {
        str.getClass();
        c4993p2.zze |= 1;
        c4993p2.zzg = str;
    }

    public static a L() {
        return (a) zzc.x();
    }

    static /* synthetic */ void M(C4993p2 c4993p2) {
        c4993p2.zzf = AbstractC5010r4.C();
    }

    static /* synthetic */ void N(C4993p2 c4993p2, String str) {
        str.getClass();
        c4993p2.zze |= 2;
        c4993p2.zzh = str;
    }

    private final void U() {
        A4 a42 = this.zzf;
        if (a42.a()) {
            return;
        }
        this.zzf = AbstractC5010r4.q(a42);
    }

    public final C5001q2 H(int i8) {
        return (C5001q2) this.zzf.get(0);
    }

    public final String P() {
        return this.zzg;
    }

    public final String Q() {
        return this.zzh;
    }

    public final List R() {
        return this.zzf;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final boolean T() {
        return (this.zze & 2) != 0;
    }

    public final int k() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4908f2.f29289a[i8 - 1]) {
            case 1:
                return new C4993p2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", C5001q2.class, "zzg", "zzh", "zzi", b.c()});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C4993p2.class) {
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
