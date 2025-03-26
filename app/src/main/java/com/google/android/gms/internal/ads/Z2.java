package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.List;

/* loaded from: classes.dex */
public final class Z2 implements InterfaceC3880r0 {

    /* renamed from: e, reason: collision with root package name */
    private final Y0 f20390e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC4207u0 f20391f;

    /* renamed from: g, reason: collision with root package name */
    private Y0 f20392g;

    /* renamed from: h, reason: collision with root package name */
    private Y0 f20393h;

    /* renamed from: i, reason: collision with root package name */
    private int f20394i;

    /* renamed from: j, reason: collision with root package name */
    private C3503nb f20395j;

    /* renamed from: l, reason: collision with root package name */
    private long f20397l;

    /* renamed from: m, reason: collision with root package name */
    private long f20398m;

    /* renamed from: n, reason: collision with root package name */
    private long f20399n;

    /* renamed from: o, reason: collision with root package name */
    private int f20400o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC2147b3 f20401p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20402q;

    /* renamed from: a, reason: collision with root package name */
    private final UQ f20386a = new UQ(10);

    /* renamed from: b, reason: collision with root package name */
    private final K0 f20387b = new K0();

    /* renamed from: c, reason: collision with root package name */
    private final G0 f20388c = new G0();

    /* renamed from: k, reason: collision with root package name */
    private long f20396k = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    private final I0 f20389d = new I0();

    public Z2(int i8) {
        C3336m0 c3336m0 = new C3336m0();
        this.f20390e = c3336m0;
        this.f20393h = c3336m0;
        this.f20399n = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int c(com.google.android.gms.internal.ads.InterfaceC3989s0 r35) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Z2.c(com.google.android.gms.internal.ads.s0):int");
    }

    private final long e(long j8) {
        return this.f20396k + ((j8 * 1000000) / this.f20387b.f16492d);
    }

    private final void j() {
        InterfaceC2147b3 interfaceC2147b3 = this.f20401p;
        if ((interfaceC2147b3 instanceof X2) && interfaceC2147b3.e()) {
            long j8 = this.f20399n;
            if (j8 == -1 || j8 == this.f20401p.d()) {
                return;
            }
            this.f20401p = ((X2) this.f20401p).h(this.f20399n);
            InterfaceC4207u0 interfaceC4207u0 = this.f20391f;
            interfaceC4207u0.getClass();
            interfaceC4207u0.Q(this.f20401p);
        }
    }

    private static boolean k(int i8, long j8) {
        return ((long) (i8 & (-128000))) == (j8 & (-128000));
    }

    private final boolean l(InterfaceC3989s0 interfaceC3989s0) {
        InterfaceC2147b3 interfaceC2147b3 = this.f20401p;
        if (interfaceC2147b3 != null) {
            long d8 = interfaceC2147b3.d();
            if (d8 != -1 && interfaceC3989s0.b() > d8 - 4) {
                return true;
            }
        }
        try {
            return !interfaceC3989s0.G(this.f20386a.n(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean m(InterfaceC3989s0 interfaceC3989s0, boolean z7) {
        int i8;
        int i9;
        int b8;
        interfaceC3989s0.h();
        if (interfaceC3989s0.c() == 0) {
            C3503nb a8 = this.f20389d.a(interfaceC3989s0, null);
            this.f20395j = a8;
            if (a8 != null) {
                this.f20388c.b(a8);
            }
            i8 = (int) interfaceC3989s0.b();
            if (!z7) {
                interfaceC3989s0.D(i8);
            }
            i9 = 0;
        } else {
            i8 = 0;
            i9 = 0;
        }
        int i10 = i9;
        int i11 = i10;
        while (true) {
            if (!l(interfaceC3989s0)) {
                this.f20386a.l(0);
                int w7 = this.f20386a.w();
                if ((i9 == 0 || k(w7, i9)) && (b8 = L0.b(w7)) != -1) {
                    i10++;
                    if (i10 != 1) {
                        if (i10 == 4) {
                            break;
                        }
                    } else {
                        this.f20387b.a(w7);
                        i9 = w7;
                    }
                    interfaceC3989s0.z(b8 - 4);
                } else {
                    int i12 = i11 + 1;
                    if (i11 == (true != z7 ? 131072 : 32768)) {
                        if (z7) {
                            return false;
                        }
                        j();
                        throw new EOFException();
                    }
                    if (z7) {
                        interfaceC3989s0.h();
                        interfaceC3989s0.z(i8 + i12);
                    } else {
                        interfaceC3989s0.D(1);
                    }
                    i9 = 0;
                    i11 = i12;
                    i10 = 0;
                }
            } else if (i10 <= 0) {
                j();
                throw new EOFException();
            }
        }
        if (z7) {
            interfaceC3989s0.D(i8 + i11);
        } else {
            interfaceC3989s0.h();
        }
        this.f20394i = i9;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ InterfaceC3880r0 a() {
        return this;
    }

    public final void b() {
        this.f20402q = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ List d() {
        return AbstractC4169th0.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void f(long j8, long j9) {
        this.f20394i = 0;
        this.f20396k = -9223372036854775807L;
        this.f20397l = 0L;
        this.f20400o = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final int g(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        AbstractC3796qC.b(this.f20392g);
        int i8 = AbstractC2301cW.f21206a;
        return c(interfaceC3989s0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        return m(interfaceC3989s0, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f20391f = interfaceC4207u0;
        Y0 R7 = interfaceC4207u0.R(0, 1);
        this.f20392g = R7;
        this.f20393h = R7;
        this.f20391f.P();
    }
}
