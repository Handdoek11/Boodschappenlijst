package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Ar, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1140Ar extends FrameLayout implements InterfaceC3862qr {

    /* renamed from: A, reason: collision with root package name */
    private boolean f13662A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f13663B;

    /* renamed from: C, reason: collision with root package name */
    private long f13664C;

    /* renamed from: D, reason: collision with root package name */
    private long f13665D;

    /* renamed from: E, reason: collision with root package name */
    private String f13666E;

    /* renamed from: F, reason: collision with root package name */
    private String[] f13667F;

    /* renamed from: G, reason: collision with root package name */
    private Bitmap f13668G;

    /* renamed from: H, reason: collision with root package name */
    private final ImageView f13669H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f13670I;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC1567Mr f13671o;

    /* renamed from: s, reason: collision with root package name */
    private final FrameLayout f13672s;

    /* renamed from: t, reason: collision with root package name */
    private final View f13673t;

    /* renamed from: u, reason: collision with root package name */
    private final C4818zf f13674u;

    /* renamed from: v, reason: collision with root package name */
    final RunnableC1637Or f13675v;

    /* renamed from: w, reason: collision with root package name */
    private final long f13676w;

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC3970rr f13677x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f13678y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f13679z;

    public C1140Ar(Context context, InterfaceC1567Mr interfaceC1567Mr, int i8, boolean z7, C4818zf c4818zf, Lr lr) {
        super(context);
        this.f13671o = interfaceC1567Mr;
        this.f13674u = c4818zf;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13672s = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Z2.r.l(interfaceC1567Mr.h());
        AbstractC4079sr abstractC4079sr = interfaceC1567Mr.h().f753a;
        C1602Nr c1602Nr = new C1602Nr(context, interfaceC1567Mr.l(), interfaceC1567Mr.s(), c4818zf, interfaceC1567Mr.i());
        AbstractC3970rr c3212kt = i8 == 3 ? new C3212kt(context, c1602Nr) : i8 == 2 ? new TextureViewSurfaceTextureListenerC2667fs(context, c1602Nr, interfaceC1567Mr, z7, AbstractC4079sr.a(interfaceC1567Mr), lr) : new TextureViewSurfaceTextureListenerC3753pr(context, interfaceC1567Mr, z7, AbstractC4079sr.a(interfaceC1567Mr), lr, new C1602Nr(context, interfaceC1567Mr.l(), interfaceC1567Mr.s(), c4818zf, interfaceC1567Mr.i()));
        this.f13677x = c3212kt;
        View view = new View(context);
        this.f13673t = view;
        view.setBackgroundColor(0);
        frameLayout.addView(c3212kt, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23774S)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23750P)).booleanValue()) {
            x();
        }
        this.f13669H = new ImageView(context);
        this.f13676w = ((Long) D2.A.c().a(AbstractC3184kf.f23790U)).longValue();
        boolean booleanValue = ((Boolean) D2.A.c().a(AbstractC3184kf.f23766R)).booleanValue();
        this.f13663B = booleanValue;
        if (c4818zf != null) {
            c4818zf.d("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.f13675v = new RunnableC1637Or(this);
        c3212kt.q(this);
    }

    private final void s() {
        if (this.f13671o.f() == null || !this.f13679z || this.f13662A) {
            return;
        }
        this.f13671o.f().getWindow().clearFlags(128);
        this.f13679z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer v7 = v();
        if (v7 != null) {
            hashMap.put("playerId", v7.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f13671o.D0("onVideoEvent", hashMap);
    }

    private final boolean u() {
        return this.f13669H.getParent() != null;
    }

    final /* synthetic */ void A(boolean z7) {
        t("windowFocusChanged", "hasWindowFocus", String.valueOf(z7));
    }

    public final void B(Integer num) {
        if (this.f13677x == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f13666E)) {
            t("no_src", new String[0]);
        } else {
            this.f13677x.c(this.f13666E, this.f13667F, num);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862qr
    public final void B0(String str, String str2) {
        t("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    public final void C() {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        abstractC3970rr.f26225s.d(true);
        abstractC3970rr.l();
    }

    final void D() {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        long d8 = abstractC3970rr.d();
        if (this.f13664C == d8 || d8 <= 0) {
            return;
        }
        float f8 = d8 / 1000.0f;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue()) {
            t("timeupdate", "time", String.valueOf(f8), "totalBytes", String.valueOf(this.f13677x.k()), "qoeCachedBytes", String.valueOf(this.f13677x.i()), "qoeLoadedBytes", String.valueOf(this.f13677x.j()), "droppedFrames", String.valueOf(this.f13677x.e()), "reportTime", String.valueOf(C2.v.c().a()));
        } else {
            t("timeupdate", "time", String.valueOf(f8));
        }
        this.f13664C = d8;
    }

    public final void E() {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        abstractC3970rr.n();
    }

    public final void F() {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        abstractC3970rr.o();
    }

    public final void G(int i8) {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        abstractC3970rr.p(i8);
    }

    public final void H(MotionEvent motionEvent) {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        abstractC3970rr.dispatchTouchEvent(motionEvent);
    }

    public final void I(int i8) {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        abstractC3970rr.w(i8);
    }

    public final void J(int i8) {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        abstractC3970rr.x(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862qr
    public final void a(int i8, int i9) {
        if (this.f13663B) {
            AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23782T;
            int max = Math.max(i8 / ((Integer) D2.A.c().a(abstractC2207bf)).intValue(), 1);
            int max2 = Math.max(i9 / ((Integer) D2.A.c().a(abstractC2207bf)).intValue(), 1);
            Bitmap bitmap = this.f13668G;
            if (bitmap != null && bitmap.getWidth() == max && this.f13668G.getHeight() == max2) {
                return;
            }
            this.f13668G = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.f13670I = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862qr
    public final void b() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23841a2)).booleanValue()) {
            this.f13675v.b();
        }
        if (this.f13671o.f() != null && !this.f13679z) {
            boolean z7 = (this.f13671o.f().getWindow().getAttributes().flags & 128) != 0;
            this.f13662A = z7;
            if (!z7) {
                this.f13671o.f().getWindow().addFlags(128);
                this.f13679z = true;
            }
        }
        this.f13678y = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862qr
    public final void c() {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr != null && this.f13665D == 0) {
            float f8 = abstractC3970rr.f();
            AbstractC3970rr abstractC3970rr2 = this.f13677x;
            t("canplaythrough", "duration", String.valueOf(f8 / 1000.0f), "videoWidth", String.valueOf(abstractC3970rr2.h()), "videoHeight", String.valueOf(abstractC3970rr2.g()));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862qr
    public final void d() {
        t("pause", new String[0]);
        s();
        this.f13678y = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862qr
    public final void e() {
        this.f13675v.b();
        G2.D0.f2566l.post(new RunnableC4624xr(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862qr
    public final void f() {
        if (this.f13670I && this.f13668G != null && !u()) {
            this.f13669H.setImageBitmap(this.f13668G);
            this.f13669H.invalidate();
            this.f13672s.addView(this.f13669H, new FrameLayout.LayoutParams(-1, -1));
            this.f13672s.bringChildToFront(this.f13669H);
        }
        this.f13675v.a();
        this.f13665D = this.f13664C;
        G2.D0.f2566l.post(new RunnableC4733yr(this));
    }

    public final void finalize() {
        try {
            this.f13675v.a();
            final AbstractC3970rr abstractC3970rr = this.f13677x;
            if (abstractC3970rr != null) {
                AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ur
                    @Override // java.lang.Runnable
                    public final void run() {
                        abstractC3970rr.s();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862qr
    public final void g() {
        this.f13673t.setVisibility(4);
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vr
            @Override // java.lang.Runnable
            public final void run() {
                this.f27375o.z();
            }
        });
    }

    public final void h(int i8) {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        abstractC3970rr.y(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862qr
    public final void i() {
        if (this.f13678y && u()) {
            this.f13672s.removeView(this.f13669H);
        }
        if (this.f13677x == null || this.f13668G == null) {
            return;
        }
        long b8 = C2.v.c().b();
        if (this.f13677x.getBitmap(this.f13668G) != null) {
            this.f13670I = true;
        }
        long b9 = C2.v.c().b() - b8;
        if (AbstractC0608p0.m()) {
            AbstractC0608p0.k("Spinner frame grab took " + b9 + "ms");
        }
        if (b9 > this.f13676w) {
            H2.p.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f13663B = false;
            this.f13668G = null;
            C4818zf c4818zf = this.f13674u;
            if (c4818zf != null) {
                c4818zf.d("spinner_jank", Long.toString(b9));
            }
        }
    }

    public final void j(int i8) {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        abstractC3970rr.a(i8);
    }

    public final void k(int i8) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23774S)).booleanValue()) {
            this.f13672s.setBackgroundColor(i8);
            this.f13673t.setBackgroundColor(i8);
        }
    }

    public final void l(int i8) {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        abstractC3970rr.b(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862qr
    public final void m(String str, String str2) {
        t("error", "what", str, "extra", str2);
    }

    public final void n(String str, String[] strArr) {
        this.f13666E = str;
        this.f13667F = strArr;
    }

    public final void o(int i8, int i9, int i10, int i11) {
        if (AbstractC0608p0.m()) {
            AbstractC0608p0.k("Set video bounds to x:" + i8 + ";y:" + i9 + ";w:" + i10 + ";h:" + i11);
        }
        if (i10 == 0 || i11 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.setMargins(i8, i9, 0, 0);
        this.f13672s.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z7) {
        super.onWindowFocusChanged(z7);
        if (z7) {
            this.f13675v.b();
        } else {
            this.f13675v.a();
            this.f13665D = this.f13664C;
        }
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.wr
            @Override // java.lang.Runnable
            public final void run() {
                this.f27563o.A(z7);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC3862qr
    public final void onWindowVisibilityChanged(int i8) {
        boolean z7;
        super.onWindowVisibilityChanged(i8);
        if (i8 == 0) {
            this.f13675v.b();
            z7 = true;
        } else {
            this.f13675v.a();
            this.f13665D = this.f13664C;
            z7 = false;
        }
        G2.D0.f2566l.post(new RunnableC4842zr(this, z7));
    }

    public final void p(float f8) {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        abstractC3970rr.f26225s.e(f8);
        abstractC3970rr.l();
    }

    public final void q(float f8, float f9) {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr != null) {
            abstractC3970rr.t(f8, f9);
        }
    }

    public final void r() {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        abstractC3970rr.f26225s.d(false);
        abstractC3970rr.l();
    }

    public final Integer v() {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr != null) {
            return abstractC3970rr.v();
        }
        return null;
    }

    public final void x() {
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr == null) {
            return;
        }
        TextView textView = new TextView(abstractC3970rr.getContext());
        Resources f8 = C2.v.s().f();
        textView.setText(String.valueOf(f8 == null ? "AdMob - " : f8.getString(A2.d.f169u)).concat(this.f13677x.m()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f13672s.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f13672s.bringChildToFront(textView);
    }

    public final void y() {
        this.f13675v.a();
        AbstractC3970rr abstractC3970rr = this.f13677x;
        if (abstractC3970rr != null) {
            abstractC3970rr.s();
        }
        s();
    }

    final /* synthetic */ void z() {
        t("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3862qr
    public final void zza() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23841a2)).booleanValue()) {
            this.f13675v.a();
        }
        t("ended", new String[0]);
        s();
    }
}
