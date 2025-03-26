package com.google.android.gms.internal.ads;

import D2.C0555y;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class FJ {

    /* renamed from: a, reason: collision with root package name */
    private final C2508eM f15123a;

    /* renamed from: b, reason: collision with root package name */
    private final C4030sL f15124b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f15125c = null;

    public FJ(C2508eM c2508eM, C4030sL c4030sL) {
        this.f15123a = c2508eM;
        this.f15124b = c4030sL;
    }

    private static final int f(Context context, String str, int i8) {
        try {
            i8 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        C0555y.b();
        return H2.g.B(context, i8);
    }

    public final View a(final View view, final WindowManager windowManager) {
        InterfaceC4410vt a8 = this.f15123a.a(D2.c2.C0(), null, null);
        a8.M().setVisibility(4);
        a8.M().setContentDescription("policy_validator");
        a8.Z0("/sendMessageToSdk", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.yJ
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, Map map) {
                this.f28066a.b((InterfaceC4410vt) obj, map);
            }
        });
        a8.Z0("/hideValidatorOverlay", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.zJ
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, Map map) {
                this.f28586a.c(windowManager, view, (InterfaceC4410vt) obj, map);
            }
        });
        a8.Z0("/open", new C2323cj(null, null, null, null, null));
        this.f15124b.m(new WeakReference(a8), "/loadNativeAdPolicyViolations", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.AJ
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, Map map) {
                this.f13538a.d(view, windowManager, (InterfaceC4410vt) obj, map);
            }
        });
        this.f15124b.m(new WeakReference(a8), "/showValidatorOverlay", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.BJ
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, Map map) {
                H2.p.b("Show native ad policy validator overlay.");
                ((InterfaceC4410vt) obj).M().setVisibility(0);
            }
        });
        return a8.M();
    }

    final /* synthetic */ void b(InterfaceC4410vt interfaceC4410vt, Map map) {
        this.f15124b.j("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(WindowManager windowManager, View view, InterfaceC4410vt interfaceC4410vt, Map map) {
        H2.p.b("Hide native ad policy validator overlay.");
        interfaceC4410vt.M().setVisibility(8);
        if (interfaceC4410vt.M().getWindowToken() != null) {
            windowManager.removeView(interfaceC4410vt.M());
        }
        interfaceC4410vt.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f15125c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f15125c);
    }

    final /* synthetic */ void d(final View view, final WindowManager windowManager, final InterfaceC4410vt interfaceC4410vt, final Map map) {
        interfaceC4410vt.L().i0(new InterfaceC3541nu() { // from class: com.google.android.gms.internal.ads.CJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3541nu
            public final void a(boolean z7, int i8, String str, String str2) {
                this.f14152o.e(map, z7, i8, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int f8 = f(context, (String) map.get("validator_width"), ((Integer) D2.A.c().a(AbstractC3184kf.W7)).intValue());
        int f9 = f(context, (String) map.get("validator_height"), ((Integer) D2.A.c().a(AbstractC3184kf.X7)).intValue());
        int f10 = f(context, (String) map.get("validator_x"), 0);
        int f11 = f(context, (String) map.get("validator_y"), 0);
        interfaceC4410vt.i1(C3976ru.b(f8, f9));
        try {
            interfaceC4410vt.A().getSettings().setUseWideViewPort(((Boolean) D2.A.c().a(AbstractC3184kf.Y7)).booleanValue());
            interfaceC4410vt.A().getSettings().setLoadWithOverviewMode(((Boolean) D2.A.c().a(AbstractC3184kf.Z7)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams b8 = G2.X.b();
        b8.x = f10;
        b8.y = f11;
        windowManager.updateViewLayout(interfaceC4410vt.M(), b8);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i8 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - f11;
            this.f15125c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.EJ
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        InterfaceC4410vt interfaceC4410vt2 = interfaceC4410vt;
                        if (interfaceC4410vt2.M().getWindowToken() == null) {
                            return;
                        }
                        int i9 = i8;
                        WindowManager.LayoutParams layoutParams = b8;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i9;
                        } else {
                            layoutParams.y = rect2.top - i9;
                        }
                        windowManager.updateViewLayout(interfaceC4410vt2.M(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f15125c);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        interfaceC4410vt.loadUrl(str2);
    }

    final /* synthetic */ void e(Map map, boolean z7, int i8, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f15124b.j("sendMessageToNativeJs", hashMap);
    }
}
