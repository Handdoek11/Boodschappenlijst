package g5;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import h5.f;
import h5.g;
import h5.h;
import z0.X;

/* renamed from: g5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5810c extends AbstractC5808a {

    /* renamed from: h, reason: collision with root package name */
    private boolean f36088h;

    /* renamed from: i, reason: collision with root package name */
    private h f36089i;

    /* renamed from: j, reason: collision with root package name */
    private h5.d f36090j;

    /* renamed from: k, reason: collision with root package name */
    private f f36091k;

    /* renamed from: l, reason: collision with root package name */
    private g f36092l;

    protected AbstractC5810c() {
        k0();
    }

    private void k0() {
        e0();
        if (this.f36089i == null || this.f36090j == null || this.f36091k == null || this.f36092l == null) {
            throw new IllegalStateException("setup incomplete");
        }
    }

    @Override // g5.AbstractC5808a
    public boolean R() {
        return this.f36088h;
    }

    @Override // g5.AbstractC5808a
    public boolean S() {
        if (this.f36088h && !p()) {
            Log.d("ARVGeneralItemAnimator", "dispatchFinishedWhenDone()");
        }
        return super.S();
    }

    protected void b0(RecyclerView.F f8) {
        X.e(f8.f10944a).c();
    }

    protected boolean c0() {
        return this.f36089i.o() || this.f36092l.o() || this.f36091k.o() || this.f36090j.o();
    }

    protected abstract void d0();

    protected abstract void e0();

    protected void f0() {
        boolean o8 = this.f36089i.o();
        boolean o9 = this.f36092l.o();
        boolean o10 = this.f36091k.o();
        boolean o11 = this.f36090j.o();
        long o12 = o8 ? o() : 0L;
        long n8 = o9 ? n() : 0L;
        long m8 = o10 ? m() : 0L;
        if (o8) {
            this.f36089i.w(false, 0L);
        }
        if (o9) {
            this.f36092l.w(o8, o12);
        }
        if (o10) {
            this.f36091k.w(o8, o12);
        }
        if (o11) {
            boolean z7 = o8 || o9 || o10;
            this.f36090j.w(z7, z7 ? o12 + Math.max(n8, m8) : 0L);
        }
    }

    protected void g0(h5.d dVar) {
        this.f36090j = dVar;
    }

    protected void h0(f fVar) {
        this.f36091k = fVar;
    }

    protected void i0(g gVar) {
        this.f36092l = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.F f8) {
        b0(f8);
        this.f36092l.m(f8);
        this.f36091k.m(f8);
        this.f36089i.m(f8);
        this.f36090j.m(f8);
        this.f36092l.k(f8);
        this.f36091k.k(f8);
        this.f36089i.k(f8);
        this.f36090j.k(f8);
        if (this.f36089i.u(f8) && this.f36088h) {
            throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [remove]");
        }
        if (this.f36090j.u(f8) && this.f36088h) {
            throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [add]");
        }
        if (this.f36091k.u(f8) && this.f36088h) {
            throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [change]");
        }
        if (this.f36092l.u(f8) && this.f36088h) {
            throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [move]");
        }
        S();
    }

    protected void j0(h hVar) {
        this.f36089i = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        this.f36092l.i();
        this.f36089i.i();
        this.f36090j.i();
        this.f36091k.i();
        if (p()) {
            this.f36092l.h();
            this.f36090j.h();
            this.f36091k.h();
            this.f36089i.b();
            this.f36092l.b();
            this.f36090j.b();
            this.f36091k.b();
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return this.f36089i.p() || this.f36090j.p() || this.f36091k.p() || this.f36092l.p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        if (c0()) {
            d0();
        }
    }

    @Override // androidx.recyclerview.widget.q
    public boolean w(RecyclerView.F f8) {
        if (this.f36088h) {
            Log.d("ARVGeneralItemAnimator", "animateAdd(id = " + f8.E() + ", position = " + f8.G() + ")");
        }
        return this.f36090j.y(f8);
    }

    @Override // androidx.recyclerview.widget.q
    public boolean x(RecyclerView.F f8, RecyclerView.F f9, int i8, int i9, int i10, int i11) {
        if (f8 == f9) {
            return this.f36092l.y(f8, i8, i9, i10, i11);
        }
        if (this.f36088h) {
            Log.d("ARVGeneralItemAnimator", "animateChange(old.id = " + (f8 != null ? Long.toString(f8.E()) : "-") + ", old.position = " + (f8 != null ? Long.toString(f8.G()) : "-") + ", new.id = " + (f9 != null ? Long.toString(f9.E()) : "-") + ", new.position = " + (f9 != null ? Long.toString(f9.G()) : "-") + ", fromX = " + i8 + ", fromY = " + i9 + ", toX = " + i10 + ", toY = " + i11 + ")");
        }
        return this.f36091k.y(f8, f9, i8, i9, i10, i11);
    }

    @Override // androidx.recyclerview.widget.q
    public boolean y(RecyclerView.F f8, int i8, int i9, int i10, int i11) {
        if (this.f36088h) {
            Log.d("ARVGeneralItemAnimator", "animateMove(id = " + f8.E() + ", position = " + f8.G() + ", fromX = " + i8 + ", fromY = " + i9 + ", toX = " + i10 + ", toY = " + i11 + ")");
        }
        return this.f36092l.y(f8, i8, i9, i10, i11);
    }

    @Override // androidx.recyclerview.widget.q
    public boolean z(RecyclerView.F f8) {
        if (this.f36088h) {
            Log.d("ARVGeneralItemAnimator", "animateRemove(id = " + f8.E() + ", position = " + f8.G() + ")");
        }
        return this.f36089i.y(f8);
    }
}
