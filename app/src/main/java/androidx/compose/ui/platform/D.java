package androidx.compose.ui.platform;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final D f8211a = new D();

    private D() {
    }

    public final boolean a(MotionEvent motionEvent, int i8) {
        float rawX = motionEvent.getRawX(i8);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            float rawY = motionEvent.getRawY(i8);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
