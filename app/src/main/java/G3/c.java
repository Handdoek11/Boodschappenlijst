package g3;

import android.os.Process;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final Runnable f36012o;

    public c(Runnable runnable, int i8) {
        this.f36012o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f36012o.run();
    }
}
