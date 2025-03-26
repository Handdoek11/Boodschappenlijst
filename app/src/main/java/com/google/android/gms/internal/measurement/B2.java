package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import java.util.List;

/* loaded from: classes.dex */
public final class B2 extends AbstractC5010r4 implements Y4 {
    private static final B2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private String zzf = "";
    private A4 zzg = AbstractC5010r4.C();

    public static final class a extends AbstractC5010r4.b implements Y4 {
        private a() {
            super(B2.zzc);
        }
    }

    static {
        B2 b22 = new B2();
        zzc = b22;
        AbstractC5010r4.u(B2.class, b22);
    }

    private B2() {
    }

    public final String H() {
        return this.zzf;
    }

    public final List I() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (F2.f28867a[i8 - 1]) {
            case 1:
                return new B2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", D2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (B2.class) {
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
