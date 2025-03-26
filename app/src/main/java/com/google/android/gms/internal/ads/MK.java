package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class MK {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f17338a;

    /* renamed from: b, reason: collision with root package name */
    private final C1993Yx f17339b;

    /* renamed from: c, reason: collision with root package name */
    private final C3259lG f17340c;

    /* renamed from: d, reason: collision with root package name */
    private final C3874qx f17341d;

    MK(Executor executor, C1993Yx c1993Yx, C3259lG c3259lG, C3874qx c3874qx) {
        this.f17338a = executor;
        this.f17340c = c3259lG;
        this.f17339b = c1993Yx;
        this.f17341d = c3874qx;
    }

    public final void a(final InterfaceC4410vt interfaceC4410vt) {
        if (interfaceC4410vt == null) {
            return;
        }
        this.f17340c.m1(interfaceC4410vt.M());
        this.f17340c.f1(new InterfaceC4701yb() { // from class: com.google.android.gms.internal.ads.IK
            @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
            public final void A0(C4592xb c4592xb) {
                InterfaceC3759pu L7 = interfaceC4410vt.L();
                Rect rect = c4592xb.f27877d;
                L7.O0(rect.left, rect.top, false);
            }
        }, this.f17338a);
        this.f17340c.f1(new InterfaceC4701yb() { // from class: com.google.android.gms.internal.ads.JK
            @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
            public final void A0(C4592xb c4592xb) {
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != c4592xb.f27883j ? "0" : "1");
                interfaceC4410vt.D0("onAdVisibilityChanged", hashMap);
            }
        }, this.f17338a);
        this.f17340c.f1(this.f17339b, this.f17338a);
        this.f17339b.e(interfaceC4410vt);
        InterfaceC3759pu L7 = interfaceC4410vt.L();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Z9)).booleanValue() && L7 != null) {
            L7.Y0(this.f17341d);
            L7.b1(this.f17341d, null, null);
        }
        interfaceC4410vt.Z0("/trackActiveViewUnit", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.KK
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, Map map) {
                this.f16577a.b((InterfaceC4410vt) obj, map);
            }
        });
        interfaceC4410vt.Z0("/untrackActiveViewUnit", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.LK
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, Map map) {
                this.f16819a.c((InterfaceC4410vt) obj, map);
            }
        });
    }

    final /* synthetic */ void b(InterfaceC4410vt interfaceC4410vt, Map map) {
        this.f17339b.b();
    }

    final /* synthetic */ void c(InterfaceC4410vt interfaceC4410vt, Map map) {
        this.f17339b.a();
    }
}
