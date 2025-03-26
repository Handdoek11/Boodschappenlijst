package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.d60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2371d60 implements JX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21421a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f21422b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4630xu f21423c;

    /* renamed from: d, reason: collision with root package name */
    private final S50 f21424d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2477e50 f21425e;

    /* renamed from: f, reason: collision with root package name */
    private final D60 f21426f;

    /* renamed from: g, reason: collision with root package name */
    private final RunnableC3791q90 f21427g;

    /* renamed from: h, reason: collision with root package name */
    private final J60 f21428h;

    /* renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.d f21429i;

    public C2371d60(Context context, Executor executor, AbstractC4630xu abstractC4630xu, InterfaceC2477e50 interfaceC2477e50, S50 s50, J60 j60, D60 d60) {
        this.f21421a = context;
        this.f21422b = executor;
        this.f21423c = abstractC4630xu;
        this.f21425e = interfaceC2477e50;
        this.f21424d = s50;
        this.f21428h = j60;
        this.f21426f = d60;
        this.f21427g = abstractC4630xu.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ML j(InterfaceC2260c50 interfaceC2260c50) {
        ML p8 = this.f21423c.p();
        QB qb = new QB();
        qb.f(this.f21421a);
        qb.k(((C2045a60) interfaceC2260c50).f20635a);
        qb.j(this.f21426f);
        p8.a(qb.l());
        p8.d(new C2823hF().q());
        return p8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    @Override // com.google.android.gms.internal.ads.JX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(D2.X1 r11, java.lang.String r12, com.google.android.gms.internal.ads.HX r13, com.google.android.gms.internal.ads.IX r14) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2371d60.a(D2.X1, java.lang.String, com.google.android.gms.internal.ads.HX, com.google.android.gms.internal.ads.IX):boolean");
    }

    final /* synthetic */ void h() {
        this.f21424d.r0(AbstractC3351m70.d(6, null, null));
    }

    final void i(int i8) {
        this.f21428h.L().a(i8);
    }

    @Override // com.google.android.gms.internal.ads.JX
    public final boolean zza() {
        throw null;
    }
}
