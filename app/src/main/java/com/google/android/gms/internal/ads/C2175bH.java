package com.google.android.gms.internal.ads;

import G2.C0624z;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.bH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2175bH implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f20841a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f20842b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f20843c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f20844d;

    public C2175bH(TG tg, InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f20841a = interfaceC4203ty0;
        this.f20842b = interfaceC4203ty02;
        this.f20843c = interfaceC4203ty03;
        this.f20844d = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f20841a.zzb();
        final H2.a a8 = ((C1815Tu) this.f20842b).a();
        final C3785q60 a9 = ((C2269cA) this.f20843c).a();
        final L60 a10 = ((C2056aC) this.f20844d).a();
        return new C3041jG(new ZC() { // from class: com.google.android.gms.internal.ads.RG
            @Override // com.google.android.gms.internal.ads.ZC
            public final void s() {
                C0624z w7 = C2.v.w();
                Context context2 = context;
                L60 l60 = a10;
                w7.n(context2, a8.f2914o, a9.f25754C.toString(), l60.f16768f);
            }
        }, AbstractC1497Kq.f16650g);
    }
}
