package i5;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import z0.X;

/* renamed from: i5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5862b extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    private RecyclerView f36527a;

    /* renamed from: b, reason: collision with root package name */
    private EdgeEffect f36528b;

    /* renamed from: c, reason: collision with root package name */
    private EdgeEffect f36529c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36530d;

    /* renamed from: e, reason: collision with root package name */
    private int f36531e;

    /* renamed from: f, reason: collision with root package name */
    private int f36532f;

    public AbstractC5862b(RecyclerView recyclerView) {
        this.f36527a = recyclerView;
    }

    private static boolean j(Canvas canvas, RecyclerView recyclerView, int i8, EdgeEffect edgeEffect) {
        if (edgeEffect.isFinished()) {
            return false;
        }
        int save = canvas.save();
        boolean n8 = n(recyclerView);
        if (i8 == 0) {
            canvas.rotate(-90.0f);
            if (n8) {
                canvas.translate((-recyclerView.getHeight()) + recyclerView.getPaddingTop(), recyclerView.getPaddingLeft());
            } else {
                canvas.translate(-recyclerView.getHeight(), 0.0f);
            }
        } else if (i8 != 1) {
            if (i8 == 2) {
                canvas.rotate(90.0f);
                if (n8) {
                    canvas.translate(recyclerView.getPaddingTop(), (-recyclerView.getWidth()) + recyclerView.getPaddingRight());
                } else {
                    canvas.translate(0.0f, -recyclerView.getWidth());
                }
            } else if (i8 == 3) {
                canvas.rotate(180.0f);
                if (n8) {
                    canvas.translate((-recyclerView.getWidth()) + recyclerView.getPaddingRight(), (-recyclerView.getHeight()) + recyclerView.getPaddingBottom());
                } else {
                    canvas.translate(-recyclerView.getWidth(), -recyclerView.getHeight());
                }
            }
        } else if (n8) {
            canvas.translate(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop());
        }
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private void k(RecyclerView recyclerView) {
        if (this.f36528b == null) {
            this.f36528b = new EdgeEffect(recyclerView.getContext());
        }
        u(recyclerView, this.f36528b, this.f36531e);
    }

    private void l(RecyclerView recyclerView) {
        if (this.f36529c == null) {
            this.f36529c = new EdgeEffect(recyclerView.getContext());
        }
        u(recyclerView, this.f36529c, this.f36532f);
    }

    private static boolean n(RecyclerView recyclerView) {
        return recyclerView.getLayoutManager().R();
    }

    private static void u(RecyclerView recyclerView, EdgeEffect edgeEffect, int i8) {
        int measuredWidth = recyclerView.getMeasuredWidth();
        int measuredHeight = recyclerView.getMeasuredHeight();
        if (n(recyclerView)) {
            measuredWidth -= recyclerView.getPaddingLeft() + recyclerView.getPaddingRight();
            measuredHeight -= recyclerView.getPaddingTop() + recyclerView.getPaddingBottom();
        }
        int max = Math.max(0, measuredWidth);
        int max2 = Math.max(0, measuredHeight);
        if (i8 == 0 || i8 == 2) {
            max = max2;
            max2 = max;
        }
        edgeEffect.setSize(max, max2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
        EdgeEffect edgeEffect = this.f36528b;
        boolean j8 = edgeEffect != null ? j(canvas, recyclerView, this.f36531e, edgeEffect) : false;
        EdgeEffect edgeEffect2 = this.f36529c;
        if (edgeEffect2 != null) {
            j8 |= j(canvas, recyclerView, this.f36532f, edgeEffect2);
        }
        if (j8) {
            X.e0(recyclerView);
        }
    }

    public void m() {
        if (this.f36530d) {
            this.f36527a.j1(this);
        }
        r();
        this.f36527a = null;
        this.f36530d = false;
    }

    protected abstract int o(int i8);

    public void p(float f8) {
        k(this.f36527a);
        androidx.core.widget.d.c(this.f36528b, f8, 0.5f);
        X.e0(this.f36527a);
    }

    public void q(float f8) {
        l(this.f36527a);
        androidx.core.widget.d.c(this.f36529c, f8, 0.5f);
        X.e0(this.f36527a);
    }

    public void r() {
        boolean z7;
        EdgeEffect edgeEffect = this.f36528b;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z7 = this.f36528b.isFinished();
        } else {
            z7 = false;
        }
        EdgeEffect edgeEffect2 = this.f36529c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z7 |= this.f36529c.isFinished();
        }
        if (z7) {
            X.e0(this.f36527a);
        }
    }

    public void s() {
        if (this.f36530d) {
            this.f36527a.j1(this);
            this.f36527a.j(this);
        }
    }

    public void t() {
        if (this.f36530d) {
            return;
        }
        this.f36531e = o(0);
        this.f36532f = o(1);
        this.f36527a.j(this);
        this.f36530d = true;
    }
}
