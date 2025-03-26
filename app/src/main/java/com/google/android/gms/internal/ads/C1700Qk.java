package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import G2.C0578a0;
import android.content.Context;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Qk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1700Qk {

    /* renamed from: b, reason: collision with root package name */
    private final Context f18525b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18526c;

    /* renamed from: d, reason: collision with root package name */
    private final H2.a f18527d;

    /* renamed from: e, reason: collision with root package name */
    private final RunnableC3791q90 f18528e;

    /* renamed from: f, reason: collision with root package name */
    private final G2.E f18529f;

    /* renamed from: g, reason: collision with root package name */
    private final G2.E f18530g;

    /* renamed from: h, reason: collision with root package name */
    private C1665Pk f18531h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f18524a = new Object();

    /* renamed from: i, reason: collision with root package name */
    private int f18532i = 1;

    public C1700Qk(Context context, H2.a aVar, String str, G2.E e8, G2.E e9, RunnableC3791q90 runnableC3791q90) {
        this.f18526c = str;
        this.f18525b = context.getApplicationContext();
        this.f18527d = aVar;
        this.f18528e = runnableC3791q90;
        this.f18529f = e8;
        this.f18530g = e9;
    }

    public final C1491Kk b(N9 n9) {
        AbstractC0608p0.k("getEngine: Trying to acquire lock");
        synchronized (this.f18524a) {
            try {
                AbstractC0608p0.k("getEngine: Lock acquired");
                AbstractC0608p0.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.f18524a) {
                    try {
                        AbstractC0608p0.k("refreshIfDestroyed: Lock acquired");
                        C1665Pk c1665Pk = this.f18531h;
                        if (c1665Pk != null && this.f18532i == 0) {
                            c1665Pk.f(new InterfaceC1951Xq() { // from class: com.google.android.gms.internal.ads.yk
                                @Override // com.google.android.gms.internal.ads.InterfaceC1951Xq
                                public final void a(Object obj) {
                                    this.f28180a.k((InterfaceC3194kk) obj);
                                }
                            }, new InterfaceC1881Vq() { // from class: com.google.android.gms.internal.ads.zk
                                @Override // com.google.android.gms.internal.ads.InterfaceC1881Vq
                                public final void zza() {
                                }
                            });
                        }
                    } finally {
                    }
                }
                AbstractC0608p0.k("refreshIfDestroyed: Lock released");
                C1665Pk c1665Pk2 = this.f18531h;
                if (c1665Pk2 != null && c1665Pk2.a() != -1) {
                    int i8 = this.f18532i;
                    if (i8 == 0) {
                        AbstractC0608p0.k("getEngine (NO_UPDATE): Lock released");
                        return this.f18531h.g();
                    }
                    if (i8 != 1) {
                        AbstractC0608p0.k("getEngine (UPDATING): Lock released");
                        return this.f18531h.g();
                    }
                    this.f18532i = 2;
                    d(null);
                    AbstractC0608p0.k("getEngine (PENDING_UPDATE): Lock released");
                    return this.f18531h.g();
                }
                this.f18532i = 2;
                this.f18531h = d(null);
                AbstractC0608p0.k("getEngine (NULL or REJECTED): Lock released");
                return this.f18531h.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final C1665Pk d(N9 n9) {
        InterfaceC2160b90 a8 = AbstractC2051a90.a(this.f18525b, 6);
        a8.f();
        final C1665Pk c1665Pk = new C1665Pk(this.f18530g);
        AbstractC0608p0.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final N9 n92 = null;
        AbstractC1497Kq.f16649f.execute(new Runnable(n92, c1665Pk) { // from class: com.google.android.gms.internal.ads.Ak

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ C1665Pk f13623s;

            {
                this.f13623s = c1665Pk;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f13622o.i(null, this.f13623s);
            }
        });
        AbstractC0608p0.k("loadNewJavascriptEngine: Promise created");
        c1665Pk.f(new C1313Fk(this, c1665Pk, a8), new C1349Gk(this, c1665Pk, a8));
        return c1665Pk;
    }

    final /* synthetic */ void i(N9 n9, C1665Pk c1665Pk) {
        long a8 = C2.v.c().a();
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC0608p0.k("loadJavascriptEngine > Before createJavascriptEngine");
            C4065sk c4065sk = new C4065sk(this.f18525b, this.f18527d, null, null);
            AbstractC0608p0.k("loadJavascriptEngine > After createJavascriptEngine");
            AbstractC0608p0.k("loadJavascriptEngine > Before setting new engine loaded listener");
            c4065sk.N(new C4392vk(this, arrayList, a8, c1665Pk, c4065sk));
            AbstractC0608p0.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            c4065sk.H0("/jsLoaded", new C1169Bk(this, a8, c1665Pk, c4065sk));
            C0578a0 c0578a0 = new C0578a0();
            C1205Ck c1205Ck = new C1205Ck(this, null, c4065sk, c0578a0);
            c0578a0.b(c1205Ck);
            AbstractC0608p0.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            c4065sk.H0("/requestReload", c1205Ck);
            AbstractC0608p0.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.f18526c)));
            if (this.f18526c.endsWith(".js")) {
                AbstractC0608p0.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                c4065sk.b0(this.f18526c);
                AbstractC0608p0.k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.f18526c.startsWith("<html>")) {
                AbstractC0608p0.k("loadJavascriptEngine > Before newEngine.loadHtml");
                c4065sk.E(this.f18526c);
                AbstractC0608p0.k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                AbstractC0608p0.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                c4065sk.Q(this.f18526c);
                AbstractC0608p0.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            AbstractC0608p0.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            G2.D0.f2566l.postDelayed(new RunnableC1277Ek(this, c1665Pk, c4065sk, arrayList, a8), ((Integer) D2.A.c().a(AbstractC3184kf.f23856c)).intValue());
        } catch (Throwable th) {
            H2.p.e("Error creating webview.", th);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.B7)).booleanValue()) {
                c1665Pk.d(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) D2.A.c().a(AbstractC3184kf.D7)).booleanValue()) {
                C2.v.s().w(th, "SdkJavascriptFactory.loadJavascriptEngine");
                c1665Pk.c();
            } else {
                C2.v.s().x(th, "SdkJavascriptFactory.loadJavascriptEngine");
                c1665Pk.c();
            }
        }
    }

    final /* synthetic */ void j(C1665Pk c1665Pk, final InterfaceC3194kk interfaceC3194kk, ArrayList arrayList, long j8) {
        AbstractC0608p0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.f18524a) {
            try {
                AbstractC0608p0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (c1665Pk.a() != -1 && c1665Pk.a() != 1) {
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.B7)).booleanValue()) {
                        c1665Pk.d(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        c1665Pk.c();
                    }
                    InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16649f;
                    Objects.requireNonNull(interfaceC3194kk);
                    interfaceExecutorServiceC3522nk0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.uk
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC3194kk.a();
                        }
                    });
                    AbstractC0608p0.k("Could not receive /jsLoaded in " + String.valueOf(D2.A.c().a(AbstractC3184kf.f23847b)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + c1665Pk.a() + ". Update status(onEngLoadedTimeout) is " + this.f18532i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (C2.v.c().a() - j8) + " ms. Rejecting.");
                    AbstractC0608p0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                AbstractC0608p0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void k(InterfaceC3194kk interfaceC3194kk) {
        if (interfaceC3194kk.f()) {
            this.f18532i = 1;
        }
    }
}
