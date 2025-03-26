package androidx.transition;

import android.view.View;

/* loaded from: classes.dex */
abstract class J extends H {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f11435f = true;

    static class a {
        static void a(View view, int i8, int i9, int i10, int i11) {
            view.setLeftTopRightBottom(i8, i9, i10, i11);
        }
    }

    J() {
    }

    @Override // androidx.transition.D
    public void d(View view, int i8, int i9, int i10, int i11) {
        if (f11435f) {
            try {
                a.a(view, i8, i9, i10, i11);
            } catch (NoSuchMethodError unused) {
                f11435f = false;
            }
        }
    }
}
