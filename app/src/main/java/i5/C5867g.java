package i5;

import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import f5.AbstractC5790e;
import java.util.List;
import k5.AbstractC6107a;
import k5.C6108b;
import l5.AbstractC6177c;
import l5.AbstractC6179e;

/* renamed from: i5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5867g extends AbstractC5790e implements j5.g {

    /* renamed from: g, reason: collision with root package name */
    private C5873m f36537g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC5864d f36538h;

    /* renamed from: i, reason: collision with root package name */
    private RecyclerView.F f36539i;

    /* renamed from: j, reason: collision with root package name */
    private C5870j f36540j;

    /* renamed from: k, reason: collision with root package name */
    private C5871k f36541k;

    /* renamed from: l, reason: collision with root package name */
    private int f36542l;

    /* renamed from: m, reason: collision with root package name */
    private int f36543m;

    /* renamed from: n, reason: collision with root package name */
    private int f36544n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f36545o;

    public C5867g(C5873m c5873m, RecyclerView.h hVar) {
        super(hVar);
        this.f36542l = -1;
        this.f36543m = -1;
        if (c5873m == null) {
            throw new IllegalArgumentException("manager cannot be null");
        }
        this.f36537g = c5873m;
    }

    private void n0() {
        C5873m c5873m = this.f36537g;
        if (c5873m != null) {
            c5873m.c();
        }
    }

    protected static int o0(int i8, int i9, int i10, int i11) {
        if (i9 < 0 || i10 < 0) {
            return i8;
        }
        if (i11 == 0) {
            return i9 != i10 ? (i8 >= i9 || i8 >= i10) ? (i8 <= i9 || i8 <= i10) ? i10 < i9 ? i8 == i10 ? i9 : i8 - 1 : i8 == i10 ? i9 : i8 + 1 : i8 : i8 : i8;
        }
        if (i11 == 1) {
            return i8 == i10 ? i9 : i8 == i9 ? i10 : i8;
        }
        throw new IllegalStateException("unexpected state");
    }

    private int s0(int i8) {
        return t0() ? o0(i8, this.f36542l, this.f36543m, this.f36544n) : i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void x0(RecyclerView.F f8, int i8) {
        if (f8 instanceof InterfaceC5866f) {
            InterfaceC5866f interfaceC5866f = (InterfaceC5866f) f8;
            int f9 = interfaceC5866f.f();
            if (f9 == -1 || ((f9 ^ i8) & Integer.MAX_VALUE) != 0) {
                i8 |= Integer.MIN_VALUE;
            }
            interfaceC5866f.j(i8);
        }
    }

    private boolean y0() {
        return t0() && !this.f36545o;
    }

    @Override // f5.AbstractC5790e, androidx.recyclerview.widget.RecyclerView.h
    public long F(int i8) {
        return t0() ? super.F(o0(i8, this.f36542l, this.f36543m, this.f36544n)) : super.F(i8);
    }

    @Override // f5.AbstractC5790e, androidx.recyclerview.widget.RecyclerView.h
    public int G(int i8) {
        return t0() ? super.G(o0(i8, this.f36542l, this.f36543m, this.f36544n)) : super.G(i8);
    }

    @Override // f5.AbstractC5790e, androidx.recyclerview.widget.RecyclerView.h
    public void T(RecyclerView.F f8, int i8, List list) {
        if (!t0()) {
            x0(f8, 0);
            super.T(f8, i8, list);
            return;
        }
        long j8 = this.f36540j.f36587c;
        long E7 = f8.E();
        int o02 = o0(i8, this.f36542l, this.f36543m, this.f36544n);
        if (E7 == j8 && f8 != this.f36539i) {
            Log.i("ARVDraggableWrapper", "a new view holder object for the currently dragging item is assigned");
            this.f36539i = f8;
            this.f36537g.N(f8);
        }
        int i9 = E7 == j8 ? 3 : 1;
        if (this.f36541k.a(i8)) {
            i9 |= 4;
        }
        x0(f8, i9);
        super.T(f8, o02, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f5.AbstractC5790e, androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F U(ViewGroup viewGroup, int i8) {
        RecyclerView.F U7 = super.U(viewGroup, i8);
        if (U7 instanceof InterfaceC5866f) {
            ((InterfaceC5866f) U7).j(-1);
        }
        return U7;
    }

    @Override // j5.g
    public AbstractC6107a b(RecyclerView.F f8, int i8, int i9) {
        Object d02 = d0();
        if (!(d02 instanceof j5.g)) {
            return new C6108b();
        }
        return ((j5.g) d02).b(f8, s0(i8), i9);
    }

    @Override // f5.AbstractC5790e
    protected void f0() {
        if (y0()) {
            n0();
        } else {
            super.f0();
        }
    }

    @Override // f5.AbstractC5790e
    protected void h0(int i8, int i9) {
        if (y0()) {
            n0();
        } else {
            super.h0(i8, i9);
        }
    }

    @Override // f5.AbstractC5790e
    protected void i0(int i8, int i9) {
        if (y0()) {
            n0();
        } else {
            super.i0(i8, i9);
        }
    }

    @Override // f5.AbstractC5790e
    protected void j0(int i8, int i9, int i10) {
        if (y0()) {
            n0();
        } else {
            super.j0(i8, i9, i10);
        }
    }

    @Override // f5.AbstractC5790e
    protected void k0() {
        super.k0();
        this.f36539i = null;
        this.f36538h = null;
        this.f36537g = null;
    }

    boolean l0(int i8, int i9) {
        return this.f36538h.x(i8, i9);
    }

    boolean m0(RecyclerView.F f8, int i8, int i9, int i10) {
        InterfaceC5864d interfaceC5864d = (InterfaceC5864d) AbstractC6179e.b(this, InterfaceC5864d.class, i8);
        if (interfaceC5864d == null) {
            return false;
        }
        return interfaceC5864d.o(f8, i8, i9, i10);
    }

    @Override // j5.g
    public void n(RecyclerView.F f8, int i8) {
        Object d02 = d0();
        if (d02 instanceof j5.g) {
            ((j5.g) d02).n(f8, s0(i8));
        }
    }

    @Override // f5.AbstractC5790e, f5.InterfaceC5792g
    public void p(RecyclerView.F f8, int i8) {
        if (t0()) {
            this.f36537g.M(f8);
            this.f36539i = this.f36537g.r();
        }
        super.p(f8, i8);
    }

    int p0() {
        return this.f36543m;
    }

    int q0() {
        return this.f36542l;
    }

    C5871k r0(RecyclerView.F f8, int i8) {
        InterfaceC5864d interfaceC5864d = (InterfaceC5864d) AbstractC6179e.b(this, InterfaceC5864d.class, i8);
        if (interfaceC5864d == null) {
            return null;
        }
        return interfaceC5864d.z(f8, i8);
    }

    @Override // j5.g
    public void s(RecyclerView.F f8, int i8, int i9) {
        Object d02 = d0();
        if (d02 instanceof j5.g) {
            ((j5.g) d02).s(f8, s0(i8), i9);
        }
    }

    protected boolean t0() {
        return this.f36540j != null;
    }

    void u0(int i8, int i9, int i10) {
        int o02 = o0(i8, this.f36542l, this.f36543m, this.f36544n);
        if (o02 == this.f36542l) {
            this.f36543m = i9;
            if (this.f36544n == 0 && AbstractC6177c.x(i10)) {
                M(i8, i9);
                return;
            } else {
                J();
                return;
            }
        }
        throw new IllegalStateException("onMoveItem() - may be a bug or has duplicate IDs  --- mDraggingItemInitialPosition = " + this.f36542l + ", mDraggingItemCurrentPosition = " + this.f36543m + ", origFromPosition = " + o02 + ", fromPosition = " + i8 + ", toPosition = " + i9);
    }

    void v0(int i8, int i9, boolean z7) {
        InterfaceC5864d interfaceC5864d = this.f36538h;
        this.f36542l = -1;
        this.f36543m = -1;
        this.f36541k = null;
        this.f36540j = null;
        this.f36539i = null;
        this.f36538h = null;
        if (z7 && i9 != i8) {
            interfaceC5864d.i(i8, i9);
        }
        interfaceC5864d.v(i8, i9, z7);
    }

    @Override // j5.g
    public int w(RecyclerView.F f8, int i8, int i9, int i10) {
        Object d02 = d0();
        if (!(d02 instanceof j5.g)) {
            return 0;
        }
        return ((j5.g) d02).w(f8, s0(i8), i9, i10);
    }

    void w0() {
        this.f36545o = true;
        this.f36538h.q(q0());
        this.f36545o = false;
    }

    void z0(C5870j c5870j, RecyclerView.F f8, C5871k c5871k, int i8, int i9) {
        if (f8.E() == -1) {
            throw new IllegalStateException("dragging target must provides valid ID");
        }
        InterfaceC5864d interfaceC5864d = (InterfaceC5864d) AbstractC6179e.b(this, InterfaceC5864d.class, i8);
        this.f36538h = interfaceC5864d;
        if (interfaceC5864d == null) {
            throw new IllegalStateException("DraggableItemAdapter not found!");
        }
        this.f36543m = i8;
        this.f36542l = i8;
        this.f36540j = c5870j;
        this.f36539i = f8;
        this.f36541k = c5871k;
        this.f36544n = i9;
    }
}
