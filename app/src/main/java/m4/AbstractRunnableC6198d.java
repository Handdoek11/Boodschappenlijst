package m4;

import android.os.Process;

/* renamed from: m4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC6198d implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
