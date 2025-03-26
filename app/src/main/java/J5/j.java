package j5;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import f5.AbstractC5790e;
import java.util.List;
import k5.AbstractC6107a;
import l5.AbstractC6179e;
import z0.X;

/* loaded from: classes2.dex */
class j extends AbstractC5790e {

    /* renamed from: g, reason: collision with root package name */
    private g f38325g;

    /* renamed from: h, reason: collision with root package name */
    private C6080c f38326h;

    /* renamed from: i, reason: collision with root package name */
    private long f38327i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f38328j;

    public j(C6080c c6080c, RecyclerView.h hVar) {
        super(hVar);
        this.f38327i = -1L;
        g gVar = (g) AbstractC6179e.a(hVar, g.class);
        this.f38325g = gVar;
        if (gVar == null) {
            throw new IllegalArgumentException("adapter does not implement SwipeableItemAdapter");
        }
        if (c6080c == null) {
            throw new IllegalArgumentException("manager cannot be null");
        }
        this.f38326h = c6080c;
    }

    private void l0() {
        C6080c c6080c = this.f38326h;
        if (c6080c != null) {
            c6080c.e();
        }
    }

    private static boolean m0(int i8, int i9, int i10) {
        return i8 >= i9 && i8 < i9 + i10;
    }

    private static float n0(int i8, int i9) {
        if (i9 != 1 && i9 != 2) {
            return 0.0f;
        }
        if (i8 == 2) {
            return -65536.0f;
        }
        if (i8 == 3) {
            return -65537.0f;
        }
        if (i8 != 4) {
            return i8 != 5 ? 0.0f : 65537.0f;
        }
        return 65536.0f;
    }

    private static float o0(i iVar, boolean z7) {
        return z7 ? iVar.b() : iVar.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void w0(RecyclerView.F f8, int i8) {
        if (f8 instanceof i) {
            i iVar = (i) f8;
            int p8 = iVar.p();
            if (p8 == -1 || ((p8 ^ i8) & Integer.MAX_VALUE) != 0) {
                i8 |= Integer.MIN_VALUE;
            }
            iVar.e(i8);
        }
    }

    private static void x0(i iVar, float f8, boolean z7) {
        if (z7) {
            iVar.n(f8);
        } else {
            iVar.c(f8);
        }
    }

    private boolean y0() {
        C6080c c6080c = this.f38326h;
        return c6080c == null || c6080c.G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f5.AbstractC5790e, androidx.recyclerview.widget.RecyclerView.h
    public void T(RecyclerView.F f8, int i8, List list) {
        i iVar = f8 instanceof i ? (i) f8 : null;
        float o02 = iVar != null ? o0((i) f8, y0()) : 0.0f;
        if (q0()) {
            w0(f8, f8.E() == this.f38327i ? 3 : 1);
            super.T(f8, i8, list);
        } else {
            w0(f8, 0);
            super.T(f8, i8, list);
        }
        if (iVar != null) {
            float o03 = o0(iVar, y0());
            boolean h8 = iVar.h();
            boolean z7 = this.f38326h.z();
            boolean w7 = this.f38326h.w(f8);
            if (o02 == o03 && (z7 || w7)) {
                return;
            }
            this.f38326h.b(f8, i8, o02, o03, h8, y0(), true, z7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f5.AbstractC5790e, androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F U(ViewGroup viewGroup, int i8) {
        RecyclerView.F U7 = super.U(viewGroup, i8);
        if (U7 instanceof i) {
            ((i) U7).e(-1);
        }
        return U7;
    }

    @Override // f5.AbstractC5790e
    protected void f0() {
        if (q0() && !this.f38328j) {
            l0();
        }
        super.f0();
    }

    @Override // f5.AbstractC5790e
    protected void g0(int i8, int i9, Object obj) {
        super.g0(i8, i9, obj);
    }

    @Override // f5.AbstractC5790e
    protected void h0(int i8, int i9) {
        int n8;
        if (q0() && (n8 = this.f38326h.n()) >= i8) {
            this.f38326h.I(n8 + i9);
        }
        super.h0(i8, i9);
    }

    @Override // f5.AbstractC5790e
    protected void i0(int i8, int i9) {
        if (q0()) {
            int n8 = this.f38326h.n();
            if (m0(n8, i8, i9)) {
                l0();
            } else if (i8 < n8) {
                this.f38326h.I(n8 - i9);
            }
        }
        super.i0(i8, i9);
    }

    @Override // f5.AbstractC5790e
    protected void j0(int i8, int i9, int i10) {
        if (q0()) {
            this.f38326h.H();
        }
        super.j0(i8, i9, i10);
    }

    @Override // f5.AbstractC5790e
    protected void k0() {
        super.k0();
        this.f38325g = null;
        this.f38326h = null;
        this.f38327i = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f5.AbstractC5790e, f5.InterfaceC5792g
    public void p(RecyclerView.F f8, int i8) {
        super.p(f8, i8);
        long j8 = this.f38327i;
        if (j8 != -1 && j8 == f8.E()) {
            this.f38326h.e();
        }
        if (f8 instanceof i) {
            C6080c c6080c = this.f38326h;
            if (c6080c != null) {
                c6080c.d(f8);
            }
            i iVar = (i) f8;
            iVar.i(0);
            iVar.m(0);
            iVar.n(0.0f);
            iVar.c(0.0f);
            iVar.k(true);
            View b8 = k.b(iVar);
            if (b8 != null) {
                X.e(b8).c();
                b8.setTranslationX(0.0f);
                b8.setTranslationY(0.0f);
            }
        }
    }

    int p0(RecyclerView.F f8, int i8, int i9, int i10) {
        return this.f38325g.w(f8, i8, i9, i10);
    }

    protected boolean q0() {
        return this.f38327i != -1;
    }

    AbstractC6107a r0(RecyclerView.F f8, int i8, int i9) {
        this.f38327i = -1L;
        g gVar = this.f38325g;
        if (gVar == null) {
            return null;
        }
        return gVar.b(f8, i8, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void s0(RecyclerView.F f8, int i8, int i9, int i10, AbstractC6107a abstractC6107a) {
        i iVar = (i) f8;
        iVar.i(i9);
        iVar.m(i10);
        if (i10 != 3) {
            x0(iVar, n0(i9, i10), y0());
        }
        abstractC6107a.e();
        J();
    }

    void t0(C6080c c6080c, RecyclerView.F f8, int i8, long j8) {
        this.f38327i = j8;
        this.f38328j = true;
        this.f38325g.n(f8, i8);
        this.f38328j = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void u0(RecyclerView.F f8, int i8, float f9, boolean z7, boolean z8, boolean z9) {
        i iVar = (i) f8;
        float a8 = C6080c.a(iVar, z8, f9, z7, iVar.h());
        float f10 = z8 ? a8 : 0.0f;
        if (z8) {
            a8 = 0.0f;
        }
        iVar.o(f10, a8, z9);
    }

    void v0(RecyclerView.F f8, int i8, float f9, boolean z7, boolean z8, boolean z9, int i9) {
        this.f38325g.s(f8, i8, i9);
        u0(f8, i8, f9, z7, z8, z9);
    }
}
