package l5;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import z0.X;

/* renamed from: l5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6177c {
    public static int a(int i8) {
        switch (i8) {
            case -1:
                return -1;
            case 0:
            case 2:
            case 4:
                return 0;
            case 1:
            case 3:
            case 5:
                return 1;
            default:
                throw new IllegalArgumentException("Unknown layout type (= " + i8 + ")");
        }
    }

    public static RecyclerView.F b(RecyclerView recyclerView, float f8, float f9) {
        View X7 = recyclerView.X(f8, f9);
        if (X7 != null) {
            return recyclerView.m0(X7);
        }
        return null;
    }

    public static RecyclerView.F c(RecyclerView recyclerView, float f8, float f9) {
        View d8 = d(recyclerView, f8, f9);
        if (d8 != null) {
            return recyclerView.m0(d8);
        }
        return null;
    }

    private static View d(ViewGroup viewGroup, float f8, float f9) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (f8 >= childAt.getLeft() && f8 <= childAt.getRight() && f9 >= childAt.getTop() && f9 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public static int e(RecyclerView recyclerView) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).Z1();
        }
        return -1;
    }

    public static int f(RecyclerView recyclerView, boolean z7) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return z7 ? g((LinearLayoutManager) layoutManager) : ((LinearLayoutManager) layoutManager).d2();
        }
        return -1;
    }

    private static int g(LinearLayoutManager linearLayoutManager) {
        View k8 = k(linearLayoutManager, 0, linearLayoutManager.O(), false, true);
        if (k8 == null) {
            return -1;
        }
        return linearLayoutManager.l0(k8);
    }

    public static int h(RecyclerView recyclerView) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).e2();
        }
        return -1;
    }

    public static int i(RecyclerView recyclerView, boolean z7) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return z7 ? j((LinearLayoutManager) layoutManager) : ((LinearLayoutManager) layoutManager).g2();
        }
        return -1;
    }

    private static int j(LinearLayoutManager linearLayoutManager) {
        View k8 = k(linearLayoutManager, linearLayoutManager.O() - 1, -1, false, true);
        if (k8 == null) {
            return -1;
        }
        return linearLayoutManager.l0(k8);
    }

    private static View k(LinearLayoutManager linearLayoutManager, int i8, int i9, boolean z7, boolean z8) {
        boolean z9 = linearLayoutManager.r2() == 1;
        int b02 = z9 ? linearLayoutManager.b0() : linearLayoutManager.s0();
        int i10 = i9 <= i8 ? -1 : 1;
        View view = null;
        while (i8 != i9) {
            View N7 = linearLayoutManager.N(i8);
            int top = z9 ? N7.getTop() : N7.getLeft();
            int bottom = z9 ? N7.getBottom() : N7.getRight();
            if (top < b02 && bottom > 0) {
                if (!z7) {
                    return N7;
                }
                if (top >= 0 && bottom <= b02) {
                    return N7;
                }
                if (z8 && view == null) {
                    view = N7;
                }
            }
            i8 += i10;
        }
        return view;
    }

    public static View l(RecyclerView.p pVar, int i8) {
        if (i8 != -1) {
            return pVar.H(i8);
        }
        return null;
    }

    public static Rect m(RecyclerView.p pVar, View view, Rect rect) {
        rect.left = pVar.e0(view);
        rect.right = pVar.n0(view);
        rect.top = pVar.q0(view);
        rect.bottom = pVar.M(view);
        return rect;
    }

    private static View n(RecyclerView.F f8) {
        if (f8 == null) {
            return null;
        }
        View view = f8.f10944a;
        if (X.R(view)) {
            return view;
        }
        return null;
    }

    public static Rect o(View view, Rect rect) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            rect.left = marginLayoutParams.leftMargin;
            rect.right = marginLayoutParams.rightMargin;
            rect.top = marginLayoutParams.topMargin;
            rect.bottom = marginLayoutParams.bottomMargin;
        } else {
            rect.bottom = 0;
            rect.top = 0;
            rect.right = 0;
            rect.left = 0;
        }
        return rect;
    }

    public static int p(RecyclerView.p pVar) {
        if (pVar instanceof GridLayoutManager) {
            return ((GridLayoutManager) pVar).r2() == 0 ? 2 : 3;
        }
        if (pVar instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) pVar).r2() == 0 ? 0 : 1;
        }
        if (pVar instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) pVar).u2() == 0 ? 4 : 5;
        }
        return -1;
    }

    public static int q(RecyclerView recyclerView) {
        return p(recyclerView.getLayoutManager());
    }

    public static int r(RecyclerView.p pVar) {
        if (pVar instanceof GridLayoutManager) {
            return ((GridLayoutManager) pVar).r2();
        }
        if (pVar instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) pVar).r2();
        }
        if (pVar instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) pVar).u2();
        }
        return -1;
    }

    public static int s(RecyclerView recyclerView) {
        return r(recyclerView.getLayoutManager());
    }

    public static int t(RecyclerView recyclerView) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).a3();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).v2();
        }
        return 1;
    }

    public static int u(RecyclerView.F f8) {
        View n8 = n(f8);
        if (n8 == null) {
            return -1;
        }
        ViewGroup.LayoutParams layoutParams = n8.getLayoutParams();
        if (!(layoutParams instanceof StaggeredGridLayoutManager.c)) {
            return layoutParams instanceof GridLayoutManager.b ? ((GridLayoutManager.b) layoutParams).f() : layoutParams instanceof RecyclerView.q ? 1 : -1;
        }
        if (((StaggeredGridLayoutManager.c) layoutParams).e()) {
            return t((RecyclerView) n8.getParent());
        }
        return 1;
    }

    public static int v(RecyclerView.F f8) {
        int G7 = f8.G();
        if (G7 == f8.C()) {
            return G7;
        }
        return -1;
    }

    public static Rect w(View view, Rect rect) {
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        return rect;
    }

    public static boolean x(int i8) {
        return i8 == 1 || i8 == 0;
    }
}
