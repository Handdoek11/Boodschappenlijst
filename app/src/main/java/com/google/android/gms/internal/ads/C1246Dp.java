package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.C1109h;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Dp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1246Dp implements InterfaceC1426Ip {

    /* renamed from: l, reason: collision with root package name */
    private static final List f14556l = DesugarCollections.synchronizedList(new ArrayList());

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f14557m = 0;

    /* renamed from: a, reason: collision with root package name */
    private final C4199tw0 f14558a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f14559b;

    /* renamed from: e, reason: collision with root package name */
    private final Context f14562e;

    /* renamed from: f, reason: collision with root package name */
    boolean f14563f;

    /* renamed from: g, reason: collision with root package name */
    private final C1318Fp f14564g;

    /* renamed from: c, reason: collision with root package name */
    private final List f14560c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f14561d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Object f14565h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private HashSet f14566i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private boolean f14567j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14568k = false;

    public C1246Dp(Context context, H2.a aVar, C1318Fp c1318Fp, String str, C1282Ep c1282Ep) {
        Z2.r.m(c1318Fp, "SafeBrowsing config is not present.");
        this.f14562e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f14559b = new LinkedHashMap();
        this.f14564g = c1318Fp;
        Iterator it = c1318Fp.f15204v.iterator();
        while (it.hasNext()) {
            this.f14566i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f14566i.remove("cookie".toLowerCase(Locale.ENGLISH));
        C4199tw0 b02 = C4637xx0.b0();
        b02.P(9);
        b02.L(str);
        b02.J(str);
        C4308uw0 b03 = C4417vw0.b0();
        String str2 = this.f14564g.f15200o;
        if (str2 != null) {
            b03.C(str2);
        }
        b02.I((C4417vw0) b03.x());
        C3657ox0 b04 = C3766px0.b0();
        b04.E(h3.e.a(this.f14562e).g());
        String str3 = aVar.f2914o;
        if (str3 != null) {
            b04.C(str3);
        }
        long a8 = C1109h.f().a(this.f14562e);
        if (a8 > 0) {
            b04.D(a8);
        }
        b02.H((C3766px0) b04.x());
        this.f14558a = b02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426Ip
    public final void a(String str, Map map, int i8) {
        synchronized (this.f14565h) {
            if (i8 == 3) {
                try {
                    this.f14568k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f14559b.containsKey(str)) {
                if (i8 == 3) {
                    ((C3439mx0) this.f14559b.get(str)).G(4);
                }
                return;
            }
            C3439mx0 c02 = C3548nx0.c0();
            int a8 = AbstractC3330lx0.a(i8);
            if (a8 != 0) {
                c02.G(a8);
            }
            c02.D(this.f14559b.size());
            c02.F(str);
            Kw0 b02 = Nw0.b0();
            if (!this.f14566i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f14566i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        Ew0 b03 = Fw0.b0();
                        b03.C(AbstractC3542nu0.I(str2));
                        b03.D(AbstractC3542nu0.I(str3));
                        b02.C((Fw0) b03.x());
                    }
                }
            }
            c02.E((Nw0) b02.x());
            this.f14559b.put(str, c02);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426Ip
    public final void b() {
        synchronized (this.f14565h) {
            this.f14559b.keySet();
            com.google.common.util.concurrent.d h8 = AbstractC2326ck0.h(Collections.emptyMap());
            InterfaceC1420Ij0 interfaceC1420Ij0 = new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.yp
                @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                public final com.google.common.util.concurrent.d a(Object obj) {
                    return this.f28205a.d((Map) obj);
                }
            };
            InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16650g;
            com.google.common.util.concurrent.d n8 = AbstractC2326ck0.n(h8, interfaceC1420Ij0, interfaceExecutorServiceC3522nk0);
            com.google.common.util.concurrent.d o8 = AbstractC2326ck0.o(n8, 10L, TimeUnit.SECONDS, AbstractC1497Kq.f16647d);
            AbstractC2326ck0.r(n8, new C1210Cp(this, o8), interfaceExecutorServiceC3522nk0);
            f14556l.add(o8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426Ip
    public final void b0(String str) {
        synchronized (this.f14565h) {
            try {
                if (str == null) {
                    this.f14558a.F();
                } else {
                    this.f14558a.G(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1426Ip
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.Fp r0 = r7.f14564g
            boolean r0 = r0.f15202t
            if (r0 != 0) goto L8
            goto L81
        L8:
            boolean r0 = r7.f14567j
            if (r0 != 0) goto L81
            C2.v.t()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6f
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L26
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L26
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L26
            if (r3 == 0) goto L28
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L26
            goto L29
        L26:
            r2 = move-exception
            goto L2f
        L28:
            r3 = r1
        L29:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2d
            goto L35
        L2d:
            r2 = move-exception
            goto L30
        L2f:
            r3 = r1
        L30:
            java.lang.String r4 = "Fail to capture the web view"
            H2.p.e(r4, r2)
        L35:
            if (r3 != 0) goto L6e
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L60
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L60
            if (r2 == 0) goto L62
            if (r3 != 0) goto L44
            goto L62
        L44:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L60
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L60
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L60
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L60
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L60
            r1 = r4
            goto L6f
        L60:
            r8 = move-exception
            goto L68
        L62:
            java.lang.String r8 = "Width or height of view is zero"
            H2.p.g(r8)     // Catch: java.lang.RuntimeException -> L60
            goto L6f
        L68:
            java.lang.String r2 = "Fail to capture the webview"
            H2.p.e(r2, r8)
            goto L6f
        L6e:
            r1 = r3
        L6f:
            if (r1 != 0) goto L77
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.AbstractC1390Hp.a(r8)
            return
        L77:
            r7.f14567j = r0
            com.google.android.gms.internal.ads.zp r8 = new com.google.android.gms.internal.ads.zp
            r8.<init>()
            G2.D0.M(r8)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1246Dp.c(android.view.View):void");
    }

    final /* synthetic */ com.google.common.util.concurrent.d d(Map map) {
        C3439mx0 c3439mx0;
        com.google.common.util.concurrent.d m8;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f14565h) {
                            try {
                                int length = optJSONArray.length();
                                synchronized (this.f14565h) {
                                    c3439mx0 = (C3439mx0) this.f14559b.get(str);
                                }
                                if (c3439mx0 == null) {
                                    AbstractC1390Hp.a("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i8 = 0; i8 < length; i8++) {
                                        c3439mx0.C(optJSONArray.getJSONObject(i8).getString("threat_type"));
                                    }
                                    this.f14563f = (length > 0) | this.f14563f;
                                }
                            } finally {
                            }
                        }
                    }
                }
            } catch (JSONException e8) {
                if (((Boolean) AbstractC4166tg.f26911a.e()).booleanValue()) {
                    H2.p.c("Failed to get SafeBrowsing metadata", e8);
                }
                return AbstractC2326ck0.g(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f14563f) {
            synchronized (this.f14565h) {
                this.f14558a.P(10);
            }
        }
        boolean z7 = this.f14563f;
        if (!(z7 && this.f14564g.f15206x) && (!(this.f14568k && this.f14564g.f15205w) && (z7 || !this.f14564g.f15203u))) {
            return AbstractC2326ck0.h(null);
        }
        synchronized (this.f14565h) {
            try {
                Iterator it = this.f14559b.values().iterator();
                while (it.hasNext()) {
                    this.f14558a.E((C3548nx0) ((C3439mx0) it.next()).x());
                }
                this.f14558a.C(this.f14560c);
                this.f14558a.D(this.f14561d);
                if (AbstractC1390Hp.b()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.f14558a.N() + "\n  clickUrl: " + this.f14558a.M() + "\n  resources: \n");
                    for (C3548nx0 c3548nx0 : this.f14558a.O()) {
                        sb.append("    [");
                        sb.append(c3548nx0.b0());
                        sb.append("] ");
                        sb.append(c3548nx0.e0());
                    }
                    AbstractC1390Hp.a(sb.toString());
                }
                com.google.common.util.concurrent.d b8 = new G2.P(this.f14562e).b(1, this.f14564g.f15201s, null, ((C4637xx0) this.f14558a.x()).m());
                if (AbstractC1390Hp.b()) {
                    b8.f(new Runnable() { // from class: com.google.android.gms.internal.ads.Ap
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC1390Hp.a("Pinged SB successfully.");
                        }
                    }, AbstractC1497Kq.f16644a);
                }
                m8 = AbstractC2326ck0.m(b8, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.Bp
                    @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
                    public final Object apply(Object obj) {
                        int i9 = C1246Dp.f14557m;
                        return null;
                    }
                }, AbstractC1497Kq.f16650g);
            } finally {
            }
        }
        return m8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426Ip
    public final boolean f() {
        return f3.m.d() && this.f14564g.f15202t && !this.f14567j;
    }

    final /* synthetic */ void g(Bitmap bitmap) {
        C3324lu0 C7 = AbstractC3542nu0.C();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, C7);
        synchronized (this.f14565h) {
            C4199tw0 c4199tw0 = this.f14558a;
            C2678fx0 b02 = C2896hx0.b0();
            b02.C(C7.e());
            b02.D("image/png");
            b02.E(2);
            c4199tw0.K((C2896hx0) b02.x());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426Ip
    public final C1318Fp zza() {
        return this.f14564g;
    }
}
