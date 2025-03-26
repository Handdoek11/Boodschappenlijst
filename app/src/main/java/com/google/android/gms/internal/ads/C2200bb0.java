package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2200bb0 extends AbstractC1927Xa0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1997Za0 f20892a;

    /* renamed from: c, reason: collision with root package name */
    private C3179kc0 f20894c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC1440Jb0 f20895d;

    /* renamed from: g, reason: collision with root package name */
    private final String f20898g;

    /* renamed from: b, reason: collision with root package name */
    private final C4484wb0 f20893b = new C4484wb0();

    /* renamed from: e, reason: collision with root package name */
    private boolean f20896e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20897f = false;

    C2200bb0(C1962Ya0 c1962Ya0, C1997Za0 c1997Za0, String str) {
        this.f20892a = c1997Za0;
        this.f20898g = str;
        k(null);
        if (c1997Za0.d() == EnumC2091ab0.HTML || c1997Za0.d() == EnumC2091ab0.JAVASCRIPT) {
            this.f20895d = new C1475Kb0(str, c1997Za0.a());
        } else {
            this.f20895d = new C1579Nb0(str, c1997Za0.i(), null);
        }
        this.f20895d.o();
        C4048sb0.a().d(this);
        this.f20895d.f(c1962Ya0);
    }

    private final void k(View view) {
        this.f20894c = new C3179kc0(view);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1927Xa0
    public final void b(View view, EnumC2525eb0 enumC2525eb0, String str) {
        if (this.f20897f) {
            return;
        }
        this.f20893b.b(view, enumC2525eb0, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1927Xa0
    public final void c() {
        if (this.f20897f) {
            return;
        }
        this.f20894c.clear();
        if (!this.f20897f) {
            this.f20893b.c();
        }
        this.f20897f = true;
        this.f20895d.e();
        C4048sb0.a().e(this);
        this.f20895d.c();
        this.f20895d = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1927Xa0
    public final void d(View view) {
        if (this.f20897f || f() == view) {
            return;
        }
        k(view);
        this.f20895d.b();
        Collection<C2200bb0> c8 = C4048sb0.a().c();
        if (c8 == null || c8.isEmpty()) {
            return;
        }
        for (C2200bb0 c2200bb0 : c8) {
            if (c2200bb0 != this && c2200bb0.f() == view) {
                c2200bb0.f20894c.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1927Xa0
    public final void e() {
        if (this.f20896e || this.f20895d == null) {
            return;
        }
        this.f20896e = true;
        C4048sb0.a().f(this);
        this.f20895d.l(C1116Ab0.c().b());
        this.f20895d.g(C3831qb0.b().c());
        this.f20895d.i(this, this.f20892a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View f() {
        return (View) this.f20894c.get();
    }

    public final AbstractC1440Jb0 g() {
        return this.f20895d;
    }

    public final String h() {
        return this.f20898g;
    }

    public final List i() {
        return this.f20893b.a();
    }

    public final boolean j() {
        return this.f20896e && !this.f20897f;
    }
}
