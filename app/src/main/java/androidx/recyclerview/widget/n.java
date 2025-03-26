package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class n extends r {

    /* renamed from: d, reason: collision with root package name */
    private m f11261d;

    /* renamed from: e, reason: collision with root package name */
    private m f11262e;

    class a extends j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.RecyclerView.A
        protected void o(View view, RecyclerView.B b8, RecyclerView.A.a aVar) {
            n nVar = n.this;
            int[] c8 = nVar.c(nVar.f11269a.getLayoutManager(), view);
            int i8 = c8[0];
            int i9 = c8[1];
            int w7 = w(Math.max(Math.abs(i8), Math.abs(i9)));
            if (w7 > 0) {
                aVar.d(i8, i9, w7, this.f11250j);
            }
        }

        @Override // androidx.recyclerview.widget.j
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.j
        protected int x(int i8) {
            return Math.min(100, super.x(i8));
        }
    }

    private int k(View view, m mVar) {
        return (mVar.g(view) + (mVar.e(view) / 2)) - (mVar.m() + (mVar.n() / 2));
    }

    private View l(RecyclerView.p pVar, m mVar) {
        int O7 = pVar.O();
        View view = null;
        if (O7 == 0) {
            return null;
        }
        int m8 = mVar.m() + (mVar.n() / 2);
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < O7; i9++) {
            View N7 = pVar.N(i9);
            int abs = Math.abs((mVar.g(N7) + (mVar.e(N7) / 2)) - m8);
            if (abs < i8) {
                view = N7;
                i8 = abs;
            }
        }
        return view;
    }

    private m m(RecyclerView.p pVar) {
        m mVar = this.f11262e;
        if (mVar == null || mVar.f11258a != pVar) {
            this.f11262e = m.a(pVar);
        }
        return this.f11262e;
    }

    private m n(RecyclerView.p pVar) {
        if (pVar.q()) {
            return o(pVar);
        }
        if (pVar.p()) {
            return m(pVar);
        }
        return null;
    }

    private m o(RecyclerView.p pVar) {
        m mVar = this.f11261d;
        if (mVar == null || mVar.f11258a != pVar) {
            this.f11261d = m.c(pVar);
        }
        return this.f11261d;
    }

    private boolean p(RecyclerView.p pVar, int i8, int i9) {
        return pVar.p() ? i8 > 0 : i9 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean q(RecyclerView.p pVar) {
        PointF c8;
        int e8 = pVar.e();
        if (!(pVar instanceof RecyclerView.A.b) || (c8 = ((RecyclerView.A.b) pVar).c(e8 - 1)) == null) {
            return false;
        }
        return c8.x < 0.0f || c8.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.r
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.p()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.q()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.r
    protected RecyclerView.A d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.A.b) {
            return new a(this.f11269a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.r
    public View f(RecyclerView.p pVar) {
        if (pVar.q()) {
            return l(pVar, o(pVar));
        }
        if (pVar.p()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.r
    public int g(RecyclerView.p pVar, int i8, int i9) {
        m n8;
        int e8 = pVar.e();
        if (e8 == 0 || (n8 = n(pVar)) == null) {
            return -1;
        }
        int O7 = pVar.O();
        View view = null;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i12 = 0; i12 < O7; i12++) {
            View N7 = pVar.N(i12);
            if (N7 != null) {
                int k8 = k(N7, n8);
                if (k8 <= 0 && k8 > i11) {
                    view2 = N7;
                    i11 = k8;
                }
                if (k8 >= 0 && k8 < i10) {
                    view = N7;
                    i10 = k8;
                }
            }
        }
        boolean p8 = p(pVar, i8, i9);
        if (p8 && view != null) {
            return pVar.l0(view);
        }
        if (!p8 && view2 != null) {
            return pVar.l0(view2);
        }
        if (p8) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int l02 = pVar.l0(view) + (q(pVar) == p8 ? -1 : 1);
        if (l02 < 0 || l02 >= e8) {
            return -1;
        }
        return l02;
    }
}
