package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.C5016s2;

/* renamed from: com.google.android.gms.internal.measurement.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4944j2 extends AbstractC5010r4 implements Y4 {
    private static final C4944j2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private int zzf;
    private C5016s2 zzg;
    private C5016s2 zzh;
    private boolean zzi;

    /* renamed from: com.google.android.gms.internal.measurement.j2$a */
    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a A(C5016s2 c5016s2) {
            v();
            C4944j2.K((C4944j2) this.f29539s, c5016s2);
            return this;
        }

        public final a B(boolean z7) {
            v();
            C4944j2.I((C4944j2) this.f29539s, z7);
            return this;
        }

        public final a y(int i8) {
            v();
            C4944j2.G((C4944j2) this.f29539s, i8);
            return this;
        }

        public final a z(C5016s2.a aVar) {
            v();
            C4944j2.H((C4944j2) this.f29539s, (C5016s2) ((AbstractC5010r4) aVar.u()));
            return this;
        }

        private a() {
            super(C4944j2.zzc);
        }
    }

    static {
        C4944j2 c4944j2 = new C4944j2();
        zzc = c4944j2;
        AbstractC5010r4.u(C4944j2.class, c4944j2);
    }

    private C4944j2() {
    }

    static /* synthetic */ void G(C4944j2 c4944j2, int i8) {
        c4944j2.zze |= 1;
        c4944j2.zzf = i8;
    }

    static /* synthetic */ void H(C4944j2 c4944j2, C5016s2 c5016s2) {
        c5016s2.getClass();
        c4944j2.zzg = c5016s2;
        c4944j2.zze |= 2;
    }

    static /* synthetic */ void I(C4944j2 c4944j2, boolean z7) {
        c4944j2.zze |= 8;
        c4944j2.zzi = z7;
    }

    public static a J() {
        return (a) zzc.x();
    }

    static /* synthetic */ void K(C4944j2 c4944j2, C5016s2 c5016s2) {
        c5016s2.getClass();
        c4944j2.zzh = c5016s2;
        c4944j2.zze |= 4;
    }

    public final C5016s2 M() {
        C5016s2 c5016s2 = this.zzg;
        return c5016s2 == null ? C5016s2.T() : c5016s2;
    }

    public final C5016s2 N() {
        C5016s2 c5016s2 = this.zzh;
        return c5016s2 == null ? C5016s2.T() : c5016s2;
    }

    public final boolean O() {
        return this.zzi;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    public final boolean R() {
        return (this.zze & 4) != 0;
    }

    public final int k() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4908f2.f29289a[i8 - 1]) {
            case 1:
                return new C4944j2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C4944j2.class) {
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
