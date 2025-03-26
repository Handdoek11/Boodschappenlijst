package M2;

import D2.X1;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractBinderC2989iq;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC2207bf;
import com.google.android.gms.internal.ads.AbstractC2326ck0;
import com.google.android.gms.internal.ads.AbstractC2534eg;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.AbstractC3187kg0;
import com.google.android.gms.internal.ads.AbstractC3840qg;
import com.google.android.gms.internal.ads.AbstractC4630xu;
import com.google.android.gms.internal.ads.C1598Nn;
import com.google.android.gms.internal.ads.C1656Pf;
import com.google.android.gms.internal.ads.C2959ia0;
import com.google.android.gms.internal.ads.C3133k70;
import com.google.android.gms.internal.ads.C3533nq;
import com.google.android.gms.internal.ads.C4030sL;
import com.google.android.gms.internal.ads.InterfaceC1376Hf0;
import com.google.android.gms.internal.ads.InterfaceC1384Hj0;
import com.google.android.gms.internal.ads.InterfaceC1420Ij0;
import com.google.android.gms.internal.ads.InterfaceC1459Jn;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC3522nk0;
import com.google.android.gms.internal.ads.N9;
import com.google.android.gms.internal.ads.NN;
import com.google.android.gms.internal.ads.P60;
import com.google.android.gms.internal.ads.RunnableC3464n90;
import com.google.android.gms.internal.ads.RunnableC3791q90;
import com.google.android.gms.internal.ads.Sj0;
import com.google.android.gms.internal.ads.zzavb;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import w2.EnumC6877c;

