package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.rA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3901rA0 {

    /* renamed from: u, reason: collision with root package name */
    private static final GG0 f26110u = new GG0(new Object(), -1);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1981Yl f26111a;

    /* renamed from: b, reason: collision with root package name */
    public final GG0 f26112b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26113c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26114d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26115e;

    /* renamed from: f, reason: collision with root package name */
    public final zzib f26116f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26117g;

    /* renamed from: h, reason: collision with root package name */
    public final JH0 f26118h;

    /* renamed from: i, reason: collision with root package name */
    public final JI0 f26119i;

    /* renamed from: j, reason: collision with root package name */
    public final List f26120j;

    /* renamed from: k, reason: collision with root package name */
    public final GG0 f26121k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26122l;

    /* renamed from: m, reason: collision with root package name */
    public final int f26123m;

    /* renamed from: n, reason: collision with root package name */
    public final int f26124n;

    /* renamed from: o, reason: collision with root package name */
    public final C2006Zf f26125o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f26126p = false;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f26127q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f26128r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f26129s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f26130t;

    public C3901rA0(AbstractC1981Yl abstractC1981Yl, GG0 gg0, long j8, long j9, int i8, zzib zzibVar, boolean z7, JH0 jh0, JI0 ji0, List list, GG0 gg02, boolean z8, int i9, int i10, C2006Zf c2006Zf, long j10, long j11, long j12, long j13, boolean z9) {
        this.f26111a = abstractC1981Yl;
        this.f26112b = gg0;
        this.f26113c = j8;
        this.f26114d = j9;
        this.f26115e = i8;
        this.f26116f = zzibVar;
        this.f26117g = z7;
        this.f26118h = jh0;
        this.f26119i = ji0;
        this.f26120j = list;
        this.f26121k = gg02;
        this.f26122l = z8;
        this.f26123m = i9;
        this.f26124n = i10;
        this.f26125o = c2006Zf;
        this.f26127q = j10;
        this.f26128r = j11;
        this.f26129s = j12;
        this.f26130t = j13;
    }

    public static C3901rA0 g(JI0 ji0) {
        AbstractC1981Yl abstractC1981Yl = AbstractC1981Yl.f20311a;
        GG0 gg0 = f26110u;
        return new C3901rA0(abstractC1981Yl, gg0, -9223372036854775807L, 0L, 1, null, false, JH0.f16220d, ji0, AbstractC4169th0.w(), gg0, false, 1, 0, C2006Zf.f20520d, 0L, 0L, 0L, 0L, false);
    }

    public static GG0 h() {
        return f26110u;
    }

    public final C3901rA0 a(GG0 gg0) {
        return new C3901rA0(this.f26111a, this.f26112b, this.f26113c, this.f26114d, this.f26115e, this.f26116f, this.f26117g, this.f26118h, this.f26119i, this.f26120j, gg0, this.f26122l, this.f26123m, this.f26124n, this.f26125o, this.f26127q, this.f26128r, this.f26129s, this.f26130t, false);
    }

    public final C3901rA0 b(GG0 gg0, long j8, long j9, long j10, long j11, JH0 jh0, JI0 ji0, List list) {
        GG0 gg02 = this.f26121k;
        boolean z7 = this.f26122l;
        int i8 = this.f26123m;
        int i9 = this.f26124n;
        C2006Zf c2006Zf = this.f26125o;
        long j12 = this.f26127q;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new C3901rA0(this.f26111a, gg0, j9, j10, this.f26115e, this.f26116f, this.f26117g, jh0, ji0, list, gg02, z7, i8, i9, c2006Zf, j12, j11, j8, elapsedRealtime, false);
    }

    public final C3901rA0 c(boolean z7, int i8, int i9) {
        return new C3901rA0(this.f26111a, this.f26112b, this.f26113c, this.f26114d, this.f26115e, this.f26116f, this.f26117g, this.f26118h, this.f26119i, this.f26120j, this.f26121k, z7, i8, i9, this.f26125o, this.f26127q, this.f26128r, this.f26129s, this.f26130t, false);
    }

    public final C3901rA0 d(zzib zzibVar) {
        return new C3901rA0(this.f26111a, this.f26112b, this.f26113c, this.f26114d, this.f26115e, zzibVar, this.f26117g, this.f26118h, this.f26119i, this.f26120j, this.f26121k, this.f26122l, this.f26123m, this.f26124n, this.f26125o, this.f26127q, this.f26128r, this.f26129s, this.f26130t, false);
    }

    public final C3901rA0 e(int i8) {
        return new C3901rA0(this.f26111a, this.f26112b, this.f26113c, this.f26114d, i8, this.f26116f, this.f26117g, this.f26118h, this.f26119i, this.f26120j, this.f26121k, this.f26122l, this.f26123m, this.f26124n, this.f26125o, this.f26127q, this.f26128r, this.f26129s, this.f26130t, false);
    }

    public final C3901rA0 f(AbstractC1981Yl abstractC1981Yl) {
        return new C3901rA0(abstractC1981Yl, this.f26112b, this.f26113c, this.f26114d, this.f26115e, this.f26116f, this.f26117g, this.f26118h, this.f26119i, this.f26120j, this.f26121k, this.f26122l, this.f26123m, this.f26124n, this.f26125o, this.f26127q, this.f26128r, this.f26129s, this.f26130t, false);
    }

    public final boolean i() {
        return this.f26115e == 3 && this.f26122l && this.f26124n == 0;
    }
}
