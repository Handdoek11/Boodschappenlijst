package A0;

import android.view.accessibility.AccessibilityManager;

/* renamed from: A0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0366c {

    /* renamed from: A0.c$a */
    public interface a {
        void onTouchExplorationStateChanged(boolean z7);
    }

    /* renamed from: A0.c$b */
    private static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final a f7a;

        b(a aVar) {
            this.f7a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f7a.equals(((b) obj).f7a);
            }
            return false;
        }

        public int hashCode() {
            return this.f7a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z7) {
            this.f7a.onTouchExplorationStateChanged(z7);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
