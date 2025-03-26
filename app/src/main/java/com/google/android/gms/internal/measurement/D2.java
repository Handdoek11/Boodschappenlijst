package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import java.util.List;

/* loaded from: classes.dex */
public final class D2 extends AbstractC5010r4 implements Y4 {
    private static final D2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private int zzf;
    private A4 zzg = AbstractC5010r4.C();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    public enum a implements InterfaceC5050w4 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);


        /* renamed from: o, reason: collision with root package name */
        private final int f28853o;

        a(int i8) {
            this.f28853o = i8;
        }

        public static a a(int i8) {
            if (i8 == 0) {
                return UNKNOWN;
            }
            if (i8 == 1) {
                return STRING;
            }
            if (i8 == 2) {
                return NUMBER;
            }
            if (i8 == 3) {
                return BOOLEAN;
            }
            if (i8 != 4) {
                return null;
            }
            return STATEMENT;
        }

        public static InterfaceC5042v4 c() {
            return H2.f28882a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f28853o + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC5050w4
        public final int zza() {
            return this.f28853o;
        }
    }

    public static final class b extends AbstractC5010r4.b implements Y4 {
        private b() {
            super(D2.zzc);
        }
    }

    static {
        D2 d22 = new D2();
        zzc = d22;
        AbstractC5010r4.u(D2.class, d22);
    }

    private D2() {
    }

    public final double G() {
        return this.zzk;
    }

    public final a H() {
        a a8 = a.a(this.zzf);
        return a8 == null ? a.UNKNOWN : a8;
    }

    public final String J() {
        return this.zzh;
    }

    public final String K() {
        return this.zzi;
    }

    public final List L() {
        return this.zzg;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        return (this.zze & 8) != 0;
    }

    public final boolean O() {
        return (this.zze & 16) != 0;
    }

    public final boolean P() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (F2.f28867a[i8 - 1]) {
            case 1:
                return new D2();
            case 2:
                return new b();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", a.c(), "zzg", D2.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (D2.class) {
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
