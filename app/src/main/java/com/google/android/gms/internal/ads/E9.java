package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class E9 implements H9 {

    /* renamed from: I, reason: collision with root package name */
    private static E9 f14652I;

    /* renamed from: A, reason: collision with root package name */
    private final C4699ya f14653A;

    /* renamed from: B, reason: collision with root package name */
    private final C3719pa f14654B;

    /* renamed from: C, reason: collision with root package name */
    private final C2631fa f14655C;

    /* renamed from: F, reason: collision with root package name */
    private volatile boolean f14658F;

    /* renamed from: G, reason: collision with root package name */
    private volatile boolean f14659G;

    /* renamed from: H, reason: collision with root package name */
    private final int f14660H;

    /* renamed from: o, reason: collision with root package name */
    private final Context f14661o;

    /* renamed from: s, reason: collision with root package name */
    private final C2747gd0 f14662s;

    /* renamed from: t, reason: collision with root package name */
    private final C3508nd0 f14663t;

    /* renamed from: u, reason: collision with root package name */
    private final C3617od0 f14664u;

    /* renamed from: v, reason: collision with root package name */
    private final C2849ha f14665v;

    /* renamed from: w, reason: collision with root package name */
    private final C3941rc0 f14666w;

    /* renamed from: x, reason: collision with root package name */
    private final Executor f14667x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3399md0 f14668y;

    /* renamed from: D, reason: collision with root package name */
    volatile long f14656D = 0;

    /* renamed from: E, reason: collision with root package name */
    private final Object f14657E = new Object();

    /* renamed from: z, reason: collision with root package name */
    private final CountDownLatch f14669z = new CountDownLatch(1);

    E9(Context context, C3941rc0 c3941rc0, C2747gd0 c2747gd0, C3508nd0 c3508nd0, C3617od0 c3617od0, C2849ha c2849ha, Executor executor, C3397mc0 c3397mc0, int i8, C4699ya c4699ya, C3719pa c3719pa, C2631fa c2631fa) {
        this.f14659G = false;
        this.f14661o = context;
        this.f14666w = c3941rc0;
        this.f14662s = c2747gd0;
        this.f14663t = c3508nd0;
        this.f14664u = c3617od0;
        this.f14665v = c2849ha;
        this.f14667x = executor;
        this.f14660H = i8;
        this.f14653A = c4699ya;
        this.f14654B = c3719pa;
        this.f14655C = c2631fa;
        this.f14659G = false;
        this.f14668y = new C9(this, c3397mc0);
    }

    public static synchronized E9 j(Context context, L7 l72, boolean z7) {
        E9 s8;
        synchronized (E9.class) {
            AbstractC4050sc0 c8 = AbstractC4159tc0.c();
            c8.a(l72.f0());
            c8.g(l72.i0());
            s8 = s(context, Executors.newCachedThreadPool(), c8.h(), z7);
        }
        return s8;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[Catch: all -> 0x009d, zzgyg -> 0x00a0, TryCatch #0 {zzgyg -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:58:0x0021, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* bridge */ /* synthetic */ void n(com.google.android.gms.internal.ads.E9 r12) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.E9.n(com.google.android.gms.internal.ads.E9):void");
    }

    private static synchronized E9 s(Context context, Executor executor, AbstractC4159tc0 abstractC4159tc0, boolean z7) {
        E9 e9;
        AbstractC4159tc0 abstractC4159tc02;
        C2631fa c2631fa;
        synchronized (E9.class) {
            try {
                if (f14652I == null) {
                    C3941rc0 a8 = C3941rc0.a(context, executor, z7);
                    S9 c8 = ((Boolean) D2.A.c().a(AbstractC3184kf.f24037w3)).booleanValue() ? S9.c(context) : null;
                    C4699ya d8 = ((Boolean) D2.A.c().a(AbstractC3184kf.f24045x3)).booleanValue() ? C4699ya.d(context, executor) : null;
                    C3719pa c3719pa = ((Boolean) D2.A.c().a(AbstractC3184kf.f23729M2)).booleanValue() ? new C3719pa() : null;
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23785T2)).booleanValue()) {
                        c2631fa = new C2631fa();
                        abstractC4159tc02 = abstractC4159tc0;
                    } else {
                        abstractC4159tc02 = abstractC4159tc0;
                        c2631fa = null;
                    }
                    C1512Lc0 e8 = C1512Lc0.e(context, executor, a8, abstractC4159tc02);
                    C2740ga c2740ga = new C2740ga(context);
                    C2849ha c2849ha = new C2849ha(abstractC4159tc0, e8, new ViewOnAttachStateChangeListenerC4372va(context, c2740ga), c2740ga, c8, d8, c3719pa, c2631fa);
                    int b8 = AbstractC1826Uc0.b(context, a8);
                    C3397mc0 c3397mc0 = new C3397mc0();
                    E9 e92 = new E9(context, a8, new C2747gd0(context, b8), new C3508nd0(context, b8, new B9(a8), ((Boolean) D2.A.c().a(AbstractC3184kf.f24036w2)).booleanValue()), new C3617od0(context, c2849ha, a8, c3397mc0), c2849ha, executor, c3397mc0, b8, d8, c3719pa, c2631fa);
                    f14652I = e92;
                    e92.o();
                    f14652I.p();
                }
                e9 = f14652I;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e9;
    }

    private final void t() {
        C4699ya c4699ya = this.f14653A;
        if (c4699ya != null) {
            c4699ya.h();
        }
    }

    private final C2638fd0 u(int i8) {
        if (AbstractC1826Uc0.a(this.f14660H)) {
            return ((Boolean) D2.A.c().a(AbstractC3184kf.f24020u2)).booleanValue() ? this.f14663t.c(1) : this.f14662s.c(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String a(Context context) {
        t();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23729M2)).booleanValue()) {
            this.f14654B.j();
        }
        p();
        InterfaceC4268uc0 a8 = this.f14664u.a();
        if (a8 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a9 = a8.a(context, null);
        this.f14666w.f(5001, System.currentTimeMillis() - currentTimeMillis, a9, null);
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void b(View view) {
        this.f14665v.b(view);
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void c(StackTraceElement[] stackTraceElementArr) {
        C2631fa c2631fa = this.f14655C;
        if (c2631fa != null) {
            c2631fa.b(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String e(Context context, String str, View view) {
        return f(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String f(Context context, String str, View view, Activity activity) {
        t();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23729M2)).booleanValue()) {
            this.f14654B.i();
        }
        p();
        InterfaceC4268uc0 a8 = this.f14664u.a();
        if (a8 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String c8 = a8.c(context, null, str, view, activity);
        this.f14666w.f(5000, System.currentTimeMillis() - currentTimeMillis, c8, null);
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void g(int i8, int i9, int i10) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Qb)).booleanValue() || (displayMetrics = this.f14661o.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f8 = i8;
        float f9 = displayMetrics.density;
        float f10 = i9;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f8 * f9, f10 * f9, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        h(obtain);
        obtain.recycle();
        float f11 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f8 * f11, f10 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        h(obtain2);
        obtain2.recycle();
        float f12 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i10, 1, f8 * f12, f10 * f12, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        h(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void h(MotionEvent motionEvent) {
        InterfaceC4268uc0 a8 = this.f14664u.a();
        if (a8 != null) {
            try {
                a8.b(null, motionEvent);
            } catch (zzfpf e8) {
                this.f14666w.c(e8.a(), -1L, e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String i(Context context, View view, Activity activity) {
        t();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23729M2)).booleanValue()) {
            this.f14654B.k(context, view);
        }
        p();
        InterfaceC4268uc0 a8 = this.f14664u.a();
        if (a8 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String d8 = a8.d(context, null, view, activity);
        this.f14666w.f(5002, System.currentTimeMillis() - currentTimeMillis, d8, null);
        return d8;
    }

    final synchronized void o() {
        long currentTimeMillis = System.currentTimeMillis();
        C2638fd0 u7 = u(1);
        if (u7 == null) {
            this.f14666w.d(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f14664u.c(u7)) {
            this.f14659G = true;
            this.f14669z.countDown();
        }
    }

    public final void p() {
        if (this.f14658F) {
            return;
        }
        synchronized (this.f14657E) {
            try {
                if (!this.f14658F) {
                    if ((System.currentTimeMillis() / 1000) - this.f14656D < 3600) {
                        return;
                    }
                    C2638fd0 b8 = this.f14664u.b();
                    if ((b8 == null || b8.d(3600L)) && AbstractC1826Uc0.a(this.f14660H)) {
                        this.f14667x.execute(new D9(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean r() {
        return this.f14659G;
    }
}
