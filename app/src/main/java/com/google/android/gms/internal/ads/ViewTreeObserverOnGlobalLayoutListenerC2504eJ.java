package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.eJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2504eJ extends AbstractBinderC2102ah implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, HJ {

    /* renamed from: F, reason: collision with root package name */
    public static final AbstractC4169th0 f21775F = AbstractC4169th0.C("2011", "1009", "3010");

    /* renamed from: B, reason: collision with root package name */
    private InterfaceC1833Ug f21777B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f21778C;

    /* renamed from: E, reason: collision with root package name */
    private GestureDetector f21780E;

    /* renamed from: o, reason: collision with root package name */
    private final String f21781o;

    /* renamed from: t, reason: collision with root package name */
    private FrameLayout f21783t;

    /* renamed from: u, reason: collision with root package name */
    private FrameLayout f21784u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f21785v;

    /* renamed from: w, reason: collision with root package name */
    private View f21786w;

    /* renamed from: y, reason: collision with root package name */
    private CI f21788y;

    /* renamed from: z, reason: collision with root package name */
    private ViewOnAttachStateChangeListenerC4810zb f21789z;

    /* renamed from: s, reason: collision with root package name */
    private Map f21782s = new HashMap();

    /* renamed from: A, reason: collision with root package name */
    private InterfaceC5852a f21776A = null;

    /* renamed from: D, reason: collision with root package name */
    private boolean f21779D = false;

    /* renamed from: x, reason: collision with root package name */
    private final int f21787x = 244410000;

    public ViewTreeObserverOnGlobalLayoutListenerC2504eJ(FrameLayout frameLayout, FrameLayout frameLayout2, int i8) {
        String str;
        this.f21783t = frameLayout;
        this.f21784u = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f21781o = str;
        C2.v.B();
        C2231br.a(frameLayout, this);
        C2.v.B();
        C2231br.b(frameLayout, this);
        this.f21785v = AbstractC1497Kq.f16649f;
        this.f21789z = new ViewOnAttachStateChangeListenerC4810zb(this.f21783t.getContext(), this.f21783t);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void Q0(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f21784u.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f21784u.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] decode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e8) {
                        H2.p.h("Encountered invalid base64 watermark.", e8);
                    }
                }
            }
            this.f21784u.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void u() {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.tb)).booleanValue() || this.f21788y.J() == 0) {
            return;
        }
        this.f21780E = new GestureDetector(this.f21783t.getContext(), new GestureDetectorOnGestureListenerC3374mJ(this.f21788y, this));
    }

    private final synchronized void x() {
        this.f21785v.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dJ
            @Override // java.lang.Runnable
            public final void run() {
                this.f21514o.v7();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final synchronized void D4(InterfaceC5852a interfaceC5852a) {
        if (this.f21779D) {
            return;
        }
        Object J02 = BinderC5853b.J0(interfaceC5852a);
        if (!(J02 instanceof CI)) {
            H2.p.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        CI ci = this.f21788y;
        if (ci != null) {
            ci.C(this);
        }
        x();
        CI ci2 = (CI) J02;
        this.f21788y = ci2;
        ci2.B(this);
        this.f21788y.t(this.f21783t);
        this.f21788y.a0(this.f21784u);
        if (this.f21778C) {
            this.f21788y.Q().b(this.f21777B);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23826Y3)).booleanValue() && !TextUtils.isEmpty(this.f21788y.U())) {
            Q0(this.f21788y.U());
        }
        u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final synchronized void F1(InterfaceC5852a interfaceC5852a) {
        this.f21788y.w((View) BinderC5853b.J0(interfaceC5852a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final synchronized void L2(String str, InterfaceC5852a interfaceC5852a) {
        p2(str, (View) BinderC5853b.J0(interfaceC5852a), true);
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized View Q(String str) {
        WeakReference weakReference;
        if (!this.f21779D && (weakReference = (WeakReference) this.f21782s.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final synchronized void a() {
        try {
            if (this.f21779D) {
                return;
            }
            CI ci = this.f21788y;
            if (ci != null) {
                ci.C(this);
                this.f21788y = null;
            }
            this.f21782s.clear();
            this.f21783t.removeAllViews();
            this.f21784u.removeAllViews();
            this.f21782s = null;
            this.f21783t = null;
            this.f21784u = null;
            this.f21786w = null;
            this.f21789z = null;
            this.f21779D = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final synchronized void b7(InterfaceC5852a interfaceC5852a) {
        if (this.f21779D) {
            return;
        }
        this.f21776A = interfaceC5852a;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final /* synthetic */ View c() {
        return this.f21783t;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final FrameLayout e() {
        return this.f21784u;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final ViewOnAttachStateChangeListenerC4810zb f() {
        return this.f21789z;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final InterfaceC5852a h() {
        return this.f21776A;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized String i() {
        return this.f21781o;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized Map j() {
        return this.f21782s;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized Map k() {
        return this.f21782s;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized Map l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final void l0(InterfaceC5852a interfaceC5852a) {
        onTouch(this.f21783t, (MotionEvent) BinderC5853b.J0(interfaceC5852a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final synchronized void m1(InterfaceC1833Ug interfaceC1833Ug) {
        if (!this.f21779D) {
            this.f21778C = true;
            this.f21777B = interfaceC1833Ug;
            CI ci = this.f21788y;
            if (ci != null) {
                ci.Q().b(interfaceC1833Ug);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized JSONObject o() {
        CI ci = this.f21788y;
        if (ci == null) {
            return null;
        }
        return ci.W(this.f21783t, j(), k());
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        CI ci = this.f21788y;
        if (ci == null || !ci.E()) {
            return;
        }
        this.f21788y.b0();
        this.f21788y.l(view, this.f21783t, j(), k(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        CI ci = this.f21788y;
        if (ci != null) {
            FrameLayout frameLayout = this.f21783t;
            ci.j(frameLayout, j(), k(), CI.H(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        CI ci = this.f21788y;
        if (ci != null) {
            FrameLayout frameLayout = this.f21783t;
            ci.j(frameLayout, j(), k(), CI.H(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        CI ci = this.f21788y;
        if (ci != null) {
            ci.u(view, motionEvent, this.f21783t);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.tb)).booleanValue() && this.f21780E != null && this.f21788y.J() != 0) {
                this.f21780E.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized JSONObject p() {
        CI ci = this.f21788y;
        if (ci == null) {
            return null;
        }
        return ci.X(this.f21783t, j(), k());
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized void p2(String str, View view, boolean z7) {
        if (!this.f21779D) {
            if (view == null) {
                this.f21782s.remove(str);
                return;
            }
            this.f21782s.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (G2.X.i(this.f21787x)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final synchronized void u1(InterfaceC5852a interfaceC5852a, int i8) {
    }

    public final FrameLayout u7() {
        return this.f21783t;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final synchronized InterfaceC5852a v(String str) {
        return BinderC5853b.p2(Q(str));
    }

    final /* synthetic */ void v7() {
        if (this.f21786w == null) {
            View view = new View(this.f21783t.getContext());
            this.f21786w = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f21783t != this.f21786w.getParent()) {
            this.f21783t.addView(this.f21786w);
        }
    }
}
