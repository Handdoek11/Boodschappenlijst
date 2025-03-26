package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;

/* loaded from: classes.dex */
public final class Z1 extends AbstractC5010r4 implements Y4 {
    private static final Z1 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    public static final class a extends AbstractC5010r4.b implements Y4 {
        private a() {
            super(Z1.zzc);
        }
    }

    static {
        Z1 z12 = new Z1();
        zzc = z12;
        AbstractC5010r4.u(Z1.class, z12);
    }

    private Z1() {
    }

    public static Z1 H() {
        return zzc;
    }

    public final String I() {
        return this.zzg;
    }

    public final String J() {
        return this.zzf;
    }

    public final int k() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4872b2.f29230a[i8 - 1]) {
            case 1:
                return new Z1();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (Z1.class) {
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
