package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import java.util.List;

/* loaded from: classes.dex */
public final class A2 extends AbstractC5010r4 implements Y4 {
    private static final A2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private A4 zze = AbstractC5010r4.C();

    public static final class a extends AbstractC5010r4.b implements Y4 {
        private a() {
            super(A2.zzc);
        }
    }

    static {
        A2 a22 = new A2();
        zzc = a22;
        AbstractC5010r4.u(A2.class, a22);
    }

    private A2() {
    }

    public static A2 H() {
        return zzc;
    }

    public final List I() {
        return this.zze;
    }

    public final int k() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (F2.f28867a[i8 - 1]) {
            case 1:
                return new A2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", B2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (A2.class) {
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
