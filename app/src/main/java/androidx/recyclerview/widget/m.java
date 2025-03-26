package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.p f11258a;

    /* renamed from: b, reason: collision with root package name */
    private int f11259b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f11260c;

    class a extends m {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.m
        public int d(View view) {
            return this.f11258a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f11258a.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f11258a.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int g(View view) {
            return this.f11258a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int h() {
            return this.f11258a.s0();
        }

        @Override // androidx.recyclerview.widget.m
        public int i() {
            return this.f11258a.s0() - this.f11258a.j0();
        }

        @Override // androidx.recyclerview.widget.m
        public int j() {
            return this.f11258a.j0();
        }

        @Override // androidx.recyclerview.widget.m
        public int k() {
            return this.f11258a.t0();
        }

        @Override // androidx.recyclerview.widget.m
        public int l() {
            return this.f11258a.c0();
        }

        @Override // androidx.recyclerview.widget.m
        public int m() {
            return this.f11258a.i0();
        }

        @Override // androidx.recyclerview.widget.m
        public int n() {
            return (this.f11258a.s0() - this.f11258a.i0()) - this.f11258a.j0();
        }

        @Override // androidx.recyclerview.widget.m
        public int p(View view) {
            this.f11258a.r0(view, true, this.f11260c);
            return this.f11260c.right;
        }

        @Override // androidx.recyclerview.widget.m
        public int q(View view) {
            this.f11258a.r0(view, true, this.f11260c);
            return this.f11260c.left;
        }

        @Override // androidx.recyclerview.widget.m
        public void r(int i8) {
            this.f11258a.G0(i8);
        }
    }

    class b extends m {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.m
        public int d(View view) {
            return this.f11258a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f11258a.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f11258a.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int g(View view) {
            return this.f11258a.Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int h() {
            return this.f11258a.b0();
        }

        @Override // androidx.recyclerview.widget.m
        public int i() {
            return this.f11258a.b0() - this.f11258a.h0();
        }

        @Override // androidx.recyclerview.widget.m
        public int j() {
            return this.f11258a.h0();
        }

        @Override // androidx.recyclerview.widget.m
        public int k() {
            return this.f11258a.c0();
        }

        @Override // androidx.recyclerview.widget.m
        public int l() {
            return this.f11258a.t0();
        }

        @Override // androidx.recyclerview.widget.m
        public int m() {
            return this.f11258a.k0();
        }

        @Override // androidx.recyclerview.widget.m
        public int n() {
            return (this.f11258a.b0() - this.f11258a.k0()) - this.f11258a.h0();
        }

        @Override // androidx.recyclerview.widget.m
        public int p(View view) {
            this.f11258a.r0(view, true, this.f11260c);
            return this.f11260c.bottom;
        }

        @Override // androidx.recyclerview.widget.m
        public int q(View view) {
            this.f11258a.r0(view, true, this.f11260c);
            return this.f11260c.top;
        }

        @Override // androidx.recyclerview.widget.m
        public void r(int i8) {
            this.f11258a.H0(i8);
        }
    }

    /* synthetic */ m(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static m a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static m b(RecyclerView.p pVar, int i8) {
        if (i8 == 0) {
            return a(pVar);
        }
        if (i8 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static m c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f11259b) {
            return 0;
        }
        return n() - this.f11259b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i8);

    public void s() {
        this.f11259b = n();
    }

    private m(RecyclerView.p pVar) {
        this.f11259b = Integer.MIN_VALUE;
        this.f11260c = new Rect();
        this.f11258a = pVar;
    }
}
