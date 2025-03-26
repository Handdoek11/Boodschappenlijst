package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.Context;
import f3.InterfaceC5781e;

/* renamed from: com.google.android.gms.internal.ads.Rp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1740Rp extends AbstractC1985Yp {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5781e f18701b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3441my0 f18702c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3441my0 f18703d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3441my0 f18704e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3441my0 f18705f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3441my0 f18706g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3441my0 f18707h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3441my0 f18708i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3441my0 f18709j;

    /* synthetic */ C1740Rp(Context context, InterfaceC5781e interfaceC5781e, InterfaceC0611r0 interfaceC0611r0, C1950Xp c1950Xp, AbstractC1775Sp abstractC1775Sp) {
        this.f18701b = interfaceC5781e;
        InterfaceC2462dy0 a8 = C2571ey0.a(context);
        this.f18702c = a8;
        InterfaceC2462dy0 a9 = C2571ey0.a(interfaceC0611r0);
        this.f18703d = a9;
        this.f18704e = C2354cy0.b(new C1496Kp(a8, a9));
        InterfaceC2462dy0 a10 = C2571ey0.a(interfaceC5781e);
        this.f18705f = a10;
        InterfaceC2462dy0 a11 = C2571ey0.a(c1950Xp);
        this.f18706g = a11;
        InterfaceC3441my0 b8 = C2354cy0.b(new C1565Mp(a10, a9, a11));
        this.f18707h = b8;
        C1670Pp c1670Pp = new C1670Pp(a10, b8);
        this.f18708i = c1670Pp;
        this.f18709j = C2354cy0.b(new C2445dq(a8, c1670Pp));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1985Yp
    final SharedPreferencesOnSharedPreferenceChangeListenerC1461Jp a() {
        return (SharedPreferencesOnSharedPreferenceChangeListenerC1461Jp) this.f18704e.zzb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1985Yp
    final C1600Np b() {
        return new C1600Np(this.f18701b, (C1531Lp) this.f18707h.zzb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1985Yp
    final C2337cq c() {
        return (C2337cq) this.f18709j.zzb();
    }
}
