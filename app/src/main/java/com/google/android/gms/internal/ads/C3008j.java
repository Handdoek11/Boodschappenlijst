package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3008j implements InterfaceC1847Ur {

    /* renamed from: o, reason: collision with root package name */
    private static final Executor f23142o = new Executor() { // from class: com.google.android.gms.internal.ads.DJ0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f23143a;

    /* renamed from: b, reason: collision with root package name */
    private final C2357d f23144b;

    /* renamed from: c, reason: collision with root package name */
    private final C3444n f23145c;

    /* renamed from: d, reason: collision with root package name */
    private final C4097t f23146d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4390vj f23147e;

    /* renamed from: f, reason: collision with root package name */
    private final List f23148f;

    /* renamed from: g, reason: collision with root package name */
    private final K f23149g;

    /* renamed from: h, reason: collision with root package name */
    private final RC f23150h;

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArraySet f23151i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC3117k f23152j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC2068aI f23153k;

    /* renamed from: l, reason: collision with root package name */
    private Pair f23154l;

    /* renamed from: m, reason: collision with root package name */
    private int f23155m;

    /* renamed from: n, reason: collision with root package name */
    private int f23156n;

    /* synthetic */ C3008j(FJ0 fj0, AbstractC2901i abstractC2901i) {
        Context context = fj0.f15126a;
        this.f23143a = context;
        C2357d c2357d = new C2357d(this, context);
        this.f23144b = c2357d;
        RC rc = fj0.f15131f;
        this.f23150h = rc;
        C3444n c3444n = fj0.f15127b;
        this.f23145c = c3444n;
        c3444n.k(rc);
        C4097t c4097t = new C4097t(new GJ0(this, null), c3444n);
        this.f23146d = c4097t;
        InterfaceC4390vj interfaceC4390vj = fj0.f15129d;
        AbstractC3796qC.b(interfaceC4390vj);
        this.f23147e = interfaceC4390vj;
        this.f23148f = fj0.f15130e;
        this.f23149g = new C3593oJ0(c3444n, c4097t);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f23151i = copyOnWriteArraySet;
        this.f23156n = 0;
        new C2723gJ0().H();
        copyOnWriteArraySet.add(c2357d);
    }

    static /* bridge */ /* synthetic */ InterfaceC4188tr c(C3008j c3008j, D d8) {
        AbstractC3796qC.f(c3008j.f23156n == 0);
        Pz0 v7 = v(d8.f14310C);
        if (v7.f18324c == 7 && AbstractC2301cW.f21206a < 34) {
            Py0 c8 = v7.c();
            c8.d(6);
            v7 = c8.g();
        }
        Pz0 pz0 = v7;
        RC rc = c3008j.f23150h;
        Looper myLooper = Looper.myLooper();
        AbstractC3796qC.b(myLooper);
        final InterfaceC2068aI b8 = rc.b(myLooper, null);
        c3008j.f23153k = b8;
        try {
            InterfaceC4390vj interfaceC4390vj = c3008j.f23147e;
            Context context = c3008j.f23143a;
            InterfaceC3903rB0 interfaceC3903rB0 = InterfaceC3903rB0.f26137a;
            Objects.requireNonNull(b8);
            interfaceC4390vj.a(context, pz0, interfaceC3903rB0, c3008j, new Executor() { // from class: com.google.android.gms.internal.ads.EJ0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    b8.j(runnable);
                }
            }, AbstractC4169th0.w(), 0L);
            Pair pair = c3008j.f23154l;
            if (pair == null) {
                throw null;
            }
            C4254uR c4254uR = (C4254uR) pair.second;
            c4254uR.b();
            c4254uR.a();
            throw null;
        } catch (zzbz e8) {
            throw new zzabg(e8, d8);
        }
    }

    static /* bridge */ /* synthetic */ void l(final C3008j c3008j, boolean z7) {
        if (c3008j.f23156n == 1) {
            c3008j.f23155m++;
            c3008j.f23149g.y(z7);
            InterfaceC2068aI interfaceC2068aI = c3008j.f23153k;
            AbstractC3796qC.b(interfaceC2068aI);
            interfaceC2068aI.j(new Runnable() { // from class: com.google.android.gms.internal.ads.CJ0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14154o.q();
                }
            });
        }
    }

    static /* bridge */ /* synthetic */ boolean t(C3008j c3008j, long j8) {
        return c3008j.f23155m == 0 && c3008j.f23146d.d(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Pz0 v(Pz0 pz0) {
        return (pz0 == null || !pz0.f()) ? Pz0.f18321h : pz0;
    }

    public final K h() {
        return this.f23144b;
    }

    public final void p() {
        C4254uR c4254uR = C4254uR.f27056c;
        c4254uR.b();
        c4254uR.a();
        this.f23154l = null;
    }

    final /* synthetic */ void q() {
        this.f23155m--;
    }

    public final void r() {
        if (this.f23156n == 2) {
            return;
        }
        InterfaceC2068aI interfaceC2068aI = this.f23153k;
        if (interfaceC2068aI != null) {
            interfaceC2068aI.b(null);
        }
        this.f23154l = null;
        this.f23156n = 2;
    }

    public final void s(Surface surface, C4254uR c4254uR) {
        Pair pair = this.f23154l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C4254uR) this.f23154l.second).equals(c4254uR)) {
            return;
        }
        this.f23154l = Pair.create(surface, c4254uR);
        c4254uR.b();
        c4254uR.a();
    }
}
