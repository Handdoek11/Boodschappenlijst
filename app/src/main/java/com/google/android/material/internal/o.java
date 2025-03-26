package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import o0.AbstractC6278a;
import z0.C7061y0;
import z0.InterfaceC7004H;
import z0.X;
import z0.X0;

/* loaded from: classes2.dex */
public abstract class o {

    class a implements InterfaceC7004H {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f32146a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f32147b;

        a(c cVar, d dVar) {
            this.f32146a = cVar;
            this.f32147b = dVar;
        }

        @Override // z0.InterfaceC7004H
        public C7061y0 a(View view, C7061y0 c7061y0) {
            return this.f32146a.a(view, c7061y0, new d(this.f32147b));
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            X.k0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        C7061y0 a(View view, C7061y0 c7061y0, d dVar);
    }

    public static void b(View view, c cVar) {
        X.A0(view, new a(cVar, new d(X.E(view), view.getPaddingTop(), X.D(view), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i8) {
        return TypedValue.applyDimension(1, i8, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList f8 = com.google.android.material.drawable.d.f(view.getBackground());
        if (f8 != null) {
            return Integer.valueOf(f8.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) AbstractC6278a.i(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float f8 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f8 += X.u((View) parent);
        }
        return f8;
    }

    public static boolean g(View view) {
        return X.z(view) == 1;
    }

    public static PorterDuff.Mode i(int i8, PorterDuff.Mode mode) {
        if (i8 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i8 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i8 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i8) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void j(View view) {
        if (X.Q(view)) {
            X.k0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void k(final View view, final boolean z7) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.n
            @Override // java.lang.Runnable
            public final void run() {
                o.l(view, z7);
            }
        });
    }

    public static void l(View view, boolean z7) {
        X0 J7;
        if (!z7 || (J7 = X.J(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            J7.c(C7061y0.l.a());
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f32148a;

        /* renamed from: b, reason: collision with root package name */
        public int f32149b;

        /* renamed from: c, reason: collision with root package name */
        public int f32150c;

        /* renamed from: d, reason: collision with root package name */
        public int f32151d;

        public d(int i8, int i9, int i10, int i11) {
            this.f32148a = i8;
            this.f32149b = i9;
            this.f32150c = i10;
            this.f32151d = i11;
        }

        public d(d dVar) {
            this.f32148a = dVar.f32148a;
            this.f32149b = dVar.f32149b;
            this.f32150c = dVar.f32150c;
            this.f32151d = dVar.f32151d;
        }
    }
}
