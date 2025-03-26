package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Cx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1218Cx implements InterfaceC3033jC, ZC, EC, InterfaceC0484a, AC, InterfaceC2934iG {

    /* renamed from: A, reason: collision with root package name */
    private final C1726Rf f14284A;

    /* renamed from: B, reason: collision with root package name */
    private final WeakReference f14285B;

    /* renamed from: C, reason: collision with root package name */
    private final WeakReference f14286C;

    /* renamed from: D, reason: collision with root package name */
    private final IB f14287D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f14288E;

    /* renamed from: F, reason: collision with root package name */
    private final AtomicBoolean f14289F = new AtomicBoolean();

    /* renamed from: o, reason: collision with root package name */
    private final Context f14290o;

    /* renamed from: s, reason: collision with root package name */
    private final Executor f14291s;

    /* renamed from: t, reason: collision with root package name */
    private final Executor f14292t;

    /* renamed from: u, reason: collision with root package name */
    private final ScheduledExecutorService f14293u;

    /* renamed from: v, reason: collision with root package name */
    private final C60 f14294v;

    /* renamed from: w, reason: collision with root package name */
    private final C3785q60 f14295w;

    /* renamed from: x, reason: collision with root package name */
    private final C2306ca0 f14296x;

    /* renamed from: y, reason: collision with root package name */
    private final W60 f14297y;

    /* renamed from: z, reason: collision with root package name */
    private final N9 f14298z;

    C1218Cx(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, C60 c60, C3785q60 c3785q60, C2306ca0 c2306ca0, W60 w60, View view, InterfaceC4410vt interfaceC4410vt, N9 n9, C1726Rf c1726Rf, C1796Tf c1796Tf, RunnableC3464n90 runnableC3464n90, IB ib) {
        this.f14290o = context;
        this.f14291s = executor;
        this.f14292t = executor2;
        this.f14293u = scheduledExecutorService;
        this.f14294v = c60;
        this.f14295w = c3785q60;
        this.f14296x = c2306ca0;
        this.f14297y = w60;
        this.f14298z = n9;
        this.f14285B = new WeakReference(view);
        this.f14286C = new WeakReference(interfaceC4410vt);
        this.f14284A = c1726Rf;
        this.f14287D = ib;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List N() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.mb)).booleanValue()) {
            C2.v.t();
            if (G2.D0.c(this.f14290o)) {
                C2.v.t();
                Integer Y7 = G2.D0.Y(this.f14290o);
                if (Y7 != null) {
                    int min = Math.min(Y7.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f14295w.f25784d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.f14295w.f25784d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        String str;
        int i8;
        List list = this.f14295w.f25784d;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23666E3)).booleanValue()) {
            str = this.f14298z.c().i(this.f14290o, (View) this.f14285B.get(), null);
        } else {
            str = null;
        }
        if ((((Boolean) D2.A.c().a(AbstractC3184kf.f23639B0)).booleanValue() && this.f14294v.f14101b.f13520b.f26838h) || !((Boolean) AbstractC3186kg.f24073h.e()).booleanValue()) {
            this.f14297y.a(this.f14296x.d(this.f14294v, this.f14295w, false, str, null, N()));
            return;
        }
        if (((Boolean) AbstractC3186kg.f24072g.e()).booleanValue() && ((i8 = this.f14295w.f25780b) == 1 || i8 == 2 || i8 == 5)) {
        }
        AbstractC2326ck0.r((Sj0) AbstractC2326ck0.o(Sj0.D(AbstractC2326ck0.h(null)), ((Long) D2.A.c().a(AbstractC3184kf.f23876e1)).longValue(), TimeUnit.MILLISECONDS, this.f14293u), new C1182Bx(this, str), this.f14291s);
    }

    private final void T(final int i8, final int i9) {
        View view;
        if (i8 <= 0 || !((view = (View) this.f14285B.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            Q();
        } else {
            this.f14293u.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.yx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28234o.C(i8, i9);
                }
            }, i9, TimeUnit.MILLISECONDS);
        }
    }

    final /* synthetic */ void C(final int i8, final int i9) {
        this.f14291s.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zx
            @Override // java.lang.Runnable
            public final void run() {
                this.f28732o.E(i8, i9);
            }
        });
    }

    final /* synthetic */ void E(int i8, int i9) {
        T(i8 - 1, i9);
    }

    @Override // D2.InterfaceC0484a
    public final void I0() {
        if (!(((Boolean) D2.A.c().a(AbstractC3184kf.f23639B0)).booleanValue() && this.f14294v.f14101b.f13520b.f26838h) && ((Boolean) AbstractC3186kg.f24069d.e()).booleanValue()) {
            AbstractC2326ck0.r((Sj0) AbstractC2326ck0.e(Sj0.D(this.f14284A.a()), Throwable.class, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.wx
                @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, AbstractC1497Kq.f16650g), new C1146Ax(this), this.f14291s);
            return;
        }
        W60 w60 = this.f14297y;
        C2306ca0 c2306ca0 = this.f14296x;
        C60 c60 = this.f14294v;
        C3785q60 c3785q60 = this.f14295w;
        w60.c(c2306ca0.c(c60, c3785q60, c3785q60.f25782c), true == C2.v.s().a(this.f14290o) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void b() {
        W60 w60 = this.f14297y;
        C2306ca0 c2306ca0 = this.f14296x;
        C60 c60 = this.f14294v;
        C3785q60 c3785q60 = this.f14295w;
        w60.a(c2306ca0.c(c60, c3785q60, c3785q60.f25794i));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void c() {
        W60 w60 = this.f14297y;
        C2306ca0 c2306ca0 = this.f14296x;
        C60 c60 = this.f14294v;
        C3785q60 c3785q60 = this.f14295w;
        w60.a(c2306ca0.c(c60, c3785q60, c3785q60.f25790g));
    }

    final /* synthetic */ void l() {
        this.f14291s.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xx
            @Override // java.lang.Runnable
            public final void run() {
                this.f27943o.Q();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AC
    public final void m(D2.W0 w02) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23656D1)).booleanValue()) {
            this.f14297y.a(this.f14296x.c(this.f14294v, this.f14295w, C2306ca0.f(2, w02.f1162o, this.f14295w.f25806o)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void o(InterfaceC1460Jo interfaceC1460Jo, String str, String str2) {
        W60 w60 = this.f14297y;
        C2306ca0 c2306ca0 = this.f14296x;
        C3785q60 c3785q60 = this.f14295w;
        w60.a(c2306ca0.e(c3785q60, c3785q60.f25792h, interfaceC1460Jo));
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void r() {
        if (this.f14289F.compareAndSet(false, true)) {
            int intValue = ((Integer) D2.A.c().a(AbstractC3184kf.f23738N3)).intValue();
            if (intValue > 0) {
                T(intValue, ((Integer) D2.A.c().a(AbstractC3184kf.f23746O3)).intValue());
                return;
            }
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23730M3)).booleanValue()) {
                this.f14292t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.vx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27407o.l();
                    }
                });
            } else {
                Q();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final synchronized void s() {
        IB ib;
        try {
            if (this.f14288E) {
                ArrayList arrayList = new ArrayList(N());
                arrayList.addAll(this.f14295w.f25788f);
                this.f14297y.a(this.f14296x.d(this.f14294v, this.f14295w, true, null, null, arrayList));
            } else {
                W60 w60 = this.f14297y;
                C2306ca0 c2306ca0 = this.f14296x;
                C60 c60 = this.f14294v;
                C3785q60 c3785q60 = this.f14295w;
                w60.a(c2306ca0.c(c60, c3785q60, c3785q60.f25802m));
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23706J3)).booleanValue() && (ib = this.f14287D) != null) {
                    List h8 = C2306ca0.h(C2306ca0.g(ib.b().f25802m, ib.a().g()), this.f14287D.a().a());
                    W60 w602 = this.f14297y;
                    C2306ca0 c2306ca02 = this.f14296x;
                    IB ib2 = this.f14287D;
                    w602.a(c2306ca02.c(ib2.c(), ib2.b(), h8));
                }
                W60 w603 = this.f14297y;
                C2306ca0 c2306ca03 = this.f14296x;
                C60 c602 = this.f14294v;
                C3785q60 c3785q602 = this.f14295w;
                w603.a(c2306ca03.c(c602, c3785q602, c3785q602.f25788f));
            }
            this.f14288E = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2934iG
    public final void t() {
        W60 w60 = this.f14297y;
        C2306ca0 c2306ca0 = this.f14296x;
        C60 c60 = this.f14294v;
        C3785q60 c3785q60 = this.f14295w;
        w60.a(c2306ca0.c(c60, c3785q60, c3785q60.f25819u0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void zzb() {
    }
}
