package com.google.android.gms.internal.ads;

import D2.C0555y;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class W60 {

    /* renamed from: a, reason: collision with root package name */
    private final C3785q60 f19716a;

    /* renamed from: b, reason: collision with root package name */
    private final C4111t60 f19717b;

    /* renamed from: c, reason: collision with root package name */
    private final C2959ia0 f19718c;

    /* renamed from: d, reason: collision with root package name */
    private final Y90 f19719d;

    /* renamed from: e, reason: collision with root package name */
    private final RunnableC3464n90 f19720e;

    /* renamed from: f, reason: collision with root package name */
    private final C3874qx f19721f;

    public W60(C2959ia0 c2959ia0, Y90 y90, C3785q60 c3785q60, C4111t60 c4111t60, C3874qx c3874qx, RunnableC3464n90 runnableC3464n90) {
        this.f19716a = c3785q60;
        this.f19717b = c4111t60;
        this.f19718c = c2959ia0;
        this.f19719d = y90;
        this.f19721f = c3874qx;
        this.f19720e = runnableC3464n90;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), 2);
        }
    }

    public final void b(String str, int i8) {
        C3785q60 c3785q60 = this.f19716a;
        if (c3785q60.f25795i0) {
            this.f19719d.a(str, this.f19717b.f26832b, i8);
            return;
        }
        this.f19718c.d(str, c3785q60.f25825x0, this.f19720e);
    }

    public final void c(List list, int i8) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC2326ck0.r((((Boolean) D2.A.c().a(AbstractC3184kf.U9)).booleanValue() && C3874qx.j(str)) ? this.f19721f.b(str, C0555y.e()) : AbstractC2326ck0.h(str), new V60(this, i8), AbstractC1497Kq.f16644a);
        }
    }
}
