package A0;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: A0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0365b {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i8) {
        accessibilityEvent.setContentChangeTypes(i8);
    }
}
