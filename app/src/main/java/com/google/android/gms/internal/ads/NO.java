package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class NO extends AbstractBinderC1559Mj {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Object f17522o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f17523s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ long f17524t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ InterfaceC2160b90 f17525u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ C1811Tq f17526v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ SO f17527w;

    NO(SO so, Object obj, String str, long j8, InterfaceC2160b90 interfaceC2160b90, C1811Tq c1811Tq) {
        this.f17522o = obj;
        this.f17523s = str;
        this.f17524t = j8;
        this.f17525u = interfaceC2160b90;
        this.f17526v = c1811Tq;
        this.f17527w = so;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1594Nj
    public final void c() {
        synchronized (this.f17522o) {
            this.f17527w.v(this.f17523s, true, "", (int) (C2.v.c().b() - this.f17524t));
            this.f17527w.f18889l.d(this.f17523s);
            this.f17527w.f18892o.Z(this.f17523s);
            RunnableC3791q90 runnableC3791q90 = this.f17527w.f18893p;
            InterfaceC2160b90 interfaceC2160b90 = this.f17525u;
            interfaceC2160b90.I0(true);
            runnableC3791q90.b(interfaceC2160b90.k());
            this.f17526v.c(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1594Nj
    public final void n(String str) {
        synchronized (this.f17522o) {
            this.f17527w.v(this.f17523s, false, str, (int) (C2.v.c().b() - this.f17524t));
            this.f17527w.f18889l.b(this.f17523s, "error");
            this.f17527w.f18892o.m(this.f17523s, "error");
            RunnableC3791q90 runnableC3791q90 = this.f17527w.f18893p;
            InterfaceC2160b90 interfaceC2160b90 = this.f17525u;
            interfaceC2160b90.C(str);
            interfaceC2160b90.I0(false);
            runnableC3791q90.b(interfaceC2160b90.k());
            this.f17526v.c(Boolean.FALSE);
        }
    }
}
