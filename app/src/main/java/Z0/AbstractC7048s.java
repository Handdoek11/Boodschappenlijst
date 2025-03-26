package z0;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: z0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7048s {
    public static void a(int i8, int i9, int i10, Rect rect, Rect rect2, int i11) {
        Gravity.apply(i8, i9, i10, rect, rect2, i11);
    }

    public static int b(int i8, int i9) {
        return Gravity.getAbsoluteGravity(i8, i9);
    }
}
