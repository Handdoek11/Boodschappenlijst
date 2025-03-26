package n1;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6246a {
    public static View a(View view, int i8) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View findViewById = viewGroup.getChildAt(i9).findViewById(i8);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }
}
