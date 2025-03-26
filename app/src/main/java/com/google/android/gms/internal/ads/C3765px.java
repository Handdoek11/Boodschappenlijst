package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.px, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3765px implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2959ia0 f25669a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25670b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ H2.v f25671c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3874qx f25672d;

    C3765px(C3874qx c3874qx, C2959ia0 c2959ia0, String str, H2.v vVar) {
        this.f25669a = c2959ia0;
        this.f25670b = str;
        this.f25671c = vVar;
        this.f25672d = c3874qx;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(final Throwable th) {
        InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = this.f25672d.f26026e;
        final C2959ia0 c2959ia0 = this.f25669a;
        final String str = this.f25670b;
        final H2.v vVar = this.f25671c;
        interfaceExecutorServiceC3522nk0.k(new Runnable() { // from class: com.google.android.gms.internal.ads.nx
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) D2.A.c().a(AbstractC3184kf.ia)).booleanValue();
                C3765px c3765px = this.f25054o;
                Throwable th2 = th;
                if (booleanValue) {
                    C3874qx c3874qx = c3765px.f25672d;
                    c3874qx.f26030i = C1773Sn.e(c3874qx.f26022a);
                    c3765px.f25672d.f26030i.a(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    C3874qx c3874qx2 = c3765px.f25672d;
                    c3874qx2.f26029h = C1773Sn.c(c3874qx2.f26022a);
                    c3765px.f25672d.f26029h.a(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                H2.v vVar2 = vVar;
                c2959ia0.d(str, vVar2, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        final C2959ia0 c2959ia0 = this.f25669a;
        final String str = (String) obj;
        InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = this.f25672d.f26026e;
        final H2.v vVar = this.f25671c;
        interfaceExecutorServiceC3522nk0.k(new Runnable() { // from class: com.google.android.gms.internal.ads.ox
            @Override // java.lang.Runnable
            public final void run() {
                c2959ia0.d(str, vVar, null);
            }
        });
    }
}
