package com.google.android.gms.internal.ads;

import android.net.Uri;
import f3.InterfaceC5781e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Js, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1464Js extends AbstractC1141As implements InterfaceC1212Cr {

    /* renamed from: A, reason: collision with root package name */
    private long f16322A;

    /* renamed from: u, reason: collision with root package name */
    private AbstractC1248Dr f16323u;

    /* renamed from: v, reason: collision with root package name */
    private String f16324v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f16325w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f16326x;

    /* renamed from: y, reason: collision with root package name */
    private C3972rs f16327y;

    /* renamed from: z, reason: collision with root package name */
    private long f16328z;

    public C1464Js(InterfaceC1567Mr interfaceC1567Mr, Lr lr) {
        super(interfaceC1567Mr);
        C2343ct c2343ct = new C2343ct(interfaceC1567Mr.getContext(), lr, (InterfaceC1567Mr) this.f13682t.get(), null);
        H2.p.f("ExoPlayerAdapter initialized.");
        this.f16323u = c2343ct;
        c2343ct.C(this);
    }

    protected static final String w(String str) {
        return "cache:".concat(String.valueOf(H2.g.j(str)));
    }

    private static String x(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void y(long j8) {
        G2.D0.f2566l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.Is
            @Override // java.lang.Runnable
            public final void run() {
                this.f16007o.v();
            }
        }, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1212Cr
    public final void I(int i8, int i9) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1212Cr
    public final void J(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1212Cr
    public final void K(String str, Exception exc) {
        H2.p.h("Precache exception", exc);
        C2.v.s().w(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1212Cr
    public final void L(final boolean z7, final long j8) {
        final InterfaceC1567Mr interfaceC1567Mr = (InterfaceC1567Mr) this.f13682t.get();
        if (interfaceC1567Mr != null) {
            AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Hs
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC1567Mr.l1(z7, j8);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1212Cr
    public final void M(String str, Exception exc) {
        H2.p.h("Precache error", exc);
        C2.v.s().w(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    public final void b() {
        synchronized (this) {
            this.f16325w = true;
            notify();
            d();
        }
        String str = this.f16324v;
        if (str != null) {
            c(this.f16324v, w(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As, W2.e
    public final void d() {
        AbstractC1248Dr abstractC1248Dr = this.f16323u;
        if (abstractC1248Dr != null) {
            abstractC1248Dr.C(null);
            this.f16323u.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    public final void k(int i8) {
        this.f16323u.A(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    public final void l(int i8) {
        this.f16323u.B(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    public final void m(int i8) {
        this.f16323u.D(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    public final void n(int i8) {
        this.f16323u.E(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    public final boolean p(String str) {
        return r(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    public final boolean r(String str, String[] strArr) {
        String str2;
        String str3;
        C1464Js c1464Js;
        long j8;
        long j9;
        String str4;
        ?? r52;
        long j10;
        long j11;
        String str5;
        long j12;
        C1464Js c1464Js2 = this;
        String str6 = str;
        c1464Js2.f16324v = str6;
        String w7 = w(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i8 = 0; i8 < strArr.length; i8++) {
                uriArr[i8] = Uri.parse(strArr[i8]);
            }
            c1464Js2.f16323u.w(uriArr, c1464Js2.f13681s);
            InterfaceC1567Mr interfaceC1567Mr = (InterfaceC1567Mr) c1464Js2.f13682t.get();
            if (interfaceC1567Mr != null) {
                interfaceC1567Mr.W(w7, c1464Js2);
            }
            InterfaceC5781e c8 = C2.v.c();
            long a8 = c8.a();
            long longValue = ((Long) D2.A.c().a(AbstractC3184kf.f23718L)).longValue();
            long longValue2 = ((Long) D2.A.c().a(AbstractC3184kf.f23710K)).longValue() * 1000;
            long intValue = ((Integer) D2.A.c().a(AbstractC3184kf.f24000s)).intValue();
            boolean booleanValue = ((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue();
            long j13 = -1;
            ?? r62 = intValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (c8.a() - a8 > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                        if (c1464Js2.f16325w) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (c1464Js2.f16326x) {
                            break;
                        }
                        if (!c1464Js2.f16323u.M()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long V7 = c1464Js2.f16323u.V();
                        if (V7 > 0) {
                            long R7 = c1464Js2.f16323u.R();
                            if (R7 != j13) {
                                try {
                                    j8 = r62;
                                    long j14 = V7;
                                    j9 = longValue2;
                                    j11 = longValue;
                                    str5 = w7;
                                    try {
                                        j(str, w7, R7, j14, R7 > 0, booleanValue ? c1464Js2.f16323u.r() : -1L, booleanValue ? c1464Js2.f16323u.T() : -1L, booleanValue ? c1464Js2.f16323u.s() : -1L, AbstractC1248Dr.O(), AbstractC1248Dr.Q());
                                        j13 = R7;
                                        j12 = V7;
                                        str4 = j14;
                                    } catch (Throwable th) {
                                        th = th;
                                        c1464Js = this;
                                        str2 = str;
                                        str3 = str5;
                                        try {
                                            throw th;
                                        } catch (Exception e8) {
                                            e = e8;
                                            H2.p.g("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                                            C2.v.s().w(e, "VideoStreamExoPlayerCache.preload");
                                            d();
                                            c1464Js.c(str2, str3, "error", x("error", e));
                                            return false;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str5 = w7;
                                }
                            } else {
                                j8 = r62;
                                j9 = longValue2;
                                j11 = longValue;
                                str5 = w7;
                                j12 = V7;
                                str4 = r62;
                            }
                            r52 = (R7 > j12 ? 1 : (R7 == j12 ? 0 : -1));
                            if (r52 >= 0) {
                                g(str, str5, j12);
                            } else {
                                try {
                                    C1464Js c1464Js3 = this;
                                    str4 = str;
                                    str3 = str5;
                                    if (c1464Js3.f16323u.S() < j8 || R7 <= 0) {
                                        j10 = j11;
                                        r52 = c1464Js3;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c1464Js = r52;
                                    str2 = str4;
                                    throw th;
                                }
                            }
                        } else {
                            j8 = r62;
                            j9 = longValue2;
                            str4 = str6;
                            str3 = w7;
                            r52 = c1464Js2;
                            j10 = longValue;
                        }
                        try {
                            r52.wait(j10);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str2 = str6;
                        str3 = w7;
                        c1464Js = c1464Js2;
                    }
                }
                longValue = j10;
                c1464Js2 = r52;
                str6 = str4;
                w7 = str3;
                r62 = j8;
                longValue2 = j9;
            }
            return true;
        } catch (Exception e9) {
            e = e9;
            str2 = str6;
            str3 = w7;
            c1464Js = c1464Js2;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    public final boolean s(String str, String[] strArr, C3972rs c3972rs) {
        this.f16324v = str;
        this.f16327y = c3972rs;
        String w7 = w(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i8 = 0; i8 < strArr.length; i8++) {
                uriArr[i8] = Uri.parse(strArr[i8]);
            }
            this.f16323u.w(uriArr, this.f13681s);
            InterfaceC1567Mr interfaceC1567Mr = (InterfaceC1567Mr) this.f13682t.get();
            if (interfaceC1567Mr != null) {
                interfaceC1567Mr.W(w7, this);
            }
            this.f16328z = C2.v.c().a();
            this.f16322A = -1L;
            y(0L);
            return true;
        } catch (Exception e8) {
            H2.p.g("Failed to preload url " + str + " Exception: " + e8.getMessage());
            C2.v.s().w(e8, "VideoStreamExoPlayerCache.preload");
            d();
            c(str, w7, "error", x("error", e8));
            return false;
        }
    }

    public final AbstractC1248Dr t() {
        synchronized (this) {
            this.f16326x = true;
            notify();
        }
        this.f16323u.C(null);
        AbstractC1248Dr abstractC1248Dr = this.f16323u;
        this.f16323u = null;
        return abstractC1248Dr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1212Cr
    public final void u() {
        H2.p.g("Precache onRenderedFirstFrame");
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void v() {
        String str;
        C1464Js c1464Js;
        C1464Js c1464Js2;
        long longValue;
        long intValue;
        boolean booleanValue;
        C1464Js c1464Js3;
        long j8;
        long j9;
        String str2;
        C1464Js c1464Js4;
        long j10;
        String w7 = w(this.f16324v);
        try {
            longValue = ((Long) D2.A.c().a(AbstractC3184kf.f23710K)).longValue() * 1000;
            intValue = ((Integer) D2.A.c().a(AbstractC3184kf.f24000s)).intValue();
            booleanValue = ((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue();
        } catch (Exception e8) {
            e = e8;
            str = w7;
            c1464Js = this;
        }
        try {
            synchronized (this) {
                try {
                    if (C2.v.c().a() - this.f16328z > longValue) {
                        throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                    }
                    if (this.f16325w) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.f16326x) {
                        if (!this.f16323u.M()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long V7 = this.f16323u.V();
                        if (V7 > 0) {
                            long R7 = this.f16323u.R();
                            if (R7 != this.f16322A) {
                                try {
                                    j9 = intValue;
                                    str2 = w7;
                                } catch (Throwable th) {
                                    th = th;
                                    str2 = w7;
                                    c1464Js4 = this;
                                }
                                try {
                                    j(this.f16324v, w7, R7, V7, R7 > 0, booleanValue != 0 ? this.f16323u.r() : -1L, booleanValue != 0 ? this.f16323u.T() : -1L, booleanValue != 0 ? this.f16323u.s() : -1L, AbstractC1248Dr.O(), AbstractC1248Dr.Q());
                                    c1464Js4 = this;
                                    j8 = R7;
                                    try {
                                        c1464Js4.f16322A = j8;
                                        j10 = V7;
                                        c1464Js4 = c1464Js4;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str = str2;
                                        c1464Js = c1464Js4;
                                        try {
                                            throw th;
                                        } catch (Exception e9) {
                                            e = e9;
                                            H2.p.g("Failed to preload url " + c1464Js.f16324v + " Exception: " + e.getMessage());
                                            C2.v.s().w(e, "VideoStreamExoPlayerCache.preload");
                                            d();
                                            c1464Js.c(c1464Js.f16324v, str, "error", x("error", e));
                                            c1464Js2 = c1464Js;
                                            C2.v.C().d(c1464Js2.f16327y);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c1464Js4 = this;
                                    str = str2;
                                    c1464Js = c1464Js4;
                                    throw th;
                                }
                            } else {
                                j8 = R7;
                                j9 = intValue;
                                str2 = w7;
                                c1464Js4 = this;
                                j10 = V7;
                            }
                            if (j8 >= j10) {
                                c1464Js4.g(c1464Js4.f16324v, str2, j10);
                                c1464Js2 = c1464Js4;
                            } else {
                                long S7 = c1464Js4.f16323u.S();
                                c1464Js3 = c1464Js4;
                                if (S7 >= j9) {
                                    c1464Js3 = c1464Js4;
                                    if (j8 > 0) {
                                        c1464Js2 = c1464Js4;
                                    }
                                }
                            }
                        } else {
                            c1464Js3 = this;
                        }
                        c1464Js3.y(((Long) D2.A.c().a(AbstractC3184kf.f23718L)).longValue());
                        return;
                    }
                    c1464Js2 = this;
                    C2.v.C().d(c1464Js2.f16327y);
                } catch (Throwable th4) {
                    th = th4;
                    str = w7;
                    c1464Js = this;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            c1464Js = booleanValue;
        }
    }
}
