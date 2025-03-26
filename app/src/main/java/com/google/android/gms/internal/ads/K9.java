package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class K9 extends I9 {

    /* renamed from: P, reason: collision with root package name */
    protected static final Object f16528P = new Object();

    /* renamed from: Q, reason: collision with root package name */
    private static final String f16529Q = "K9";

    /* renamed from: R, reason: collision with root package name */
    static boolean f16530R = false;

    /* renamed from: S, reason: collision with root package name */
    private static long f16531S;

    /* renamed from: T, reason: collision with root package name */
    private static S9 f16532T;

    /* renamed from: U, reason: collision with root package name */
    private static C4699ya f16533U;

    /* renamed from: V, reason: collision with root package name */
    private static C3719pa f16534V;

    /* renamed from: W, reason: collision with root package name */
    private static C2702g9 f16535W;

    /* renamed from: X, reason: collision with root package name */
    private static P9 f16536X;

    /* renamed from: M, reason: collision with root package name */
    protected final J9 f16537M;

    /* renamed from: N, reason: collision with root package name */
    ViewOnAttachStateChangeListenerC4372va f16538N;

    /* renamed from: O, reason: collision with root package name */
    private final Map f16539O;

    protected K9(Context context, J9 j9) {
        super(context);
        this.f16539O = new HashMap();
        this.f16537M = j9;
    }

    protected static C3610oa q(Context context, boolean z7) {
        if (I9.f15880L == null) {
            synchronized (f16528P) {
                try {
                    if (I9.f15880L == null) {
                        C3610oa g8 = C3610oa.g(context, "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", z7, f16536X);
                        if (g8.r()) {
                            try {
                                if (((Boolean) D2.A.c().a(AbstractC3184kf.f24004s3)).booleanValue()) {
                                    g8.t("w4g9FXzOzEwcEeCpaSre5nXuOUCFa92GFetfeeKgPQcF4KCZSoB1ybtd0ZEBGNIA", "edZBbMBYITINvHy1TGuBnyHrwyVIJEJzJQocfZ8d7ZI=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            g8.t("mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", Context.class);
                            g8.t("dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", Context.class);
                            g8.t("fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", Context.class);
                            g8.t("BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", Context.class);
                            g8.t("P/SJPs6J09HHrsHH3yRlYUs/9QaX+N9sbuXBCqzOk0Vtsso6vN6yQG3sif+Q9+N4", "MRnsFh7aI+oC8kg1+amaEJuIrxjLkR8/37mSauK2nHU=", Context.class);
                            Class cls = Boolean.TYPE;
                            g8.t("GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", Context.class, cls);
                            g8.t("rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", Context.class);
                            g8.t("IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", Context.class);
                            g8.t("zquiBLNsiJH5keRetXBCNmjSlO+FJBcpgfDbltZRb+WTF5I/NRR9hCGZxARfGH0K", "1hqMb526iXwDuGjyfOFzL8CpmWwTXgqej4g8gq9uBJ4=", MotionEvent.class, DisplayMetrics.class);
                            g8.t("kP6ItNwnvZ5+WyUcaZ02EOdpRTj+BEXM0VKXOe+cRQHvvVlFaFzrbSSXSpAmSH7O", "CbvMM1RmBqY6HgXPSjmPhmgdiwuju3NT+G66/tI7UPk=", MotionEvent.class, DisplayMetrics.class);
                            g8.t("y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", new Class[0]);
                            g8.t("ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", new Class[0]);
                            g8.t("IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", new Class[0]);
                            g8.t("bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", new Class[0]);
                            g8.t("bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", new Class[0]);
                            g8.t("SB9y9R9TfrBrk/vvw6hLKELaohqG/NwYydNqAtO02nMZ4t1KTWLQTj+uV3qwKJ+5", "zJhT7qghLWaTsmehrEh6IjKTMRAYPpUw83GIeS8cyos=", new Class[0]);
                            g8.t("oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", Context.class, cls, String.class);
                            g8.t("xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", StackTraceElement[].class);
                            g8.t("mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", View.class, DisplayMetrics.class, cls, cls);
                            g8.t("dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", Context.class, cls);
                            g8.t("gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", View.class, Activity.class, cls);
                            g8.t("IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", Long.TYPE);
                            g8.t("3Zd6ToP6YGdtLSvr/9LlH3RQ74jHr5f7QlQE5jiIZQZu/jwK9FxbxcEE4M1niHI2", "5EH0wgVOsOOfycPFtjiDLlWMUl1WsId7lt7tllT9vVA=", new Class[0]);
                            try {
                                if (((Boolean) D2.A.c().a(AbstractC3184kf.f24029v3)).booleanValue()) {
                                    g8.t("VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            g8.t("yo4AnI5HYhoV2EsbpvhPGv0ZIHdCUEOv2Gre1uIL5QmSqEaPxW/DTBG1l9mfjeJL", "v4ERF2BZ8VhfOGsNaLYR31bPmiZ7/cUjCjYq2SCVO2Q=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f24037w3)).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        g8.t("zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23785T2)).booleanValue()) {
                                    g8.t("nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23729M2)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                g8.t("e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", cls3, cls3, cls3, cls3);
                            } else {
                                try {
                                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23721L2)).booleanValue()) {
                                        g8.t("SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", long[].class, Context.class, View.class);
                                    }
                                } catch (IllegalStateException unused5) {
                                }
                            }
                        }
                        I9.f15880L = g8;
                    }
                } finally {
                }
            }
        }
        return I9.f15880L;
    }

    static C3828qa r(C3610oa c3610oa, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method j8 = c3610oa.j("zquiBLNsiJH5keRetXBCNmjSlO+FJBcpgfDbltZRb+WTF5I/NRR9hCGZxARfGH0K", "1hqMb526iXwDuGjyfOFzL8CpmWwTXgqej4g8gq9uBJ4=");
        if (j8 == null || motionEvent == null) {
            throw new zzavt();
        }
        try {
            return new C3828qa((String) j8.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new zzavt(e8);
        }
    }

    protected static synchronized void u(Context context, J9 j9) {
        synchronized (K9.class) {
            try {
                if (f16530R) {
                    return;
                }
                f16531S = System.currentTimeMillis() / 1000;
                I9.f15880L = q(context, j9.f16138a);
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f24037w3)).booleanValue()) {
                    f16532T = S9.c(context);
                }
                ExecutorService k8 = I9.f15880L.k();
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f24045x3)).booleanValue() && k8 != null) {
                    f16533U = C4699ya.d(context, k8);
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23729M2)).booleanValue()) {
                    f16534V = new C3719pa();
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23769R2)).booleanValue() || j9.f16140c.h0()) {
                    f16536X = new P9(context, k8);
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23737N2)).booleanValue() || j9.f16140c.g0()) {
                    f16535W = new C2702g9(context, k8, j9.f16140c, f16536X);
                }
                f16530R = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected static final void v(List list) {
        ExecutorService k8;
        if (I9.f15880L == null || (k8 = I9.f15880L.k()) == null || list.isEmpty()) {
            return;
        }
        try {
            k8.invokeAll(list, ((Long) D2.A.c().a(AbstractC3184kf.f23689H2)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            String str = f16529Q;
            StringWriter stringWriter = new StringWriter();
            e8.printStackTrace(new PrintWriter(stringWriter));
            Log.d(str, String.format("class methods got exception: %s", stringWriter.toString()));
        }
    }

    private final synchronized void w(C3610oa c3610oa, C2918i8 c2918i8) {
        MotionEvent motionEvent;
        try {
            try {
                C3828qa r8 = r(c3610oa, this.f15892o, this.f15890J);
                Long l8 = r8.f25940b;
                if (l8 != null) {
                    c2918i8.P(l8.longValue());
                }
                Long l9 = r8.f25941c;
                if (l9 != null) {
                    c2918i8.Q(l9.longValue());
                }
                Long l10 = r8.f25942d;
                if (l10 != null) {
                    c2918i8.N(l10.longValue());
                }
                if (this.f15889I) {
                    Long l11 = r8.f25943e;
                    if (l11 != null) {
                        c2918i8.M(l11.longValue());
                    }
                    Long l12 = r8.f25944f;
                    if (l12 != null) {
                        c2918i8.J(l12.longValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        } catch (zzavt unused) {
        }
        A8 b02 = B8.b0();
        if (this.f15894t > 0 && AbstractC3936ra.e(this.f15890J)) {
            b02.F(AbstractC3936ra.a(this.f15881A, 1, this.f15890J));
            b02.S(AbstractC3936ra.a(this.f15886F - this.f15884D, 1, this.f15890J));
            b02.T(AbstractC3936ra.a(this.f15887G - this.f15885E, 1, this.f15890J));
            b02.L(AbstractC3936ra.a(this.f15884D, 1, this.f15890J));
            b02.N(AbstractC3936ra.a(this.f15885E, 1, this.f15890J));
            if (this.f15889I && (motionEvent = this.f15892o) != null) {
                long a8 = AbstractC3936ra.a(((this.f15884D - this.f15886F) + motionEvent.getRawX()) - this.f15892o.getX(), 1, this.f15890J);
                if (a8 != 0) {
                    b02.Q(a8);
                }
                long a9 = AbstractC3936ra.a(((this.f15885E - this.f15887G) + this.f15892o.getRawY()) - this.f15892o.getY(), 1, this.f15890J);
                if (a9 != 0) {
                    b02.R(a9);
                }
            }
        }
        try {
            C3828qa n8 = n(this.f15892o);
            Long l13 = n8.f25940b;
            if (l13 != null) {
                b02.M(l13.longValue());
            }
            Long l14 = n8.f25941c;
            if (l14 != null) {
                b02.O(l14.longValue());
            }
            b02.K(n8.f25942d.longValue());
            if (this.f15889I) {
                Long l15 = n8.f25944f;
                if (l15 != null) {
                    b02.I(l15.longValue());
                }
                Long l16 = n8.f25943e;
                if (l16 != null) {
                    b02.J(l16.longValue());
                }
                Long l17 = n8.f25945g;
                if (l17 != null) {
                    b02.V(l17.longValue() != 0 ? 2 : 1);
                }
                if (this.f15895u > 0) {
                    Long valueOf = AbstractC3936ra.e(this.f15890J) ? Long.valueOf(Math.round(this.f15900z / this.f15895u)) : null;
                    if (valueOf != null) {
                        b02.D(valueOf.longValue());
                    } else {
                        b02.C();
                    }
                    b02.E(Math.round(this.f15899y / this.f15895u));
                }
                Long l18 = n8.f25948j;
                if (l18 != null) {
                    b02.G(l18.longValue());
                }
                Long l19 = n8.f25949k;
                if (l19 != null) {
                    b02.P(l19.longValue());
                }
                Long l20 = n8.f25950l;
                if (l20 != null) {
                    b02.U(l20.longValue() != 0 ? 2 : 1);
                }
            }
        } catch (zzavt unused2) {
        }
        long j8 = this.f15898x;
        if (j8 > 0) {
            b02.H(j8);
        }
        c2918i8.T((B8) b02.x());
        long j9 = this.f15894t;
        if (j9 > 0) {
            c2918i8.K(j9);
        }
        long j10 = this.f15895u;
        if (j10 > 0) {
            c2918i8.L(j10);
        }
        long j11 = this.f15896v;
        if (j11 > 0) {
            c2918i8.O(j11);
        }
        long j12 = this.f15897w;
        if (j12 > 0) {
            c2918i8.I(j12);
        }
        try {
            int size = this.f15893s.size() - 1;
            if (size > 0) {
                c2918i8.k0();
                for (int i8 = 0; i8 < size; i8++) {
                    C3828qa r9 = r(I9.f15880L, (MotionEvent) this.f15893s.get(i8), this.f15890J);
                    A8 b03 = B8.b0();
                    b03.M(r9.f25940b.longValue());
                    b03.O(r9.f25941c.longValue());
                    c2918i8.c0((B8) b03.x());
                }
            }
        } catch (zzavt unused3) {
            c2918i8.k0();
        }
    }

    private static final void x() {
        C4699ya c4699ya = f16533U;
        if (c4699ya != null) {
            c4699ya.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void b(View view) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23713K2)).booleanValue()) {
            if (this.f16538N == null) {
                C3610oa c3610oa = I9.f15880L;
                this.f16538N = new ViewOnAttachStateChangeListenerC4372va(c3610oa.f25209a, c3610oa.f());
            }
            this.f16538N.d(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.I9
    protected final long j(StackTraceElement[] stackTraceElementArr) {
        Method j8 = I9.f15880L.j("xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=");
        if (j8 == null || stackTraceElementArr == null) {
            throw new zzavt();
        }
        try {
            return new C2522ea((String) j8.invoke(null, stackTraceElementArr)).f21832b.longValue();
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new zzavt(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.I9
    protected final C2918i8 k(Context context, View view, Activity activity) {
        x();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23729M2)).booleanValue()) {
            f16534V.i();
        }
        J9 j9 = this.f16537M;
        C2918i8 B02 = E8.B0();
        if (!TextUtils.isEmpty(j9.f16139b)) {
            B02.q0(this.f16537M.f16139b);
        }
        t(q(context, this.f16537M.f16138a), B02, view, activity, true, context);
        return B02;
    }

    @Override // com.google.android.gms.internal.ads.I9
    protected final C2918i8 l(Context context, U7 u7) {
        x();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23729M2)).booleanValue()) {
            f16534V.j();
        }
        J9 j9 = this.f16537M;
        C2918i8 B02 = E8.B0();
        if (!TextUtils.isEmpty(j9.f16139b)) {
            B02.q0(this.f16537M.f16139b);
        }
        C3610oa q8 = q(context, this.f16537M.f16138a);
        if (q8.k() != null) {
            v(s(q8, context, B02, null));
        }
        return B02;
    }

    @Override // com.google.android.gms.internal.ads.I9
    protected final C2918i8 m(Context context, View view, Activity activity) {
        x();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23729M2)).booleanValue()) {
            f16534V.k(context, view);
        }
        J9 j9 = this.f16537M;
        C2918i8 B02 = E8.B0();
        B02.q0(j9.f16139b);
        t(q(context, this.f16537M.f16138a), B02, view, activity, false, context);
        return B02;
    }

    @Override // com.google.android.gms.internal.ads.I9
    protected final C3828qa n(MotionEvent motionEvent) {
        Method j8 = I9.f15880L.j("kP6ItNwnvZ5+WyUcaZ02EOdpRTj+BEXM0VKXOe+cRQHvvVlFaFzrbSSXSpAmSH7O", "CbvMM1RmBqY6HgXPSjmPhmgdiwuju3NT+G66/tI7UPk=");
        if (j8 == null || motionEvent == null) {
            throw new zzavt();
        }
        try {
            return new C3828qa((String) j8.invoke(null, motionEvent, this.f15890J));
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new zzavt(e8);
        }
    }

    protected List s(C3610oa c3610oa, Context context, C2918i8 c2918i8, U7 u7) {
        long j8;
        long j9;
        int a8 = c3610oa.a();
        ArrayList arrayList = new ArrayList();
        if (!c3610oa.r()) {
            c2918i8.F(16384L);
            return arrayList;
        }
        arrayList.add(new C1221Da(c3610oa, "oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", c2918i8, a8, 27, context, null, this.f16537M.f16140c, f16535W));
        arrayList.add(new C1329Ga(c3610oa, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", c2918i8, f16531S, a8, 25));
        arrayList.add(new C1716Ra(c3610oa, "IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", c2918i8, a8, 1));
        arrayList.add(new C1821Ua(c3610oa, "fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", c2918i8, a8, 31, context));
        arrayList.add(new C1996Za(c3610oa, "ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", c2918i8, a8, 33));
        arrayList.add(new C1185Ca(c3610oa, "dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", c2918i8, a8, 29, context));
        arrayList.add(new C1257Ea(c3610oa, "BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", c2918i8, a8, 5));
        arrayList.add(new C1681Qa(c3610oa, "P/SJPs6J09HHrsHH3yRlYUs/9QaX+N9sbuXBCqzOk0Vtsso6vN6yQG3sif+Q9+N4", "MRnsFh7aI+oC8kg1+amaEJuIrxjLkR8/37mSauK2nHU=", c2918i8, a8, 12));
        arrayList.add(new C1751Sa(c3610oa, "GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", c2918i8, a8, 3));
        arrayList.add(new C1293Fa(c3610oa, "bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", c2918i8, a8, 44));
        arrayList.add(new C1507La(c3610oa, "bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", c2918i8, a8, 22));
        arrayList.add(new C2090ab(c3610oa, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", c2918i8, a8, 48));
        arrayList.add(new C1149Ba(c3610oa, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", c2918i8, a8, 49));
        arrayList.add(new C1926Xa(c3610oa, "SB9y9R9TfrBrk/vvw6hLKELaohqG/NwYydNqAtO02nMZ4t1KTWLQTj+uV3qwKJ+5", "zJhT7qghLWaTsmehrEh6IjKTMRAYPpUw83GIeS8cyos=", c2918i8, a8, 51));
        arrayList.add(new C1856Va(c3610oa, "dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", c2918i8, a8, 61));
        if (Build.VERSION.SDK_INT >= 24) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f24037w3)).booleanValue()) {
                C4699ya c4699ya = f16533U;
                if (c4699ya != null) {
                    j8 = c4699ya.c();
                    j9 = c4699ya.b();
                } else {
                    j8 = -1;
                    j9 = -1;
                }
                arrayList.add(new C1646Pa(c3610oa, "zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", c2918i8, a8, 11, f16532T, j8, j9));
            }
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f24029v3)).booleanValue()) {
            arrayList.add(new C1786Ta(c3610oa, "VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", c2918i8, a8, 73));
        }
        arrayList.add(new C1576Na(c3610oa, "yo4AnI5HYhoV2EsbpvhPGv0ZIHdCUEOv2Gre1uIL5QmSqEaPxW/DTBG1l9mfjeJL", "v4ERF2BZ8VhfOGsNaLYR31bPmiZ7/cUjCjYq2SCVO2Q=", c2918i8, a8, 76));
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f24061z3)).booleanValue()) {
            arrayList.add(new C1113Aa(c3610oa, "3Zd6ToP6YGdtLSvr/9LlH3RQ74jHr5f7QlQE5jiIZQZu/jwK9FxbxcEE4M1niHI2", "5EH0wgVOsOOfycPFtjiDLlWMUl1WsId7lt7tllT9vVA=", c2918i8, a8, 89));
        }
        return arrayList;
    }

    protected final void t(C3610oa c3610oa, C2918i8 c2918i8, View view, Activity activity, boolean z7, Context context) {
        List list;
        if (c3610oa.r()) {
            w(c3610oa, c2918i8);
            ArrayList arrayList = new ArrayList();
            if (c3610oa.k() != null) {
                int a8 = c3610oa.a();
                arrayList.add(new CallableC1401Ia(c3610oa, c2918i8));
                arrayList.add(new C1716Ra(c3610oa, "IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", c2918i8, a8, 1));
                arrayList.add(new C1329Ga(c3610oa, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", c2918i8, f16531S, a8, 25));
                arrayList.add(new C1293Fa(c3610oa, "bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", c2918i8, a8, 44));
                arrayList.add(new C1681Qa(c3610oa, "P/SJPs6J09HHrsHH3yRlYUs/9QaX+N9sbuXBCqzOk0Vtsso6vN6yQG3sif+Q9+N4", "MRnsFh7aI+oC8kg1+amaEJuIrxjLkR8/37mSauK2nHU=", c2918i8, a8, 12));
                arrayList.add(new C1751Sa(c3610oa, "GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", c2918i8, a8, 3));
                arrayList.add(new C1507La(c3610oa, "bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", c2918i8, a8, 22));
                arrayList.add(new C1257Ea(c3610oa, "BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", c2918i8, a8, 5));
                arrayList.add(new C2090ab(c3610oa, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", c2918i8, a8, 48));
                arrayList.add(new C1149Ba(c3610oa, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", c2918i8, a8, 49));
                arrayList.add(new C1926Xa(c3610oa, "SB9y9R9TfrBrk/vvw6hLKELaohqG/NwYydNqAtO02nMZ4t1KTWLQTj+uV3qwKJ+5", "zJhT7qghLWaTsmehrEh6IjKTMRAYPpUw83GIeS8cyos=", c2918i8, a8, 51));
                arrayList.add(new C1891Wa(c3610oa, "xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", c2918i8, a8, 45, new Throwable().getStackTrace()));
                arrayList.add(new C2199bb(c3610oa, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", c2918i8, a8, 57, view));
                arrayList.add(new C1856Va(c3610oa, "dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", c2918i8, a8, 61));
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23697I2)).booleanValue()) {
                    arrayList.add(new C4808za(c3610oa, "gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", c2918i8, a8, 62, view, activity));
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f24061z3)).booleanValue()) {
                    arrayList.add(new C1113Aa(c3610oa, "3Zd6ToP6YGdtLSvr/9LlH3RQ74jHr5f7QlQE5jiIZQZu/jwK9FxbxcEE4M1niHI2", "5EH0wgVOsOOfycPFtjiDLlWMUl1WsId7lt7tllT9vVA=", c2918i8, a8, 89));
                }
                if (!z7) {
                    try {
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23721L2)).booleanValue()) {
                            arrayList.add(new C1472Ka(c3610oa, "SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", c2918i8, a8, 85, this.f16539O, view, context));
                        }
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23729M2)).booleanValue()) {
                            arrayList.add(new C1437Ja(c3610oa, "e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", c2918i8, a8, 85, f16534V));
                        }
                    } catch (IllegalStateException unused2) {
                    }
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23785T2)).booleanValue()) {
                        arrayList.add(new C1611Oa(c3610oa, "nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", c2918i8, a8, 94, this.f15891K));
                    }
                } else if (((Boolean) D2.A.c().a(AbstractC3184kf.f23713K2)).booleanValue()) {
                    arrayList.add(new C1961Ya(c3610oa, "IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", c2918i8, a8, 53, this.f16538N));
                }
            }
            list = arrayList;
        } else {
            c2918i8.F(16384L);
            list = Arrays.asList(new CallableC1401Ia(c3610oa, c2918i8));
        }
        v(list);
    }
}
