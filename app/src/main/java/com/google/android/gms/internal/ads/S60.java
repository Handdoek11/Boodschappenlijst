package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class S60 implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3912rG f18834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3874qx f18835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2959ia0 f18836c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JS f18837d;

    public /* synthetic */ S60(InterfaceC3912rG interfaceC3912rG, C3874qx c3874qx, C2959ia0 c2959ia0, JS js) {
        this.f18834a = interfaceC3912rG;
        this.f18835b = c3874qx;
        this.f18836c = c2959ia0;
        this.f18837d = js;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        AbstractC1627Oi.c(map, this.f18834a);
        String str = (String) map.get("u");
        if (str == null) {
            H2.p.g("URL missing from click GMSG.");
            return;
        }
        JS js = this.f18837d;
        C2959ia0 c2959ia0 = this.f18836c;
        AbstractC2326ck0.r(AbstractC1627Oi.a(interfaceC4410vt, str), new U60(interfaceC4410vt, this.f18835b, c2959ia0, js), AbstractC1497Kq.f16644a);
    }
}
