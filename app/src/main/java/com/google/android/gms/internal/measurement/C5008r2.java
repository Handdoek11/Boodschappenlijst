package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.C4969m2;

/* renamed from: com.google.android.gms.internal.measurement.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5008r2 extends AbstractC5010r4 implements Y4 {
    private static final C5008r2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private int zzf = 1;
    private A4 zzg = AbstractC5010r4.C();

    /* renamed from: com.google.android.gms.internal.measurement.r2$a */
    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a y(C4969m2.a aVar) {
            v();
            C5008r2.H((C5008r2) this.f29539s, (C4969m2) ((AbstractC5010r4) aVar.u()));
            return this;
        }

        private a() {
            super(C5008r2.zzc);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.r2$b */
    public enum b implements InterfaceC5050w4 {
        RADS(1),
        PROVISIONING(2);


        /* renamed from: o, reason: collision with root package name */
        private final int f29528o;

        b(int i8) {
            this.f29528o = i8;
        }

        public static b a(int i8) {
            if (i8 == 1) {
                return RADS;
            }
            if (i8 != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static InterfaceC5042v4 c() {
            return C5072z2.f29660a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f29528o + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC5050w4
        public final int zza() {
            return this.f29528o;
        }
    }

    static {
        C5008r2 c5008r2 = new C5008r2();
        zzc = c5008r2;
        AbstractC5010r4.u(C5008r2.class, c5008r2);
    }

    private C5008r2() {
    }

    public static a G() {
        return (a) zzc.x();
    }

    static /* synthetic */ void H(C5008r2 c5008r2, C4969m2 c4969m2) {
        c4969m2.getClass();
        A4 a42 = c5008r2.zzg;
        if (!a42.a()) {
            c5008r2.zzg = AbstractC5010r4.q(a42);
        }
        c5008r2.zzg.add(c4969m2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4908f2.f29289a[i8 - 1]) {
            case 1:
                return new C5008r2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", b.c(), "zzg", C4969m2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C5008r2.class) {
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
