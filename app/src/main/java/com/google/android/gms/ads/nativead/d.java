package com.google.android.gms.ads.nativead;

import D2.A;
import D2.C0555y;
import H2.p;
import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.InterfaceC2319ch;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import w2.n;

/* loaded from: classes.dex */
public final class d extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    private final FrameLayout f13141o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC2319ch f13142s;

    public d(Context context) {
        super(context);
        this.f13141o = d(context);
        this.f13142s = e();
    }

    private final FrameLayout d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final InterfaceC2319ch e() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.f13141o;
        return C0555y.a().h(frameLayout.getContext(), this, frameLayout);
    }

    private final void f(String str, View view) {
        InterfaceC2319ch interfaceC2319ch = this.f13142s;
        if (interfaceC2319ch == null) {
            return;
        }
        try {
            interfaceC2319ch.L2(str, BinderC5853b.p2(view));
        } catch (RemoteException e8) {
            p.e("Unable to call setAssetView on delegate", e8);
        }
    }

    protected final View a(String str) {
        InterfaceC2319ch interfaceC2319ch = this.f13142s;
        if (interfaceC2319ch != null) {
            try {
                InterfaceC5852a v7 = interfaceC2319ch.v(str);
                if (v7 != null) {
                    return (View) BinderC5853b.J0(v7);
                }
            } catch (RemoteException e8) {
                p.e("Unable to call getAssetView on delegate", e8);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
        super.bringChildToFront(this.f13141o);
    }

    final /* synthetic */ void b(n nVar) {
        InterfaceC2319ch interfaceC2319ch = this.f13142s;
        if (interfaceC2319ch == null) {
            return;
        }
        try {
            if (nVar == null) {
                interfaceC2319ch.m1(null);
            } else {
                p.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e8) {
            p.e("Unable to call setMediaContent on delegate", e8);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f13141o;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    final /* synthetic */ void c(ImageView.ScaleType scaleType) {
        InterfaceC2319ch interfaceC2319ch = this.f13142s;
        if (interfaceC2319ch == null || scaleType == null) {
            return;
        }
        try {
            interfaceC2319ch.b7(BinderC5853b.p2(scaleType));
        } catch (RemoteException e8) {
            p.e("Unable to call setMediaViewImageScaleType on delegate", e8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f13142s != null) {
            if (((Boolean) A.c().a(AbstractC3184kf.tb)).booleanValue()) {
                try {
                    this.f13142s.l0(BinderC5853b.p2(motionEvent));
                } catch (RemoteException e8) {
                    p.e("Unable to call handleTouchEvent on delegate", e8);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final b getMediaView() {
        View a8 = a("3010");
        if (a8 instanceof b) {
            return (b) a8;
        }
        if (a8 == null) {
            return null;
        }
        p.b("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i8) {
        super.onVisibilityChanged(view, i8);
        InterfaceC2319ch interfaceC2319ch = this.f13142s;
        if (interfaceC2319ch == null) {
            return;
        }
        try {
            interfaceC2319ch.u1(BinderC5853b.p2(view), i8);
        } catch (RemoteException e8) {
            p.e("Unable to call onVisibilityChanged on delegate", e8);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f13141o);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f13141o == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        f("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        f("3005", view);
    }

    public final void setBodyView(View view) {
        f("3004", view);
    }

    public final void setCallToActionView(View view) {
        f("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        InterfaceC2319ch interfaceC2319ch = this.f13142s;
        if (interfaceC2319ch == null) {
            return;
        }
        try {
            interfaceC2319ch.F1(BinderC5853b.p2(view));
        } catch (RemoteException e8) {
            p.e("Unable to call setClickConfirmingView on delegate", e8);
        }
    }

    public final void setHeadlineView(View view) {
        f("3001", view);
    }

    public final void setIconView(View view) {
        f("3003", view);
    }

    public final void setImageView(View view) {
        f("3008", view);
    }

    public final void setMediaView(b bVar) {
        f("3010", bVar);
        if (bVar == null) {
            return;
        }
        bVar.a(new f(this));
        bVar.b(new g(this));
    }

    public void setNativeAd(NativeAd nativeAd) {
        InterfaceC2319ch interfaceC2319ch = this.f13142s;
        if (interfaceC2319ch == null) {
            return;
        }
        try {
            interfaceC2319ch.D4((InterfaceC5852a) nativeAd.d());
        } catch (RemoteException e8) {
            p.e("Unable to call setNativeAd on delegate", e8);
        }
    }

    public final void setPriceView(View view) {
        f("3007", view);
    }

    public final void setStarRatingView(View view) {
        f("3009", view);
    }

    public final void setStoreView(View view) {
        f("3006", view);
    }
}
