package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
final class Bz0 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, G, JD0, LH0, InterfaceC2499eG0, Ey0, InterfaceC4857zy0 {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Gz0 f14048o;

    /* synthetic */ Bz0(Gz0 gz0, Ez0 ez0) {
        this.f14048o = gz0;
    }

    @Override // com.google.android.gms.internal.ads.JD0
    public final void C(String str) {
        this.f14048o.f15561p.w(str);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void G0(String str) {
        this.f14048o.f15561p.l(str);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void H0(Hy0 hy0) {
        this.f14048o.f15561p.j(hy0);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void I0(String str, long j8, long j9) {
        this.f14048o.f15561p.f(str, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void J0(Object obj, long j8) {
        this.f14048o.f15561p.h(obj, j8);
        Gz0 gz0 = this.f14048o;
        if (gz0.f15530E == obj) {
            C2725gL c2725gL = gz0.f15556k;
            c2725gL.d(26, new DJ() { // from class: com.google.android.gms.internal.ads.Az0
                @Override // com.google.android.gms.internal.ads.DJ
                public final void a(Object obj2) {
                }
            });
            c2725gL.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void K0(Hy0 hy0) {
        this.f14048o.f15561p.d(hy0);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void L0(Exception exc) {
        this.f14048o.f15561p.e(exc);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void M0(D d8, Iy0 iy0) {
        this.f14048o.f15561p.m(d8, iy0);
    }

    @Override // com.google.android.gms.internal.ads.JD0
    public final void N(final boolean z7) {
        Gz0 gz0 = this.f14048o;
        if (gz0.f15537L == z7) {
            return;
        }
        gz0.f15537L = z7;
        C2725gL c2725gL = this.f14048o.f15556k;
        c2725gL.d(23, new DJ() { // from class: com.google.android.gms.internal.ads.yz0
            @Override // com.google.android.gms.internal.ads.DJ
            public final void a(Object obj) {
                ((InterfaceC1127Ah) obj).N(z7);
            }
        });
        c2725gL.c();
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void N0(int i8, long j8) {
        this.f14048o.f15561p.o(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void O0(long j8, int i8) {
        this.f14048o.f15561p.q(j8, i8);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void P0(final C4408vs c4408vs) {
        C2725gL c2725gL = this.f14048o.f15556k;
        c2725gL.d(25, new DJ() { // from class: com.google.android.gms.internal.ads.zz0
            @Override // com.google.android.gms.internal.ads.DJ
            public final void a(Object obj) {
                ((InterfaceC1127Ah) obj).V(c4408vs);
            }
        });
        c2725gL.c();
    }

    @Override // com.google.android.gms.internal.ads.JD0
    public final void a(Exception exc) {
        this.f14048o.f15561p.E(exc);
    }

    @Override // com.google.android.gms.internal.ads.JD0
    public final void b(KD0 kd0) {
        this.f14048o.f15561p.I(kd0);
    }

    @Override // com.google.android.gms.internal.ads.JD0
    public final void c(long j8) {
        this.f14048o.f15561p.b(j8);
    }

    @Override // com.google.android.gms.internal.ads.JD0
    public final void d(KD0 kd0) {
        this.f14048o.f15561p.u(kd0);
    }

    @Override // com.google.android.gms.internal.ads.JD0
    public final void e(int i8, long j8, long j9) {
        this.f14048o.f15561p.F(i8, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.JD0
    public final void f(String str, long j8, long j9) {
        this.f14048o.f15561p.B(str, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.JD0
    public final void g(D d8, Iy0 iy0) {
        this.f14048o.f15561p.g(d8, iy0);
    }

    @Override // com.google.android.gms.internal.ads.JD0
    public final void h(Exception exc) {
        this.f14048o.f15561p.D(exc);
    }

    @Override // com.google.android.gms.internal.ads.JD0
    public final void i(Hy0 hy0) {
        this.f14048o.f15561p.p(hy0);
    }

    @Override // com.google.android.gms.internal.ads.JD0
    public final void j(Hy0 hy0) {
        this.f14048o.f15561p.c(hy0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
        Gz0.H(this.f14048o, surfaceTexture);
        this.f14048o.Y(i8, i9);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f14048o.b0(null);
        this.f14048o.Y(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
        this.f14048o.Y(i8, i9);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
        this.f14048o.Y(i9, i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f14048o.Y(0, 0);
    }
}
