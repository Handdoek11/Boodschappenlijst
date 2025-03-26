package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;

/* loaded from: classes.dex */
public final class M1 extends AbstractC5010r4 implements Y4 {
    private static final M1 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    public static final class a extends AbstractC5010r4.b implements Y4 {
        private a() {
            super(M1.zzc);
        }
    }

    public enum b implements InterfaceC5050w4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);


        /* renamed from: o, reason: collision with root package name */
        private final int f28945o;

        b(int i8) {
            this.f28945o = i8;
        }

        public static b a(int i8) {
            if (i8 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i8 == 1) {
                return LESS_THAN;
            }
            if (i8 == 2) {
                return GREATER_THAN;
            }
            if (i8 == 3) {
                return EQUAL;
            }
            if (i8 != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static InterfaceC5042v4 c() {
            return P1.f28979a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f28945o + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC5050w4
        public final int zza() {
            return this.f28945o;
        }
    }

    static {
        M1 m12 = new M1();
        zzc = m12;
        AbstractC5010r4.u(M1.class, m12);
    }

    private M1() {
    }

    public static M1 I() {
        return zzc;
    }

    public final b G() {
        b a8 = b.a(this.zzf);
        return a8 == null ? b.UNKNOWN_COMPARISON_TYPE : a8;
    }

    public final String J() {
        return this.zzh;
    }

    public final String K() {
        return this.zzj;
    }

    public final String L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final boolean O() {
        return (this.zze & 4) != 0;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final boolean Q() {
        return (this.zze & 16) != 0;
    }

    public final boolean R() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (I1.f28889a[i8 - 1]) {
            case 1:
                return new M1();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", b.c(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (M1.class) {
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
