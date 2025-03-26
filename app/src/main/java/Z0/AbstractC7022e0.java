package z0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: z0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7022e0 {

    /* renamed from: z0.e0$a */
    static class a {
        static boolean a(ViewParent viewParent, View view, float f8, float f9, boolean z7) {
            return viewParent.onNestedFling(view, f8, f9, z7);
        }

        static boolean b(ViewParent viewParent, View view, float f8, float f9) {
            return viewParent.onNestedPreFling(view, f8, f9);
        }

        static void c(ViewParent viewParent, View view, int i8, int i9, int[] iArr) {
            viewParent.onNestedPreScroll(view, i8, i9, iArr);
        }

        static void d(ViewParent viewParent, View view, int i8, int i9, int i10, int i11) {
            viewParent.onNestedScroll(view, i8, i9, i10, i11);
        }

        static void e(ViewParent viewParent, View view, View view2, int i8) {
            viewParent.onNestedScrollAccepted(view, view2, i8);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i8) {
            return viewParent.onStartNestedScroll(view, view2, i8);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f8, float f9, boolean z7) {
        try {
            return a.a(viewParent, view, f8, f9, z7);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e8);
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f8, float f9) {
        try {
            return a.b(viewParent, view, f8, f9);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e8);
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i8, int i9, int[] iArr, int i10) {
        if (viewParent instanceof InterfaceC7001E) {
            ((InterfaceC7001E) viewParent).o(view, i8, i9, iArr, i10);
            return;
        }
        if (i10 == 0) {
            try {
                a.c(viewParent, view, i8, i9, iArr);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e8);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        if (viewParent instanceof InterfaceC7002F) {
            ((InterfaceC7002F) viewParent).j(view, i8, i9, i10, i11, i12, iArr);
            return;
        }
        iArr[0] = iArr[0] + i10;
        iArr[1] = iArr[1] + i11;
        if (viewParent instanceof InterfaceC7001E) {
            ((InterfaceC7001E) viewParent).k(view, i8, i9, i10, i11, i12);
            return;
        }
        if (i12 == 0) {
            try {
                a.d(viewParent, view, i8, i9, i10, i11);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e8);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i8, int i9) {
        if (viewParent instanceof InterfaceC7001E) {
            ((InterfaceC7001E) viewParent).m(view, view2, i8, i9);
            return;
        }
        if (i9 == 0) {
            try {
                a.e(viewParent, view, view2, i8);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e8);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i8, int i9) {
        if (viewParent instanceof InterfaceC7001E) {
            return ((InterfaceC7001E) viewParent).l(view, view2, i8, i9);
        }
        if (i9 != 0) {
            return false;
        }
        try {
            return a.f(viewParent, view, view2, i8);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e8);
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i8) {
        if (viewParent instanceof InterfaceC7001E) {
            ((InterfaceC7001E) viewParent).n(view, i8);
            return;
        }
        if (i8 == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e8);
            }
        }
    }
}
