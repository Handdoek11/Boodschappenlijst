package f5;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import f5.C5788c;
import java.util.Collections;
import java.util.List;
import l5.AbstractC6178d;

/* renamed from: f5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5790e extends RecyclerView.h implements h, C5788c.a {

    /* renamed from: f, reason: collision with root package name */
    protected static final List f35890f = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView.h f35891d;

    /* renamed from: e, reason: collision with root package name */
    private C5788c f35892e;

    public AbstractC5790e(RecyclerView.h hVar) {
        this.f35891d = hVar;
        C5788c c5788c = new C5788c(this, hVar, null);
        this.f35892e = c5788c;
        this.f35891d.a0(c5788c);
        super.b0(this.f35891d.I());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int E() {
        if (e0()) {
            return this.f35891d.E();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long F(int i8) {
        return this.f35891d.F(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int G(int i8) {
        return this.f35891d.G(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void R(RecyclerView recyclerView) {
        if (e0()) {
            this.f35891d.R(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void S(RecyclerView.F f8, int i8) {
        T(f8, i8, f35890f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void T(RecyclerView.F f8, int i8, List list) {
        if (e0()) {
            this.f35891d.T(f8, i8, list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F U(ViewGroup viewGroup, int i8) {
        return this.f35891d.U(viewGroup, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void V(RecyclerView recyclerView) {
        if (e0()) {
            this.f35891d.V(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean W(RecyclerView.F f8) {
        return t(f8, f8.F());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void X(RecyclerView.F f8) {
        r(f8, f8.F());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void Y(RecyclerView.F f8) {
        f(f8, f8.F());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void Z(RecyclerView.F f8) {
        p(f8, f8.F());
    }

    @Override // f5.C5788c.a
    public final void a(RecyclerView.h hVar, Object obj, int i8, int i9, Object obj2) {
        g0(i8, i9, obj2);
    }

    @Override // f5.h
    public void d() {
        C5788c c5788c;
        k0();
        RecyclerView.h hVar = this.f35891d;
        if (hVar != null && (c5788c = this.f35892e) != null) {
            hVar.c0(c5788c);
        }
        this.f35891d = null;
        this.f35892e = null;
    }

    public RecyclerView.h d0() {
        return this.f35891d;
    }

    @Override // f5.h
    public int e(C5787b c5787b, int i8) {
        if (c5787b.f35885a == d0()) {
            return i8;
        }
        return -1;
    }

    public boolean e0() {
        return this.f35891d != null;
    }

    @Override // f5.InterfaceC5792g
    public void f(RecyclerView.F f8, int i8) {
        if (e0()) {
            AbstractC6178d.c(this.f35891d, f8, i8);
        }
    }

    protected void f0() {
        J();
    }

    @Override // f5.C5788c.a
    public final void g(RecyclerView.h hVar, Object obj) {
        f0();
    }

    protected void g0(int i8, int i9, Object obj) {
        O(i8, i9, obj);
    }

    @Override // f5.h
    public void h(List list) {
        RecyclerView.h hVar = this.f35891d;
        if (hVar != null) {
            list.add(hVar);
        }
    }

    protected void h0(int i8, int i9) {
        P(i8, i9);
    }

    protected void i0(int i8, int i9) {
        Q(i8, i9);
    }

    @Override // f5.C5788c.a
    public final void j(RecyclerView.h hVar, Object obj, int i8, int i9, int i10) {
        j0(i8, i9, i10);
    }

    protected void j0(int i8, int i9, int i10) {
        if (i10 == 1) {
            M(i8, i9);
            return;
        }
        throw new IllegalStateException("itemCount should be always 1  (actual: " + i10 + ")");
    }

    @Override // f5.h
    public void k(C5791f c5791f, int i8) {
        c5791f.f35893a = d0();
        c5791f.f35895c = i8;
    }

    @Override // f5.C5788c.a
    public final void m(RecyclerView.h hVar, Object obj, int i8, int i9) {
        h0(i8, i9);
    }

    @Override // f5.InterfaceC5792g
    public void p(RecyclerView.F f8, int i8) {
        if (e0()) {
            AbstractC6178d.d(this.f35891d, f8, i8);
        }
    }

    @Override // f5.InterfaceC5792g
    public void r(RecyclerView.F f8, int i8) {
        if (e0()) {
            AbstractC6178d.b(this.f35891d, f8, i8);
        }
    }

    @Override // f5.InterfaceC5792g
    public boolean t(RecyclerView.F f8, int i8) {
        if (e0() ? AbstractC6178d.a(this.f35891d, f8, i8) : false) {
            return true;
        }
        return super.W(f8);
    }

    @Override // f5.C5788c.a
    public final void y(RecyclerView.h hVar, Object obj, int i8, int i9) {
        i0(i8, i9);
    }

    protected void k0() {
    }
}
