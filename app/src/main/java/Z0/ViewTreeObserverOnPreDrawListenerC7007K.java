package z0;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: z0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC7007K implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    private final View f44681o;

    /* renamed from: s, reason: collision with root package name */
    private ViewTreeObserver f44682s;

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f44683t;

    private ViewTreeObserverOnPreDrawListenerC7007K(View view, Runnable runnable) {
        this.f44681o = view;
        this.f44682s = view.getViewTreeObserver();
        this.f44683t = runnable;
    }

    public static ViewTreeObserverOnPreDrawListenerC7007K a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC7007K viewTreeObserverOnPreDrawListenerC7007K = new ViewTreeObserverOnPreDrawListenerC7007K(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC7007K);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC7007K);
        return viewTreeObserverOnPreDrawListenerC7007K;
    }

    public void b() {
        if (this.f44682s.isAlive()) {
            this.f44682s.removeOnPreDrawListener(this);
        } else {
            this.f44681o.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f44681o.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f44683t.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f44682s = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
