package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;

/* renamed from: com.google.android.gms.internal.measurement.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4969m2 extends AbstractC5010r4 implements Y4 {
    private static final C4969m2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    /* renamed from: com.google.android.gms.internal.measurement.m2$a */
    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a y(long j8) {
            v();
            C4969m2.H((C4969m2) this.f29539s, j8);
            return this;
        }

        public final a z(String str) {
            v();
            C4969m2.I((C4969m2) this.f29539s, str);
            return this;
        }

        private a() {
            super(C4969m2.zzc);
        }
    }

    static {
        C4969m2 c4969m2 = new C4969m2();
        zzc = c4969m2;
        AbstractC5010r4.u(C4969m2.class, c4969m2);
    }

    private C4969m2() {
    }

    public static a G() {
        return (a) zzc.x();
    }

    static /* synthetic */ void H(C4969m2 c4969m2, long j8) {
        c4969m2.zze |= 2;
        c4969m2.zzg = j8;
    }

    static /* synthetic */ void I(C4969m2 c4969m2, String str) {
        str.getClass();
        c4969m2.zze |= 1;
        c4969m2.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4908f2.f29289a[i8 - 1]) {
            case 1:
                return new C4969m2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C4969m2.class) {
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
