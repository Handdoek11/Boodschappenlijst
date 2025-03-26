package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.adadapted.android.sdk.constants.Config;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.zE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4781zE0 implements MD0 {

    /* renamed from: b0, reason: collision with root package name */
    private static final Object f28513b0 = new Object();

    /* renamed from: c0, reason: collision with root package name */
    private static ScheduledExecutorService f28514c0;

    /* renamed from: d0, reason: collision with root package name */
    private static int f28515d0;

    /* renamed from: A, reason: collision with root package name */
    private long f28516A;

    /* renamed from: B, reason: collision with root package name */
    private long f28517B;

    /* renamed from: C, reason: collision with root package name */
    private long f28518C;

    /* renamed from: D, reason: collision with root package name */
    private int f28519D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f28520E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f28521F;

    /* renamed from: G, reason: collision with root package name */
    private long f28522G;

    /* renamed from: H, reason: collision with root package name */
    private float f28523H;

    /* renamed from: I, reason: collision with root package name */
    private ByteBuffer f28524I;

    /* renamed from: J, reason: collision with root package name */
    private int f28525J;

    /* renamed from: K, reason: collision with root package name */
    private ByteBuffer f28526K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f28527L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f28528M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f28529N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f28530O;

    /* renamed from: P, reason: collision with root package name */
    private int f28531P;

    /* renamed from: Q, reason: collision with root package name */
    private C4763z50 f28532Q;

    /* renamed from: R, reason: collision with root package name */
    private C3907rD0 f28533R;

    /* renamed from: S, reason: collision with root package name */
    private long f28534S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f28535T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f28536U;

    /* renamed from: V, reason: collision with root package name */
    private Looper f28537V;

    /* renamed from: W, reason: collision with root package name */
    private long f28538W;

    /* renamed from: X, reason: collision with root package name */
    private long f28539X;

    /* renamed from: Y, reason: collision with root package name */
    private Handler f28540Y;

    /* renamed from: Z, reason: collision with root package name */
    private final C2604fE0 f28541Z;

    /* renamed from: a, reason: collision with root package name */
    private final Context f28542a;

    /* renamed from: a0, reason: collision with root package name */
    private final UD0 f28543a0;

    /* renamed from: b, reason: collision with root package name */
    private final RD0 f28544b;

    /* renamed from: c, reason: collision with root package name */
    private final JE0 f28545c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC4169th0 f28546d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC4169th0 f28547e;

    /* renamed from: f, reason: collision with root package name */
    private final QD0 f28548f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f28549g;

    /* renamed from: h, reason: collision with root package name */
    private C4127tE0 f28550h;

    /* renamed from: i, reason: collision with root package name */
    private final C3474nE0 f28551i;

    /* renamed from: j, reason: collision with root package name */
    private final C3474nE0 f28552j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC2170bE0 f28553k;

    /* renamed from: l, reason: collision with root package name */
    private C2059aD0 f28554l;

    /* renamed from: m, reason: collision with root package name */
    private LD0 f28555m;

    /* renamed from: n, reason: collision with root package name */
    private C2495eE0 f28556n;

    /* renamed from: o, reason: collision with root package name */
    private C2495eE0 f28557o;

    /* renamed from: p, reason: collision with root package name */
    private C1918Ws f28558p;

    /* renamed from: q, reason: collision with root package name */
    private AudioTrack f28559q;

    /* renamed from: r, reason: collision with root package name */
    private C3254lD0 f28560r;

    /* renamed from: s, reason: collision with root package name */
    private C3799qD0 f28561s;

    /* renamed from: t, reason: collision with root package name */
    private C3365mE0 f28562t;

    /* renamed from: u, reason: collision with root package name */
    private WR f28563u;

    /* renamed from: v, reason: collision with root package name */
    private C2713gE0 f28564v;

    /* renamed from: w, reason: collision with root package name */
    private C2713gE0 f28565w;

    /* renamed from: x, reason: collision with root package name */
    private C2006Zf f28566x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f28567y;

    /* renamed from: z, reason: collision with root package name */
    private long f28568z;

    /* synthetic */ C4781zE0(C2387dE0 c2387dE0, AbstractC4236uE0 abstractC4236uE0) {
        C3254lD0 c3254lD0;
        Context context = c2387dE0.f21480a;
        this.f28542a = context;
        WR wr = WR.f19788b;
        this.f28563u = wr;
        AbstractC4236uE0 abstractC4236uE02 = null;
        if (context != null) {
            C3254lD0 c3254lD02 = C3254lD0.f24287c;
            int i8 = AbstractC2301cW.f21206a;
            c3254lD0 = C3254lD0.c(context, wr, null);
        } else {
            c3254lD0 = c2387dE0.f21481b;
        }
        this.f28560r = c3254lD0;
        this.f28541Z = c2387dE0.f21485f;
        int i9 = AbstractC2301cW.f21206a;
        UD0 ud0 = c2387dE0.f21486g;
        ud0.getClass();
        this.f28543a0 = ud0;
        this.f28548f = new QD0(new C3583oE0(this, abstractC4236uE02));
        RD0 rd0 = new RD0();
        this.f28544b = rd0;
        JE0 je0 = new JE0();
        this.f28545c = je0;
        this.f28546d = AbstractC4169th0.C(new C1289Ew(), rd0, je0);
        this.f28547e = AbstractC4169th0.x(new IE0());
        this.f28523H = 1.0f;
        this.f28531P = 0;
        this.f28532Q = new C4763z50(0, 0.0f);
        C2006Zf c2006Zf = C2006Zf.f20520d;
        this.f28565w = new C2713gE0(c2006Zf, 0L, 0L, null);
        this.f28566x = c2006Zf;
        this.f28567y = false;
        this.f28549g = new ArrayDeque();
        this.f28551i = new C3474nE0();
        this.f28552j = new C3474nE0();
        this.f28553k = c2387dE0.f21484e;
    }

    public static /* synthetic */ void C(C4781zE0 c4781zE0) {
        if (c4781zE0.f28539X >= Config.DEFAULT_AD_POLLING) {
            ((DE0) c4781zE0.f28555m).f14439a.f15114L0 = true;
            c4781zE0.f28539X = 0L;
        }
    }

    static /* synthetic */ void E(AudioTrack audioTrack, final LD0 ld0, Handler handler, final KD0 kd0) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (ld0 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.XD0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((DE0) ld0).f14439a.f15103A0.d(kd0);
                    }
                });
            }
            synchronized (f28513b0) {
                try {
                    int i8 = f28515d0 - 1;
                    f28515d0 = i8;
                    if (i8 == 0) {
                        f28514c0.shutdown();
                        f28514c0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (ld0 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.XD0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((DE0) ld0).f14439a.f15103A0.d(kd0);
                    }
                });
            }
            synchronized (f28513b0) {
                try {
                    int i9 = f28515d0 - 1;
                    f28515d0 = i9;
                    if (i9 == 0) {
                        f28514c0.shutdown();
                        f28514c0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean G() {
        boolean z7;
        synchronized (f28513b0) {
            z7 = f28515d0 > 0;
        }
        return z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long H() {
        return this.f28557o.f21748c == 0 ? this.f28568z / r0.f21747b : this.f28516A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long J() {
        C2495eE0 c2495eE0 = this.f28557o;
        if (c2495eE0.f21748c != 0) {
            return this.f28518C;
        }
        long j8 = this.f28517B;
        long j9 = c2495eE0.f21749d;
        int i8 = AbstractC2301cW.f21206a;
        return ((j8 + j9) - 1) / j9;
    }

    private final AudioTrack K(C2495eE0 c2495eE0) {
        try {
            return c0(c2495eE0.a(), this.f28563u, this.f28531P, c2495eE0.f21746a);
        } catch (zzpi e8) {
            LD0 ld0 = this.f28555m;
            if (ld0 != null) {
                ld0.a(e8);
            }
            throw e8;
        }
    }

    private final void L(long j8) {
        C2006Zf c2006Zf;
        boolean z7;
        if (b0()) {
            C2604fE0 c2604fE0 = this.f28541Z;
            c2006Zf = this.f28566x;
            c2604fE0.c(c2006Zf);
        } else {
            c2006Zf = C2006Zf.f20520d;
        }
        C2006Zf c2006Zf2 = c2006Zf;
        this.f28566x = c2006Zf2;
        if (b0()) {
            C2604fE0 c2604fE02 = this.f28541Z;
            z7 = this.f28567y;
            c2604fE02.d(z7);
        } else {
            z7 = false;
        }
        this.f28567y = z7;
        this.f28549g.add(new C2713gE0(c2006Zf2, Math.max(0L, j8), AbstractC2301cW.L(J(), this.f28557o.f21750e), null));
        X();
        LD0 ld0 = this.f28555m;
        if (ld0 != null) {
            ((DE0) ld0).f14439a.f15103A0.w(this.f28567y);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void M(long r8) {
        /*
            r7 = this;
            java.nio.ByteBuffer r8 = r7.f28526K
            if (r8 != 0) goto L6
            goto Lb5
        L6:
            com.google.android.gms.internal.ads.nE0 r8 = r7.f28552j
            boolean r8 = r8.c()
            if (r8 != 0) goto Lb5
            java.nio.ByteBuffer r8 = r7.f28526K
            int r8 = r8.remaining()
            android.media.AudioTrack r9 = r7.f28559q
            java.nio.ByteBuffer r0 = r7.f28526K
            r1 = 1
            int r9 = r9.write(r0, r8, r1)
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.f28534S = r2
            r2 = 0
            r0 = 0
            if (r9 >= 0) goto L6a
            int r8 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            r4 = 24
            if (r8 < r4) goto L31
            r8 = -6
            if (r9 == r8) goto L35
        L31:
            r8 = -32
            if (r9 != r8) goto L4a
        L35:
            long r4 = r7.J()
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L3e
            goto L4b
        L3e:
            android.media.AudioTrack r8 = r7.f28559q
            boolean r8 = a0(r8)
            if (r8 == 0) goto L4a
            r7.N()
            goto L4b
        L4a:
            r1 = r0
        L4b:
            com.google.android.gms.internal.ads.zzpl r8 = new com.google.android.gms.internal.ads.zzpl
            com.google.android.gms.internal.ads.eE0 r0 = r7.f28557o
            com.google.android.gms.internal.ads.D r0 = r0.f21746a
            r8.<init>(r9, r0, r1)
            com.google.android.gms.internal.ads.LD0 r9 = r7.f28555m
            if (r9 == 0) goto L5b
            r9.a(r8)
        L5b:
            boolean r9 = r8.f28778s
            if (r9 != 0) goto L65
            com.google.android.gms.internal.ads.nE0 r9 = r7.f28552j
            r9.b(r8)
            return
        L65:
            com.google.android.gms.internal.ads.lD0 r9 = com.google.android.gms.internal.ads.C3254lD0.f24287c
            r7.f28560r = r9
            throw r8
        L6a:
            com.google.android.gms.internal.ads.nE0 r4 = r7.f28552j
            r4.a()
            android.media.AudioTrack r4 = r7.f28559q
            boolean r4 = a0(r4)
            if (r4 == 0) goto L8b
            long r4 = r7.f28518C
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L7f
            r7.f28536U = r0
        L7f:
            boolean r2 = r7.f28530O
            if (r2 == 0) goto L8b
            com.google.android.gms.internal.ads.LD0 r2 = r7.f28555m
            if (r2 == 0) goto L8b
            if (r9 >= r8) goto L8b
            com.google.android.gms.internal.ads.DE0 r2 = (com.google.android.gms.internal.ads.DE0) r2
        L8b:
            com.google.android.gms.internal.ads.eE0 r2 = r7.f28557o
            int r2 = r2.f21748c
            if (r2 != 0) goto L97
            long r3 = r7.f28517B
            long r5 = (long) r9
            long r3 = r3 + r5
            r7.f28517B = r3
        L97:
            if (r9 != r8) goto Lb5
            if (r2 == 0) goto Lb2
            java.nio.ByteBuffer r8 = r7.f28526K
            java.nio.ByteBuffer r9 = r7.f28524I
            if (r8 != r9) goto La2
            goto La3
        La2:
            r1 = r0
        La3:
            com.google.android.gms.internal.ads.AbstractC3796qC.f(r1)
            long r8 = r7.f28518C
            int r0 = r7.f28519D
            long r0 = (long) r0
            int r2 = r7.f28525J
            long r2 = (long) r2
            long r0 = r0 * r2
            long r8 = r8 + r0
            r7.f28518C = r8
        Lb2:
            r8 = 0
            r7.f28526K = r8
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4781zE0.M(long):void");
    }

    private final void N() {
        if (this.f28557o.f21748c == 1) {
            this.f28535T = true;
        }
    }

    private final void P() {
        if (this.f28561s != null || this.f28542a == null) {
            return;
        }
        this.f28537V = Looper.myLooper();
        C3799qD0 c3799qD0 = new C3799qD0(this.f28542a, new YD0(this), this.f28563u, this.f28533R);
        this.f28561s = c3799qD0;
        this.f28560r = c3799qD0.c();
    }

    private final void Q() {
        if (this.f28528M) {
            return;
        }
        this.f28528M = true;
        this.f28548f.b(J());
        if (a0(this.f28559q)) {
            this.f28529N = false;
        }
        this.f28559q.stop();
    }

    private final void R(long j8) {
        M(j8);
        if (this.f28526K != null) {
            return;
        }
        if (!this.f28558p.h()) {
            ByteBuffer byteBuffer = this.f28524I;
            if (byteBuffer != null) {
                U(byteBuffer);
                M(j8);
                return;
            }
            return;
        }
        while (!this.f28558p.g()) {
            do {
                ByteBuffer b8 = this.f28558p.b();
                if (b8.hasRemaining()) {
                    U(b8);
                    M(j8);
                } else {
                    ByteBuffer byteBuffer2 = this.f28524I;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f28558p.e(this.f28524I);
                    }
                }
            } while (this.f28526K == null);
            return;
        }
    }

    private final void T(C2006Zf c2006Zf) {
        C2713gE0 c2713gE0 = new C2713gE0(c2006Zf, -9223372036854775807L, -9223372036854775807L, null);
        if (Z()) {
            this.f28564v = c2713gE0;
        } else {
            this.f28565w = c2713gE0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void U(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4781zE0.U(java.nio.ByteBuffer):void");
    }

    private final void W() {
        if (Z()) {
            this.f28559q.setVolume(this.f28523H);
        }
    }

    private final void X() {
        C1918Ws c1918Ws = this.f28557o.f21754i;
        this.f28558p = c1918Ws;
        c1918Ws.c();
    }

    private final boolean Y() {
        if (!this.f28558p.h()) {
            M(Long.MIN_VALUE);
            return this.f28526K == null;
        }
        this.f28558p.d();
        R(Long.MIN_VALUE);
        if (!this.f28558p.g()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f28526K;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private final boolean Z() {
        return this.f28559q != null;
    }

    private static boolean a0(AudioTrack audioTrack) {
        return AbstractC2301cW.f21206a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean b0() {
        C2495eE0 c2495eE0 = this.f28557o;
        if (c2495eE0.f21748c != 0) {
            return false;
        }
        int i8 = c2495eE0.f21746a.f14313F;
        return true;
    }

    private static final AudioTrack c0(KD0 kd0, WR wr, int i8, D d8) {
        AudioTrack audioTrack;
        try {
            int i9 = AbstractC2301cW.f21206a;
            if (i9 >= 23) {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(wr.a().f18545a).setAudioFormat(AbstractC2301cW.P(kd0.f16555b, kd0.f16556c, kd0.f16554a)).setTransferMode(1).setBufferSizeInBytes(kd0.f16558e).setSessionId(i8);
                if (i9 >= 29) {
                    sessionId.setOffloadedPlayback(kd0.f16557d);
                }
                audioTrack = sessionId.build();
            } else {
                AudioAttributes audioAttributes = wr.a().f18545a;
                int i10 = kd0.f16555b;
                int i11 = kd0.f16556c;
                int i12 = kd0.f16554a;
                audioTrack = new AudioTrack(audioAttributes, AbstractC2301cW.P(i10, i11, i12), kd0.f16558e, 1, i8);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzpi(state, kd0.f16555b, kd0.f16556c, kd0.f16554a, d8, kd0.f16557d, null);
        } catch (IllegalArgumentException e8) {
            e = e8;
            throw new zzpi(0, kd0.f16555b, kd0.f16556c, kd0.f16554a, d8, kd0.f16557d, e);
        } catch (UnsupportedOperationException e9) {
            e = e9;
            throw new zzpi(0, kd0.f16555b, kd0.f16556c, kd0.f16554a, d8, kd0.f16557d, e);
        }
    }

    public final void F(C3254lD0 c3254lD0) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f28537V;
        if (looper == myLooper) {
            if (c3254lD0.equals(this.f28560r)) {
                return;
            }
            this.f28560r = c3254lD0;
            LD0 ld0 = this.f28555m;
            if (ld0 != null) {
                ((DE0) ld0).f14439a.C();
                return;
            }
            return;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        throw new IllegalStateException("Current looper (" + (myLooper != null ? myLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final boolean I() {
        if (Z()) {
            return this.f28527L && !V();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final long O(boolean z7) {
        long I7;
        if (!Z() || this.f28521F) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f28548f.a(z7), AbstractC2301cW.L(J(), this.f28557o.f21750e));
        while (!this.f28549g.isEmpty() && min >= ((C2713gE0) this.f28549g.getFirst()).f22267c) {
            this.f28565w = (C2713gE0) this.f28549g.remove();
        }
        long j8 = min - this.f28565w.f22267c;
        if (this.f28549g.isEmpty()) {
            I7 = this.f28565w.f22266b + this.f28541Z.a(j8);
        } else {
            C2713gE0 c2713gE0 = (C2713gE0) this.f28549g.getFirst();
            I7 = c2713gE0.f22266b - AbstractC2301cW.I(c2713gE0.f22267c - min, this.f28565w.f22265a.f20521a);
        }
        long b8 = this.f28541Z.b();
        long L7 = I7 + AbstractC2301cW.L(b8, this.f28557o.f21750e);
        long j9 = this.f28538W;
        if (b8 > j9) {
            long L8 = AbstractC2301cW.L(b8 - j9, this.f28557o.f21750e);
            this.f28538W = b8;
            this.f28539X += L8;
            if (this.f28540Y == null) {
                this.f28540Y = new Handler(Looper.myLooper());
            }
            this.f28540Y.removeCallbacksAndMessages(null);
            this.f28540Y.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.WD0
                @Override // java.lang.Runnable
                public final void run() {
                    C4781zE0.C(this.f19760o);
                }
            }, 100L);
        }
        return L7;
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void S(boolean z7) {
        this.f28567y = z7;
        T(this.f28566x);
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final boolean V() {
        if (Z()) {
            return !(AbstractC2301cW.f21206a >= 29 && this.f28559q.isOffloadedPlayback() && this.f28529N) && this.f28548f.g(J());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final C2006Zf a() {
        return this.f28566x;
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final int b(D d8) {
        P();
        if (!"audio/raw".equals(d8.f14334o)) {
            return this.f28560r.b(d8, this.f28563u) != null ? 2 : 0;
        }
        if (AbstractC2301cW.j(d8.f14313F)) {
            return d8.f14313F != 2 ? 1 : 2;
        }
        HL.f("DefaultAudioSink", "Invalid PCM encoding: " + d8.f14313F);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void c() {
        C3365mE0 c3365mE0;
        if (Z()) {
            this.f28568z = 0L;
            this.f28516A = 0L;
            this.f28517B = 0L;
            this.f28518C = 0L;
            this.f28536U = false;
            this.f28519D = 0;
            this.f28565w = new C2713gE0(this.f28566x, 0L, 0L, null);
            this.f28522G = 0L;
            this.f28564v = null;
            this.f28549g.clear();
            this.f28524I = null;
            this.f28525J = 0;
            this.f28526K = null;
            this.f28528M = false;
            this.f28527L = false;
            this.f28529N = false;
            this.f28545c.o();
            X();
            if (this.f28548f.h()) {
                this.f28559q.pause();
            }
            if (a0(this.f28559q)) {
                C4127tE0 c4127tE0 = this.f28550h;
                c4127tE0.getClass();
                c4127tE0.b(this.f28559q);
            }
            final KD0 a8 = this.f28557o.a();
            C2495eE0 c2495eE0 = this.f28556n;
            if (c2495eE0 != null) {
                this.f28557o = c2495eE0;
                this.f28556n = null;
            }
            this.f28548f.c();
            if (AbstractC2301cW.f21206a >= 24 && (c3365mE0 = this.f28562t) != null) {
                c3365mE0.b();
                this.f28562t = null;
            }
            final AudioTrack audioTrack = this.f28559q;
            final LD0 ld0 = this.f28555m;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f28513b0) {
                try {
                    if (f28514c0 == null) {
                        final String str = "ExoPlayer:AudioTrackReleaseThread";
                        f28514c0 = Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str) { // from class: com.google.android.gms.internal.ads.BV

                            /* renamed from: o, reason: collision with root package name */
                            public final /* synthetic */ String f13806o = "ExoPlayer:AudioTrackReleaseThread";

                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                return new Thread(runnable, this.f13806o);
                            }
                        });
                    }
                    f28515d0++;
                    f28514c0.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.VD0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4781zE0.E(audioTrack, ld0, handler, a8);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f28559q = null;
        }
        this.f28552j.a();
        this.f28551i.a();
        this.f28538W = 0L;
        this.f28539X = 0L;
        Handler handler2 = this.f28540Y;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void d(int i8, int i9) {
        AudioTrack audioTrack = this.f28559q;
        if (audioTrack != null) {
            a0(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void e() {
        this.f28530O = false;
        if (Z()) {
            if (this.f28548f.k() || a0(this.f28559q)) {
                this.f28559q.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void f() {
        this.f28530O = true;
        if (Z()) {
            this.f28548f.f();
            this.f28559q.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void g() {
        this.f28520E = true;
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void h() {
        if (!this.f28527L && Z() && Y()) {
            Q();
            this.f28527L = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void i() {
        C3799qD0 c3799qD0 = this.f28561s;
        if (c3799qD0 != null) {
            c3799qD0.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void j() {
        c();
        AbstractC4169th0 abstractC4169th0 = this.f28546d;
        int size = abstractC4169th0.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((InterfaceC1143Au) abstractC4169th0.get(i8)).c();
        }
        AbstractC4169th0 abstractC4169th02 = this.f28547e;
        int size2 = abstractC4169th02.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((InterfaceC1143Au) abstractC4169th02.get(i9)).c();
        }
        C1918Ws c1918Ws = this.f28558p;
        if (c1918Ws != null) {
            c1918Ws.f();
        }
        this.f28530O = false;
        this.f28535T = false;
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final boolean k(D d8) {
        return b(d8) != 0;
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void l(float f8) {
        if (this.f28523H != f8) {
            this.f28523H = f8;
            W();
        }
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void m(C2006Zf c2006Zf) {
        this.f28566x = new C2006Zf(Math.max(0.1f, Math.min(c2006Zf.f20521a, 8.0f)), Math.max(0.1f, Math.min(c2006Zf.f20522b, 8.0f)));
        T(c2006Zf);
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void n(AudioDeviceInfo audioDeviceInfo) {
        this.f28533R = audioDeviceInfo == null ? null : new C3907rD0(audioDeviceInfo);
        C3799qD0 c3799qD0 = this.f28561s;
        if (c3799qD0 != null) {
            c3799qD0.h(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f28559q;
        if (audioTrack != null) {
            ZD0.a(audioTrack, this.f28533R);
        }
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void o(C4763z50 c4763z50) {
        if (this.f28532Q.equals(c4763z50)) {
            return;
        }
        if (this.f28559q != null) {
            int i8 = this.f28532Q.f28295a;
        }
        this.f28532Q = c4763z50;
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void p(LD0 ld0) {
        this.f28555m = ld0;
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final C4234uD0 q(D d8) {
        return this.f28535T ? C4234uD0.f27009d : this.f28543a0.a(d8, this.f28563u);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0272  */
    @Override // com.google.android.gms.internal.ads.MD0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(java.nio.ByteBuffer r28, long r29, int r31) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4781zE0.r(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void s(C2059aD0 c2059aD0) {
        this.f28554l = c2059aD0;
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void t(RC rc) {
        this.f28548f.e(rc);
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void u(D d8, int i8, int[] iArr) {
        int intValue;
        C1918Ws c1918Ws;
        int i9;
        int intValue2;
        int i10;
        int i11;
        int i12;
        int i13;
        int max;
        P();
        if ("audio/raw".equals(d8.f14334o)) {
            AbstractC3796qC.d(AbstractC2301cW.j(d8.f14313F));
            i9 = AbstractC2301cW.C(d8.f14313F) * d8.f14311D;
            C3843qh0 c3843qh0 = new C3843qh0();
            c3843qh0.i(this.f28546d);
            c3843qh0.h(this.f28541Z.e());
            C1918Ws c1918Ws2 = new C1918Ws(c3843qh0.j());
            if (c1918Ws2.equals(this.f28558p)) {
                c1918Ws2 = this.f28558p;
            }
            this.f28545c.p(d8.f14314G, d8.f14315H);
            this.f28544b.n(iArr);
            try {
                C4737yt a8 = c1918Ws2.a(new C4737yt(d8.f14312E, d8.f14311D, d8.f14313F));
                intValue = a8.f28219c;
                i11 = a8.f28217a;
                int i14 = a8.f28218b;
                intValue2 = AbstractC2301cW.A(i14);
                c1918Ws = c1918Ws2;
                i10 = AbstractC2301cW.C(intValue) * i14;
                i12 = 0;
            } catch (zzcg e8) {
                throw new zzph(e8, d8);
            }
        } else {
            C1918Ws c1918Ws3 = new C1918Ws(AbstractC4169th0.w());
            int i15 = d8.f14312E;
            C4234uD0 c4234uD0 = C4234uD0.f27009d;
            Pair b8 = this.f28560r.b(d8, this.f28563u);
            if (b8 == null) {
                throw new zzph("Unable to configure passthrough for: ".concat(String.valueOf(d8)), d8);
            }
            intValue = ((Integer) b8.first).intValue();
            c1918Ws = c1918Ws3;
            i9 = -1;
            intValue2 = ((Integer) b8.second).intValue();
            i10 = -1;
            i11 = i15;
            i12 = 2;
        }
        if (intValue == 0) {
            throw new zzph("Invalid output encoding (mode=" + i12 + ") for: " + String.valueOf(d8), d8);
        }
        if (intValue2 == 0) {
            throw new zzph("Invalid output channel config (mode=" + i12 + ") for: " + String.valueOf(d8), d8);
        }
        int i16 = d8.f14329j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(d8.f14334o) && i16 == -1) {
            i16 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i11, intValue2, intValue);
        AbstractC3796qC.f(minBufferSize != -2);
        int i17 = i10 != -1 ? i10 : 1;
        int i18 = 250000;
        if (i12 == 0) {
            i13 = i12;
            max = Math.max(BE0.a(250000, i11, i17), Math.min(minBufferSize * 4, BE0.a(750000, i11, i17)));
        } else if (i12 != 1) {
            if (intValue == 5) {
                i18 = 500000;
            } else if (intValue == 8) {
                i18 = 1000000;
                intValue = 8;
            }
            i13 = i12;
            max = AbstractC1943Xi0.b((i18 * (i16 != -1 ? AbstractC1698Qi0.b(i16, 8, RoundingMode.CEILING) : BE0.b(intValue))) / 1000000);
        } else {
            i13 = i12;
            max = AbstractC1943Xi0.b((BE0.b(intValue) * 50000000) / 1000000);
        }
        int i19 = intValue;
        this.f28535T = false;
        C2495eE0 c2495eE0 = new C2495eE0(d8, i9, i13, i10, i11, intValue2, i19, (((Math.max(minBufferSize, max) + i17) - 1) / i17) * i17, c1918Ws, false, false, false);
        if (Z()) {
            this.f28556n = c2495eE0;
        } else {
            this.f28557o = c2495eE0;
        }
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void v(WR wr) {
        if (this.f28563u.equals(wr)) {
            return;
        }
        this.f28563u = wr;
        C3799qD0 c3799qD0 = this.f28561s;
        if (c3799qD0 != null) {
            c3799qD0.g(wr);
        }
        c();
    }

    @Override // com.google.android.gms.internal.ads.MD0
    public final void x(int i8) {
        if (this.f28531P != i8) {
            this.f28531P = i8;
            c();
        }
    }
}