/* renamed from: M2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0675w extends AbstractBinderC2989iq {

    /* renamed from: X, reason: collision with root package name */
    protected static final List f3959X = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: Y, reason: collision with root package name */
    protected static final List f3960Y = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: Z, reason: collision with root package name */
    protected static final List f3961Z = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: a0, reason: collision with root package name */
    protected static final List f3962a0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: B, reason: collision with root package name */
    private final NN f3964B;

    /* renamed from: C, reason: collision with root package name */
    private final C2959ia0 f3965C;

    /* renamed from: K, reason: collision with root package name */
    private final H2.a f3973K;

    /* renamed from: L, reason: collision with root package name */
    private String f3974L;

    /* renamed from: N, reason: collision with root package name */
    private final List f3976N;

    /* renamed from: O, reason: collision with root package name */
    private final List f3977O;

    /* renamed from: P, reason: collision with root package name */
    private final List f3978P;

    /* renamed from: Q, reason: collision with root package name */
    private final List f3979Q;

    /* renamed from: U, reason: collision with root package name */
    private final C1656Pf f3983U;

    /* renamed from: V, reason: collision with root package name */
    private final l0 f3984V;

    /* renamed from: W, reason: collision with root package name */
    private final c0 f3985W;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC4630xu f3986o;

    /* renamed from: s, reason: collision with root package name */
    private Context f3987s;

    /* renamed from: t, reason: collision with root package name */
    private final N9 f3988t;

    /* renamed from: u, reason: collision with root package name */
    private final P60 f3989u;

    /* renamed from: v, reason: collision with root package name */
    private final C3133k70 f3990v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f3991w;

    /* renamed from: x, reason: collision with root package name */
    private final ScheduledExecutorService f3992x;

    /* renamed from: y, reason: collision with root package name */
    private C1598Nn f3993y;

    /* renamed from: z, reason: collision with root package name */
    private Point f3994z = new Point();

    /* renamed from: A, reason: collision with root package name */
    private Point f3963A = new Point();

    /* renamed from: J, reason: collision with root package name */
    private final AtomicInteger f3972J = new AtomicInteger(0);

    /* renamed from: R, reason: collision with root package name */
    private final AtomicBoolean f3980R = new AtomicBoolean(false);

    /* renamed from: S, reason: collision with root package name */
    private final AtomicBoolean f3981S = new AtomicBoolean(false);

    /* renamed from: T, reason: collision with root package name */
    private final AtomicInteger f3982T = new AtomicInteger(0);

    /* renamed from: D, reason: collision with root package name */
    private final boolean f3966D = ((Boolean) D2.A.c().a(AbstractC3184kf.f23846a7)).booleanValue();

    /* renamed from: E, reason: collision with root package name */
    private final boolean f3967E = ((Boolean) D2.A.c().a(AbstractC3184kf.f23837Z6)).booleanValue();

    /* renamed from: F, reason: collision with root package name */
    private final boolean f3968F = ((Boolean) D2.A.c().a(AbstractC3184kf.f23864c7)).booleanValue();

    /* renamed from: G, reason: collision with root package name */
    private final boolean f3969G = ((Boolean) D2.A.c().a(AbstractC3184kf.f23882e7)).booleanValue();

    /* renamed from: H, reason: collision with root package name */
    private final String f3970H = (String) D2.A.c().a(AbstractC3184kf.f23873d7);

    /* renamed from: I, reason: collision with root package name */
    private final String f3971I = (String) D2.A.c().a(AbstractC3184kf.f23891f7);

    /* renamed from: M, reason: collision with root package name */
    private final String f3975M = (String) D2.A.c().a(AbstractC3184kf.f23900g7);

    BinderC0675w(AbstractC4630xu abstractC4630xu, Context context, N9 n9, C3133k70 c3133k70, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, ScheduledExecutorService scheduledExecutorService, NN nn, C2959ia0 c2959ia0, H2.a aVar, C1656Pf c1656Pf, P60 p60, l0 l0Var, c0 c0Var) {
        List list;
        this.f3986o = abstractC4630xu;
        this.f3987s = context;
        this.f3988t = n9;
        this.f3989u = p60;
        this.f3990v = c3133k70;
        this.f3991w = interfaceExecutorServiceC3522nk0;
        this.f3992x = scheduledExecutorService;
        this.f3964B = nn;
        this.f3965C = c2959ia0;
        this.f3973K = aVar;
        this.f3983U = c1656Pf;
        this.f3984V = l0Var;
        this.f3985W = c0Var;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23909h7)).booleanValue()) {
            this.f3976N = T7((String) D2.A.c().a(AbstractC3184kf.f23918i7));
            this.f3977O = T7((String) D2.A.c().a(AbstractC3184kf.f23927j7));
            this.f3978P = T7((String) D2.A.c().a(AbstractC3184kf.f23936k7));
            list = T7((String) D2.A.c().a(AbstractC3184kf.f23945l7));
        } else {
            this.f3976N = f3959X;
            this.f3977O = f3960Y;
            this.f3978P = f3961Z;
            list = f3962a0;
        }
        this.f3979Q = list;
    }

    static /* bridge */ /* synthetic */ void B7(BinderC0675w binderC0675w, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (binderC0675w.I7((Uri) it.next())) {
                binderC0675w.f3972J.getAndIncrement();
                return;
            }
        }
    }

    private final boolean F0() {
        Map map;
        C1598Nn c1598Nn = this.f3993y;
        return (c1598Nn == null || (map = c1598Nn.f17595s) == null || map.isEmpty()) ? false : true;
    }

    static final /* synthetic */ Uri K7(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? S7(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final M2.AbstractC0658e L7(android.content.Context r14, java.lang.String r15, java.lang.String r16, D2.c2 r17, D2.X1 r18, int r19, java.lang.String r20, android.os.Bundle r21, com.google.android.gms.internal.ads.C3533nq r22) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.BinderC0675w.L7(android.content.Context, java.lang.String, java.lang.String, D2.c2, D2.X1, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.nq):M2.e");
    }

    private final com.google.common.util.concurrent.d M7(final String str) {
        final C4030sL[] c4030sLArr = new C4030sL[1];
        com.google.common.util.concurrent.d n8 = AbstractC2326ck0.n(this.f3990v.a(), new InterfaceC1420Ij0() { // from class: M2.h
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f3874a.e8(c4030sLArr, str, (C4030sL) obj);
            }
        }, this.f3991w);
        n8.f(new Runnable() { // from class: M2.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f3880o.D7(c4030sLArr);
            }
        }, this.f3991w);
        return (Sj0) AbstractC2326ck0.e((Sj0) AbstractC2326ck0.m((Sj0) AbstractC2326ck0.o(Sj0.D(n8), ((Integer) D2.A.c().a(AbstractC3184kf.y7)).intValue(), TimeUnit.MILLISECONDS, this.f3992x), new InterfaceC1376Hf0() { // from class: M2.o
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                List list = BinderC0675w.f3959X;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f3991w), Exception.class, new InterfaceC1376Hf0() { // from class: M2.p
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                List list = BinderC0675w.f3959X;
                H2.p.e("", (Exception) obj);
                return null;
            }
        }, this.f3991w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N7() {
        if (((Boolean) AbstractC3840qg.f25981c.e()).booleanValue()) {
            this.f3984V.b();
        } else {
            AbstractC2326ck0.r(((Boolean) D2.A.c().a(AbstractC3184kf.Wa)).booleanValue() ? AbstractC2326ck0.k(new InterfaceC1384Hj0() { // from class: M2.f
                @Override // com.google.android.gms.internal.ads.InterfaceC1384Hj0
                public final com.google.common.util.concurrent.d zza() {
                    return this.f3866a.d8();
                }
            }, AbstractC1497Kq.f16644a) : L7(this.f3987s, null, EnumC6877c.BANNER.name(), null, null, 0, null, new Bundle(), null).b(), new C0674v(this), this.f3986o.d());
        }
    }

    private final void O7() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.v9)).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.y9)).booleanValue()) {
                return;
            }
            if (((Boolean) D2.A.c().a(AbstractC3184kf.C9)).booleanValue() && this.f3980R.getAndSet(true)) {
                return;
            }
            N7();
        }
    }

    private final void P7(List list, final InterfaceC5852a interfaceC5852a, InterfaceC1459Jn interfaceC1459Jn, boolean z7) {
        com.google.common.util.concurrent.d p02;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.x7)).booleanValue()) {
            H2.p.g("The updating URL feature is not enabled.");
            try {
                interfaceC1459Jn.n("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e8) {
                H2.p.e("", e8);
                return;
            }
        }
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (I7((Uri) it.next())) {
                i8++;
            }
        }
        if (i8 > 1) {
            H2.p.g("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (I7(uri)) {
                p02 = this.f3991w.p0(new Callable() { // from class: M2.j
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f3885o.W7(uri, interfaceC5852a);
                    }
                });
                if (F0()) {
                    p02 = AbstractC2326ck0.n(p02, new InterfaceC1420Ij0() { // from class: M2.k
                        @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                        public final com.google.common.util.concurrent.d a(Object obj) {
                            BinderC0675w binderC0675w = this.f3890a;
                            return AbstractC2326ck0.m(binderC0675w.M7("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new InterfaceC1376Hf0(binderC0675w, (Uri) obj) { // from class: M2.l

                                /* renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ Uri f3894a;

                                {
                                    this.f3894a = r2;
                                }

                                @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
                                public final Object apply(Object obj2) {
                                    return BinderC0675w.K7(this.f3894a, (String) obj2);
                                }
                            }, binderC0675w.f3991w);
                        }
                    }, this.f3991w);
                } else {
                    H2.p.f("Asset view map is empty.");
                }
            } else {
                H2.p.g("Not a Google URL: ".concat(String.valueOf(uri)));
                p02 = AbstractC2326ck0.h(uri);
            }
            arrayList.add(p02);
        }
        AbstractC2326ck0.r(AbstractC2326ck0.d(arrayList), new C0673u(this, interfaceC1459Jn, z7), this.f3986o.d());
    }

    private final void Q7(final List list, final InterfaceC5852a interfaceC5852a, InterfaceC1459Jn interfaceC1459Jn, boolean z7) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.x7)).booleanValue()) {
            try {
                interfaceC1459Jn.n("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e8) {
                H2.p.e("", e8);
                return;
            }
        }
        com.google.common.util.concurrent.d p02 = this.f3991w.p0(new Callable() { // from class: M2.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3921o.w7(list, interfaceC5852a);
            }
        });
        if (F0()) {
            p02 = AbstractC2326ck0.n(p02, new InterfaceC1420Ij0() { // from class: M2.r
                @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                public final com.google.common.util.concurrent.d a(Object obj) {
                    return this.f3925a.f8((ArrayList) obj);
                }
            }, this.f3991w);
        } else {
            H2.p.f("Asset view map is empty.");
        }
        AbstractC2326ck0.r(p02, new C0672t(this, interfaceC1459Jn, z7), this.f3986o.d());
    }

    private static boolean R7(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri S7(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i8 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i8) + str + "=" + str2 + "&" + uri2.substring(i8));
    }

    private static final List T7(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!AbstractC3187kg0.d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ RunnableC3464n90 a8(com.google.common.util.concurrent.d dVar, C3533nq c3533nq) {
        if (!RunnableC3791q90.a() || !((Boolean) AbstractC2534eg.f21869e.e()).booleanValue()) {
            return null;
        }
        try {
            RunnableC3464n90 a8 = ((AbstractC0658e) AbstractC2326ck0.p(dVar)).a();
            a8.d(new ArrayList(Collections.singletonList(c3533nq.f25040s)));
            X1 x12 = c3533nq.f25042u;
            a8.b(x12 == null ? "" : x12.f1175G);
            a8.f(c3533nq.f25042u.f1172D);
            return a8;
        } catch (ExecutionException e8) {
            C2.v.s().x(e8, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ void D7(C4030sL[] c4030sLArr) {
        C4030sL c4030sL = c4030sLArr[0];
        if (c4030sL != null) {
            this.f3990v.b(AbstractC2326ck0.h(c4030sL));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3097jq
    public final void E4(List list, InterfaceC5852a interfaceC5852a, InterfaceC1459Jn interfaceC1459Jn) {
        P7(list, interfaceC5852a, interfaceC1459Jn, true);
    }

    final boolean I7(Uri uri) {
        return R7(uri, this.f3976N, this.f3977O);
    }

    final boolean J7(Uri uri) {
        return R7(uri, this.f3978P, this.f3979Q);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3097jq
    public final InterfaceC5852a R6(InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2, String str, InterfaceC5852a interfaceC5852a3) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.I9)).booleanValue()) {
            return BinderC5853b.p2(null);
        }
        this.f3983U.g((Context) BinderC5853b.J0(interfaceC5852a), (androidx.browser.customtabs.c) BinderC5853b.J0(interfaceC5852a2), str, (androidx.browser.customtabs.b) BinderC5853b.J0(interfaceC5852a3));
        if (((Boolean) AbstractC3840qg.f25981c.e()).booleanValue()) {
            this.f3984V.b();
        }
        if (((Boolean) AbstractC3840qg.f25979a.e()).booleanValue()) {
            this.f3985W.b();
        }
        return BinderC5853b.p2(this.f3983U.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3097jq
    public final void U(InterfaceC5852a interfaceC5852a) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.u9)).booleanValue()) {
            AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23972o7;
            if (!((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
                O7();
            }
            WebView webView = (WebView) BinderC5853b.J0(interfaceC5852a);
            if (webView == null) {
                H2.p.d("The webView cannot be null.");
                return;
            }
            final g0 g0Var = new g0(webView, this.f3985W, AbstractC1497Kq.f16649f);
            webView.addJavascriptInterface(new C0654a(webView, this.f3988t, this.f3964B, this.f3965C, this.f3989u, this.f3984V, this.f3985W, g0Var), "gmaSdk");
            if (((Boolean) D2.A.c().a(AbstractC3184kf.E9)).booleanValue()) {
                C2.v.s().t();
            }
            if (((Boolean) AbstractC3840qg.f25979a.e()).booleanValue()) {
                this.f3985W.b();
                if (((Boolean) AbstractC3840qg.f25980b.e()).booleanValue()) {
                    AbstractC1497Kq.f16647d.scheduleWithFixedDelay(new Runnable() { // from class: M2.f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            g0Var.c();
                        }
                    }, 0L, ((Integer) D2.A.c().a(AbstractC3184kf.F9)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
                O7();
            }
        }
    }

    final /* synthetic */ Uri W7(Uri uri, InterfaceC5852a interfaceC5852a) {
        P60 p60;
        try {
            uri = (!((Boolean) D2.A.c().a(AbstractC3184kf.Sb)).booleanValue() || (p60 = this.f3989u) == null) ? this.f3988t.a(uri, this.f3987s, (View) BinderC5853b.J0(interfaceC5852a), null) : p60.a(uri, this.f3987s, (View) BinderC5853b.J0(interfaceC5852a), null);
        } catch (zzavb e8) {
            H2.p.h("", e8);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ AbstractC0658e Z7(C3533nq c3533nq, int i8, Bundle bundle) {
        return L7(this.f3987s, c3533nq.f25039o, c3533nq.f25040s, c3533nq.f25041t, c3533nq.f25042u, i8, c3533nq.f25044w, bundle, c3533nq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3097jq
    public final void a0(InterfaceC5852a interfaceC5852a) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.x7)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) BinderC5853b.J0(interfaceC5852a);
            C1598Nn c1598Nn = this.f3993y;
            this.f3994z = G2.X.a(motionEvent, c1598Nn == null ? null : c1598Nn.f17594o);
            if (motionEvent.getAction() == 0) {
                this.f3963A = this.f3994z;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f3994z;
            obtain.setLocation(point.x, point.y);
            this.f3988t.d(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3097jq
    public final void b1(List list, InterfaceC5852a interfaceC5852a, InterfaceC1459Jn interfaceC1459Jn) {
        Q7(list, interfaceC5852a, interfaceC1459Jn, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3097jq
    public final void c1(C1598Nn c1598Nn) {
        this.f3993y = c1598Nn;
        this.f3990v.c(1);
    }

    final /* synthetic */ com.google.common.util.concurrent.d d8() {
        return L7(this.f3987s, null, EnumC6877c.BANNER.name(), null, null, 0, null, new Bundle(), null).b();
    }

    final /* synthetic */ com.google.common.util.concurrent.d e8(C4030sL[] c4030sLArr, String str, C4030sL c4030sL) {
        c4030sLArr[0] = c4030sL;
        Context context = this.f3987s;
        C1598Nn c1598Nn = this.f3993y;
        Map map = c1598Nn.f17595s;
        JSONObject d8 = G2.X.d(context, map, map, c1598Nn.f17594o, null);
        JSONObject g8 = G2.X.g(this.f3987s, this.f3993y.f17594o);
        JSONObject f8 = G2.X.f(this.f3993y.f17594o);
        JSONObject e8 = G2.X.e(this.f3987s, this.f3993y.f17594o);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", d8);
        jSONObject.put("ad_view_signal", g8);
        jSONObject.put("scroll_view_signal", f8);
        jSONObject.put("lock_screen_signal", e8);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", G2.X.c(null, this.f3987s, this.f3963A, this.f3994z));
        }
        return c4030sL.g(str, jSONObject);
    }

    final /* synthetic */ com.google.common.util.concurrent.d f8(final ArrayList arrayList) {
        return AbstractC2326ck0.m(M7("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new InterfaceC1376Hf0() { // from class: M2.g
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return this.f3868a.v7(arrayList, (String) obj);
            }
        }, this.f3991w);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3097jq
    public final void s5(List list, InterfaceC5852a interfaceC5852a, InterfaceC1459Jn interfaceC1459Jn) {
        Q7(list, interfaceC5852a, interfaceC1459Jn, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065 A[PHI: r1
  0x0065: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v18 int) binds: [B:6:0x0057, B:8:0x0063, B:11:0x0073, B:14:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3097jq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u2(i3.InterfaceC5852a r11, final com.google.android.gms.internal.ads.C3533nq r12, com.google.android.gms.internal.ads.InterfaceC2772gq r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.BinderC0675w.u2(i3.a, com.google.android.gms.internal.ads.nq, com.google.android.gms.internal.ads.gq):void");
    }

    final /* synthetic */ ArrayList v7(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!J7(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(S7(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ ArrayList w7(List list, InterfaceC5852a interfaceC5852a) {
        String i8 = this.f3988t.c() != null ? this.f3988t.c().i(this.f3987s, (View) BinderC5853b.J0(interfaceC5852a), null) : "";
        if (TextUtils.isEmpty(i8)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (J7(uri)) {
                arrayList.add(S7(uri, "ms", i8));
            } else {
                H2.p.g("Not a Google URL: ".concat(String.valueOf(uri)));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3097jq
    public final void x3(List list, InterfaceC5852a interfaceC5852a, InterfaceC1459Jn interfaceC1459Jn) {
        P7(list, interfaceC5852a, interfaceC1459Jn, false);
    }
}
