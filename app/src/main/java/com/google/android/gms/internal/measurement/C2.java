package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import java.util.List;

/* loaded from: classes.dex */
public final class C2 extends AbstractC5010r4 implements Y4 {
    private static final C2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private A4 zzf = AbstractC5010r4.C();
    private A2 zzg;

    public static final class a extends AbstractC5010r4.b implements Y4 {
        private a() {
            super(C2.zzc);
        }
    }

    static {
        C2 c22 = new C2();
        zzc = c22;
        AbstractC5010r4.u(C2.class, c22);
    }

    private C2() {
    }

    public final A2 G() {
        A2 a22 = this.zzg;
        return a22 == null ? A2.H() : a22;
    }

    public final List I() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (F2.f28867a[i8 - 1]) {
            case 1:
                return new C2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", D2.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C2.class) {
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
