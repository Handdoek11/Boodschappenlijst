package com.google.android.gms.common.api.internal;

import X2.C0754b;
import X2.InterfaceC0759g;
import android.app.Activity;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.C1108g;
import q.C6398b;

/* renamed from: com.google.android.gms.common.api.internal.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1101m extends L {

    /* renamed from: w, reason: collision with root package name */
    private final C6398b f13342w;

    /* renamed from: x, reason: collision with root package name */
    private final C1091c f13343x;

    C1101m(InterfaceC0759g interfaceC0759g, C1091c c1091c, C1108g c1108g) {
        super(interfaceC0759g, c1108g);
        this.f13342w = new C6398b();
        this.f13343x = c1091c;
        this.f13281o.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C1091c c1091c, C0754b c0754b) {
        InterfaceC0759g d8 = LifecycleCallback.d(activity);
        C1101m c1101m = (C1101m) d8.d("ConnectionlessLifecycleHelper", C1101m.class);
        if (c1101m == null) {
            c1101m = new C1101m(d8, c1091c, C1108g.m());
        }
        Z2.r.m(c0754b, "ApiKey cannot be null");
        c1101m.f13342w.add(c0754b);
        c1091c.a(c1101m);
    }

    private final void v() {
        if (this.f13342w.isEmpty()) {
            return;
        }
        this.f13343x.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.L, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.L, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f13343x.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.L
    protected final void m(C1103b c1103b, int i8) {
        this.f13343x.E(c1103b, i8);
    }

    @Override // com.google.android.gms.common.api.internal.L
    protected final void n() {
        this.f13343x.F();
    }

    final C6398b t() {
        return this.f13342w;
    }
}
