package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.cr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC2339cr extends AbstractC2556er implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: s, reason: collision with root package name */
    private final WeakReference f21297s;

    public ViewTreeObserverOnGlobalLayoutListenerC2339cr(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f21297s = new WeakReference(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2556er
    protected final void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2556er
    protected final void b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f21297s.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            e();
        }
    }
}
