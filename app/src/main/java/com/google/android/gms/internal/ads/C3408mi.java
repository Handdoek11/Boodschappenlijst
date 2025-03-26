package com.google.android.gms.internal.ads;

import D2.C0555y;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3408mi implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3912rG f24556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3874qx f24557b;

    public /* synthetic */ C3408mi(InterfaceC3912rG interfaceC3912rG, C3874qx c3874qx) {
        this.f24556a = interfaceC3912rG;
        this.f24557b = c3874qx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        AbstractC1627Oi.c(map, this.f24556a);
        final String str = (String) map.get("u");
        if (str == null) {
            H2.p.g("URL missing from click GMSG.");
            return;
        }
        final C3874qx c3874qx = this.f24557b;
        Sj0 D7 = Sj0.D(AbstractC1627Oi.a(interfaceC4410vt, str));
        InterfaceC1420Ij0 interfaceC1420Ij0 = new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.pi
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj2) {
                C3874qx c3874qx2;
                String str2 = (String) obj2;
                InterfaceC1662Pi interfaceC1662Pi = AbstractC1627Oi.f17915a;
                return (((Boolean) D2.A.c().a(AbstractC3184kf.U9)).booleanValue() && (c3874qx2 = c3874qx) != null && C3874qx.j(str)) ? c3874qx2.b(str2, C0555y.e()) : AbstractC2326ck0.h(str2);
            }
        };
        InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16644a;
        AbstractC2326ck0.r((Sj0) AbstractC2326ck0.n(D7, interfaceC1420Ij0, interfaceExecutorServiceC3522nk0), new C1237Di(interfaceC4410vt), interfaceExecutorServiceC3522nk0);
    }
}
