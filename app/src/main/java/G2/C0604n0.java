package G2;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.C2231br;

/* renamed from: G2.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604n0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f2654a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f2655b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2656c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2657d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2658e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f2659f;

    public C0604n0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f2655b = activity;
        this.f2654a = view;
        this.f2659f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void g() {
        if (this.f2656c) {
            return;
        }
        Activity activity = this.f2655b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f2659f;
            ViewTreeObserver f8 = f(activity);
            if (f8 != null) {
                f8.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f2654a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f2659f;
        C2.v.B();
        C2231br.a(view, onGlobalLayoutListener2);
        this.f2656c = true;
    }

    private final void h() {
        Activity activity = this.f2655b;
        if (activity != null && this.f2656c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f2659f;
            ViewTreeObserver f8 = f(activity);
            if (f8 != null) {
                f8.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f2656c = false;
        }
    }

    public final void a() {
        this.f2658e = false;
        h();
    }

    public final void b() {
        this.f2658e = true;
        if (this.f2657d) {
            g();
        }
    }

    public final void c() {
        this.f2657d = true;
        if (this.f2658e) {
            g();
        }
    }

    public final void d() {
        this.f2657d = false;
        h();
    }

    public final void e(Activity activity) {
        this.f2655b = activity;
    }
}
