package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import F2.InterfaceC0572d;
import G2.AbstractC0608p0;
import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.Gt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1358Gt extends WebViewClient implements InterfaceC3759pu {

    /* renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ int f15462Y = 0;

    /* renamed from: A, reason: collision with root package name */
    private InterfaceC2756gi f15463A;

    /* renamed from: B, reason: collision with root package name */
    private InterfaceC3912rG f15464B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f15465C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f15466D;

    /* renamed from: H, reason: collision with root package name */
    private boolean f15470H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f15471I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f15472J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f15473K;

    /* renamed from: L, reason: collision with root package name */
    private InterfaceC0572d f15474L;

    /* renamed from: M, reason: collision with root package name */
    private C2440dn f15475M;

    /* renamed from: N, reason: collision with root package name */
    private C2.b f15476N;

    /* renamed from: P, reason: collision with root package name */
    protected InterfaceC1426Ip f15478P;

    /* renamed from: Q, reason: collision with root package name */
    private HN f15479Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f15480R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f15481S;

    /* renamed from: T, reason: collision with root package name */
    private int f15482T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f15483U;

    /* renamed from: W, reason: collision with root package name */
    private final US f15485W;

    /* renamed from: X, reason: collision with root package name */
    private View.OnAttachStateChangeListener f15486X;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC4410vt f15487o;

    /* renamed from: s, reason: collision with root package name */
    private final C2000Zc f15488s;

    /* renamed from: v, reason: collision with root package name */
    private InterfaceC0484a f15491v;

    /* renamed from: w, reason: collision with root package name */
    private F2.z f15492w;

    /* renamed from: x, reason: collision with root package name */
    private InterfaceC3541nu f15493x;

    /* renamed from: y, reason: collision with root package name */
    private InterfaceC3650ou f15494y;

    /* renamed from: z, reason: collision with root package name */
    private InterfaceC2538ei f15495z;

    /* renamed from: t, reason: collision with root package name */
    private final HashMap f15489t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    private final Object f15490u = new Object();

    /* renamed from: E, reason: collision with root package name */
    private int f15467E = 0;

    /* renamed from: F, reason: collision with root package name */
    private String f15468F = "";

    /* renamed from: G, reason: collision with root package name */
    private String f15469G = "";

    /* renamed from: O, reason: collision with root package name */
    private C1982Ym f15477O = null;

    /* renamed from: V, reason: collision with root package name */
    private final HashSet f15484V = new HashSet(Arrays.asList(((String) D2.A.c().a(AbstractC3184kf.f23652C5)).split(",")));

    public AbstractC1358Gt(InterfaceC4410vt interfaceC4410vt, C2000Zc c2000Zc, boolean z7, C2440dn c2440dn, C1982Ym c1982Ym, US us) {
        this.f15488s = c2000Zc;
        this.f15487o = interfaceC4410vt;
        this.f15470H = z7;
        this.f15475M = c2440dn;
        this.f15485W = us;
    }

    private final void C() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f15486X;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.f15487o).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(final View view, final InterfaceC1426Ip interfaceC1426Ip, final int i8) {
        if (!interfaceC1426Ip.f() || i8 <= 0) {
            return;
        }
        interfaceC1426Ip.c(view);
        if (interfaceC1426Ip.f()) {
            G2.D0.f2566l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.wt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27575o.M0(view, interfaceC1426Ip, i8);
                }
            }, 100L);
        }
    }

    private static final boolean Q(InterfaceC4410vt interfaceC4410vt) {
        return interfaceC4410vt.P() != null && interfaceC4410vt.P().b();
    }

    private static final boolean T(boolean z7, InterfaceC4410vt interfaceC4410vt) {
        return (!z7 || interfaceC4410vt.H().i() || interfaceC4410vt.u().equals("interstitial_mb")) ? false : true;
    }

    private static WebResourceResponse r() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23791U0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f2, code lost:
    
        C2.v.t();
        C2.v.t();
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0104, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0106, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
    
        r6 = r14.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0113, code lost:
    
        C2.v.t();
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011e, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0120, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0122, code lost:
    
        r14 = r14.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
    
        if (r14.length != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012a, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012c, code lost:
    
        if (r0 >= r14.length) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013a, code lost:
    
        if (r14[r0].trim().startsWith("charset") == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013c, code lost:
    
        r1 = r14[r0].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0149, code lost:
    
        if (r1.length <= 1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014b, code lost:
    
        r4 = r1[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0152, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0155, code lost:
    
        r14 = r3.getHeaderFields();
        r10 = new java.util.HashMap(r14.size());
        r14 = r14.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016e, code lost:
    
        if (r14.hasNext() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0170, code lost:
    
        r0 = r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017a, code lost:
    
        if (r0.getKey() == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0180, code lost:
    
        if (r0.getValue() == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018c, code lost:
    
        if (r0.getValue().isEmpty() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018e, code lost:
    
        r10.put(r0.getKey(), r0.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a4, code lost:
    
        r5 = C2.v.u().b(r6, r7, r3.getResponseCode(), r3.getResponseMessage(), r10, r3.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse t(java.lang.String r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1358Gt.t(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(Map map, List list, String str) {
        if (AbstractC0608p0.m()) {
            AbstractC0608p0.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                AbstractC0608p0.k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC1662Pi) it.next()).a(this.f15487o, map);
        }
    }

    public final void A0(boolean z7) {
        this.f15483U = z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void C0(boolean z7) {
        synchronized (this.f15490u) {
            this.f15471I = true;
        }
    }

    final /* synthetic */ void D0() {
        this.f15487o.U();
        F2.x O7 = this.f15487o.O();
        if (O7 != null) {
            O7.I();
        }
    }

    public final ViewTreeObserver.OnGlobalLayoutListener E() {
        synchronized (this.f15490u) {
        }
        return null;
    }

    final /* synthetic */ void H0(boolean z7, long j8) {
        this.f15487o.l1(z7, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void I(int i8, int i9) {
        C1982Ym c1982Ym = this.f15477O;
        if (c1982Ym != null) {
            c1982Ym.l(i8, i9);
        }
    }

    @Override // D2.InterfaceC0484a
    public final void I0() {
        InterfaceC0484a interfaceC0484a = this.f15491v;
        if (interfaceC0484a != null) {
            interfaceC0484a.I0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final void K0() {
        InterfaceC3912rG interfaceC3912rG = this.f15464B;
        if (interfaceC3912rG != null) {
            interfaceC3912rG.K0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void L0(boolean z7) {
        synchronized (this.f15490u) {
            this.f15472J = true;
        }
    }

    final /* synthetic */ void M0(View view, InterfaceC1426Ip interfaceC1426Ip, int i8) {
        N(view, interfaceC1426Ip, i8 - 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void O0(int i8, int i9, boolean z7) {
        C2440dn c2440dn = this.f15475M;
        if (c2440dn != null) {
            c2440dn.h(i8, i9);
        }
        C1982Ym c1982Ym = this.f15477O;
        if (c1982Ym != null) {
            c1982Ym.k(i8, i9, false);
        }
    }

    public final void P0(F2.l lVar, boolean z7, boolean z8, String str) {
        InterfaceC4410vt interfaceC4410vt = this.f15487o;
        boolean n02 = interfaceC4410vt.n0();
        boolean z9 = T(n02, interfaceC4410vt) || z8;
        boolean z10 = z9 || !z7;
        InterfaceC0484a interfaceC0484a = z9 ? null : this.f15491v;
        F2.z zVar = n02 ? null : this.f15492w;
        InterfaceC0572d interfaceC0572d = this.f15474L;
        InterfaceC4410vt interfaceC4410vt2 = this.f15487o;
        W0(new AdOverlayInfoParcel(lVar, interfaceC0484a, zVar, interfaceC0572d, interfaceC4410vt2.l(), interfaceC4410vt2, z10 ? null : this.f15464B, str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void S() {
        synchronized (this.f15490u) {
            this.f15465C = false;
            this.f15470H = true;
            AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27936o.D0();
                }
            });
        }
    }

    public final void T0(String str, String str2, int i8) {
        US us = this.f15485W;
        InterfaceC4410vt interfaceC4410vt = this.f15487o;
        W0(new AdOverlayInfoParcel(interfaceC4410vt, interfaceC4410vt.l(), str, str2, 14, us));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final boolean V() {
        boolean z7;
        synchronized (this.f15490u) {
            z7 = this.f15470H;
        }
        return z7;
    }

    public final void V0(boolean z7, int i8, boolean z8) {
        InterfaceC4410vt interfaceC4410vt = this.f15487o;
        boolean T7 = T(interfaceC4410vt.n0(), interfaceC4410vt);
        boolean z9 = true;
        if (!T7 && z8) {
            z9 = false;
        }
        InterfaceC0484a interfaceC0484a = T7 ? null : this.f15491v;
        F2.z zVar = this.f15492w;
        InterfaceC0572d interfaceC0572d = this.f15474L;
        InterfaceC4410vt interfaceC4410vt2 = this.f15487o;
        W0(new AdOverlayInfoParcel(interfaceC0484a, zVar, interfaceC0572d, interfaceC4410vt2, z7, i8, interfaceC4410vt2.l(), z9 ? null : this.f15464B, Q(this.f15487o) ? this.f15485W : null));
    }

    public final void W0(AdOverlayInfoParcel adOverlayInfoParcel) {
        F2.l lVar;
        C1982Ym c1982Ym = this.f15477O;
        boolean m8 = c1982Ym != null ? c1982Ym.m() : false;
        C2.v.m();
        F2.y.a(this.f15487o.getContext(), adOverlayInfoParcel, !m8, this.f15479Q);
        InterfaceC1426Ip interfaceC1426Ip = this.f15478P;
        if (interfaceC1426Ip != null) {
            String str = adOverlayInfoParcel.f13072C;
            if (str == null && (lVar = adOverlayInfoParcel.f13085o) != null) {
                str = lVar.f2261s;
            }
            interfaceC1426Ip.b0(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void Y0(C3874qx c3874qx) {
        g("/click");
        c("/click", new C3408mi(this.f15464B, c3874qx));
    }

    public final ViewTreeObserver.OnScrollChangedListener Z() {
        synchronized (this.f15490u) {
        }
        return null;
    }

    public final void a(boolean z7, int i8, String str, boolean z8, boolean z9) {
        InterfaceC4410vt interfaceC4410vt = this.f15487o;
        boolean n02 = interfaceC4410vt.n0();
        boolean T7 = T(n02, interfaceC4410vt);
        boolean z10 = true;
        if (!T7 && z8) {
            z10 = false;
        }
        InterfaceC0484a interfaceC0484a = T7 ? null : this.f15491v;
        C1250Dt c1250Dt = n02 ? null : new C1250Dt(this.f15487o, this.f15492w);
        InterfaceC2538ei interfaceC2538ei = this.f15495z;
        InterfaceC2756gi interfaceC2756gi = this.f15463A;
        InterfaceC0572d interfaceC0572d = this.f15474L;
        InterfaceC4410vt interfaceC4410vt2 = this.f15487o;
        W0(new AdOverlayInfoParcel(interfaceC0484a, c1250Dt, interfaceC2538ei, interfaceC2756gi, interfaceC0572d, interfaceC4410vt2, z7, i8, str, interfaceC4410vt2.l(), z10 ? null : this.f15464B, Q(this.f15487o) ? this.f15485W : null, z9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final HN b() {
        return this.f15479Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b9 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #13 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0028, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0082, B:22:0x0099, B:23:0x009c, B:25:0x009f, B:28:0x00b9, B:30:0x00d1, B:32:0x00ea, B:77:0x01bd, B:49:0x0176, B:97:0x02a4, B:85:0x022b, B:86:0x0254, B:84:0x0203, B:48:0x014f, B:31:0x00de, B:87:0x0255, B:89:0x025f, B:91:0x0265, B:93:0x0298, B:99:0x02b3, B:101:0x02b9, B:103:0x02c7), top: B:112:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02cc A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f8 A[Catch: all -> 0x01b1, TryCatch #8 {all -> 0x01b1, blocks: (B:70:0x0196, B:72:0x01a8, B:76:0x01b3, B:80:0x01e6, B:82:0x01f8, B:83:0x01ff), top: B:111:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a4 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #13 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0028, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0082, B:22:0x0099, B:23:0x009c, B:25:0x009f, B:28:0x00b9, B:30:0x00d1, B:32:0x00ea, B:77:0x01bd, B:49:0x0176, B:97:0x02a4, B:85:0x022b, B:86:0x0254, B:84:0x0203, B:48:0x014f, B:31:0x00de, B:87:0x0255, B:89:0x025f, B:91:0x0265, B:93:0x0298, B:99:0x02b3, B:101:0x02b9, B:103:0x02c7), top: B:112:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final android.webkit.WebResourceResponse b0(java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1358Gt.b0(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void b1(C3874qx c3874qx, JS js, HN hn) {
        g("/open");
        c("/open", new C2323cj(this.f15476N, this.f15477O, js, hn, c3874qx));
    }

    public final void c(String str, InterfaceC1662Pi interfaceC1662Pi) {
        synchronized (this.f15490u) {
            try {
                List list = (List) this.f15489t.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    this.f15489t.put(str, list);
                }
                list.add(interfaceC1662Pi);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void c1(C3785q60 c3785q60) {
        if (C2.v.r().p(this.f15487o.getContext())) {
            g("/logScionEvent");
            new HashMap();
            c("/logScionEvent", new C1872Vi(this.f15487o.getContext(), c3785q60.f25823w0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final C2.b d() {
        return this.f15476N;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void d1(Uri uri) {
        AbstractC0608p0.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.f15489t;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            AbstractC0608p0.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23645B6)).booleanValue() || C2.v.s().h() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zt
                @Override // java.lang.Runnable
                public final void run() {
                    int i8 = AbstractC1358Gt.f15462Y;
                    C2.v.s().h().e(substring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23644B5)).booleanValue() && this.f15484V.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) D2.A.c().a(AbstractC3184kf.f23660D5)).intValue()) {
                AbstractC0608p0.k("Parsing gmsg query params on BG thread: ".concat(path));
                AbstractC2326ck0.r(C2.v.t().G(uri), new C1214Ct(this, list, path, uri), AbstractC1497Kq.f16649f);
                return;
            }
        }
        C2.v.t();
        w(G2.D0.p(uri), list, path);
    }

    public final void e(boolean z7) {
        this.f15465C = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void e1(InterfaceC0484a interfaceC0484a, InterfaceC2538ei interfaceC2538ei, F2.z zVar, InterfaceC2756gi interfaceC2756gi, InterfaceC0572d interfaceC0572d, boolean z7, C1767Si c1767Si, C2.b bVar, InterfaceC2657fn interfaceC2657fn, InterfaceC1426Ip interfaceC1426Ip, final JS js, final C2959ia0 c2959ia0, HN hn, C3192kj c3192kj, InterfaceC3912rG interfaceC3912rG, C3083jj c3083jj, C2432dj c2432dj, C1697Qi c1697Qi, C3874qx c3874qx) {
        C2.b bVar2 = bVar == null ? new C2.b(this.f15487o.getContext(), interfaceC1426Ip, null) : bVar;
        this.f15477O = new C1982Ym(this.f15487o, interfaceC2657fn);
        this.f15478P = interfaceC1426Ip;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23849b1)).booleanValue()) {
            c("/adMetadata", new C2430di(interfaceC2538ei));
        }
        if (interfaceC2756gi != null) {
            c("/appEvent", new C2647fi(interfaceC2756gi));
        }
        c("/backButton", AbstractC1627Oi.f17924j);
        c("/refresh", AbstractC1627Oi.f17925k);
        c("/canOpenApp", AbstractC1627Oi.f17916b);
        c("/canOpenURLs", AbstractC1627Oi.f17915a);
        c("/canOpenIntents", AbstractC1627Oi.f17917c);
        c("/close", AbstractC1627Oi.f17918d);
        c("/customClose", AbstractC1627Oi.f17919e);
        c("/instrument", AbstractC1627Oi.f17928n);
        c("/delayPageLoaded", AbstractC1627Oi.f17930p);
        c("/delayPageClosed", AbstractC1627Oi.f17931q);
        c("/getLocationInfo", AbstractC1627Oi.f17932r);
        c("/log", AbstractC1627Oi.f17921g);
        c("/mraid", new C1907Wi(bVar2, this.f15477O, interfaceC2657fn));
        C2440dn c2440dn = this.f15475M;
        if (c2440dn != null) {
            c("/mraidLoaded", c2440dn);
        }
        C2.b bVar3 = bVar2;
        c("/open", new C2323cj(bVar2, this.f15477O, js, hn, c3874qx));
        c("/precache", new C1177Bs());
        c("/touch", AbstractC1627Oi.f17923i);
        c("/video", AbstractC1627Oi.f17926l);
        c("/videoMeta", AbstractC1627Oi.f17927m);
        if (js == null || c2959ia0 == null) {
            c("/click", new C3408mi(interfaceC3912rG, c3874qx));
            c("/httpTrack", AbstractC1627Oi.f17920f);
        } else {
            c("/click", new S60(interfaceC3912rG, c3874qx, c2959ia0, js));
            c("/httpTrack", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.T60
                @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
                public final void a(Object obj, Map map) {
                    InterfaceC3430mt interfaceC3430mt = (InterfaceC3430mt) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        H2.p.g("URL missing from httpTrack GMSG.");
                        return;
                    }
                    C3785q60 P7 = interfaceC3430mt.P();
                    if (P7 != null && !P7.f25795i0) {
                        c2959ia0.d(str, P7.f25825x0, null);
                        return;
                    }
                    C4111t60 z8 = ((InterfaceC2128au) interfaceC3430mt).z();
                    if (z8 != null) {
                        js.g(new LS(C2.v.c().a(), z8.f26832b, str, 2));
                    } else {
                        C2.v.s().x(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                    }
                }
            });
        }
        if (C2.v.r().p(this.f15487o.getContext())) {
            Map hashMap = new HashMap();
            if (this.f15487o.P() != null) {
                hashMap = this.f15487o.P().f25823w0;
            }
            c("/logScionEvent", new C1872Vi(this.f15487o.getContext(), hashMap));
        }
        if (c1767Si != null) {
            c("/setInterstitialProperties", new C1732Ri(c1767Si));
        }
        if (c3192kj != null) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.O8)).booleanValue()) {
                c("/inspectorNetworkExtras", c3192kj);
            }
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.h9)).booleanValue() && c3083jj != null) {
            c("/shareSheet", c3083jj);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.m9)).booleanValue() && c2432dj != null) {
            c("/inspectorOutOfContextTest", c2432dj);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.q9)).booleanValue() && c1697Qi != null) {
            c("/inspectorStorage", c1697Qi);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.sb)).booleanValue()) {
            c("/bindPlayStoreOverlay", AbstractC1627Oi.f17935u);
            c("/presentPlayStoreOverlay", AbstractC1627Oi.f17936v);
            c("/expandPlayStoreOverlay", AbstractC1627Oi.f17937w);
            c("/collapsePlayStoreOverlay", AbstractC1627Oi.f17938x);
            c("/closePlayStoreOverlay", AbstractC1627Oi.f17939y);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23995r3)).booleanValue()) {
            c("/setPAIDPersonalizationEnabled", AbstractC1627Oi.f17912A);
            c("/resetPAID", AbstractC1627Oi.f17940z);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Mb)).booleanValue()) {
            InterfaceC4410vt interfaceC4410vt = this.f15487o;
            if (interfaceC4410vt.P() != null && interfaceC4410vt.P().f25813r0) {
                c("/writeToLocalStorage", AbstractC1627Oi.f17913B);
                c("/clearLocalStorageKeys", AbstractC1627Oi.f17914C);
            }
        }
        this.f15491v = interfaceC0484a;
        this.f15492w = zVar;
        this.f15495z = interfaceC2538ei;
        this.f15463A = interfaceC2756gi;
        this.f15474L = interfaceC0572d;
        this.f15476N = bVar3;
        this.f15464B = interfaceC3912rG;
        this.f15479Q = hn;
        this.f15465C = z7;
    }

    public final void f1(boolean z7, int i8, String str, String str2, boolean z8) {
        InterfaceC4410vt interfaceC4410vt = this.f15487o;
        boolean n02 = interfaceC4410vt.n0();
        boolean T7 = T(n02, interfaceC4410vt);
        boolean z9 = true;
        if (!T7 && z8) {
            z9 = false;
        }
        InterfaceC0484a interfaceC0484a = T7 ? null : this.f15491v;
        C1250Dt c1250Dt = n02 ? null : new C1250Dt(this.f15487o, this.f15492w);
        InterfaceC2538ei interfaceC2538ei = this.f15495z;
        InterfaceC2756gi interfaceC2756gi = this.f15463A;
        InterfaceC0572d interfaceC0572d = this.f15474L;
        InterfaceC4410vt interfaceC4410vt2 = this.f15487o;
        W0(new AdOverlayInfoParcel(interfaceC0484a, c1250Dt, interfaceC2538ei, interfaceC2756gi, interfaceC0572d, interfaceC4410vt2, z7, i8, str, str2, interfaceC4410vt2.l(), z9 ? null : this.f15464B, Q(this.f15487o) ? this.f15485W : null));
    }

    public final void g(String str) {
        synchronized (this.f15490u) {
            try {
                List list = (List) this.f15489t.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(String str, InterfaceC1662Pi interfaceC1662Pi) {
        synchronized (this.f15490u) {
            try {
                List list = (List) this.f15489t.get(str);
                if (list == null) {
                    return;
                }
                list.remove(interfaceC1662Pi);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void i0(InterfaceC3541nu interfaceC3541nu) {
        this.f15493x = interfaceC3541nu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void j() {
        C2000Zc c2000Zc = this.f15488s;
        if (c2000Zc != null) {
            c2000Zc.c(10005);
        }
        this.f15481S = true;
        this.f15467E = 10004;
        this.f15468F = "Page loaded delay cancel.";
        t0();
        this.f15487o.destroy();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void k() {
        synchronized (this.f15490u) {
        }
        this.f15482T++;
        t0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void l() {
        this.f15482T--;
        t0();
    }

    public final void m(String str, f3.n nVar) {
        synchronized (this.f15490u) {
            try {
                List<InterfaceC1662Pi> list = (List) this.f15489t.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (InterfaceC1662Pi interfaceC1662Pi : list) {
                    if (nVar.apply(interfaceC1662Pi)) {
                        arrayList.add(interfaceC1662Pi);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n() {
        boolean z7;
        synchronized (this.f15490u) {
            z7 = this.f15472J;
        }
        return z7;
    }

    public final boolean o() {
        boolean z7;
        synchronized (this.f15490u) {
            z7 = this.f15473K;
        }
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void o0(C3874qx c3874qx, JS js, C2959ia0 c2959ia0) {
        g("/click");
        if (js == null || c2959ia0 == null) {
            c("/click", new C3408mi(this.f15464B, c3874qx));
        } else {
            c("/click", new S60(this.f15464B, c3874qx, c2959ia0, js));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        AbstractC0608p0.k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            d1(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f15490u) {
            try {
                if (this.f15487o.f0()) {
                    AbstractC0608p0.k("Blank page loaded, 1...");
                    this.f15487o.Y();
                    return;
                }
                this.f15480R = true;
                InterfaceC3650ou interfaceC3650ou = this.f15494y;
                if (interfaceC3650ou != null) {
                    interfaceC3650ou.zza();
                    this.f15494y = null;
                }
                t0();
                if (this.f15487o.O() != null) {
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.Nb)).booleanValue()) {
                        this.f15487o.O().y7(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i8, String str, String str2) {
        this.f15466D = true;
        this.f15467E = i8;
        this.f15468F = str;
        this.f15469G = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f15487o.a1(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final boolean p() {
        boolean z7;
        synchronized (this.f15490u) {
            z7 = this.f15471I;
        }
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void s() {
        InterfaceC1426Ip interfaceC1426Ip = this.f15478P;
        if (interfaceC1426Ip != null) {
            WebView A7 = this.f15487o.A();
            if (z0.X.Q(A7)) {
                N(A7, interfaceC1426Ip, 10);
                return;
            }
            C();
            ViewOnAttachStateChangeListenerC1178Bt viewOnAttachStateChangeListenerC1178Bt = new ViewOnAttachStateChangeListenerC1178Bt(this, interfaceC1426Ip);
            this.f15486X = viewOnAttachStateChangeListenerC1178Bt;
            ((View) this.f15487o).addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1178Bt);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return b0(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case ModuleDescriptor.MODULE_VERSION /* 127 */:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AbstractC0608p0.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            d1(parse);
        } else {
            if (this.f15465C && webView == this.f15487o.A()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    InterfaceC0484a interfaceC0484a = this.f15491v;
                    if (interfaceC0484a != null) {
                        interfaceC0484a.I0();
                        InterfaceC1426Ip interfaceC1426Ip = this.f15478P;
                        if (interfaceC1426Ip != null) {
                            interfaceC1426Ip.b0(str);
                        }
                        this.f15491v = null;
                    }
                    InterfaceC3912rG interfaceC3912rG = this.f15464B;
                    if (interfaceC3912rG != null) {
                        interfaceC3912rG.K0();
                        this.f15464B = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f15487o.A().willNotDraw()) {
                H2.p.g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    N9 F7 = this.f15487o.F();
                    P60 N02 = this.f15487o.N0();
                    if (!((Boolean) D2.A.c().a(AbstractC3184kf.Sb)).booleanValue() || N02 == null) {
                        if (F7 != null && F7.f(parse)) {
                            Context context = this.f15487o.getContext();
                            InterfaceC4410vt interfaceC4410vt = this.f15487o;
                            parse = F7.a(parse, context, (View) interfaceC4410vt, interfaceC4410vt.f());
                        }
                    } else if (F7 != null && F7.f(parse)) {
                        Context context2 = this.f15487o.getContext();
                        InterfaceC4410vt interfaceC4410vt2 = this.f15487o;
                        parse = N02.a(parse, context2, (View) interfaceC4410vt2, interfaceC4410vt2.f());
                    }
                } catch (zzavb unused) {
                    H2.p.g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                C2.b bVar = this.f15476N;
                if (bVar == null || bVar.c()) {
                    F2.l lVar = new F2.l("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    InterfaceC4410vt interfaceC4410vt3 = this.f15487o;
                    P0(lVar, true, false, interfaceC4410vt3 != null ? interfaceC4410vt3.r() : "");
                } else {
                    bVar.b(str);
                }
            }
        }
        return true;
    }

    public final void t0() {
        if (this.f15493x != null && ((this.f15480R && this.f15482T <= 0) || this.f15481S || this.f15466D)) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue() && this.f15487o.k() != null) {
                AbstractC3946rf.a(this.f15487o.k().a(), this.f15487o.i(), "awfllc");
            }
            InterfaceC3541nu interfaceC3541nu = this.f15493x;
            boolean z7 = false;
            if (!this.f15481S && !this.f15466D) {
                z7 = true;
            }
            interfaceC3541nu.a(z7, this.f15467E, this.f15468F, this.f15469G);
            this.f15493x = null;
        }
        this.f15487o.v();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void v0(InterfaceC3650ou interfaceC3650ou) {
        this.f15494y = interfaceC3650ou;
    }

    public final void w0() {
        InterfaceC1426Ip interfaceC1426Ip = this.f15478P;
        if (interfaceC1426Ip != null) {
            interfaceC1426Ip.b();
            this.f15478P = null;
        }
        C();
        synchronized (this.f15490u) {
            try {
                this.f15489t.clear();
                this.f15491v = null;
                this.f15492w = null;
                this.f15493x = null;
                this.f15494y = null;
                this.f15495z = null;
                this.f15463A = null;
                this.f15465C = false;
                this.f15470H = false;
                this.f15471I = false;
                this.f15472J = false;
                this.f15474L = null;
                this.f15476N = null;
                this.f15475M = null;
                C1982Ym c1982Ym = this.f15477O;
                if (c1982Ym != null) {
                    c1982Ym.h(true);
                    this.f15477O = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final void x() {
        InterfaceC3912rG interfaceC3912rG = this.f15464B;
        if (interfaceC3912rG != null) {
            interfaceC3912rG.x();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759pu
    public final void y0(boolean z7) {
        synchronized (this.f15490u) {
            this.f15473K = z7;
        }
    }
}
