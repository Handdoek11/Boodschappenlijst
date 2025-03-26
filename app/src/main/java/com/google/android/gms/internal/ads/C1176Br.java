package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: com.google.android.gms.internal.ads.Br, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176Br {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13906a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1567Mr f13907b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f13908c;

    /* renamed from: d, reason: collision with root package name */
    private C1140Ar f13909d;

    public C1176Br(Context context, ViewGroup viewGroup, InterfaceC4410vt interfaceC4410vt) {
        this.f13906a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f13908c = viewGroup;
        this.f13907b = interfaceC4410vt;
        this.f13909d = null;
    }

    public final C1140Ar a() {
        return this.f13909d;
    }

    public final Integer b() {
        C1140Ar c1140Ar = this.f13909d;
        if (c1140Ar != null) {
            return c1140Ar.v();
        }
        return null;
    }

    public final void c(int i8, int i9, int i10, int i11) {
        Z2.r.e("The underlay may only be modified from the UI thread.");
        C1140Ar c1140Ar = this.f13909d;
        if (c1140Ar != null) {
            c1140Ar.o(i8, i9, i10, i11);
        }
    }

    public final void d(int i8, int i9, int i10, int i11, int i12, boolean z7, Lr lr) {
        if (this.f13909d != null) {
            return;
        }
        AbstractC3946rf.a(this.f13907b.k().a(), this.f13907b.i(), "vpr2");
        Context context = this.f13906a;
        InterfaceC1567Mr interfaceC1567Mr = this.f13907b;
        C1140Ar c1140Ar = new C1140Ar(context, interfaceC1567Mr, i12, z7, interfaceC1567Mr.k().a(), lr);
        this.f13909d = c1140Ar;
        this.f13908c.addView(c1140Ar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f13909d.o(i8, i9, i10, i11);
        this.f13907b.P0(false);
    }

    public final void e() {
        Z2.r.e("onDestroy must be called from the UI thread.");
        C1140Ar c1140Ar = this.f13909d;
        if (c1140Ar != null) {
            c1140Ar.y();
            this.f13908c.removeView(this.f13909d);
            this.f13909d = null;
        }
    }

    public final void f() {
        Z2.r.e("onPause must be called from the UI thread.");
        C1140Ar c1140Ar = this.f13909d;
        if (c1140Ar != null) {
            c1140Ar.E();
        }
    }

    public final void g(int i8) {
        C1140Ar c1140Ar = this.f13909d;
        if (c1140Ar != null) {
            c1140Ar.k(i8);
        }
    }
}
