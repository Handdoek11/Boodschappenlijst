package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.Collections;

/* loaded from: classes.dex */
public final class SK extends AbstractBinderC1979Yj implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceC1449Jg {

    /* renamed from: o, reason: collision with root package name */
    private View f18864o;

    /* renamed from: s, reason: collision with root package name */
    private D2.Y0 f18865s;

    /* renamed from: t, reason: collision with root package name */
    private CI f18866t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f18867u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f18868v = false;

    public SK(CI ci, HI hi) {
        this.f18864o = hi.S();
        this.f18865s = hi.W();
        this.f18866t = ci;
        if (hi.f0() != null) {
            hi.f0().m0(this);
        }
    }

    private final void e() {
        View view = this.f18864o;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f18864o);
        }
    }

    private final void g() {
        View view;
        CI ci = this.f18866t;
        if (ci == null || (view = this.f18864o) == null) {
            return;
        }
        ci.j(view, Collections.emptyMap(), Collections.emptyMap(), CI.H(this.f18864o));
    }

    private static final void t7(InterfaceC2325ck interfaceC2325ck, int i8) {
        try {
            interfaceC2325ck.D(i8);
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2014Zj
    public final void Y0(InterfaceC5852a interfaceC5852a, InterfaceC2325ck interfaceC2325ck) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        if (this.f18867u) {
            H2.p.d("Instream ad can not be shown after destroy().");
            t7(interfaceC2325ck, 2);
            return;
        }
        View view = this.f18864o;
        if (view == null || this.f18865s == null) {
            H2.p.d("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            t7(interfaceC2325ck, 0);
            return;
        }
        if (this.f18868v) {
            H2.p.d("Instream ad should not be used again.");
            t7(interfaceC2325ck, 1);
            return;
        }
        this.f18868v = true;
        e();
        ((ViewGroup) BinderC5853b.J0(interfaceC5852a)).addView(this.f18864o, new ViewGroup.LayoutParams(-1, -1));
        C2.v.B();
        C2231br.a(this.f18864o, this);
        C2.v.B();
        C2231br.b(this.f18864o, this);
        g();
        try {
            interfaceC2325ck.c();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2014Zj
    public final InterfaceC1833Ug a() {
        Z2.r.e("#008 Must be called on the main UI thread.");
        if (this.f18867u) {
            H2.p.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        CI ci = this.f18866t;
        if (ci == null || ci.Q() == null) {
            return null;
        }
        return ci.Q().a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2014Zj
    public final void d() {
        Z2.r.e("#008 Must be called on the main UI thread.");
        e();
        CI ci = this.f18866t;
        if (ci != null) {
            ci.a();
        }
        this.f18866t = null;
        this.f18864o = null;
        this.f18865s = null;
        this.f18867u = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        g();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2014Zj
    public final D2.Y0 zzb() {
        Z2.r.e("#008 Must be called on the main UI thread.");
        if (!this.f18867u) {
            return this.f18865s;
        }
        H2.p.d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2014Zj
    public final void zze(InterfaceC5852a interfaceC5852a) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        Y0(interfaceC5852a, new RK(this));
    }
}
