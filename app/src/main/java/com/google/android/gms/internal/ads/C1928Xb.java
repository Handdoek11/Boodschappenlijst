package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Xb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1928Xb extends Thread {

    /* renamed from: A, reason: collision with root package name */
    private final int f20070A;

    /* renamed from: B, reason: collision with root package name */
    private final int f20071B;

    /* renamed from: C, reason: collision with root package name */
    private final int f20072C;

    /* renamed from: D, reason: collision with root package name */
    private final String f20073D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f20074E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f20075F;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20076o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20077s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f20078t;

    /* renamed from: u, reason: collision with root package name */
    private final C1613Ob f20079u;

    /* renamed from: v, reason: collision with root package name */
    private final int f20080v;

    /* renamed from: w, reason: collision with root package name */
    private final int f20081w;

    /* renamed from: x, reason: collision with root package name */
    private final int f20082x;

    /* renamed from: y, reason: collision with root package name */
    private final int f20083y;

    /* renamed from: z, reason: collision with root package name */
    private final int f20084z;

    public C1928Xb() {
        C1613Ob c1613Ob = new C1613Ob();
        this.f20076o = false;
        this.f20077s = false;
        this.f20079u = c1613Ob;
        this.f20078t = new Object();
        this.f20081w = ((Long) AbstractC2317cg.f21266d.e()).intValue();
        this.f20082x = ((Long) AbstractC2317cg.f21263a.e()).intValue();
        this.f20083y = ((Long) AbstractC2317cg.f21267e.e()).intValue();
        this.f20084z = ((Long) AbstractC2317cg.f21265c.e()).intValue();
        this.f20070A = ((Integer) D2.A.c().a(AbstractC3184kf.f23875e0)).intValue();
        this.f20071B = ((Integer) D2.A.c().a(AbstractC3184kf.f23884f0)).intValue();
        this.f20072C = ((Integer) D2.A.c().a(AbstractC3184kf.f23893g0)).intValue();
        this.f20080v = ((Long) AbstractC2317cg.f21268f.e()).intValue();
        this.f20073D = (String) D2.A.c().a(AbstractC3184kf.f23911i0);
        this.f20074E = ((Boolean) D2.A.c().a(AbstractC3184kf.f23920j0)).booleanValue();
        this.f20075F = ((Boolean) D2.A.c().a(AbstractC3184kf.f23929k0)).booleanValue();
        ((Boolean) D2.A.c().a(AbstractC3184kf.f23938l0)).booleanValue();
        setName("ContentFetchTask");
    }

    final C1893Wb a(View view, C1578Nb c1578Nb) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    c1578Nb.h(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new C1893Wb(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof InterfaceC4410vt)) {
                WebView webView = (WebView) view;
                if (f3.m.d()) {
                    c1578Nb.f();
                    webView.post(new RunnableC1858Vb(this, c1578Nb, webView, globalVisibleRect));
                    return new C1893Wb(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    C1893Wb a8 = a(viewGroup.getChildAt(i10), c1578Nb);
                    i8 += a8.f19818a;
                    i9 += a8.f19819b;
                }
                return new C1893Wb(this, i8, i9);
            }
        }
        return new C1893Wb(this, 0, 0);
    }

    final void b(View view) {
        try {
            C1578Nb c1578Nb = new C1578Nb(this.f20081w, this.f20082x, this.f20083y, this.f20084z, this.f20070A, this.f20071B, this.f20072C, this.f20075F);
            Context b8 = C2.v.e().b();
            if (b8 != null && !TextUtils.isEmpty(this.f20073D)) {
                String str = (String) view.getTag(b8.getResources().getIdentifier((String) D2.A.c().a(AbstractC3184kf.f23902h0), "id", b8.getPackageName()));
                if (str != null && str.equals(this.f20073D)) {
                    return;
                }
            }
            C1893Wb a8 = a(view, c1578Nb);
            c1578Nb.j();
            if (a8.f19818a == 0 && a8.f19819b == 0) {
                return;
            }
            int i8 = a8.f19819b;
            if (i8 != 0) {
                if (i8 == 0) {
                }
                this.f20079u.a(c1578Nb);
            } else if (c1578Nb.b() == 0) {
                return;
            }
            if (this.f20079u.c(c1578Nb)) {
                return;
            }
            this.f20079u.a(c1578Nb);
        } catch (Exception e8) {
            H2.p.e("Exception in fetchContentOnUIThread", e8);
            C2.v.s().x(e8, "ContentFetchTask.fetchContent");
        }
    }

    final void c(C1578Nb c1578Nb, WebView webView, String str, boolean z7) {
        c1578Nb.e();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.f20074E || TextUtils.isEmpty(webView.getTitle())) {
                    c1578Nb.i(optString, z7, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    c1578Nb.i(webView.getTitle() + "\n" + optString, z7, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (c1578Nb.l()) {
                this.f20079u.b(c1578Nb);
            }
        } catch (JSONException unused) {
            H2.p.b("Json string may be malformed.");
        } catch (Throwable th) {
            H2.p.c("Failed to get webview content.", th);
            C2.v.s().x(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void d() {
        synchronized (this.f20078t) {
            try {
                if (this.f20076o) {
                    H2.p.b("Content hash thread already started, quitting...");
                } else {
                    this.f20076o = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f20078t) {
            this.f20077s = true;
            H2.p.b("ContentFetchThread: paused, pause = true");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = C2.v.e().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        H2.p.b("ContentFetchThread: no activity. Sleeping.");
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        C2.v.s().x(r0, "ContentFetchTask.extractContent");
        H2.p.b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
    
        H2.p.e("Error in ContentFetchTask", r0);
        C2.v.s().x(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        H2.p.e("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de A[EXC_TOP_SPLITTER, LOOP:1: B:66:0x00de->B:73:0x00de, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1928Xb.run():void");
    }
}
