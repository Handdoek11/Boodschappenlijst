package z0;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import z0.C7010N;

/* renamed from: z0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7010N {

    /* renamed from: a, reason: collision with root package name */
    private final c f44686a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0.N$a */
    static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final View f44687a;

        a(View view) {
            this.f44687a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // z0.C7010N.c
        void a() {
            final View view = this.f44687a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = view.getRootView().findFocus();
            }
            if (view == null) {
                view = this.f44687a.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: z0.M
                @Override // java.lang.Runnable
                public final void run() {
                    C7010N.a.c(view);
                }
            });
        }
    }

    /* renamed from: z0.N$c */
    private static class c {
        c() {
        }

        abstract void a();
    }

    public C7010N(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f44686a = new b(view);
        } else {
            this.f44686a = new a(view);
        }
    }

    public void a() {
        this.f44686a.a();
    }

    /* renamed from: z0.N$b */
    private static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private View f44688b;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsetsController f44689c;

        b(View view) {
            super(view);
            this.f44688b = view;
        }

        @Override // z0.C7010N.a, z0.C7010N.c
        void a() {
            View view = this.f44688b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f44689c;
            if (windowInsetsController == null) {
                View view2 = this.f44688b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.a();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f44689c = windowInsetsController;
        }
    }

    C7010N(WindowInsetsController windowInsetsController) {
        this.f44686a = new b(windowInsetsController);
    }
}
