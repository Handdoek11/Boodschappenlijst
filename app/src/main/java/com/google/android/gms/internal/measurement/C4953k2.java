package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;

/* renamed from: com.google.android.gms.internal.measurement.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4953k2 extends AbstractC5010r4 implements Y4 {
    private static final C4953k2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* renamed from: com.google.android.gms.internal.measurement.k2$a */
    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a y(int i8) {
            v();
            C4953k2.G((C4953k2) this.f29539s, i8);
            return this;
        }

        public final a z(long j8) {
            v();
            C4953k2.H((C4953k2) this.f29539s, j8);
            return this;
        }

        private a() {
            super(C4953k2.zzc);
        }
    }

    static {
        C4953k2 c4953k2 = new C4953k2();
        zzc = c4953k2;
        AbstractC5010r4.u(C4953k2.class, c4953k2);
    }

    private C4953k2() {
    }

    static /* synthetic */ void G(C4953k2 c4953k2, int i8) {
        c4953k2.zze |= 1;
        c4953k2.zzf = i8;
    }

    static /* synthetic */ void H(C4953k2 c4953k2, long j8) {
        c4953k2.zze |= 2;
        c4953k2.zzg = j8;
    }

    public static a J() {
        return (a) zzc.x();
    }

    public final long I() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zze & 2) != 0;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4908f2.f29289a[i8 - 1]) {
            case 1:
                return new C4953k2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C4953k2.class) {
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
