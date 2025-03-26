package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;

/* loaded from: classes.dex */
public final class T1 extends AbstractC5010r4 implements Y4 {
    private static final T1 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final String A() {
            return ((T1) this.f29539s).I();
        }

        public final boolean B() {
            return ((T1) this.f29539s).J();
        }

        public final boolean C() {
            return ((T1) this.f29539s).K();
        }

        public final boolean D() {
            return ((T1) this.f29539s).L();
        }

        public final boolean E() {
            return ((T1) this.f29539s).M();
        }

        public final boolean F() {
            return ((T1) this.f29539s).N();
        }

        public final int y() {
            return ((T1) this.f29539s).k();
        }

        public final a z(String str) {
            v();
            T1.G((T1) this.f29539s, str);
            return this;
        }

        private a() {
            super(T1.zzc);
        }
    }

    static {
        T1 t12 = new T1();
        zzc = t12;
        AbstractC5010r4.u(T1.class, t12);
    }

    private T1() {
    }

    static /* synthetic */ void G(T1 t12, String str) {
        str.getClass();
        t12.zze |= 1;
        t12.zzf = str;
    }

    public final String I() {
        return this.zzf;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zze & 2) != 0;
    }

    public final boolean M() {
        return (this.zze & 4) != 0;
    }

    public final boolean N() {
        return (this.zze & 8) != 0;
    }

    public final int k() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4872b2.f29230a[i8 - 1]) {
            case 1:
                return new T1();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (T1.class) {
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
