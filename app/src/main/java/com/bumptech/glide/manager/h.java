package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.load.resource.bitmap.y;
import d2.AbstractC5710l;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    final Set f12978a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f12979b;

    class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f12980o;

        /* renamed from: com.bumptech.glide.manager.h$a$a, reason: collision with other inner class name */
        class RunnableC0222a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f12982o;

            RunnableC0222a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f12982o = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                y.b().h();
                h.this.f12979b = true;
                h.b(a.this.f12980o, this.f12982o);
                h.this.f12978a.clear();
            }
        }

        a(View view) {
            this.f12980o = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AbstractC5710l.v(new RunnableC0222a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // com.bumptech.glide.manager.i
    public void a(Activity activity) {
        if (!this.f12979b && this.f12978a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
