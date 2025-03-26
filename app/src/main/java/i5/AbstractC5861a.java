package i5;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import z0.C7026g0;
import z0.InterfaceC7028h0;
import z0.X;

/* renamed from: i5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5861a extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    private int f36520a = 200;

    /* renamed from: b, reason: collision with root package name */
    private final int f36521b;

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f36522c;

    /* renamed from: d, reason: collision with root package name */
    protected final RecyclerView f36523d;

    /* renamed from: e, reason: collision with root package name */
    protected RecyclerView.F f36524e;

    public AbstractC5861a(RecyclerView recyclerView, RecyclerView.F f8) {
        this.f36523d = recyclerView;
        this.f36524e = f8;
        this.f36521b = (int) ((recyclerView.getResources().getDisplayMetrics().density * 2.0f) + 0.5f);
    }

    protected static void l(View view, float f8) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        X.H0(view, f8);
        view.setAlpha(1.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    protected static void m(RecyclerView recyclerView, RecyclerView.F f8, float f9, float f10) {
        RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.j(f8);
        }
        f8.f10944a.setTranslationX(f9);
        f8.f10944a.setTranslationY(f10);
    }

    protected float j(View view, float f8, float f9, float f10, float f11) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float abs = width > 0 ? Math.abs(translationX / width) : 0.0f;
        float abs2 = height > 0 ? Math.abs(translationY / height) : 0.0f;
        return Math.min(Math.max(Math.max(Math.max(Math.max(Math.max(0.0f, abs), abs2), Math.abs(Math.max(f8, f9) - 1.0f)), Math.abs(f10 * 0.033333335f)), Math.abs(f11 - 1.0f)), 1.0f);
    }

    protected void k(View view, float f8, float f9, float f10, float f11, boolean z7) {
        float I7 = X.I(view);
        int j8 = (int) (this.f36520a * j(view, f8, f9, f10, f11));
        if (!z7 || j8 <= 20) {
            l(view, I7);
            return;
        }
        C7026g0 e8 = X.e(view);
        view.setScaleX(f8);
        view.setScaleY(f9);
        view.setRotation(f10);
        view.setAlpha(f11);
        X.H0(view, I7 + 1.0f);
        e8.c();
        e8.i(j8);
        e8.j(this.f36522c);
        e8.p(0.0f);
        e8.q(0.0f);
        e8.r(I7);
        e8.b(1.0f);
        e8.f(0.0f);
        e8.g(1.0f);
        e8.h(1.0f);
        e8.k(new C0270a(I7));
        e8.o();
    }

    public void n(int i8) {
        this.f36520a = i8;
    }

    public void o(Interpolator interpolator) {
        this.f36522c = interpolator;
    }

    /* renamed from: i5.a$a, reason: collision with other inner class name */
    class C0270a implements InterfaceC7028h0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f36525a;

        C0270a(float f8) {
            this.f36525a = f8;
        }

        @Override // z0.InterfaceC7028h0
        public void b(View view) {
            X.e(view).k(null);
            AbstractC5861a.l(view, this.f36525a);
            if (view.getParent() instanceof RecyclerView) {
                X.e0((RecyclerView) view.getParent());
            }
        }

        @Override // z0.InterfaceC7028h0
        public void a(View view) {
        }

        @Override // z0.InterfaceC7028h0
        public void c(View view) {
        }
    }
}
