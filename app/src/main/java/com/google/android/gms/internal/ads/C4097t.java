package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4097t {

    /* renamed from: a, reason: collision with root package name */
    private final C3444n f26773a;

    /* renamed from: f, reason: collision with root package name */
    private C4408vs f26778f;

    /* renamed from: h, reason: collision with root package name */
    private long f26780h;

    /* renamed from: j, reason: collision with root package name */
    private final GJ0 f26782j;

    /* renamed from: b, reason: collision with root package name */
    private final C3226l f26774b = new C3226l();

    /* renamed from: c, reason: collision with root package name */
    private final C2082aU f26775c = new C2082aU(10);

    /* renamed from: d, reason: collision with root package name */
    private final C2082aU f26776d = new C2082aU(10);

    /* renamed from: e, reason: collision with root package name */
    private final JM f26777e = new JM(16);

    /* renamed from: g, reason: collision with root package name */
    private C4408vs f26779g = C4408vs.f27376d;

    /* renamed from: i, reason: collision with root package name */
    private long f26781i = -9223372036854775807L;

    public C4097t(GJ0 gj0, C3444n c3444n) {
        this.f26782j = gj0;
        this.f26773a = c3444n;
    }

    private static Object e(C2082aU c2082aU) {
        AbstractC3796qC.d(c2082aU.a() > 0);
        while (c2082aU.a() > 1) {
            c2082aU.b();
        }
        Object b8 = c2082aU.b();
        b8.getClass();
        return b8;
    }

    public final void a() {
        this.f26777e.c();
        this.f26781i = -9223372036854775807L;
        C2082aU c2082aU = this.f26776d;
        if (c2082aU.a() > 0) {
            Long l8 = (Long) e(c2082aU);
            l8.longValue();
            this.f26776d.d(0L, l8);
        }
        if (this.f26778f != null) {
            this.f26775c.e();
            return;
        }
        C2082aU c2082aU2 = this.f26775c;
        if (c2082aU2.a() > 0) {
            this.f26778f = (C4408vs) e(c2082aU2);
        }
    }

    public final void b(int i8, int i9) {
        this.f26778f = new C4408vs(i8, i9, 1.0f);
    }

    public final void c(long j8, long j9) {
        while (true) {
            JM jm = this.f26777e;
            if (jm.d()) {
                return;
            }
            C2082aU c2082aU = this.f26776d;
            long a8 = jm.a();
            Long l8 = (Long) c2082aU.c(a8);
            if (l8 != null && l8.longValue() != this.f26780h) {
                this.f26780h = l8.longValue();
                this.f26773a.f();
            }
            int a9 = this.f26773a.a(a8, j8, j9, this.f26780h, false, this.f26774b);
            if (a9 != 0 && a9 != 1) {
                if (a9 == 2 || a9 == 3 || a9 == 4) {
                    this.f26781i = a8;
                    this.f26777e.b();
                    GJ0 gj0 = this.f26782j;
                    Iterator it = gj0.f15355b.f23151i.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2465e) it.next()).b(gj0.f15355b);
                    }
                    AbstractC3796qC.b(null);
                    throw null;
                }
                return;
            }
            this.f26781i = a8;
            long longValue = Long.valueOf(this.f26777e.b()).longValue();
            C4408vs c4408vs = (C4408vs) this.f26775c.c(longValue);
            if (c4408vs != null && !c4408vs.equals(C4408vs.f27376d) && !c4408vs.equals(this.f26779g)) {
                this.f26779g = c4408vs;
                this.f26782j.a(c4408vs);
            }
            this.f26782j.b(a9 == 0 ? -1L : this.f26774b.d(), longValue, this.f26773a.p());
        }
    }

    public final boolean d(long j8) {
        long j9 = this.f26781i;
        return j9 != -9223372036854775807L && j9 >= j8;
    }
}
