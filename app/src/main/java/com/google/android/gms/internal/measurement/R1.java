package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import java.util.List;

/* loaded from: classes.dex */
public final class R1 extends AbstractC5010r4 implements Y4 {
    private static final R1 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private boolean zzi;
    private A4 zzf = AbstractC5010r4.C();
    private A4 zzg = AbstractC5010r4.C();
    private A4 zzh = AbstractC5010r4.C();
    private A4 zzj = AbstractC5010r4.C();

    public static final class a extends AbstractC5010r4 implements Y4 {
        private static final a zzc;
        private static volatile InterfaceC4893d5 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* renamed from: com.google.android.gms.internal.measurement.R1$a$a, reason: collision with other inner class name */
        public static final class C0230a extends AbstractC5010r4.b implements Y4 {
            private C0230a() {
                super(a.zzc);
            }
        }

        static {
            a aVar = new a();
            zzc = aVar;
            AbstractC5010r4.u(a.class, aVar);
        }

        private a() {
        }

        public final d H() {
            d a8 = d.a(this.zzg);
            return a8 == null ? d.CONSENT_STATUS_UNSPECIFIED : a8;
        }

        public final e I() {
            e a8 = e.a(this.zzf);
            return a8 == null ? e.CONSENT_TYPE_UNSPECIFIED : a8;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
        protected final Object r(int i8, Object obj, Object obj2) {
            switch (AbstractC4872b2.f29230a[i8 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0230a();
                case 3:
                    return AbstractC5010r4.s(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.c(), "zzg", d.c()});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC4893d5 interfaceC4893d5 = zzd;
                    if (interfaceC4893d5 == null) {
                        synchronized (a.class) {
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

    public static final class b extends AbstractC5010r4.b implements Y4 {
        private b() {
            super(R1.zzc);
        }
    }

    public static final class c extends AbstractC5010r4 implements Y4 {
        private static final c zzc;
        private static volatile InterfaceC4893d5 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public static final class a extends AbstractC5010r4.b implements Y4 {
            private a() {
                super(c.zzc);
            }
        }

        static {
            c cVar = new c();
            zzc = cVar;
            AbstractC5010r4.u(c.class, cVar);
        }

        private c() {
        }

        public final e H() {
            e a8 = e.a(this.zzg);
            return a8 == null ? e.CONSENT_TYPE_UNSPECIFIED : a8;
        }

        public final e I() {
            e a8 = e.a(this.zzf);
            return a8 == null ? e.CONSENT_TYPE_UNSPECIFIED : a8;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
        protected final Object r(int i8, Object obj, Object obj2) {
            switch (AbstractC4872b2.f29230a[i8 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return AbstractC5010r4.s(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.c(), "zzg", e.c()});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC4893d5 interfaceC4893d5 = zzd;
                    if (interfaceC4893d5 == null) {
                        synchronized (c.class) {
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

    public enum d implements InterfaceC5050w4 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);


        /* renamed from: o, reason: collision with root package name */
        private final int f29006o;

        d(int i8) {
            this.f29006o = i8;
        }

        public static d a(int i8) {
            if (i8 == 0) {
                return CONSENT_STATUS_UNSPECIFIED;
            }
            if (i8 == 1) {
                return GRANTED;
            }
            if (i8 != 2) {
                return null;
            }
            return DENIED;
        }

        public static InterfaceC5042v4 c() {
            return C4881c2.f29238a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f29006o + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC5050w4
        public final int zza() {
            return this.f29006o;
        }
    }

    public enum e implements InterfaceC5050w4 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);


        /* renamed from: o, reason: collision with root package name */
        private final int f29013o;

        e(int i8) {
            this.f29013o = i8;
        }

        public static e a(int i8) {
            if (i8 == 0) {
                return CONSENT_TYPE_UNSPECIFIED;
            }
            if (i8 == 1) {
                return AD_STORAGE;
            }
            if (i8 == 2) {
                return ANALYTICS_STORAGE;
            }
            if (i8 == 3) {
                return AD_USER_DATA;
            }
            if (i8 != 4) {
                return null;
            }
            return AD_PERSONALIZATION;
        }

        public static InterfaceC5042v4 c() {
            return C4890d2.f29269a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f29013o + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC5050w4
        public final int zza() {
            return this.f29013o;
        }
    }

    public static final class f extends AbstractC5010r4 implements Y4 {
        private static final f zzc;
        private static volatile InterfaceC4893d5 zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        public static final class a extends AbstractC5010r4.b implements Y4 {
            private a() {
                super(f.zzc);
            }
        }

        static {
            f fVar = new f();
            zzc = fVar;
            AbstractC5010r4.u(f.class, fVar);
        }

        private f() {
        }

        public final String H() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
        protected final Object r(int i8, Object obj, Object obj2) {
            switch (AbstractC4872b2.f29230a[i8 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a();
                case 3:
                    return AbstractC5010r4.s(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC4893d5 interfaceC4893d5 = zzd;
                    if (interfaceC4893d5 == null) {
                        synchronized (f.class) {
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

    static {
        R1 r12 = new R1();
        zzc = r12;
        AbstractC5010r4.u(R1.class, r12);
    }

    private R1() {
    }

    public static R1 H() {
        return zzc;
    }

    public final List I() {
        return this.zzh;
    }

    public final List J() {
        return this.zzf;
    }

    public final List K() {
        return this.zzg;
    }

    public final List L() {
        return this.zzj;
    }

    public final boolean M() {
        return this.zzi;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4872b2.f29230a[i8 - 1]) {
            case 1:
                return new R1();
            case 2:
                return new b();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", a.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", a.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (R1.class) {
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
