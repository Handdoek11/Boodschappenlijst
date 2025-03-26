package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class g {

    static class a {
        static void a(PopupWindow popupWindow, boolean z7) {
            popupWindow.setOverlapAnchor(z7);
        }

        static void b(PopupWindow popupWindow, int i8) {
            popupWindow.setWindowLayoutType(i8);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z7) {
        a.a(popupWindow, z7);
    }

    public static void b(PopupWindow popupWindow, int i8) {
        a.b(popupWindow, i8);
    }

    public static void c(PopupWindow popupWindow, View view, int i8, int i9, int i10) {
        popupWindow.showAsDropDown(view, i8, i9, i10);
    }
}
