package com.google.android.gms.internal.ads;

import G2.C0624z;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ly, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1539Ly implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1219Cy f17182a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f17183b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f17184c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f17185d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4203ty0 f17186e;

    public C1539Ly(C1219Cy c1219Cy, InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f17182a = c1219Cy;
        this.f17183b = interfaceC4203ty0;
        this.f17184c = interfaceC4203ty02;
        this.f17185d = interfaceC4203ty03;
        this.f17186e = interfaceC4203ty04;
    }

    public static C3041jG a(C1219Cy c1219Cy, final Context context, final H2.a aVar, final C3785q60 c3785q60, final L60 l60) {
        return new C3041jG(new ZC() { // from class: com.google.android.gms.internal.ads.Ay
            @Override // com.google.android.gms.internal.ads.ZC
            public final void s() {
                C0624z w7 = C2.v.w();
                Context context2 = context;
                L60 l602 = l60;
                w7.n(context2, aVar.f2914o, c3785q60.f25754C.toString(), l602.f16768f);
            }
        }, AbstractC1497Kq.f16650g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a(this.f17182a, (Context) this.f17183b.zzb(), ((C1815Tu) this.f17184c).a(), ((C2269cA) this.f17185d).a(), ((C2056aC) this.f17186e).a());
    }
}
