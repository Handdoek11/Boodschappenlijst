package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: com.google.android.gms.internal.ads.zU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4802zU implements CH {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28629a;

    /* renamed from: b, reason: collision with root package name */
    private final H2.a f28630b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.d f28631c;

    /* renamed from: d, reason: collision with root package name */
    private final C3785q60 f28632d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4410vt f28633e;

    /* renamed from: f, reason: collision with root package name */
    private final L60 f28634f;

    /* renamed from: g, reason: collision with root package name */
    private final C1767Si f28635g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f28636h;

    /* renamed from: i, reason: collision with root package name */
    private final US f28637i;

    /* renamed from: j, reason: collision with root package name */
    private final HN f28638j;

    C4802zU(Context context, H2.a aVar, com.google.common.util.concurrent.d dVar, C3785q60 c3785q60, InterfaceC4410vt interfaceC4410vt, L60 l60, boolean z7, C1767Si c1767Si, US us, HN hn) {
        this.f28629a = context;
        this.f28630b = aVar;
        this.f28631c = dVar;
        this.f28632d = c3785q60;
        this.f28633e = interfaceC4410vt;
        this.f28634f = l60;
        this.f28635g = c1767Si;
        this.f28636h = z7;
        this.f28637i = us;
        this.f28638j = hn;
    }

    @Override // com.google.android.gms.internal.ads.CH
    public final void a(boolean z7, Context context, C4558xC c4558xC) {
        QG qg = (QG) AbstractC2326ck0.q(this.f28631c);
        this.f28633e.X0(true);
        boolean e8 = this.f28636h ? this.f28635g.e(false) : false;
        C2.v.t();
        C2.l lVar = new C2.l(e8, G2.D0.j(this.f28629a), this.f28636h ? this.f28635g.d() : false, this.f28636h ? this.f28635g.a() : 0.0f, -1, z7, this.f28632d.f25766O, false);
        if (c4558xC != null) {
            c4558xC.c();
        }
        C2.v.m();
        C3914rH j8 = qg.j();
        InterfaceC4410vt interfaceC4410vt = this.f28633e;
        C3785q60 c3785q60 = this.f28632d;
        H2.a aVar = this.f28630b;
        int i8 = c3785q60.f25768Q;
        String str = c3785q60.f25753B;
        C4220u60 c4220u60 = c3785q60.f25814s;
        F2.y.a(context, new AdOverlayInfoParcel(null, j8, null, interfaceC4410vt, i8, aVar, str, lVar, c4220u60.f26997b, c4220u60.f26996a, this.f28634f.f16768f, c4558xC, c3785q60.b() ? this.f28637i : null, this.f28633e.r()), true, this.f28638j);
    }
}
