package l0;

import android.view.View;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6165a {
    public static String a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
