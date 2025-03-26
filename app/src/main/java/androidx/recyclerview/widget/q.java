package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class q extends RecyclerView.m {

    /* renamed from: g, reason: collision with root package name */
    boolean f11268g = true;

    public final void A(RecyclerView.F f8) {
        I(f8);
        h(f8);
    }

    public final void B(RecyclerView.F f8) {
        J(f8);
    }

    public final void C(RecyclerView.F f8, boolean z7) {
        K(f8, z7);
        h(f8);
    }

    public final void D(RecyclerView.F f8, boolean z7) {
        L(f8, z7);
    }

    public final void E(RecyclerView.F f8) {
        M(f8);
        h(f8);
    }

    public final void F(RecyclerView.F f8) {
        N(f8);
    }

    public final void G(RecyclerView.F f8) {
        O(f8);
        h(f8);
    }

    public final void H(RecyclerView.F f8) {
        P(f8);
    }

    public void I(RecyclerView.F f8) {
    }

    public void J(RecyclerView.F f8) {
    }

    public void K(RecyclerView.F f8, boolean z7) {
    }

    public void L(RecyclerView.F f8, boolean z7) {
    }

    public void M(RecyclerView.F f8) {
    }

    public void N(RecyclerView.F f8) {
    }

    public void O(RecyclerView.F f8) {
    }

    public void P(RecyclerView.F f8) {
    }

    public void Q(boolean z7) {
        this.f11268g = z7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.F f8, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i8;
        int i9;
        return (bVar == null || ((i8 = bVar.f10982a) == (i9 = bVar2.f10982a) && bVar.f10983b == bVar2.f10983b)) ? w(f8) : y(f8, i8, bVar.f10983b, i9, bVar2.f10983b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.F f8, RecyclerView.F f9, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i8;
        int i9;
        int i10 = bVar.f10982a;
        int i11 = bVar.f10983b;
        if (f9.d0()) {
            int i12 = bVar.f10982a;
            i9 = bVar.f10983b;
            i8 = i12;
        } else {
            i8 = bVar2.f10982a;
            i9 = bVar2.f10983b;
        }
        return x(f8, f9, i10, i11, i8, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.F f8, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i8 = bVar.f10982a;
        int i9 = bVar.f10983b;
        View view = f8.f10944a;
        int left = bVar2 == null ? view.getLeft() : bVar2.f10982a;
        int top = bVar2 == null ? view.getTop() : bVar2.f10983b;
        if (f8.P() || (i8 == left && i9 == top)) {
            return z(f8);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(f8, i8, i9, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.F f8, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i8 = bVar.f10982a;
        int i9 = bVar2.f10982a;
        if (i8 != i9 || bVar.f10983b != bVar2.f10983b) {
            return y(f8, i8, bVar.f10983b, i9, bVar2.f10983b);
        }
        E(f8);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.F f8) {
        return !this.f11268g || f8.N();
    }

    public abstract boolean w(RecyclerView.F f8);

    public abstract boolean x(RecyclerView.F f8, RecyclerView.F f9, int i8, int i9, int i10, int i11);

    public abstract boolean y(RecyclerView.F f8, int i8, int i9, int i10, int i11);

    public abstract boolean z(RecyclerView.F f8);
}
