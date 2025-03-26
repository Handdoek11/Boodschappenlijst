package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Ny0 implements Vz0 {

    /* renamed from: a, reason: collision with root package name */
    private final RI0 f17794a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17795b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17796c;

    /* renamed from: d, reason: collision with root package name */
    private final long f17797d;

    /* renamed from: e, reason: collision with root package name */
    private final long f17798e;

    /* renamed from: f, reason: collision with root package name */
    private final long f17799f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f17800g;

    /* renamed from: h, reason: collision with root package name */
    private long f17801h;

    public Ny0() {
        RI0 ri0 = new RI0(true, 65536);
        l(2500, 0, "bufferForPlaybackMs", "0");
        l(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        l(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(50000, 50000, "maxBufferMs", "minBufferMs");
        l(0, 0, "backBufferDurationMs", "0");
        this.f17794a = ri0;
        this.f17795b = AbstractC2301cW.K(50000L);
        this.f17796c = AbstractC2301cW.K(50000L);
        this.f17797d = AbstractC2301cW.K(2500L);
        this.f17798e = AbstractC2301cW.K(5000L);
        this.f17799f = AbstractC2301cW.K(0L);
        this.f17800g = new HashMap();
        this.f17801h = -1L;
    }

    private static void l(int i8, int i9, String str, String str2) {
        AbstractC3796qC.e(i8 >= i9, str + " cannot be less than " + str2);
    }

    private final void m(C2059aD0 c2059aD0) {
        if (this.f17800g.remove(c2059aD0) != null) {
            n();
        }
    }

    private final void n() {
        if (this.f17800g.isEmpty()) {
            this.f17794a.e();
        } else {
            this.f17794a.f(k());
        }
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final boolean a(C2059aD0 c2059aD0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final boolean b(AbstractC1981Yl abstractC1981Yl, GG0 gg0, long j8) {
        Iterator it = this.f17800g.values().iterator();
        while (it.hasNext()) {
            if (((Ly0) it.next()).f17187a) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final void c(Uz0 uz0, JH0 jh0, BI0[] bi0Arr) {
        Ly0 ly0 = (Ly0) this.f17800g.get(uz0.f19492a);
        ly0.getClass();
        int length = bi0Arr.length;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = 13107200;
            if (i8 >= length) {
                ly0.f17188b = Math.max(13107200, i9);
                n();
                return;
            }
            BI0 bi0 = bi0Arr[i8];
            if (bi0 != null) {
                switch (bi0.g().f27904c) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i10 = 144310272;
                        break;
                    case 2:
                        i10 = 131072000;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    default:
                        i10 = 131072;
                        break;
                }
                i9 += i10;
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final boolean d(Uz0 uz0) {
        Ly0 ly0 = (Ly0) this.f17800g.get(uz0.f19492a);
        ly0.getClass();
        int a8 = this.f17794a.a();
        int k8 = k();
        long j8 = this.f17795b;
        float f8 = uz0.f19494c;
        if (f8 > 1.0f) {
            j8 = Math.min(AbstractC2301cW.I(j8, f8), this.f17796c);
        }
        long j9 = uz0.f19493b;
        if (j9 < Math.max(j8, 500000L)) {
            boolean z7 = a8 < k8;
            ly0.f17187a = z7;
            if (!z7 && j9 < 500000) {
                HL.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j9 >= this.f17796c || a8 >= k8) {
            ly0.f17187a = false;
        }
        return ly0.f17187a;
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final void e(C2059aD0 c2059aD0) {
        long id = Thread.currentThread().getId();
        long j8 = this.f17801h;
        boolean z7 = true;
        if (j8 != -1 && j8 != id) {
            z7 = false;
        }
        AbstractC3796qC.g(z7, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f17801h = id;
        if (!this.f17800g.containsKey(c2059aD0)) {
            this.f17800g.put(c2059aD0, new Ly0(null));
        }
        Ly0 ly0 = (Ly0) this.f17800g.get(c2059aD0);
        ly0.getClass();
        ly0.f17188b = 13107200;
        ly0.f17187a = false;
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final long f(C2059aD0 c2059aD0) {
        return this.f17799f;
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final void g(C2059aD0 c2059aD0) {
        m(c2059aD0);
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final boolean h(Uz0 uz0) {
        boolean z7 = uz0.f19495d;
        long J7 = AbstractC2301cW.J(uz0.f19493b, uz0.f19494c);
        long j8 = z7 ? this.f17798e : this.f17797d;
        long j9 = uz0.f19496e;
        if (j9 != -9223372036854775807L) {
            j8 = Math.min(j9 / 2, j8);
        }
        return j8 <= 0 || J7 >= j8 || this.f17794a.a() >= k();
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final RI0 i() {
        return this.f17794a;
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final void j(C2059aD0 c2059aD0) {
        m(c2059aD0);
        if (this.f17800g.isEmpty()) {
            this.f17801h = -1L;
        }
    }

    final int k() {
        Iterator it = this.f17800g.values().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += ((Ly0) it.next()).f17188b;
        }
        return i8;
    }
}
