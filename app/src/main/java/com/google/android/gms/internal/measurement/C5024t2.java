package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5024t2 extends AbstractC5010r4 implements Y4 {
    private static final C5024t2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private int zzf;
    private InterfaceC5058x4 zzg = AbstractC5010r4.B();

    /* renamed from: com.google.android.gms.internal.measurement.t2$a */
    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a y(int i8) {
            v();
            C5024t2.H((C5024t2) this.f29539s, i8);
            return this;
        }

        public final a z(Iterable iterable) {
            v();
            C5024t2.I((C5024t2) this.f29539s, iterable);
            return this;
        }

        private a() {
            super(C5024t2.zzc);
        }
    }

    static {
        C5024t2 c5024t2 = new C5024t2();
        zzc = c5024t2;
        AbstractC5010r4.u(C5024t2.class, c5024t2);
    }

    private C5024t2() {
    }

    static /* synthetic */ void H(C5024t2 c5024t2, int i8) {
        c5024t2.zze |= 1;
        c5024t2.zzf = i8;
    }

    static /* synthetic */ void I(C5024t2 c5024t2, Iterable iterable) {
        InterfaceC5058x4 interfaceC5058x4 = c5024t2.zzg;
        if (!interfaceC5058x4.a()) {
            c5024t2.zzg = AbstractC5010r4.p(interfaceC5058x4);
        }
        C3.e(iterable, c5024t2.zzg);
    }

    public static a K() {
        return (a) zzc.x();
    }

    public final long G(int i8) {
        return this.zzg.A(i8);
    }

    public final int J() {
        return this.zzf;
    }

    public final List M() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4908f2.f29289a[i8 - 1]) {
            case 1:
                return new C5024t2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C5024t2.class) {
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
