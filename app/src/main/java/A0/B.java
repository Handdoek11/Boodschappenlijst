package A0;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
public abstract class B {
    public static void a(AccessibilityRecord accessibilityRecord, int i8) {
        accessibilityRecord.setMaxScrollX(i8);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i8) {
        accessibilityRecord.setMaxScrollY(i8);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i8) {
        accessibilityRecord.setSource(view, i8);
    }
}
