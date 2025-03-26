package G2;

import android.view.View;
import android.view.ViewParent;

/* renamed from: G2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0583d {
    public static boolean a(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                return true;
            }
        }
        return false;
    }
}
