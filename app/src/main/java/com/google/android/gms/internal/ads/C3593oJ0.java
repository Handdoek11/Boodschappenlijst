package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.oJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3593oJ0 implements K {

    /* renamed from: a, reason: collision with root package name */
    private final C3444n f25152a;

    /* renamed from: b, reason: collision with root package name */
    private final C4097t f25153b;

    /* renamed from: c, reason: collision with root package name */
    private D f25154c = new C2723gJ0().H();

    public C3593oJ0(C3444n c3444n, C4097t c4097t) {
        this.f25152a = c3444n;
        this.f25153b = c4097t;
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void A(long j8, long j9, long j10, long j11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void B(InterfaceC3117k interfaceC3117k) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void C(Surface surface, C4254uR c4254uR) {
        this.f25152a.m(surface);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void C0(boolean z7) {
        this.f25152a.c(z7);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void D(D d8) {
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void E(long j8, long j9) {
        try {
            this.f25153b.c(j8, j9);
        } catch (zzib e8) {
            throw new zzabg(e8, this.f25154c);
        }
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void F(boolean z7) {
        this.f25152a.e(z7);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void G(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final boolean H(long j8, boolean z7, long j9, long j10, J j11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void I(I i8, Executor executor) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final boolean U(boolean z7) {
        return this.f25152a.o(z7);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void a() {
        this.f25152a.b();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void e() {
        this.f25152a.d();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void h() {
        this.f25152a.g();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void i() {
        this.f25152a.h();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void t0(float f8) {
        this.f25152a.n(f8);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final boolean u() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void x(int i8) {
        this.f25152a.j(i8);
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void y(boolean z7) {
        if (z7) {
            this.f25152a.i();
        }
        this.f25153b.a();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void z(int i8, D d8) {
        D d9 = this.f25154c;
        int i9 = d9.f14341v;
        int i10 = d8.f14341v;
        if (i10 != i9 || d8.f14342w != d9.f14342w) {
            this.f25153b.b(i10, d8.f14342w);
        }
        float f8 = d8.f14343x;
        if (f8 != this.f25154c.f14343x) {
            this.f25152a.l(f8);
        }
        this.f25154c = d8;
    }

    @Override // com.google.android.gms.internal.ads.K
    public final Surface zza() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.K
    public final void zzb() {
        this.f25152a.m(null);
    }
}
