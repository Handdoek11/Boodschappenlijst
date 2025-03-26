package com.google.android.gms.internal.ads;

import D2.C0555y;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.wz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnScrollChangedListenerC4531wz extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: o, reason: collision with root package name */
    private final Context f27700o;

    /* renamed from: s, reason: collision with root package name */
    private View f27701s;

    private ViewTreeObserverOnScrollChangedListenerC4531wz(Context context) {
        super(context);
        this.f27700o = context;
    }

    public static ViewTreeObserverOnScrollChangedListenerC4531wz a(Context context, View view, C3785q60 c3785q60) {
        Resources resources;
        DisplayMetrics displayMetrics;
        ViewTreeObserverOnScrollChangedListenerC4531wz viewTreeObserverOnScrollChangedListenerC4531wz = new ViewTreeObserverOnScrollChangedListenerC4531wz(context);
        if (!c3785q60.f25818u.isEmpty() && (resources = viewTreeObserverOnScrollChangedListenerC4531wz.f27700o.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f8 = ((C3893r60) c3785q60.f25818u.get(0)).f26094a;
            float f9 = displayMetrics.density;
            viewTreeObserverOnScrollChangedListenerC4531wz.setLayoutParams(new FrameLayout.LayoutParams((int) (f8 * f9), (int) (r1.f26095b * f9)));
        }
        viewTreeObserverOnScrollChangedListenerC4531wz.f27701s = view;
        viewTreeObserverOnScrollChangedListenerC4531wz.addView(view);
        C2.v.B();
        C2231br.b(viewTreeObserverOnScrollChangedListenerC4531wz, viewTreeObserverOnScrollChangedListenerC4531wz);
        C2.v.B();
        C2231br.a(viewTreeObserverOnScrollChangedListenerC4531wz, viewTreeObserverOnScrollChangedListenerC4531wz);
        JSONObject jSONObject = c3785q60.f25793h0;
        RelativeLayout relativeLayout = new RelativeLayout(viewTreeObserverOnScrollChangedListenerC4531wz.f27700o);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            viewTreeObserverOnScrollChangedListenerC4531wz.c(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            viewTreeObserverOnScrollChangedListenerC4531wz.c(optJSONObject2, relativeLayout, 12);
        }
        viewTreeObserverOnScrollChangedListenerC4531wz.addView(relativeLayout);
        return viewTreeObserverOnScrollChangedListenerC4531wz;
    }

    private final int b(double d8) {
        C0555y.b();
        return H2.g.B(this.f27700o, (int) d8);
    }

    private final void c(JSONObject jSONObject, RelativeLayout relativeLayout, int i8) {
        TextView textView = new TextView(this.f27700o);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int b8 = b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, b8, 0, b8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i8);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f27701s.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f27701s.setY(-r0[1]);
    }
}
