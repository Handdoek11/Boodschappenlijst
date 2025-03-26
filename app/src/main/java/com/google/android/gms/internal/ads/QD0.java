package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class QD0 {

    /* renamed from: A, reason: collision with root package name */
    private long f18397A;

    /* renamed from: B, reason: collision with root package name */
    private long f18398B;

    /* renamed from: C, reason: collision with root package name */
    private long f18399C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f18400D;

    /* renamed from: E, reason: collision with root package name */
    private long f18401E;

    /* renamed from: F, reason: collision with root package name */
    private long f18402F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f18403G;

    /* renamed from: H, reason: collision with root package name */
    private long f18404H;

    /* renamed from: I, reason: collision with root package name */
    private RC f18405I;

    /* renamed from: a, reason: collision with root package name */
    private final PD0 f18406a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f18407b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f18408c;

    /* renamed from: d, reason: collision with root package name */
    private int f18409d;

    /* renamed from: e, reason: collision with root package name */
    private OD0 f18410e;

    /* renamed from: f, reason: collision with root package name */
    private int f18411f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18412g;

    /* renamed from: h, reason: collision with root package name */
    private long f18413h;

    /* renamed from: i, reason: collision with root package name */
    private float f18414i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18415j;

    /* renamed from: k, reason: collision with root package name */
    private long f18416k;

    /* renamed from: l, reason: collision with root package name */
    private long f18417l;

    /* renamed from: m, reason: collision with root package name */
    private Method f18418m;

    /* renamed from: n, reason: collision with root package name */
    private long f18419n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18420o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18421p;

    /* renamed from: q, reason: collision with root package name */
    private long f18422q;

    /* renamed from: r, reason: collision with root package name */
    private long f18423r;

    /* renamed from: s, reason: collision with root package name */
    private long f18424s;

    /* renamed from: t, reason: collision with root package name */
    private long f18425t;

    /* renamed from: u, reason: collision with root package name */
    private long f18426u;

    /* renamed from: v, reason: collision with root package name */
    private int f18427v;

    /* renamed from: w, reason: collision with root package name */
    private int f18428w;

    /* renamed from: x, reason: collision with root package name */
    private long f18429x;

    /* renamed from: y, reason: collision with root package name */
    private long f18430y;

    /* renamed from: z, reason: collision with root package name */
    private long f18431z;

    public QD0(PD0 pd0) {
        this.f18406a = pd0;
        try {
            this.f18418m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f18407b = new long[10];
        this.f18405I = RC.f18620a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long l() {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.RC r0 = r13.f18405I
            long r0 = r0.zzb()
            long r2 = r13.f18429x
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 2
            if (r2 == 0) goto L3d
            android.media.AudioTrack r2 = r13.f18408c
            r2.getClass()
            int r2 = r2.getPlayState()
            if (r2 != r3) goto L20
            long r0 = r13.f18431z
            return r0
        L20:
            long r0 = com.google.android.gms.internal.ads.AbstractC2301cW.K(r0)
            long r2 = r13.f18429x
            long r0 = r0 - r2
            float r2 = r13.f18414i
            long r0 = com.google.android.gms.internal.ads.AbstractC2301cW.I(r0, r2)
            int r2 = r13.f18411f
            long r0 = com.google.android.gms.internal.ads.AbstractC2301cW.H(r0, r2)
            long r2 = r13.f18397A
            long r4 = r13.f18431z
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L3d:
            long r6 = r13.f18423r
            long r6 = r0 - r6
            r8 = 5
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto La6
            android.media.AudioTrack r2 = r13.f18408c
            r2.getClass()
            int r6 = r2.getPlayState()
            r7 = 1
            if (r6 != r7) goto L54
            goto La4
        L54:
            int r2 = r2.getPlaybackHeadPosition()
            long r7 = (long) r2
            boolean r2 = r13.f18412g
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            r9 = 0
            if (r2 == 0) goto L75
            if (r6 != r3) goto L70
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L71
            long r11 = r13.f18424s
            r13.f18426u = r11
            goto L71
        L70:
            r3 = r6
        L71:
            long r11 = r13.f18426u
            long r7 = r7 + r11
            r6 = r3
        L75:
            int r2 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            r3 = 29
            if (r2 > r3) goto L95
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L91
            long r2 = r13.f18424s
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L92
            r2 = 3
            if (r6 != r2) goto L92
            long r2 = r13.f18430y
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto La4
            r13.f18430y = r0
            goto La4
        L91:
            r9 = r7
        L92:
            r13.f18430y = r4
            r7 = r9
        L95:
            long r2 = r13.f18424s
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto La2
            long r2 = r13.f18425t
            r4 = 1
            long r2 = r2 + r4
            r13.f18425t = r2
        La2:
            r13.f18424s = r7
        La4:
            r13.f18423r = r0
        La6:
            long r0 = r13.f18424s
            long r2 = r13.f18404H
            long r0 = r0 + r2
            long r2 = r13.f18425t
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.QD0.l():long");
    }

    private final long m() {
        return AbstractC2301cW.L(l(), this.f18411f);
    }

    private final void n() {
        this.f18416k = 0L;
        this.f18428w = 0;
        this.f18427v = 0;
        this.f18417l = 0L;
        this.f18399C = 0L;
        this.f18402F = 0L;
        this.f18415j = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r23) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.QD0.a(boolean):long");
    }

    public final void b(long j8) {
        this.f18431z = l();
        this.f18429x = AbstractC2301cW.K(this.f18405I.zzb());
        this.f18397A = j8;
    }

    public final void c() {
        n();
        this.f18408c = null;
        this.f18410e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.f18408c = r3
            r2.f18409d = r7
            com.google.android.gms.internal.ads.OD0 r0 = new com.google.android.gms.internal.ads.OD0
            r0.<init>(r3)
            r2.f18410e = r0
            int r3 = r3.getSampleRate()
            r2.f18411f = r3
            r3 = 0
            if (r4 == 0) goto L23
            int r4 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            r0 = 23
            if (r4 >= r0) goto L23
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L24
            r4 = 6
            if (r5 != r4) goto L23
            r5 = r4
            goto L24
        L23:
            r0 = r3
        L24:
            r2.f18412g = r0
            boolean r4 = com.google.android.gms.internal.ads.AbstractC2301cW.j(r5)
            r2.f18421p = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.f18411f
            long r4 = com.google.android.gms.internal.ads.AbstractC2301cW.L(r4, r6)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            r2.f18413h = r4
            r4 = 0
            r2.f18424s = r4
            r2.f18425t = r4
            r2.f18403G = r3
            r2.f18404H = r4
            r2.f18426u = r4
            r2.f18420o = r3
            r2.f18429x = r0
            r2.f18430y = r0
            r2.f18422q = r4
            r2.f18419n = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f18414i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.QD0.d(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void e(RC rc) {
        this.f18405I = rc;
    }

    public final void f() {
        if (this.f18429x != -9223372036854775807L) {
            this.f18429x = AbstractC2301cW.K(this.f18405I.zzb());
        }
        OD0 od0 = this.f18410e;
        od0.getClass();
        od0.e();
    }

    public final boolean g(long j8) {
        if (j8 > AbstractC2301cW.H(a(false), this.f18411f)) {
            return true;
        }
        if (this.f18412g) {
            AudioTrack audioTrack = this.f18408c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && l() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        AudioTrack audioTrack = this.f18408c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean i(long j8) {
        return this.f18430y != -9223372036854775807L && j8 > 0 && this.f18405I.zzb() - this.f18430y >= 200;
    }

    public final boolean j(long j8) {
        AudioTrack audioTrack = this.f18408c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f18412g) {
            if (playState == 2) {
                this.f18420o = false;
                return false;
            }
            if (playState == 1) {
                if (l() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z7 = this.f18420o;
        boolean g8 = g(j8);
        this.f18420o = g8;
        if (z7 && !g8 && playState != 1) {
            this.f18406a.h(this.f18409d, AbstractC2301cW.N(this.f18413h));
        }
        return true;
    }

    public final boolean k() {
        n();
        if (this.f18429x != -9223372036854775807L) {
            this.f18431z = l();
            return false;
        }
        OD0 od0 = this.f18410e;
        od0.getClass();
        od0.e();
        return true;
    }
}
