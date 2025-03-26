package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2249c0 {

    /* renamed from: a, reason: collision with root package name */
    protected final W f21039a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC2141b0 f21040b;

    /* renamed from: c, reason: collision with root package name */
    protected Y f21041c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21042d;

    protected AbstractC2249c0(Z z7, InterfaceC2141b0 interfaceC2141b0, long j8, long j9, long j10, long j11, long j12, long j13, int i8) {
        this.f21040b = interfaceC2141b0;
        this.f21042d = i8;
        this.f21039a = new W(z7, j8, 0L, j10, j11, j12, j13);
    }

    protected static final int f(InterfaceC3989s0 interfaceC3989s0, long j8, O0 o02) {
        if (j8 == interfaceC3989s0.c()) {
            return 0;
        }
        o02.f17813a = j8;
        return 1;
    }

    protected static final boolean g(InterfaceC3989s0 interfaceC3989s0, long j8) {
        long c8 = j8 - interfaceC3989s0.c();
        if (c8 < 0 || c8 > 262144) {
            return false;
        }
        interfaceC3989s0.D((int) c8);
        return true;
    }

    public final int a(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        while (true) {
            Y y7 = this.f21041c;
            AbstractC3796qC.b(y7);
            long j8 = y7.f20173f;
            long j9 = y7.f20174g;
            long j10 = y7.f20175h;
            if (j9 - j8 <= this.f21042d) {
                c(false, j8);
                return f(interfaceC3989s0, j8, o02);
            }
            if (!g(interfaceC3989s0, j10)) {
                return f(interfaceC3989s0, j10, o02);
            }
            interfaceC3989s0.h();
            C2032a0 a8 = this.f21040b.a(interfaceC3989s0, y7.f20169b);
            int i8 = a8.f20612a;
            if (i8 == -3) {
                c(false, j10);
                return f(interfaceC3989s0, j10, o02);
            }
            if (i8 == -2) {
                Y.h(y7, a8.f20613b, a8.f20614c);
            } else {
                if (i8 != -1) {
                    g(interfaceC3989s0, a8.f20614c);
                    c(true, a8.f20614c);
                    return f(interfaceC3989s0, a8.f20614c, o02);
                }
                Y.g(y7, a8.f20613b, a8.f20614c);
            }
        }
    }

    public final R0 b() {
        return this.f21039a;
    }

    protected final void c(boolean z7, long j8) {
        this.f21041c = null;
        this.f21040b.zzb();
    }

    public final void d(long j8) {
        Y y7 = this.f21041c;
        if (y7 == null || y7.f20168a != j8) {
            W w7 = this.f21039a;
            this.f21041c = new Y(j8, w7.j(j8), 0L, w7.f19688c, w7.f19689d, w7.f19690e, w7.f19691f);
        }
    }

    public final boolean e() {
        return this.f21041c != null;
    }
}
