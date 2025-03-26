package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2357d implements K, InterfaceC2465e {

    /* renamed from: a, reason: collision with root package name */
    private final int f21364a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f21365b;

    /* renamed from: c, reason: collision with root package name */
    private final C3226l f21366c;

    /* renamed from: d, reason: collision with root package name */
    private D f21367d;

    /* renamed from: e, reason: collision with root package name */
    private long f21368e;

    /* renamed from: f, reason: collision with root package name */
    private long f21369f;

    /* renamed from: g, reason: collision with root package name */
    private long f21370g;

    /* renamed from: h, reason: collision with root package name */
    private long f21371h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21372i;

    /* renamed from: j, reason: collision with root package name */
    private long f21373j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21374k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21375l;

    /* renamed from: m, reason: collision with root package name */
    private long f21376m;

    /* renamed from: n, reason: collision with root package name */
    private I f21377n;

    /* renamed from: o, reason: collision with root package name */
    private Executor f21378o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ C3008j f21379p;

    public C2357d(C3008j c3008j, Context context) {
        this.f21379p = c3008j;
        this.f21364a = true != AbstractC2301cW.k(context) ? 5 : 1;
        this.f21365b = new ArrayList();
        this.f21366c = new C3226l();
        this.f21373j = -9223372036854775807L;
        this.f21377n = I.f15838a;
        this.f21378o = C3008j.f23142o;
    }

    private final void f() {
        if (this.f21367d == null) {
            return;
        }
        new ArrayList(this.f21365b);
        D d8 = this.f21367d;
        d8.getClass();
        C2723gJ0 b8 = d8.b();
        b8.b(C3008j.v(d8.f14310C));
        b8.H();
        AbstractC3796qC.b(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void A(long j8, long j9, long j10, long j11) {
        boolean z7 = this.f21372i;
        boolean z8 = true;
        if (this.f21369f == j9 && this.f21370g == j10) {
            z8 = false;
        }
        this.f21372i = z7 | z8;
        this.f21368e = j8;
        this.f21369f = j9;
        this.f21370g = j10;
        this.f21371h = j11;
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void B(InterfaceC3117k interfaceC3117k) {
        this.f21379p.f23152j = interfaceC3117k;
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void C(Surface surface, C4254uR c4254uR) {
        this.f21379p.s(surface, c4254uR);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void C0(boolean z7) {
        this.f21379p.f23149g.C0(z7);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void D(D d8) {
        C3008j.c(this.f21379p, d8);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void E(long j8, long j9) {
        this.f21379p.f23149g.E(j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void F(boolean z7) {
        this.f21379p.f23149g.F(z7);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void G(List list) {
        if (this.f21365b.equals(list)) {
            return;
        }
        this.f21365b.clear();
        this.f21365b.addAll(list);
        this.f21365b.addAll(this.f21379p.f23148f);
        f();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final boolean H(long j8, boolean z7, long j9, long j10, J j11) {
        AbstractC3796qC.f(false);
        long j12 = j8 - this.f21370g;
        try {
            if (this.f21379p.f23145c.a(j12, j9, j10, this.f21368e, z7, this.f21366c) != 4) {
                if (j12 < this.f21371h && !z7) {
                    C4028sJ0 c4028sJ0 = (C4028sJ0) j11;
                    c4028sJ0.f26635d.a1(c4028sJ0.f26632a, c4028sJ0.f26633b, c4028sJ0.f26634c);
                    return true;
                }
                this.f21379p.f23149g.E(j9, j10);
                if (this.f21375l) {
                    long j13 = this.f21376m;
                    if (j13 == -9223372036854775807L || C3008j.t(this.f21379p, j13)) {
                        f();
                        this.f21375l = false;
                        this.f21376m = -9223372036854775807L;
                    }
                }
                AbstractC3796qC.b(null);
                throw null;
            }
            return false;
        } catch (zzib e8) {
            D d8 = this.f21367d;
            AbstractC3796qC.b(d8);
            throw new zzabg(e8, d8);
        }
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void I(I i8, Executor executor) {
        this.f21377n = i8;
        this.f21378o = executor;
    }

    @Override // com.google.android.gms.internal.ads.K
    public final boolean U(boolean z7) {
        return this.f21379p.f23149g.U(false);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void a() {
        this.f21379p.f23149g.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2465e
    public final void b(C3008j c3008j) {
        final I i8 = this.f21377n;
        this.f21378o.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                i8.c(this.f21037o);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2465e
    public final void c(C3008j c3008j) {
        final I i8 = this.f21377n;
        this.f21378o.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.IJ0
            @Override // java.lang.Runnable
            public final void run() {
                i8.a(this.f15923o);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2465e
    public final void d(C3008j c3008j, final C4408vs c4408vs) {
        final I i8 = this.f21377n;
        this.f21378o.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.HJ0
            @Override // java.lang.Runnable
            public final void run() {
                i8.b(this.f15708o, c4408vs);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void e() {
        this.f21379p.f23149g.e();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void h() {
        this.f21379p.f23149g.h();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void i() {
        this.f21379p.f23149g.i();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void j() {
        this.f21379p.r();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void t0(float f8) {
        this.f21379p.f23149g.t0(f8);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final boolean u() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.K
    public final boolean w() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void x(int i8) {
        this.f21379p.f23149g.x(i8);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void y(boolean z7) {
        this.f21374k = false;
        this.f21373j = -9223372036854775807L;
        C3008j.l(this.f21379p, z7);
        this.f21376m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void z(int i8, D d8) {
        AbstractC3796qC.f(false);
        this.f21367d = d8;
        if (this.f21374k) {
            AbstractC3796qC.f(this.f21373j != -9223372036854775807L);
            this.f21375l = true;
            this.f21376m = this.f21373j;
        } else {
            f();
            this.f21374k = true;
            this.f21375l = false;
            this.f21376m = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.K
    public final Surface zza() {
        AbstractC3796qC.f(false);
        AbstractC3796qC.b(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void zzb() {
        this.f21379p.p();
    }
}
