package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.fs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC2667fs extends AbstractC3970rr implements TextureView.SurfaceTextureListener, InterfaceC1212Cr {

    /* renamed from: A, reason: collision with root package name */
    private String[] f22123A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f22124B;

    /* renamed from: C, reason: collision with root package name */
    private int f22125C;

    /* renamed from: D, reason: collision with root package name */
    private C1498Kr f22126D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f22127E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f22128F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f22129G;

    /* renamed from: H, reason: collision with root package name */
    private int f22130H;

    /* renamed from: I, reason: collision with root package name */
    private int f22131I;

    /* renamed from: J, reason: collision with root package name */
    private float f22132J;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC1567Mr f22133t;

    /* renamed from: u, reason: collision with root package name */
    private final C1602Nr f22134u;

    /* renamed from: v, reason: collision with root package name */
    private final Lr f22135v;

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC3862qr f22136w;

    /* renamed from: x, reason: collision with root package name */
    private Surface f22137x;

    /* renamed from: y, reason: collision with root package name */
    private AbstractC1248Dr f22138y;

    /* renamed from: z, reason: collision with root package name */
    private String f22139z;

    public TextureViewSurfaceTextureListenerC2667fs(Context context, C1602Nr c1602Nr, InterfaceC1567Mr interfaceC1567Mr, boolean z7, boolean z8, Lr lr) {
        super(context);
        this.f22125C = 1;
        this.f22133t = interfaceC1567Mr;
        this.f22134u = c1602Nr;
        this.f22127E = z7;
        this.f22135v = lr;
        setSurfaceTextureListener(this);
        c1602Nr.a(this);
    }

    private static String T(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void U() {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null) {
            abstractC1248Dr.H(true);
        }
    }

    private final void V() {
        if (this.f22128F) {
            return;
        }
        this.f22128F = true;
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.es
            @Override // java.lang.Runnable
            public final void run() {
                this.f21901o.D();
            }
        });
        l();
        this.f22134u.b();
        if (this.f22129G) {
            o();
        }
    }

    private final void W(boolean z7, Integer num) {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null && !z7) {
            abstractC1248Dr.G(num);
            return;
        }
        if (this.f22139z == null || this.f22137x == null) {
            return;
        }
        if (z7) {
            if (!d0()) {
                H2.p.g("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                abstractC1248Dr.L();
                Y();
            }
        }
        if (this.f22139z.startsWith("cache:")) {
            AbstractC1141As s02 = this.f22133t.s0(this.f22139z);
            if (s02 instanceof C1464Js) {
                AbstractC1248Dr t7 = ((C1464Js) s02).t();
                this.f22138y = t7;
                t7.G(num);
                if (!this.f22138y.M()) {
                    H2.p.g("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(s02 instanceof C1357Gs)) {
                    H2.p.g("Stream cache miss: ".concat(String.valueOf(this.f22139z)));
                    return;
                }
                C1357Gs c1357Gs = (C1357Gs) s02;
                String A7 = A();
                ByteBuffer w7 = c1357Gs.w();
                boolean x7 = c1357Gs.x();
                String v7 = c1357Gs.v();
                if (v7 == null) {
                    H2.p.g("Stream cache URL is null.");
                    return;
                } else {
                    AbstractC1248Dr z8 = z(num);
                    this.f22138y = z8;
                    z8.x(new Uri[]{Uri.parse(v7)}, A7, w7, x7);
                }
            }
        } else {
            this.f22138y = z(num);
            String A8 = A();
            Uri[] uriArr = new Uri[this.f22123A.length];
            int i8 = 0;
            while (true) {
                String[] strArr = this.f22123A;
                if (i8 >= strArr.length) {
                    break;
                }
                uriArr[i8] = Uri.parse(strArr[i8]);
                i8++;
            }
            this.f22138y.w(uriArr, A8);
        }
        this.f22138y.C(this);
        Z(this.f22137x, false);
        if (this.f22138y.M()) {
            int P7 = this.f22138y.P();
            this.f22125C = P7;
            if (P7 == 3) {
                V();
            }
        }
    }

    private final void X() {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null) {
            abstractC1248Dr.H(false);
        }
    }

    private final void Y() {
        if (this.f22138y != null) {
            Z(null, true);
            AbstractC1248Dr abstractC1248Dr = this.f22138y;
            if (abstractC1248Dr != null) {
                abstractC1248Dr.C(null);
                this.f22138y.y();
                this.f22138y = null;
            }
            this.f22125C = 1;
            this.f22124B = false;
            this.f22128F = false;
            this.f22129G = false;
        }
    }

    private final void Z(Surface surface, boolean z7) {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr == null) {
            H2.p.g("Trying to set surface before player is initialized.");
            return;
        }
        try {
            abstractC1248Dr.J(surface, z7);
        } catch (IOException e8) {
            H2.p.h("", e8);
        }
    }

    private final void a0() {
        b0(this.f22130H, this.f22131I);
    }

    private final void b0(int i8, int i9) {
        float f8 = i9 > 0 ? i8 / i9 : 1.0f;
        if (this.f22132J != f8) {
            this.f22132J = f8;
            requestLayout();
        }
    }

    private final boolean c0() {
        return d0() && this.f22125C != 1;
    }

    private final boolean d0() {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        return (abstractC1248Dr == null || !abstractC1248Dr.M() || this.f22124B) ? false : true;
    }

    final String A() {
        InterfaceC1567Mr interfaceC1567Mr = this.f22133t;
        return C2.v.t().H(interfaceC1567Mr.getContext(), interfaceC1567Mr.l().f2914o);
    }

    final /* synthetic */ void B(String str) {
        InterfaceC3862qr interfaceC3862qr = this.f22136w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.m("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void C() {
        InterfaceC3862qr interfaceC3862qr = this.f22136w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.zza();
        }
    }

    final /* synthetic */ void D() {
        InterfaceC3862qr interfaceC3862qr = this.f22136w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.c();
        }
    }

    final /* synthetic */ void E(boolean z7, long j8) {
        this.f22133t.l1(z7, j8);
    }

    final /* synthetic */ void F(String str) {
        InterfaceC3862qr interfaceC3862qr = this.f22136w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.B0("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void G() {
        InterfaceC3862qr interfaceC3862qr = this.f22136w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.g();
        }
    }

    final /* synthetic */ void H() {
        InterfaceC3862qr interfaceC3862qr = this.f22136w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1212Cr
    public final void I(int i8, int i9) {
        this.f22130H = i8;
        this.f22131I = i9;
        a0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1212Cr
    public final void J(int i8) {
        if (this.f22125C != i8) {
            this.f22125C = i8;
            if (i8 == 3) {
                V();
                return;
            }
            if (i8 != 4) {
                return;
            }
            if (this.f22135v.f16896a) {
                X();
            }
            this.f22134u.e();
            this.f26225s.c();
            G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ds
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21677o.C();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1212Cr
    public final void K(String str, Exception exc) {
        final String T7 = T("onLoadException", exc);
        H2.p.g("ExoPlayerAdapter exception: ".concat(T7));
        C2.v.s().w(exc, "AdExoPlayerView.onException");
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Zr
            @Override // java.lang.Runnable
            public final void run() {
                this.f20557o.F(T7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1212Cr
    public final void L(final boolean z7, final long j8) {
        if (this.f22133t != null) {
            AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Yr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20340o.E(z7, j8);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1212Cr
    public final void M(String str, Exception exc) {
        final String T7 = T(str, exc);
        H2.p.g("ExoPlayerAdapter error: ".concat(T7));
        this.f22124B = true;
        if (this.f22135v.f16896a) {
            X();
        }
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.cs
            @Override // java.lang.Runnable
            public final void run() {
                this.f21298o.B(T7);
            }
        });
        C2.v.s().w(exc, "AdExoPlayerView.onError");
    }

    final /* synthetic */ void N() {
        InterfaceC3862qr interfaceC3862qr = this.f22136w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.f();
        }
    }

    final /* synthetic */ void O(int i8, int i9) {
        InterfaceC3862qr interfaceC3862qr = this.f22136w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.a(i8, i9);
        }
    }

    final /* synthetic */ void P() {
        float a8 = this.f26225s.a();
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr == null) {
            H2.p.g("Trying to set volume before player is initialized.");
            return;
        }
        try {
            abstractC1248Dr.K(a8, false);
        } catch (IOException e8) {
            H2.p.h("", e8);
        }
    }

    final /* synthetic */ void Q(int i8) {
        InterfaceC3862qr interfaceC3862qr = this.f22136w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.onWindowVisibilityChanged(i8);
        }
    }

    final /* synthetic */ void R() {
        InterfaceC3862qr interfaceC3862qr = this.f22136w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.d();
        }
    }

    final /* synthetic */ void S() {
        InterfaceC3862qr interfaceC3862qr = this.f22136w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void a(int i8) {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null) {
            abstractC1248Dr.E(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void b(int i8) {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null) {
            abstractC1248Dr.I(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void c(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f22123A = new String[]{str};
        } else {
            this.f22123A = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f22139z;
        boolean z7 = false;
        if (this.f22135v.f16906k && str2 != null && !str.equals(str2) && this.f22125C == 4) {
            z7 = true;
        }
        this.f22139z = str;
        W(z7, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int d() {
        if (c0()) {
            return (int) this.f22138y.U();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int e() {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null) {
            return abstractC1248Dr.N();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int f() {
        if (c0()) {
            return (int) this.f22138y.V();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int g() {
        return this.f22131I;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int h() {
        return this.f22130H;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final long i() {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null) {
            return abstractC1248Dr.T();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final long j() {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null) {
            return abstractC1248Dr.r();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final long k() {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null) {
            return abstractC1248Dr.s();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr, com.google.android.gms.internal.ads.InterfaceC1672Pr
    public final void l() {
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Tr
            @Override // java.lang.Runnable
            public final void run() {
                this.f19181o.P();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final String m() {
        return "ExoPlayer/2".concat(true != this.f22127E ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void n() {
        if (c0()) {
            if (this.f22135v.f16896a) {
                X();
            }
            this.f22138y.F(false);
            this.f22134u.e();
            this.f26225s.c();
            G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.as
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20766o.R();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void o() {
        if (!c0()) {
            this.f22129G = true;
            return;
        }
        if (this.f22135v.f16896a) {
            U();
        }
        this.f22138y.F(true);
        this.f22134u.c();
        this.f26225s.b();
        this.f26224o.b();
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Sr
            @Override // java.lang.Runnable
            public final void run() {
                this.f18973o.S();
            }
        });
    }

    @Override // android.view.View
    protected final void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f8 = this.f22132J;
        if (f8 != 0.0f && this.f22126D == null) {
            float f9 = measuredWidth;
            float f10 = f9 / measuredHeight;
            if (f8 > f10) {
                measuredHeight = (int) (f9 / f8);
            }
            if (f8 < f10) {
                measuredWidth = (int) (measuredHeight * f8);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        C1498Kr c1498Kr = this.f22126D;
        if (c1498Kr != null) {
            c1498Kr.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
        if (this.f22127E) {
            C1498Kr c1498Kr = new C1498Kr(getContext());
            this.f22126D = c1498Kr;
            c1498Kr.c(surfaceTexture, i8, i9);
            this.f22126D.start();
            SurfaceTexture a8 = this.f22126D.a();
            if (a8 != null) {
                surfaceTexture = a8;
            } else {
                this.f22126D.d();
                this.f22126D = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f22137x = surface;
        if (this.f22138y == null) {
            W(false, null);
        } else {
            Z(surface, true);
            if (!this.f22135v.f16896a) {
                U();
            }
        }
        if (this.f22130H == 0 || this.f22131I == 0) {
            b0(i8, i9);
        } else {
            a0();
        }
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bs
            @Override // java.lang.Runnable
            public final void run() {
                this.f20995o.H();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        n();
        C1498Kr c1498Kr = this.f22126D;
        if (c1498Kr != null) {
            c1498Kr.d();
            this.f22126D = null;
        }
        if (this.f22138y != null) {
            X();
            Surface surface = this.f22137x;
            if (surface != null) {
                surface.release();
            }
            this.f22137x = null;
            Z(null, true);
        }
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Xr
            @Override // java.lang.Runnable
            public final void run() {
                this.f20152o.N();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i8, final int i9) {
        C1498Kr c1498Kr = this.f22126D;
        if (c1498Kr != null) {
            c1498Kr.b(i8, i9);
        }
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Wr
            @Override // java.lang.Runnable
            public final void run() {
                this.f19848o.O(i8, i9);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f22134u.f(this);
        this.f26224o.a(surfaceTexture, this.f22136w);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i8) {
        AbstractC0608p0.k("AdExoPlayerView3 window visibility changed to " + i8);
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Vr
            @Override // java.lang.Runnable
            public final void run() {
                this.f19662o.Q(i8);
            }
        });
        super.onWindowVisibilityChanged(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void p(int i8) {
        if (c0()) {
            this.f22138y.z(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void q(InterfaceC3862qr interfaceC3862qr) {
        this.f22136w = interfaceC3862qr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void r(String str) {
        if (str != null) {
            c(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void s() {
        if (d0()) {
            this.f22138y.L();
            Y();
        }
        this.f22134u.e();
        this.f26225s.c();
        this.f22134u.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void t(float f8, float f9) {
        C1498Kr c1498Kr = this.f22126D;
        if (c1498Kr != null) {
            c1498Kr.e(f8, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1212Cr
    public final void u() {
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Rr
            @Override // java.lang.Runnable
            public final void run() {
                this.f18712o.G();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final Integer v() {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null) {
            return abstractC1248Dr.t();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void w(int i8) {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null) {
            abstractC1248Dr.A(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void x(int i8) {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null) {
            abstractC1248Dr.B(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void y(int i8) {
        AbstractC1248Dr abstractC1248Dr = this.f22138y;
        if (abstractC1248Dr != null) {
            abstractC1248Dr.D(i8);
        }
    }

    final AbstractC1248Dr z(Integer num) {
        Lr lr = this.f22135v;
        InterfaceC1567Mr interfaceC1567Mr = this.f22133t;
        C2343ct c2343ct = new C2343ct(interfaceC1567Mr.getContext(), lr, interfaceC1567Mr, num);
        H2.p.f("ExoPlayerAdapter initialized.");
        return c2343ct;
    }
}
