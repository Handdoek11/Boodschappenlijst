package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* renamed from: com.google.android.gms.internal.ads.jM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3051jM {

    /* renamed from: a, reason: collision with root package name */
    private Context f23248a;

    /* renamed from: b, reason: collision with root package name */
    private PopupWindow f23249b;

    public final void a(Context context, View view) {
        PopupWindow popupWindow;
        if (!f3.m.d() || f3.m.f()) {
            return;
        }
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            popupWindow = null;
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(view, -1, -1);
            popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            H2.p.b("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
            }
        }
        this.f23249b = popupWindow;
        if (popupWindow == null) {
            context = null;
        }
        this.f23248a = context;
    }

    public final void b() {
        PopupWindow popupWindow;
        Context context = this.f23248a;
        if (context == null || this.f23249b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && (popupWindow = this.f23249b) != null && popupWindow.isShowing()) {
            this.f23249b.dismiss();
        }
        this.f23248a = null;
        this.f23249b = null;
    }
}
