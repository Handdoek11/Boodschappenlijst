package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4446wA0 extends AbstractC4131tG0 {

    /* renamed from: c, reason: collision with root package name */
    private final C4721yl f27464c;

    C4446wA0(C4555xA0 c4555xA0, AbstractC1981Yl abstractC1981Yl) {
        super(abstractC1981Yl);
        this.f27464c = new C4721yl();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4131tG0, com.google.android.gms.internal.ads.AbstractC1981Yl
    public final C1945Xk d(int i8, C1945Xk c1945Xk, boolean z7) {
        C1945Xk d8 = this.f26863b.d(i8, c1945Xk, z7);
        if (this.f26863b.e(d8.f20118c, this.f27464c, 0L).b()) {
            d8.i(c1945Xk.f20116a, c1945Xk.f20117b, c1945Xk.f20118c, c1945Xk.f20119d, 0L, C3505nc.f25000e, true);
        } else {
            d8.f20121f = true;
        }
        return d8;
    }
}
