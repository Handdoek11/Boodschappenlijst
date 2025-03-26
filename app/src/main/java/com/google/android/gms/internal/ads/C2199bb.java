package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.bb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2199bb extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private final View f20891y;

    public C2199bb(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9, View view) {
        super(c3610oa, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", c2918i8, i8, 57);
        this.f20891y = view;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        if (this.f20891y != null) {
            Boolean bool = (Boolean) D2.A.c().a(AbstractC3184kf.f24053y3);
            Boolean bool2 = (Boolean) D2.A.c().a(AbstractC3184kf.Qa);
            C4045sa c4045sa = new C4045sa((String) this.f21841v.invoke(null, this.f20891y, this.f21837o.b().getResources().getDisplayMetrics(), bool, bool2));
            C8 b02 = D8.b0();
            b02.D(c4045sa.f26700b.longValue());
            b02.F(c4045sa.f26701c.longValue());
            b02.G(c4045sa.f26702d.longValue());
            if (bool2.booleanValue()) {
                b02.E(c4045sa.f26704f.longValue());
            }
            if (bool.booleanValue()) {
                b02.C(c4045sa.f26703e.longValue());
            }
            this.f21840u.a0((D8) b02.x());
        }
    }
}
