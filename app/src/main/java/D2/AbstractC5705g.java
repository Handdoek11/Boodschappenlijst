package d2;

import android.os.SystemClock;

/* renamed from: d2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5705g {

    /* renamed from: a, reason: collision with root package name */
    private static final double f35219a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j8) {
        return (b() - j8) * f35219a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
