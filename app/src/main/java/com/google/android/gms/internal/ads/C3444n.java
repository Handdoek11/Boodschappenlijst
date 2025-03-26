package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3444n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3335m f24840a;

    /* renamed from: b, reason: collision with root package name */
    private final C3988s f24841b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24842c;

    /* renamed from: f, reason: collision with root package name */
    private long f24845f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f24848i;

    /* renamed from: d, reason: collision with root package name */
    private int f24843d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f24844e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f24846g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f24847h = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private float f24849j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    private RC f24850k = RC.f18620a;

    public C3444n(Context context, InterfaceC3335m interfaceC3335m, long j8) {
        this.f24840a = interfaceC3335m;
        this.f24841b = new C3988s(context);
    }

    private final void q(int i8) {
        this.f24843d = Math.min(this.f24843d, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r15 > 100000) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r20 >= r24) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (r17.f24842c != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r18, long r20, long r22, long r24, boolean r26, com.google.android.gms.internal.ads.C3226l r27) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3444n.a(long, long, long, long, boolean, com.google.android.gms.internal.ads.l):int");
    }

    public final void b() {
        if (this.f24843d == 0) {
            this.f24843d = 1;
        }
    }

    public final void c(boolean z7) {
        this.f24848i = z7;
        this.f24847h = -9223372036854775807L;
    }

    public final void d() {
        q(0);
    }

    public final void e(boolean z7) {
        this.f24843d = z7 ? 1 : 0;
    }

    public final void f() {
        q(2);
    }

    public final void g() {
        this.f24842c = true;
        this.f24845f = AbstractC2301cW.K(this.f24850k.zzb());
        this.f24841b.g();
    }

    public final void h() {
        this.f24842c = false;
        this.f24847h = -9223372036854775807L;
        this.f24841b.h();
    }

    public final void i() {
        this.f24841b.f();
        this.f24846g = -9223372036854775807L;
        this.f24844e = -9223372036854775807L;
        q(1);
        this.f24847h = -9223372036854775807L;
    }

    public final void j(int i8) {
        this.f24841b.j(i8);
    }

    public final void k(RC rc) {
        this.f24850k = rc;
    }

    public final void l(float f8) {
        this.f24841b.c(f8);
    }

    public final void m(Surface surface) {
        this.f24841b.i(surface);
        q(1);
    }

    public final void n(float f8) {
        AbstractC3796qC.d(f8 > 0.0f);
        if (f8 == this.f24849j) {
            return;
        }
        this.f24849j = f8;
        this.f24841b.e(f8);
    }

    public final boolean o(boolean z7) {
        boolean z8 = true;
        if (z7 && this.f24843d == 3) {
            this.f24847h = -9223372036854775807L;
        } else {
            if (this.f24847h == -9223372036854775807L) {
                return false;
            }
            if (this.f24850k.zzb() >= this.f24847h) {
                z8 = false;
                this.f24847h = -9223372036854775807L;
            }
        }
        return z8;
    }

    public final boolean p() {
        int i8 = this.f24843d;
        this.f24843d = 3;
        this.f24845f = AbstractC2301cW.K(this.f24850k.zzb());
        return i8 != 3;
    }
}
