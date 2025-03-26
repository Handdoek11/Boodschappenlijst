package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
class M extends L {
    M() {
    }

    @Override // androidx.transition.D
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.J, androidx.transition.D
    public void d(View view, int i8, int i9, int i10, int i11) {
        view.setLeftTopRightBottom(i8, i9, i10, i11);
    }

    @Override // androidx.transition.D
    public void e(View view, float f8) {
        view.setTransitionAlpha(f8);
    }

    @Override // androidx.transition.L, androidx.transition.D
    public void f(View view, int i8) {
        view.setTransitionVisibility(i8);
    }

    @Override // androidx.transition.H, androidx.transition.D
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.H, androidx.transition.D
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
