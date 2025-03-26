package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.dr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ViewTreeObserverOnScrollChangedListenerC2447dr extends AbstractC2556er implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: s, reason: collision with root package name */
    private final WeakReference f21676s;

    public ViewTreeObserverOnScrollChangedListenerC2447dr(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f21676s = new WeakReference(onScrollChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2556er
    protected final void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2556er
    protected final void b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f21676s.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            e();
        }
    }
}
