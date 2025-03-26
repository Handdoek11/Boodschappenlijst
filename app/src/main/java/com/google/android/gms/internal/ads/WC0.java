package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class WC0 implements MA0, XC0 {

    /* renamed from: A, reason: collision with root package name */
    private PlaybackMetrics.Builder f19734A;

    /* renamed from: B, reason: collision with root package name */
    private int f19735B;

    /* renamed from: E, reason: collision with root package name */
    private zzbd f19738E;

    /* renamed from: F, reason: collision with root package name */
    private UB0 f19739F;

    /* renamed from: G, reason: collision with root package name */
    private UB0 f19740G;

    /* renamed from: H, reason: collision with root package name */
    private UB0 f19741H;

    /* renamed from: I, reason: collision with root package name */
    private D f19742I;

    /* renamed from: J, reason: collision with root package name */
    private D f19743J;

    /* renamed from: K, reason: collision with root package name */
    private D f19744K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f19745L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f19746M;

    /* renamed from: N, reason: collision with root package name */
    private int f19747N;

    /* renamed from: O, reason: collision with root package name */
    private int f19748O;

    /* renamed from: P, reason: collision with root package name */
    private int f19749P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f19750Q;

    /* renamed from: o, reason: collision with root package name */
    private final Context f19751o;

    /* renamed from: s, reason: collision with root package name */
    private final YC0 f19752s;

    /* renamed from: t, reason: collision with root package name */
    private final PlaybackSession f19753t;

    /* renamed from: z, reason: collision with root package name */
    private String f19759z;

    /* renamed from: v, reason: collision with root package name */
    private final C4721yl f19755v = new C4721yl();

    /* renamed from: w, reason: collision with root package name */
    private final C1945Xk f19756w = new C1945Xk();

    /* renamed from: y, reason: collision with root package name */
    private final HashMap f19758y = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    private final HashMap f19757x = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    private final long f19754u = SystemClock.elapsedRealtime();

    /* renamed from: C, reason: collision with root package name */
    private int f19736C = 0;

    /* renamed from: D, reason: collision with root package name */
    private int f19737D = 0;

    private WC0(Context context, PlaybackSession playbackSession) {
        this.f19751o = context.getApplicationContext();
        this.f19753t = playbackSession;
        TB0 tb0 = new TB0(TB0.f19089h);
        this.f19752s = tb0;
        tb0.g(this);
    }

    public static WC0 q(Context context) {
        MediaMetricsManager a8 = RC0.a(context.getSystemService("media_metrics"));
        if (a8 == null) {
            return null;
        }
        return new WC0(context, a8.createPlaybackSession());
    }

    private static int r(int i8) {
        switch (AbstractC2301cW.D(i8)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void s() {
        PlaybackMetrics.Builder builder = this.f19734A;
        if (builder != null && this.f19750Q) {
            builder.setAudioUnderrunCount(this.f19749P);
            this.f19734A.setVideoFramesDropped(this.f19747N);
            this.f19734A.setVideoFramesPlayed(this.f19748O);
            Long l8 = (Long) this.f19757x.get(this.f19759z);
            this.f19734A.setNetworkTransferDurationMillis(l8 == null ? 0L : l8.longValue());
            Long l9 = (Long) this.f19758y.get(this.f19759z);
            this.f19734A.setNetworkBytesRead(l9 == null ? 0L : l9.longValue());
            this.f19734A.setStreamSource((l9 == null || l9.longValue() <= 0) ? 0 : 1);
            this.f19753t.reportPlaybackMetrics(this.f19734A.build());
        }
        this.f19734A = null;
        this.f19759z = null;
        this.f19749P = 0;
        this.f19747N = 0;
        this.f19748O = 0;
        this.f19742I = null;
        this.f19743J = null;
        this.f19744K = null;
        this.f19750Q = false;
    }

    private final void t(long j8, D d8, int i8) {
        if (Objects.equals(this.f19743J, d8)) {
            return;
        }
        int i9 = this.f19743J == null ? 1 : 0;
        this.f19743J = d8;
        x(0, j8, d8, i9);
    }

    private final void u(long j8, D d8, int i8) {
        if (Objects.equals(this.f19744K, d8)) {
            return;
        }
        int i9 = this.f19744K == null ? 1 : 0;
        this.f19744K = d8;
        x(2, j8, d8, i9);
    }

    private final void v(AbstractC1981Yl abstractC1981Yl, GG0 gg0) {
        int a8;
        PlaybackMetrics.Builder builder = this.f19734A;
        if (gg0 == null || (a8 = abstractC1981Yl.a(gg0.f15340a)) == -1) {
            return;
        }
        int i8 = 0;
        abstractC1981Yl.d(a8, this.f19756w, false);
        abstractC1981Yl.e(this.f19756w.f20118c, this.f19755v, 0L);
        C3128k5 c3128k5 = this.f19755v.f28186c.f14645b;
        if (c3128k5 != null) {
            int G7 = AbstractC2301cW.G(c3128k5.f23502a);
            i8 = G7 != 0 ? G7 != 1 ? G7 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i8);
        C4721yl c4721yl = this.f19755v;
        long j8 = c4721yl.f28195l;
        if (j8 != -9223372036854775807L && !c4721yl.f28193j && !c4721yl.f28191h && !c4721yl.b()) {
            builder.setMediaDurationMillis(AbstractC2301cW.N(j8));
        }
        builder.setPlaybackType(true != this.f19755v.b() ? 1 : 2);
        this.f19750Q = true;
    }

    private final void w(long j8, D d8, int i8) {
        if (Objects.equals(this.f19742I, d8)) {
            return;
        }
        int i9 = this.f19742I == null ? 1 : 0;
        this.f19742I = d8;
        x(1, j8, d8, i9);
    }

    private final void x(int i8, long j8, D d8, int i9) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = AbstractC2709gC0.a(i8).setTimeSinceCreatedMillis(j8 - this.f19754u);
        if (d8 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i9 != 1 ? 1 : 2);
            String str = d8.f14333n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = d8.f14334o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = d8.f14330k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i10 = d8.f14329j;
            if (i10 != -1) {
                timeSinceCreatedMillis.setBitrate(i10);
            }
            int i11 = d8.f14341v;
            if (i11 != -1) {
                timeSinceCreatedMillis.setWidth(i11);
            }
            int i12 = d8.f14342w;
            if (i12 != -1) {
                timeSinceCreatedMillis.setHeight(i12);
            }
            int i13 = d8.f14311D;
            if (i13 != -1) {
                timeSinceCreatedMillis.setChannelCount(i13);
            }
            int i14 = d8.f14312E;
            if (i14 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i14);
            }
            String str4 = d8.f14323d;
            if (str4 != null) {
                int i15 = AbstractC2301cW.f21206a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f8 = d8.f14343x;
            if (f8 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f8);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f19750Q = true;
        this.f19753t.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean y(UB0 ub0) {
        if (ub0 != null) {
            return ub0.f19319c.equals(this.f19752s.b());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void a(KA0 ka0, CG0 cg0) {
        GG0 gg0 = ka0.f16544d;
        if (gg0 == null) {
            return;
        }
        D d8 = cg0.f14122b;
        d8.getClass();
        UB0 ub0 = new UB0(d8, 0, this.f19752s.d(ka0.f16542b, gg0));
        int i8 = cg0.f14121a;
        if (i8 != 0) {
            if (i8 == 1) {
                this.f19740G = ub0;
                return;
            } else if (i8 != 2) {
                if (i8 != 3) {
                    return;
                }
                this.f19741H = ub0;
                return;
            }
        }
        this.f19739F = ub0;
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final /* synthetic */ void b(KA0 ka0, D d8, Iy0 iy0) {
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final /* synthetic */ void c(KA0 ka0, Object obj, long j8) {
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029d  */
    @Override // com.google.android.gms.internal.ads.MA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.InterfaceC2106aj r19, com.google.android.gms.internal.ads.LA0 r20) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WC0.d(com.google.android.gms.internal.ads.aj, com.google.android.gms.internal.ads.LA0):void");
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final /* synthetic */ void e(KA0 ka0, int i8, long j8) {
    }

    @Override // com.google.android.gms.internal.ads.XC0
    public final void f(KA0 ka0, String str, boolean z7) {
        GG0 gg0 = ka0.f16544d;
        if ((gg0 == null || !gg0.b()) && str.equals(this.f19759z)) {
            s();
        }
        this.f19757x.remove(str);
        this.f19758y.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void g(KA0 ka0, C4408vs c4408vs) {
        UB0 ub0 = this.f19739F;
        if (ub0 != null) {
            D d8 = ub0.f19317a;
            if (d8.f14342w == -1) {
                C2723gJ0 b8 = d8.b();
                b8.G(c4408vs.f27377a);
                b8.k(c4408vs.f27378b);
                this.f19739F = new UB0(b8.H(), 0, ub0.f19319c);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final /* synthetic */ void h(KA0 ka0, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.XC0
    public final void i(KA0 ka0, String str) {
        GG0 gg0 = ka0.f16544d;
        if (gg0 == null || !gg0.b()) {
            s();
            this.f19759z = str;
            this.f19734A = VB0.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.0-beta01");
            v(ka0.f16542b, ka0.f16544d);
        }
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void j(KA0 ka0, zzbd zzbdVar) {
        this.f19738E = zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void k(KA0 ka0, C2104ai c2104ai, C2104ai c2104ai2, int i8) {
        if (i8 == 1) {
            this.f19745L = true;
            i8 = 1;
        }
        this.f19735B = i8;
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void l(KA0 ka0, Hy0 hy0) {
        this.f19747N += hy0.f15830g;
        this.f19748O += hy0.f15828e;
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void m(KA0 ka0, C4458wG0 c4458wG0, CG0 cg0, IOException iOException, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final /* synthetic */ void n(KA0 ka0, D d8, Iy0 iy0) {
    }

    public final LogSessionId o() {
        return this.f19753t.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void p(KA0 ka0, int i8, long j8, long j9) {
        GG0 gg0 = ka0.f16544d;
        if (gg0 != null) {
            String d8 = this.f19752s.d(ka0.f16542b, gg0);
            Long l8 = (Long) this.f19758y.get(d8);
            Long l9 = (Long) this.f19757x.get(d8);
            this.f19758y.put(d8, Long.valueOf((l8 == null ? 0L : l8.longValue()) + j8));
            this.f19757x.put(d8, Long.valueOf((l9 != null ? l9.longValue() : 0L) + i8));
        }
    }
}
