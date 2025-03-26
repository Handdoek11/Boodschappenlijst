package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
abstract class p {
    static int a(RecyclerView.B b8, m mVar, View view, View view2, RecyclerView.p pVar, boolean z7) {
        if (pVar.O() == 0 || b8.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return Math.abs(pVar.l0(view) - pVar.l0(view2)) + 1;
        }
        return Math.min(mVar.n(), mVar.d(view2) - mVar.g(view));
    }

    static int b(RecyclerView.B b8, m mVar, View view, View view2, RecyclerView.p pVar, boolean z7, boolean z8) {
        if (pVar.O() == 0 || b8.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z8 ? Math.max(0, (b8.b() - Math.max(pVar.l0(view), pVar.l0(view2))) - 1) : Math.max(0, Math.min(pVar.l0(view), pVar.l0(view2)));
        if (z7) {
            return Math.round((max * (Math.abs(mVar.d(view2) - mVar.g(view)) / (Math.abs(pVar.l0(view) - pVar.l0(view2)) + 1))) + (mVar.m() - mVar.g(view)));
        }
        return max;
    }

    static int c(RecyclerView.B b8, m mVar, View view, View view2, RecyclerView.p pVar, boolean z7) {
        if (pVar.O() == 0 || b8.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return b8.b();
        }
        return (int) (((mVar.d(view2) - mVar.g(view)) / (Math.abs(pVar.l0(view) - pVar.l0(view2)) + 1)) * b8.b());
    }
}
