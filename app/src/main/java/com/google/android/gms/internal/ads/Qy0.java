package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class Qy0 implements Zz0 {

    /* renamed from: a, reason: collision with root package name */
    private final IA0 f18574a;

    /* renamed from: b, reason: collision with root package name */
    private final Oy0 f18575b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC4773zA0 f18576c;

    /* renamed from: d, reason: collision with root package name */
    private Zz0 f18577d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18578e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18579f;

    public Qy0(Oy0 oy0, RC rc) {
        this.f18575b = oy0;
        this.f18574a = new IA0(rc);
    }

    @Override // com.google.android.gms.internal.ads.Zz0
    public final void P(C2006Zf c2006Zf) {
        Zz0 zz0 = this.f18577d;
        if (zz0 != null) {
            zz0.P(c2006Zf);
            c2006Zf = this.f18577d.a();
        }
        this.f18574a.P(c2006Zf);
    }

    @Override // com.google.android.gms.internal.ads.Zz0
    public final C2006Zf a() {
        Zz0 zz0 = this.f18577d;
        return zz0 != null ? zz0.a() : this.f18574a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zA0 r0 = r4.f18576c
            if (r0 == 0) goto L71
            boolean r0 = r0.e()
            if (r0 != 0) goto L71
            if (r5 == 0) goto L15
            com.google.android.gms.internal.ads.zA0 r0 = r4.f18576c
            int r0 = r0.d()
            r1 = 2
            if (r0 != r1) goto L71
        L15:
            com.google.android.gms.internal.ads.zA0 r0 = r4.f18576c
            boolean r0 = r0.Y()
            if (r0 != 0) goto L28
            if (r5 != 0) goto L71
            com.google.android.gms.internal.ads.zA0 r5 = r4.f18576c
            boolean r5 = r5.y()
            if (r5 == 0) goto L28
            goto L71
        L28:
            com.google.android.gms.internal.ads.Zz0 r5 = r4.f18577d
            r5.getClass()
            long r0 = r5.zza()
            boolean r2 = r4.f18578e
            if (r2 == 0) goto L51
            com.google.android.gms.internal.ads.IA0 r2 = r4.f18574a
            long r2 = r2.zza()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L45
            com.google.android.gms.internal.ads.IA0 r5 = r4.f18574a
            r5.d()
            goto L7d
        L45:
            r2 = 0
            r4.f18578e = r2
            boolean r2 = r4.f18579f
            if (r2 == 0) goto L51
            com.google.android.gms.internal.ads.IA0 r2 = r4.f18574a
            r2.c()
        L51:
            com.google.android.gms.internal.ads.IA0 r2 = r4.f18574a
            r2.b(r0)
            com.google.android.gms.internal.ads.Zf r5 = r5.a()
            com.google.android.gms.internal.ads.IA0 r0 = r4.f18574a
            com.google.android.gms.internal.ads.Zf r0 = r0.a()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L7d
            com.google.android.gms.internal.ads.IA0 r0 = r4.f18574a
            r0.P(r5)
            com.google.android.gms.internal.ads.Oy0 r0 = r4.f18575b
            r0.a(r5)
            goto L7d
        L71:
            r5 = 1
            r4.f18578e = r5
            boolean r5 = r4.f18579f
            if (r5 == 0) goto L7d
            com.google.android.gms.internal.ads.IA0 r5 = r4.f18574a
            r5.c()
        L7d:
            long r0 = r4.zza()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Qy0.b(boolean):long");
    }

    public final void c(InterfaceC4773zA0 interfaceC4773zA0) {
        if (interfaceC4773zA0 == this.f18576c) {
            this.f18577d = null;
            this.f18576c = null;
            this.f18578e = true;
        }
    }

    public final void d(InterfaceC4773zA0 interfaceC4773zA0) {
        Zz0 zz0;
        Zz0 j8 = interfaceC4773zA0.j();
        if (j8 == null || j8 == (zz0 = this.f18577d)) {
            return;
        }
        if (zz0 != null) {
            throw zzib.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f18577d = j8;
        this.f18576c = interfaceC4773zA0;
        j8.P(this.f18574a.a());
    }

    public final void e(long j8) {
        this.f18574a.b(j8);
    }

    public final void f() {
        this.f18579f = true;
        this.f18574a.c();
    }

    public final void g() {
        this.f18579f = false;
        this.f18574a.d();
    }

    @Override // com.google.android.gms.internal.ads.Zz0
    public final boolean h() {
        if (this.f18578e) {
            return false;
        }
        Zz0 zz0 = this.f18577d;
        zz0.getClass();
        return zz0.h();
    }

    @Override // com.google.android.gms.internal.ads.Zz0
    public final long zza() {
        if (this.f18578e) {
            return this.f18574a.zza();
        }
        Zz0 zz0 = this.f18577d;
        zz0.getClass();
        return zz0.zza();
    }
}
