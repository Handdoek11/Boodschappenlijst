package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;

/* renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4935i2 extends AbstractC5010r4 implements Y4 {
    private static final C4935i2 zzc;
    private static volatile InterfaceC4893d5 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* renamed from: com.google.android.gms.internal.measurement.i2$a */
    public static final class a extends AbstractC5010r4.b implements Y4 {
        public final a A(boolean z7) {
            v();
            C4935i2.L((C4935i2) this.f29539s, z7);
            return this;
        }

        public final a B(boolean z7) {
            v();
            C4935i2.M((C4935i2) this.f29539s, z7);
            return this;
        }

        public final a C(boolean z7) {
            v();
            C4935i2.O((C4935i2) this.f29539s, z7);
            return this;
        }

        public final a D(boolean z7) {
            v();
            C4935i2.Q((C4935i2) this.f29539s, z7);
            return this;
        }

        public final a E(boolean z7) {
            v();
            C4935i2.S((C4935i2) this.f29539s, z7);
            return this;
        }

        public final a y(boolean z7) {
            v();
            C4935i2.H((C4935i2) this.f29539s, z7);
            return this;
        }

        public final a z(boolean z7) {
            v();
            C4935i2.J((C4935i2) this.f29539s, z7);
            return this;
        }

        private a() {
            super(C4935i2.zzc);
        }
    }

    static {
        C4935i2 c4935i2 = new C4935i2();
        zzc = c4935i2;
        AbstractC5010r4.u(C4935i2.class, c4935i2);
    }

    private C4935i2() {
    }

    public static a G() {
        return (a) zzc.x();
    }

    static /* synthetic */ void H(C4935i2 c4935i2, boolean z7) {
        c4935i2.zze |= 32;
        c4935i2.zzk = z7;
    }

    static /* synthetic */ void J(C4935i2 c4935i2, boolean z7) {
        c4935i2.zze |= 16;
        c4935i2.zzj = z7;
    }

    public static C4935i2 K() {
        return zzc;
    }

    static /* synthetic */ void L(C4935i2 c4935i2, boolean z7) {
        c4935i2.zze |= 1;
        c4935i2.zzf = z7;
    }

    static /* synthetic */ void M(C4935i2 c4935i2, boolean z7) {
        c4935i2.zze |= 64;
        c4935i2.zzl = z7;
    }

    static /* synthetic */ void O(C4935i2 c4935i2, boolean z7) {
        c4935i2.zze |= 2;
        c4935i2.zzg = z7;
    }

    static /* synthetic */ void Q(C4935i2 c4935i2, boolean z7) {
        c4935i2.zze |= 4;
        c4935i2.zzh = z7;
    }

    static /* synthetic */ void S(C4935i2 c4935i2, boolean z7) {
        c4935i2.zze |= 8;
        c4935i2.zzi = z7;
    }

    public final boolean N() {
        return this.zzk;
    }

    public final boolean P() {
        return this.zzj;
    }

    public final boolean R() {
        return this.zzf;
    }

    public final boolean T() {
        return this.zzl;
    }

    public final boolean U() {
        return this.zzg;
    }

    public final boolean V() {
        return this.zzh;
    }

    public final boolean W() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5010r4
    protected final Object r(int i8, Object obj, Object obj2) {
        switch (AbstractC4908f2.f29289a[i8 - 1]) {
            case 1:
                return new C4935i2();
            case 2:
                return new a();
            case 3:
                return AbstractC5010r4.s(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4893d5 interfaceC4893d5 = zzd;
                if (interfaceC4893d5 == null) {
                    synchronized (C4935i2.class) {
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
