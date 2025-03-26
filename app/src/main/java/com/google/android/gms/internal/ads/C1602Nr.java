package com.google.android.gms.internal.ads;

import D2.C0555y;
import G2.AbstractC0608p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Nr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1602Nr {

    /* renamed from: r, reason: collision with root package name */
    private static final boolean f17635r;

    /* renamed from: a, reason: collision with root package name */
    private final Context f17636a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17637b;

    /* renamed from: c, reason: collision with root package name */
    private final H2.a f17638c;

    /* renamed from: d, reason: collision with root package name */
    private final C4491wf f17639d;

    /* renamed from: e, reason: collision with root package name */
    private final C4818zf f17640e;

    /* renamed from: f, reason: collision with root package name */
    private final G2.I f17641f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f17642g;

    /* renamed from: h, reason: collision with root package name */
    private final String[] f17643h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17644i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f17645j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17646k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17647l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f17648m;

    /* renamed from: n, reason: collision with root package name */
    private AbstractC3970rr f17649n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17650o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17651p;

    /* renamed from: q, reason: collision with root package name */
    private long f17652q;

    static {
        f17635r = C0555y.e().nextInt(100) < ((Integer) D2.A.c().a(AbstractC3184kf.Bc)).intValue();
    }

    public C1602Nr(Context context, H2.a aVar, String str, C4818zf c4818zf, C4491wf c4491wf) {
        G2.G g8 = new G2.G();
        g8.a("min_1", Double.MIN_VALUE, 1.0d);
        g8.a("1_5", 1.0d, 5.0d);
        g8.a("5_10", 5.0d, 10.0d);
        g8.a("10_20", 10.0d, 20.0d);
        g8.a("20_30", 20.0d, 30.0d);
        g8.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f17641f = g8.b();
        this.f17644i = false;
        this.f17645j = false;
        this.f17646k = false;
        this.f17647l = false;
        this.f17652q = -1L;
        this.f17636a = context;
        this.f17638c = aVar;
        this.f17637b = str;
        this.f17640e = c4818zf;
        this.f17639d = c4491wf;
        String str2 = (String) D2.A.c().a(AbstractC3184kf.f23734N);
        if (str2 == null) {
            this.f17643h = new String[0];
            this.f17642g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f17643h = new String[length];
        this.f17642g = new long[length];
        for (int i8 = 0; i8 < split.length; i8++) {
            try {
                this.f17642g[i8] = Long.parseLong(split[i8]);
            } catch (NumberFormatException e8) {
                H2.p.h("Unable to parse frame hash target time number.", e8);
                this.f17642g[i8] = -1;
            }
        }
    }

    public final void a(AbstractC3970rr abstractC3970rr) {
        AbstractC3946rf.a(this.f17640e, this.f17639d, "vpc2");
        this.f17644i = true;
        this.f17640e.d("vpn", abstractC3970rr.m());
        this.f17649n = abstractC3970rr;
    }

    public final void b() {
        if (!this.f17644i || this.f17645j) {
            return;
        }
        AbstractC3946rf.a(this.f17640e, this.f17639d, "vfr2");
        this.f17645j = true;
    }

    public final void c() {
        this.f17648m = true;
        if (!this.f17645j || this.f17646k) {
            return;
        }
        AbstractC3946rf.a(this.f17640e, this.f17639d, "vfp2");
        this.f17646k = true;
    }

    public final void d() {
        if (!f17635r || this.f17650o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f17637b);
        bundle.putString("player", this.f17649n.m());
        for (G2.F f8 : this.f17641f.a()) {
            String valueOf = String.valueOf(f8.f2578a);
            bundle.putString("fps_c_".concat(valueOf), Integer.toString(f8.f2582e));
            String valueOf2 = String.valueOf(f8.f2578a);
            bundle.putString("fps_p_".concat(valueOf2), Double.toString(f8.f2581d));
        }
        int i8 = 0;
        while (true) {
            long[] jArr = this.f17642g;
            if (i8 >= jArr.length) {
                C2.v.t().N(this.f17636a, this.f17638c.f2914o, "gmob-apps", bundle, true);
                this.f17650o = true;
                return;
            }
            String str = this.f17643h[i8];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i8]).toString()), str);
            }
            i8++;
        }
    }

    public final void e() {
        this.f17648m = false;
    }

    public final void f(AbstractC3970rr abstractC3970rr) {
        if (this.f17646k && !this.f17647l) {
            if (AbstractC0608p0.m() && !this.f17647l) {
                AbstractC0608p0.k("VideoMetricsMixin first frame");
            }
            AbstractC3946rf.a(this.f17640e, this.f17639d, "vff2");
            this.f17647l = true;
        }
        long c8 = C2.v.c().c();
        if (this.f17648m && this.f17651p && this.f17652q != -1) {
            this.f17641f.b(TimeUnit.SECONDS.toNanos(1L) / (c8 - this.f17652q));
        }
        this.f17651p = this.f17648m;
        this.f17652q = c8;
        long longValue = ((Long) D2.A.c().a(AbstractC3184kf.f23742O)).longValue();
        long d8 = abstractC3970rr.d();
        int i8 = 0;
        while (true) {
            String[] strArr = this.f17643h;
            if (i8 >= strArr.length) {
                return;
            }
            if (strArr[i8] == null && longValue > Math.abs(d8 - this.f17642g[i8])) {
                String[] strArr2 = this.f17643h;
                int i9 = 8;
                Bitmap bitmap = abstractC3970rr.getBitmap(8, 8);
                long j8 = 63;
                int i10 = 0;
                long j9 = 0;
                while (i10 < i9) {
                    int i11 = 0;
                    while (i11 < i9) {
                        int pixel = bitmap.getPixel(i11, i10);
                        j9 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j8);
                        j8--;
                        i11++;
                        i9 = 8;
                    }
                    i10++;
                    i9 = 8;
                }
                strArr2[i8] = String.format("%016X", Long.valueOf(j9));
                return;
            }
            i8++;
        }
    }
}
