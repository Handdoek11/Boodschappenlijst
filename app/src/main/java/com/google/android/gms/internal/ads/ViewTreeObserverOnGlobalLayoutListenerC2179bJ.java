package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2179bJ extends AbstractBinderC2754gh implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, HJ {

    /* renamed from: o, reason: collision with root package name */
    private final WeakReference f20846o;

    /* renamed from: s, reason: collision with root package name */
    private final Map f20847s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    private final Map f20848t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    private final Map f20849u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    private CI f20850v;

    /* renamed from: w, reason: collision with root package name */
    private ViewOnAttachStateChangeListenerC4810zb f20851w;

    public ViewTreeObserverOnGlobalLayoutListenerC2179bJ(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        C2.v.B();
        C2231br.a(view, this);
        C2.v.B();
        C2231br.b(view, this);
        this.f20846o = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f20847s.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f20849u.putAll(this.f20847s);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f20848t.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f20849u.putAll(this.f20848t);
        this.f20851w = new ViewOnAttachStateChangeListenerC4810zb(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2863hh
    public final synchronized void N0(InterfaceC5852a interfaceC5852a) {
        try {
            if (this.f20850v != null) {
                Object J02 = BinderC5853b.J0(interfaceC5852a);
                if (!(J02 instanceof View)) {
                    H2.p.g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.f20850v.w((View) J02);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized View Q(String str) {
        WeakReference weakReference = (WeakReference) this.f20849u.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final View c() {
        return (View) this.f20846o.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2863hh
    public final synchronized void d() {
        CI ci = this.f20850v;
        if (ci != null) {
            ci.C(this);
            this.f20850v = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final FrameLayout e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final ViewOnAttachStateChangeListenerC4810zb f() {
        return this.f20851w;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized InterfaceC5852a h() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized String i() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized Map j() {
        return this.f20849u;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized Map k() {
        return this.f20847s;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized Map l() {
        return this.f20848t;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized JSONObject o() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        CI ci = this.f20850v;
        if (ci != null) {
            ci.l(view, c(), j(), k(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        CI ci = this.f20850v;
        if (ci != null) {
            ci.j(c(), j(), k(), CI.H(c()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        CI ci = this.f20850v;
        if (ci != null) {
            ci.j(c(), j(), k(), CI.H(c()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        CI ci = this.f20850v;
        if (ci != null) {
            ci.u(view, motionEvent, c());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized JSONObject p() {
        CI ci = this.f20850v;
        if (ci == null) {
            return null;
        }
        return ci.X(c(), j(), k());
    }

    @Override // com.google.android.gms.internal.ads.HJ
    public final synchronized void p2(String str, View view, boolean z7) {
        this.f20849u.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f20847s.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2863hh
    public final synchronized void t3(InterfaceC5852a interfaceC5852a) {
        Object J02 = BinderC5853b.J0(interfaceC5852a);
        if (!(J02 instanceof CI)) {
            H2.p.g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        CI ci = this.f20850v;
        if (ci != null) {
            ci.C(this);
        }
        CI ci2 = (CI) J02;
        if (!ci2.D()) {
            H2.p.d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f20850v = ci2;
        ci2.B(this);
        this.f20850v.t(c());
    }
}
