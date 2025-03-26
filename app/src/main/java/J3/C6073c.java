package j3;

import android.os.Process;

/* renamed from: j3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6073c extends Thread {
    C6073c(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
