package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;

/* loaded from: classes.dex */
public final class S1 extends AbstractC5010r4 implements Y4 {
    private static final S1 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private String zzf = "";
    private A4 zzg = AbstractC5010r4.C();
    private boolean zzh;

    public static final class a extends AbstractC5010r4.b implements Y4 {
        private a() {
            super(S1.zzc);
        }
    }

    static {
        S1 s12 = new S1();
        zzc = s12;
        AbstractC5010r4.u(S1.class, s12);
    }

    private S1() {
    }

    public final String H() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4872b2.f29230a[i8 - 1]) {
            case 1:
                return new S1();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", X1.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (S1.class) {
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
