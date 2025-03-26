package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
final class Gz0 extends AbstractC1310Fi0 implements InterfaceC2247bz0 {

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ int f15525V = 0;

    /* renamed from: A, reason: collision with root package name */
    private FA0 f15526A;

    /* renamed from: B, reason: collision with root package name */
    private C2139az0 f15527B;

    /* renamed from: C, reason: collision with root package name */
    private C2211bh f15528C;

    /* renamed from: D, reason: collision with root package name */
    private M9 f15529D;

    /* renamed from: E, reason: collision with root package name */
    private Object f15530E;

    /* renamed from: F, reason: collision with root package name */
    private Surface f15531F;

    /* renamed from: G, reason: collision with root package name */
    private int f15532G;

    /* renamed from: H, reason: collision with root package name */
    private C4254uR f15533H;

    /* renamed from: I, reason: collision with root package name */
    private int f15534I;

    /* renamed from: J, reason: collision with root package name */
    private WR f15535J;

    /* renamed from: K, reason: collision with root package name */
    private float f15536K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f15537L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f15538M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f15539N;

    /* renamed from: O, reason: collision with root package name */
    private int f15540O;

    /* renamed from: P, reason: collision with root package name */
    private M9 f15541P;

    /* renamed from: Q, reason: collision with root package name */
    private C3901rA0 f15542Q;

    /* renamed from: R, reason: collision with root package name */
    private int f15543R;

    /* renamed from: S, reason: collision with root package name */
    private long f15544S;

    /* renamed from: T, reason: collision with root package name */
    private final C3443mz0 f15545T;

    /* renamed from: U, reason: collision with root package name */
    private CH0 f15546U;

    /* renamed from: b, reason: collision with root package name */
    final JI0 f15547b;

    /* renamed from: c, reason: collision with root package name */
    final C2211bh f15548c;

    /* renamed from: d, reason: collision with root package name */
    private final C4344vE f15549d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f15550e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2106aj f15551f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC4773zA0[] f15552g;

    /* renamed from: h, reason: collision with root package name */
    private final II0 f15553h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC2068aI f15554i;

    /* renamed from: j, reason: collision with root package name */
    private final Sz0 f15555j;

    /* renamed from: k, reason: collision with root package name */
    private final C2725gL f15556k;

    /* renamed from: l, reason: collision with root package name */
    private final CopyOnWriteArraySet f15557l;

    /* renamed from: m, reason: collision with root package name */
    private final C1945Xk f15558m;

    /* renamed from: n, reason: collision with root package name */
    private final List f15559n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f15560o;

    /* renamed from: p, reason: collision with root package name */
    private final JA0 f15561p;

    /* renamed from: q, reason: collision with root package name */
    private final Looper f15562q;

    /* renamed from: r, reason: collision with root package name */
    private final QI0 f15563r;

    /* renamed from: s, reason: collision with root package name */
    private final RC f15564s;

    /* renamed from: t, reason: collision with root package name */
    private final Bz0 f15565t;

    /* renamed from: u, reason: collision with root package name */
    private final Cz0 f15566u;

    /* renamed from: v, reason: collision with root package name */
    private final Fy0 f15567v;

    /* renamed from: w, reason: collision with root package name */
    private final long f15568w;

    /* renamed from: x, reason: collision with root package name */
    private int f15569x;

    /* renamed from: y, reason: collision with root package name */
    private int f15570y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f15571z;

    static {
        AbstractC2591f8.b("media3.exoplayer");
    }

