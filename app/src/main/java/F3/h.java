package f3;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class h implements InterfaceC5781e {

    /* renamed from: a, reason: collision with root package name */
    private static final h f35862a = new h();

    private h() {
    }

    public static InterfaceC5781e d() {
        return f35862a;
    }

    @Override // f3.InterfaceC5781e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // f3.InterfaceC5781e
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // f3.InterfaceC5781e
    public final long c() {
        return System.nanoTime();
    }
}
