package G2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.HandlerC1968Yd0;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private HandlerThread f2602a = null;

    /* renamed from: b, reason: collision with root package name */
    private Handler f2603b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f2604c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f2605d = new Object();

    public final Handler a() {
        return this.f2603b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f2605d) {
            try {
                if (this.f2604c != 0) {
                    Z2.r.m(this.f2602a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f2602a == null) {
                    AbstractC0608p0.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f2602a = handlerThread;
                    handlerThread.start();
                    this.f2603b = new HandlerC1968Yd0(this.f2602a.getLooper());
                    AbstractC0608p0.k("Looper thread started.");
                } else {
                    AbstractC0608p0.k("Resuming the looper thread");
                    this.f2605d.notifyAll();
                }
                this.f2604c++;
                looper = this.f2602a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }
}
