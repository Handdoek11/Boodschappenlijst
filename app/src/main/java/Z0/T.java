package z0;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    private static Map f44693a = DesugarCollections.synchronizedMap(new WeakHashMap());

    private static class a {
        static float a(VelocityTracker velocityTracker, int i8) {
            return velocityTracker.getAxisVelocity(i8);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f44693a.containsKey(velocityTracker)) {
                f44693a.put(velocityTracker, new U());
            }
            ((U) f44693a.get(velocityTracker)).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i8) {
        c(velocityTracker, i8, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i8, float f8) {
        velocityTracker.computeCurrentVelocity(i8, f8);
        U e8 = e(velocityTracker);
        if (e8 != null) {
            e8.c(i8, f8);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i8) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i8);
        }
        if (i8 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i8 == 1) {
            return velocityTracker.getYVelocity();
        }
        U e8 = e(velocityTracker);
        if (e8 != null) {
            return e8.d(i8);
        }
        return 0.0f;
    }

    private static U e(VelocityTracker velocityTracker) {
        return (U) f44693a.get(velocityTracker);
    }
}
