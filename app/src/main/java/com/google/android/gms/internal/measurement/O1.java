package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import java.util.List;

/* loaded from: classes.dex */
public final class O1 extends AbstractC5010r4 implements Y4 {
    private static final O1 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private A4 zzi = AbstractC5010r4.C();

    public static final class a extends AbstractC5010r4.b implements Y4 {
        private a() {
            super(O1.zzc);
        }
    }

    public enum b implements InterfaceC5050w4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);


        /* renamed from: o, reason: collision with root package name */
        private final int f28972o;

        b(int i8) {
            this.f28972o = i8;
        }

        public static b a(int i8) {
            switch (i8) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static InterfaceC5042v4 c() {
            return Q1.f28997a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f28972o + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC5050w4
        public final int zza() {
            return this.f28972o;
        }
    }

    static {
        O1 o12 = new O1();
        zzc = o12;
        AbstractC5010r4.u(O1.class, o12);
    }

    private O1() {
    }

    public static O1 I() {
        return zzc;
    }

    public final b G() {
        b a8 = b.a(this.zzf);
        return a8 == null ? b.UNKNOWN_MATCH_TYPE : a8;
    }

    public final String J() {
        return this.zzg;
    }

    public final List K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zze & 4) != 0;
    }

    public final boolean N() {
        return (this.zze & 2) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (I1.f28889a[i8 - 1]) {
            case 1:
                return new O1();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", b.c(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (O1.class) {
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
