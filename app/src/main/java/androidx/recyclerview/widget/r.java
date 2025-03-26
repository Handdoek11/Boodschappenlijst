package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class r extends RecyclerView.s {

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f11269a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f11270b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView.u f11271c = new a();

    class a extends RecyclerView.u {

        /* renamed from: a, reason: collision with root package name */
        boolean f11272a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i8) {
            super.a(recyclerView, i8);
            if (i8 == 0 && this.f11272a) {
                this.f11272a = false;
                r.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i8, int i9) {
            if (i8 == 0 && i9 == 0) {
                return;
            }
            this.f11272a = true;
        }
    }

    private void e() {
        this.f11269a.l1(this.f11271c);
        this.f11269a.setOnFlingListener(null);
    }

    private void h() {
        if (this.f11269a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f11269a.n(this.f11271c);
        this.f11269a.setOnFlingListener(this);
    }

    private boolean i(RecyclerView.p pVar, int i8, int i9) {
        RecyclerView.A d8;
        int g8;
        if (!(pVar instanceof RecyclerView.A.b) || (d8 = d(pVar)) == null || (g8 = g(pVar, i8, i9)) == -1) {
            return false;
        }
        d8.p(g8);
        pVar.N1(d8);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i8, int i9) {
        RecyclerView.p layoutManager = this.f11269a.getLayoutManager();
        if (layoutManager == null || this.f11269a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f11269a.getMinFlingVelocity();
        return (Math.abs(i9) > minFlingVelocity || Math.abs(i8) > minFlingVelocity) && i(layoutManager, i8, i9);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f11269a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f11269a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f11270b = new Scroller(this.f11269a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    protected abstract RecyclerView.A d(RecyclerView.p pVar);

    public abstract View f(RecyclerView.p pVar);

    public abstract int g(RecyclerView.p pVar, int i8, int i9);

    void j() {
        RecyclerView.p layoutManager;
        View f8;
        RecyclerView recyclerView = this.f11269a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f8 = f(layoutManager)) == null) {
            return;
        }
        int[] c8 = c(layoutManager, f8);
        int i8 = c8[0];
        if (i8 == 0 && c8[1] == 0) {
            return;
        }
        this.f11269a.z1(i8, c8[1]);
    }
}
