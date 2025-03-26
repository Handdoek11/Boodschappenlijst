package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.er, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2556er {

    /* renamed from: o, reason: collision with root package name */
    private final WeakReference f21900o;

    public AbstractC2556er(View view) {
        this.f21900o = new WeakReference(view);
    }

    protected abstract void a(ViewTreeObserver viewTreeObserver);

    protected abstract void b(ViewTreeObserver viewTreeObserver);

    protected final ViewTreeObserver c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f21900o.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void d() {
        ViewTreeObserver c8 = c();
        if (c8 != null) {
            a(c8);
        }
    }

    public final void e() {
        ViewTreeObserver c8 = c();
        if (c8 != null) {
            b(c8);
        }
    }
}
