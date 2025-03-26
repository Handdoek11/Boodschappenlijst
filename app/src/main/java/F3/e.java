package F3;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f2363a = false;

    public static void a(a aVar, View view, FrameLayout frameLayout) {
        c(aVar, view, frameLayout);
        if (aVar.i() != null) {
            aVar.i().setForeground(aVar);
        } else {
            if (f2363a) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(aVar);
        }
    }

    public static void b(a aVar, View view) {
        if (aVar == null) {
            return;
        }
        if (f2363a || aVar.i() != null) {
            aVar.i().setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void c(a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.N(view, frameLayout);
    }

    public static void d(Rect rect, float f8, float f9, float f10, float f11) {
        rect.set((int) (f8 - f10), (int) (f9 - f11), (int) (f8 + f10), (int) (f9 + f11));
    }
}