    public Gz0(Zy0 zy0, InterfaceC2106aj interfaceC2106aj) {
        C2059aD0 c2059aD0;
        C4344vE c4344vE = new C4344vE(RC.f18620a);
        this.f15549d = c4344vE;
        try {
            HL.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + AbstractC2301cW.f21210e + "]");
            Context applicationContext = zy0.f20580a.getApplicationContext();
            this.f15550e = applicationContext;
            JA0 ja0 = (JA0) zy0.f20587h.apply(zy0.f20581b);
            this.f15561p = ja0;
            this.f15540O = zy0.f20589j;
            this.f15535J = zy0.f20590k;
            this.f15532G = zy0.f20591l;
            this.f15537L = false;
            this.f15568w = zy0.f20595p;
            Ez0 ez0 = null;
            Bz0 bz0 = new Bz0(this, ez0);
            this.f15565t = bz0;
            Cz0 cz0 = new Cz0(ez0);
            this.f15566u = cz0;
            Handler handler = new Handler(zy0.f20588i);
            InterfaceC4773zA0[] a8 = ((Sy0) zy0.f20582c).f18987o.a(handler, bz0, bz0, bz0, bz0);
            this.f15552g = a8;
            int length = a8.length;
            II0 ii0 = (II0) zy0.f20584e.zza();
            this.f15553h = ii0;
            Zy0.a(((Ty0) zy0.f20583d).f19203o);
            UI0 d8 = UI0.d(((Wy0) zy0.f20586g).f19926o);
            this.f15563r = d8;
            this.f15560o = zy0.f20592m;
            this.f15526A = zy0.f20593n;
            Looper looper = zy0.f20588i;
            this.f15562q = looper;
            RC rc = zy0.f20581b;
            this.f15564s = rc;
            this.f15551f = interfaceC2106aj;
            C2725gL c2725gL = new C2725gL(looper, rc, new InterfaceC2506eK(this) { // from class: com.google.android.gms.internal.ads.lz0
                @Override // com.google.android.gms.internal.ads.InterfaceC2506eK
                public final void a(Object obj, YH0 yh0) {
                }
            });
            this.f15556k = c2725gL;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f15557l = copyOnWriteArraySet;
            this.f15559n = new ArrayList();
            this.f15546U = new CH0(0);
            this.f15527B = C2139az0.f20796b;
            int length2 = a8.length;
            JI0 ji0 = new JI0(new DA0[2], new BI0[2], C1635Op.f17950b, null);
            this.f15547b = ji0;
            this.f15558m = new C1945Xk();
            C1125Ag c1125Ag = new C1125Ag();
            c1125Ag.c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            ii0.e();
            c1125Ag.d(29, true);
            c1125Ag.d(23, false);
            c1125Ag.d(25, false);
            c1125Ag.d(33, false);
            c1125Ag.d(26, false);
            c1125Ag.d(34, false);
            C2211bh e8 = c1125Ag.e();
            this.f15548c = e8;
            C1125Ag c1125Ag2 = new C1125Ag();
            c1125Ag2.b(e8);
            c1125Ag2.a(4);
            c1125Ag2.a(10);
            this.f15528C = c1125Ag2.e();
            this.f15554i = rc.b(looper, null);
            C3443mz0 c3443mz0 = new C3443mz0(this);
            this.f15545T = c3443mz0;
            this.f15542Q = C3901rA0.g(ji0);
            ja0.v(interfaceC2106aj, looper);
            if (AbstractC2301cW.f21206a < 31) {
                c2059aD0 = new C2059aD0(zy0.f20598s);
            } else {
                boolean z7 = zy0.f20596q;
                String str = zy0.f20598s;
                WC0 q8 = WC0.q(applicationContext);
                if (q8 == null) {
                    HL.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    c2059aD0 = new C2059aD0(LogSessionId.LOG_SESSION_ID_NONE, str);
                } else {
                    if (z7) {
                        n(q8);
                    }
                    c2059aD0 = new C2059aD0(q8.o(), str);
                }
            }
            this.f15555j = new Sz0(a8, ii0, ji0, (Vz0) zy0.f20585f.zza(), d8, 0, false, ja0, this.f15526A, zy0.f20599t, zy0.f20594o, false, false, looper, rc, c3443mz0, c2059aD0, null, this.f15527B);
            this.f15536K = 1.0f;
            M9 m9 = M9.f17264z;
            this.f15529D = m9;
            this.f15541P = m9;
            this.f15543R = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            this.f15534I = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i8 = AbstractC1470Jy.f16478a;
            this.f15538M = true;
            if (ja0 == null) {
                throw null;
            }
            c2725gL.b(ja0);
            d8.a(new Handler(looper), ja0);
            copyOnWriteArraySet.add(bz0);
            new Ay0(zy0.f20580a, handler, bz0);
            this.f15567v = new Fy0(zy0.f20580a, handler, bz0);
            zy0.f20580a.getApplicationContext();
            zy0.f20580a.getApplicationContext();
            new SB0(0).a();
            C4408vs c4408vs = C4408vs.f27376d;
            this.f15533H = C4254uR.f27056c;
            ii0.d(this.f15535J);
            Z(1, 10, Integer.valueOf(this.f15534I));
            Z(2, 10, Integer.valueOf(this.f15534I));
            Z(1, 3, this.f15535J);
            Z(2, 4, Integer.valueOf(this.f15532G));
            Z(2, 5, 0);
            Z(1, 9, Boolean.valueOf(this.f15537L));
            Z(2, 7, cz0);
            Z(6, 8, cz0);
            Z(-1, 16, Integer.valueOf(this.f15540O));
            c4344vE.e();
        } catch (Throwable th) {
            this.f15549d.e();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void H(Gz0 gz0, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        gz0.b0(surface);
        gz0.f15531F = surface;
    }

    private final int P(C3901rA0 c3901rA0) {
        return c3901rA0.f26111a.o() ? this.f15543R : c3901rA0.f26111a.n(c3901rA0.f26112b.f15340a, this.f15558m).f20118c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int R(int i8) {
        return i8 == -1 ? 2 : 1;
    }

    private final long S(C3901rA0 c3901rA0) {
        if (!c3901rA0.f26112b.b()) {
            return AbstractC2301cW.N(T(c3901rA0));
        }
        c3901rA0.f26111a.n(c3901rA0.f26112b.f15340a, this.f15558m);
        long j8 = c3901rA0.f26113c;
        if (j8 != -9223372036854775807L) {
            return AbstractC2301cW.N(j8) + AbstractC2301cW.N(0L);
        }
        long j9 = c3901rA0.f26111a.e(P(c3901rA0), this.f15189a, 0L).f28194k;
        return AbstractC2301cW.N(0L);
    }

    private final long T(C3901rA0 c3901rA0) {
        if (c3901rA0.f26111a.o()) {
            return AbstractC2301cW.K(this.f15544S);
        }
        long j8 = c3901rA0.f26129s;
        if (c3901rA0.f26112b.b()) {
            return j8;
        }
        V(c3901rA0.f26111a, c3901rA0.f26112b, j8);
        return j8;
    }

    private static long U(C3901rA0 c3901rA0) {
        C4721yl c4721yl = new C4721yl();
        C1945Xk c1945Xk = new C1945Xk();
        c3901rA0.f26111a.n(c3901rA0.f26112b.f15340a, c1945Xk);
        long j8 = c3901rA0.f26113c;
        if (j8 != -9223372036854775807L) {
            return j8;
        }
        long j9 = c3901rA0.f26111a.e(c1945Xk.f20118c, c4721yl, 0L).f28194k;
        return 0L;
    }

    private final long V(AbstractC1981Yl abstractC1981Yl, GG0 gg0, long j8) {
        abstractC1981Yl.n(gg0.f15340a, this.f15558m);
        return j8;
    }

    private final Pair W(AbstractC1981Yl abstractC1981Yl, int i8, long j8) {
        if (abstractC1981Yl.o()) {
            this.f15543R = i8;
            if (j8 == -9223372036854775807L) {
                j8 = 0;
            }
            this.f15544S = j8;
            return null;
        }
        if (i8 == -1 || i8 >= abstractC1981Yl.c()) {
            i8 = abstractC1981Yl.g(false);
            long j9 = abstractC1981Yl.e(i8, this.f15189a, 0L).f28194k;
            j8 = AbstractC2301cW.N(0L);
        }
        return abstractC1981Yl.l(this.f15189a, this.f15558m, i8, AbstractC2301cW.K(j8));
    }

    private final C3901rA0 X(C3901rA0 c3901rA0, AbstractC1981Yl abstractC1981Yl, Pair pair) {
        AbstractC3796qC.d(abstractC1981Yl.o() || pair != null);
        AbstractC1981Yl abstractC1981Yl2 = c3901rA0.f26111a;
        long S7 = S(c3901rA0);
        C3901rA0 f8 = c3901rA0.f(abstractC1981Yl);
        if (abstractC1981Yl.o()) {
            GG0 h8 = C3901rA0.h();
            long K7 = AbstractC2301cW.K(this.f15544S);
            C3901rA0 a8 = f8.b(h8, K7, K7, K7, 0L, JH0.f16220d, this.f15547b, AbstractC4169th0.w()).a(h8);
            a8.f26127q = a8.f26129s;
            return a8;
        }
        Object obj = f8.f26112b.f15340a;
        int i8 = AbstractC2301cW.f21206a;
        boolean equals = obj.equals(pair.first);
        GG0 gg0 = !equals ? new GG0(pair.first, -1L) : f8.f26112b;
        long longValue = ((Long) pair.second).longValue();
        long K8 = AbstractC2301cW.K(S7);
        if (!abstractC1981Yl2.o()) {
            abstractC1981Yl2.n(obj, this.f15558m);
        }
        if (!equals || longValue < K8) {
            AbstractC3796qC.f(!gg0.b());
            C3901rA0 a9 = f8.b(gg0, longValue, longValue, longValue, 0L, !equals ? JH0.f16220d : f8.f26118h, !equals ? this.f15547b : f8.f26119i, !equals ? AbstractC4169th0.w() : f8.f26120j).a(gg0);
            a9.f26127q = longValue;
            return a9;
        }
        if (longValue != K8) {
            AbstractC3796qC.f(!gg0.b());
            long max = Math.max(0L, f8.f26128r - (longValue - K8));
            long j8 = f8.f26127q;
            if (f8.f26121k.equals(f8.f26112b)) {
                j8 = longValue + max;
            }
            C3901rA0 b8 = f8.b(gg0, longValue, longValue, longValue, max, f8.f26118h, f8.f26119i, f8.f26120j);
            b8.f26127q = j8;
            return b8;
        }
        int a10 = abstractC1981Yl.a(f8.f26121k.f15340a);
        if (a10 != -1 && abstractC1981Yl.d(a10, this.f15558m, false).f20118c == abstractC1981Yl.n(gg0.f15340a, this.f15558m).f20118c) {
            return f8;
        }
        abstractC1981Yl.n(gg0.f15340a, this.f15558m);
        long f9 = gg0.b() ? this.f15558m.f(gg0.f15341b, gg0.f15342c) : this.f15558m.f20119d;
        C3901rA0 a11 = f8.b(gg0, f8.f26129s, f8.f26129s, f8.f26114d, f9 - f8.f26129s, f8.f26118h, f8.f26119i, f8.f26120j).a(gg0);
        a11.f26127q = f9;
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(final int i8, final int i9) {
        if (i8 == this.f15533H.b() && i9 == this.f15533H.a()) {
            return;
        }
        this.f15533H = new C4254uR(i8, i9);
        C2725gL c2725gL = this.f15556k;
        c2725gL.d(24, new DJ() { // from class: com.google.android.gms.internal.ads.iz0
            @Override // com.google.android.gms.internal.ads.DJ
            public final void a(Object obj) {
                int i10 = Gz0.f15525V;
                ((InterfaceC1127Ah) obj).Y(i8, i9);
            }
        });
        c2725gL.c();
        Z(2, 14, new C4254uR(i8, i9));
    }

    private final void Z(int i8, int i9, Object obj) {
        InterfaceC4773zA0[] interfaceC4773zA0Arr = this.f15552g;
        int length = interfaceC4773zA0Arr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC4773zA0 interfaceC4773zA0 = interfaceC4773zA0Arr[i10];
            if (i8 == -1 || interfaceC4773zA0.zzb() == i8) {
                int P7 = P(this.f15542Q);
                Sz0 sz0 = this.f15555j;
                C4337vA0 c4337vA0 = new C4337vA0(sz0, interfaceC4773zA0, this.f15542Q.f26111a, P7 == -1 ? 0 : P7, this.f15564s, sz0.X());
                c4337vA0.f(i9);
                c4337vA0.e(obj);
                c4337vA0.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        Z(1, 2, Float.valueOf(this.f15536K * this.f15567v.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(Object obj) {
        Object obj2 = this.f15530E;
        boolean z7 = false;
        if (obj2 != null && obj2 != obj) {
            z7 = true;
        }
        boolean g02 = this.f15555j.g0(obj, z7 ? this.f15568w : -9223372036854775807L);
        if (z7) {
            Object obj3 = this.f15530E;
            Surface surface = this.f15531F;
            if (obj3 == surface) {
                surface.release();
                this.f15531F = null;
            }
        }
        this.f15530E = obj;
        if (g02) {
            return;
        }
        c0(zzib.d(new zzkd(3), 1003));
    }

    private final void c0(zzib zzibVar) {
        C3901rA0 c3901rA0 = this.f15542Q;
        C3901rA0 a8 = c3901rA0.a(c3901rA0.f26112b);
        a8.f26127q = a8.f26129s;
        a8.f26128r = 0L;
        C3901rA0 e8 = a8.e(1);
        if (zzibVar != null) {
            e8 = e8.d(zzibVar);
        }
        this.f15569x++;
        this.f15555j.e0();
        e0(e8, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(boolean z7, int i8, int i9) {
        boolean z8 = z7 && i8 != -1;
        int i10 = i8 == 0 ? 1 : 0;
        C3901rA0 c3901rA0 = this.f15542Q;
        if (c3901rA0.f26122l == z8 && c3901rA0.f26124n == i10 && c3901rA0.f26123m == i9) {
            return;
        }
        this.f15569x++;
        C3901rA0 c8 = c3901rA0.c(z8, i9, i10);
        this.f15555j.d0(z8, i9, i10);
        e0(c8, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029a  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e0(final com.google.android.gms.internal.ads.C3901rA0 r43, final int r44, boolean r45, int r46, long r47, int r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Gz0.e0(com.google.android.gms.internal.ads.rA0, int, boolean, int, long, int, boolean):void");
    }

    private final void f0() {
        int c8 = c();
        if (c8 == 2 || c8 == 3) {
            g0();
            boolean z7 = this.f15542Q.f26126p;
            x();
            x();
        }
    }

    private final void g0() {
        this.f15549d.b();
        if (Thread.currentThread() != this.f15562q.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f15562q.getThread().getName());
            if (this.f15538M) {
                throw new IllegalStateException(format);
            }
            HL.g("ExoPlayerImpl", format, this.f15539N ? null : new IllegalStateException());
            this.f15539N = true;
        }
    }

    public final zzib A() {
        g0();
        return this.f15542Q.f26116f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2247bz0
    public final int B() {
        g0();
        int length = this.f15552g.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2247bz0
    public final void I() {
        HL.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + AbstractC2301cW.f21210e + "] [" + AbstractC2591f8.a() + "]");
        g0();
        this.f15567v.d();
        if (!this.f15555j.f0()) {
            C2725gL c2725gL = this.f15556k;
            c2725gL.d(10, new DJ() { // from class: com.google.android.gms.internal.ads.jz0
                @Override // com.google.android.gms.internal.ads.DJ
                public final void a(Object obj) {
                    ((InterfaceC1127Ah) obj).a0(zzib.d(new zzkd(1), 1003));
                }
            });
            c2725gL.c();
        }
        this.f15556k.e();
        this.f15554i.b(null);
        this.f15563r.c(this.f15561p);
        C3901rA0 c3901rA0 = this.f15542Q;
        boolean z7 = c3901rA0.f26126p;
        C3901rA0 e8 = c3901rA0.e(1);
        this.f15542Q = e8;
        C3901rA0 a8 = e8.a(e8.f26112b);
        this.f15542Q = a8;
        a8.f26127q = a8.f26129s;
        this.f15542Q.f26128r = 0L;
        this.f15561p.y();
        this.f15553h.c();
        Surface surface = this.f15531F;
        if (surface != null) {
            surface.release();
            this.f15531F = null;
        }
        int i8 = AbstractC1470Jy.f16478a;
    }

    final /* synthetic */ void L(final Oz0 oz0) {
        this.f15554i.j(new Runnable() { // from class: com.google.android.gms.internal.ads.nz0
            @Override // java.lang.Runnable
            public final void run() {
                this.f25062o.M(oz0);
            }
        });
    }

    final /* synthetic */ void M(Oz0 oz0) {
        long j8;
        int i8 = this.f15569x - oz0.f18096c;
        this.f15569x = i8;
        boolean z7 = true;
        if (oz0.f18097d) {
            this.f15570y = oz0.f18098e;
            this.f15571z = true;
        }
        if (i8 == 0) {
            AbstractC1981Yl abstractC1981Yl = oz0.f18095b.f26111a;
            if (!this.f15542Q.f26111a.o() && abstractC1981Yl.o()) {
                this.f15543R = -1;
                this.f15544S = 0L;
            }
            if (!abstractC1981Yl.o()) {
                List y7 = ((C4555xA0) abstractC1981Yl).y();
                AbstractC3796qC.f(y7.size() == this.f15559n.size());
                for (int i9 = 0; i9 < y7.size(); i9++) {
                    ((Dz0) this.f15559n.get(i9)).a((AbstractC1981Yl) y7.get(i9));
                }
            }
            long j9 = -9223372036854775807L;
            if (this.f15571z) {
                if (oz0.f18095b.f26112b.equals(this.f15542Q.f26112b) && oz0.f18095b.f26114d == this.f15542Q.f26129s) {
                    z7 = false;
                }
                if (z7) {
                    if (abstractC1981Yl.o() || oz0.f18095b.f26112b.b()) {
                        j8 = oz0.f18095b.f26114d;
                    } else {
                        C3901rA0 c3901rA0 = oz0.f18095b;
                        GG0 gg0 = c3901rA0.f26112b;
                        j8 = c3901rA0.f26114d;
                        V(abstractC1981Yl, gg0, j8);
                    }
                    j9 = j8;
                }
            } else {
                z7 = false;
            }
            this.f15571z = false;
            e0(oz0.f18095b, 1, z7, this.f15570y, j9, -1, false);
        }
    }

    final /* synthetic */ void N(InterfaceC1127Ah interfaceC1127Ah) {
        interfaceC1127Ah.S(this.f15528C);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final void Q(float f8) {
        g0();
        final float max = Math.max(0.0f, Math.min(f8, 1.0f));
        if (this.f15536K == max) {
            return;
        }
        this.f15536K = max;
        a0();
        C2725gL c2725gL = this.f15556k;
        c2725gL.d(22, new DJ() { // from class: com.google.android.gms.internal.ads.hz0
            @Override // com.google.android.gms.internal.ads.DJ
            public final void a(Object obj) {
                int i8 = Gz0.f15525V;
                ((InterfaceC1127Ah) obj).Q(max);
            }
        });
        c2725gL.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final int a() {
        g0();
        if (w()) {
            return this.f15542Q.f26112b.f15342c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final int b() {
        g0();
        if (this.f15542Q.f26111a.o()) {
            return 0;
        }
        C3901rA0 c3901rA0 = this.f15542Q;
        return c3901rA0.f26111a.a(c3901rA0.f26112b.f15340a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final int c() {
        g0();
        return this.f15542Q.f26115e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final int d() {
        g0();
        int P7 = P(this.f15542Q);
        if (P7 == -1) {
            return 0;
        }
        return P7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final int e() {
        g0();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final long f() {
        g0();
        if (w()) {
            C3901rA0 c3901rA0 = this.f15542Q;
            return c3901rA0.f26121k.equals(c3901rA0.f26112b) ? AbstractC2301cW.N(this.f15542Q.f26127q) : j();
        }
        g0();
        if (this.f15542Q.f26111a.o()) {
            return this.f15544S;
        }
        C3901rA0 c3901rA02 = this.f15542Q;
        long j8 = 0;
        if (c3901rA02.f26121k.f15343d != c3901rA02.f26112b.f15343d) {
            return AbstractC2301cW.N(c3901rA02.f26111a.e(d(), this.f15189a, 0L).f28195l);
        }
        long j9 = c3901rA02.f26127q;
        if (this.f15542Q.f26121k.b()) {
            C3901rA0 c3901rA03 = this.f15542Q;
            c3901rA03.f26111a.n(c3901rA03.f26121k.f15340a, this.f15558m).g(this.f15542Q.f26121k.f15341b);
        } else {
            j8 = j9;
        }
        C3901rA0 c3901rA04 = this.f15542Q;
        V(c3901rA04.f26111a, c3901rA04.f26121k, j8);
        return AbstractC2301cW.N(j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final int g() {
        g0();
        return this.f15542Q.f26124n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final long h() {
        g0();
        return S(this.f15542Q);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final long i() {
        g0();
        return AbstractC2301cW.N(T(this.f15542Q));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final long j() {
        g0();
        if (w()) {
            C3901rA0 c3901rA0 = this.f15542Q;
            GG0 gg0 = c3901rA0.f26112b;
            c3901rA0.f26111a.n(gg0.f15340a, this.f15558m);
            return AbstractC2301cW.N(this.f15558m.f(gg0.f15341b, gg0.f15342c));
        }
        AbstractC1981Yl l8 = l();
        if (l8.o()) {
            return -9223372036854775807L;
        }
        return AbstractC2301cW.N(l8.e(d(), this.f15189a, 0L).f28195l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final long k() {
        g0();
        return AbstractC2301cW.N(this.f15542Q.f26128r);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final AbstractC1981Yl l() {
        g0();
        return this.f15542Q.f26111a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final void m(Surface surface) {
        g0();
        b0(surface);
        int i8 = surface == null ? 0 : -1;
        Y(i8, i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2247bz0
    public final void n(MA0 ma0) {
        this.f15561p.s(ma0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final C1635Op o() {
        g0();
        return this.f15542Q.f26119i.f16227d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final void p() {
        g0();
        Fy0 fy0 = this.f15567v;
        boolean x7 = x();
        fy0.b(x7, 2);
        d0(x7, 1, R(1));
        C3901rA0 c3901rA0 = this.f15542Q;
        if (c3901rA0.f26115e != 1) {
            return;
        }
        C3901rA0 d8 = c3901rA0.d(null);
        C3901rA0 e8 = d8.e(true == d8.f26111a.o() ? 4 : 2);
        this.f15569x++;
        this.f15555j.b0();
        e0(e8, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2247bz0
    public final void q(MA0 ma0) {
        g0();
        this.f15561p.r(ma0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final void r(boolean z7) {
        g0();
        this.f15567v.b(z7, c());
        d0(z7, 1, R(1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2247bz0
    public final void s(IG0 ig0) {
        g0();
        List singletonList = Collections.singletonList(ig0);
        g0();
        g0();
        P(this.f15542Q);
        i();
        this.f15569x++;
        boolean z7 = false;
        if (!this.f15559n.isEmpty()) {
            int size = this.f15559n.size();
            for (int i8 = size - 1; i8 >= 0; i8--) {
                this.f15559n.remove(i8);
            }
            this.f15546U = this.f15546U.h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < singletonList.size(); i9++) {
            C3466nA0 c3466nA0 = new C3466nA0((IG0) singletonList.get(i9), this.f15560o);
            arrayList.add(c3466nA0);
            this.f15559n.add(i9, new Dz0(c3466nA0.f24895b, c3466nA0.f24894a));
        }
        this.f15546U = this.f15546U.g(0, arrayList.size());
        C4555xA0 c4555xA0 = new C4555xA0(this.f15559n, this.f15546U);
        if (!c4555xA0.o() && c4555xA0.c() < 0) {
            throw new zzac(c4555xA0, -1, -9223372036854775807L);
        }
        int g8 = c4555xA0.g(false);
        C3901rA0 X7 = X(this.f15542Q, c4555xA0, W(c4555xA0, g8, -9223372036854775807L));
        int i10 = X7.f26115e;
        if (g8 != -1 && i10 != 1) {
            i10 = 4;
            if (!c4555xA0.o() && g8 < c4555xA0.c()) {
                i10 = 2;
            }
        }
        C3901rA0 e8 = X7.e(i10);
        this.f15555j.h0(arrayList, g8, AbstractC2301cW.K(-9223372036854775807L), this.f15546U);
        if (!this.f15542Q.f26112b.f15340a.equals(e8.f26112b.f15340a) && !this.f15542Q.f26111a.o()) {
            z7 = true;
        }
        e0(e8, 0, z7, 4, T(e8), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final void t() {
        g0();
        this.f15567v.b(x(), 1);
        c0(null);
        int i8 = AbstractC1470Jy.f16478a;
        AbstractC4169th0 w7 = AbstractC4169th0.w();
        long j8 = this.f15542Q.f26129s;
        AbstractC4169th0.t(w7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final boolean u() {
        g0();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1310Fi0
    public final void v(int i8, long j8, int i9, boolean z7) {
        g0();
        if (i8 == -1) {
            return;
        }
        AbstractC3796qC.d(i8 >= 0);
        AbstractC1981Yl abstractC1981Yl = this.f15542Q.f26111a;
        if (abstractC1981Yl.o() || i8 < abstractC1981Yl.c()) {
            this.f15561p.x();
            this.f15569x++;
            if (w()) {
                HL.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                Oz0 oz0 = new Oz0(this.f15542Q);
                oz0.a(1);
                this.f15545T.f24839a.L(oz0);
                return;
            }
            C3901rA0 c3901rA0 = this.f15542Q;
            int i10 = c3901rA0.f26115e;
            if (i10 == 3 || (i10 == 4 && !abstractC1981Yl.o())) {
                c3901rA0 = this.f15542Q.e(2);
            }
            int d8 = d();
            C3901rA0 X7 = X(c3901rA0, abstractC1981Yl, W(abstractC1981Yl, i8, j8));
            this.f15555j.c0(abstractC1981Yl, i8, AbstractC2301cW.K(j8));
            e0(X7, 0, true, 1, T(X7), d8, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final boolean w() {
        g0();
        return this.f15542Q.f26112b.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final boolean x() {
        g0();
        return this.f15542Q.f26122l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2106aj
    public final int zzb() {
        g0();
        if (w()) {
            return this.f15542Q.f26112b.f15341b;
        }
        return -1;
    }
}
