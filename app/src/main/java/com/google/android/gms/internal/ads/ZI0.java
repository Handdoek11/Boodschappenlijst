package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

/* loaded from: classes.dex */
final class ZI0 extends Handler implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC2071aJ0 f20444o;

    /* renamed from: s, reason: collision with root package name */
    private final long f20445s;

    /* renamed from: t, reason: collision with root package name */
    private XI0 f20446t;

    /* renamed from: u, reason: collision with root package name */
    private IOException f20447u;

    /* renamed from: v, reason: collision with root package name */
    private int f20448v;

    /* renamed from: w, reason: collision with root package name */
    private Thread f20449w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f20450x;

    /* renamed from: y, reason: collision with root package name */
    private volatile boolean f20451y;

    /* renamed from: z, reason: collision with root package name */
    final /* synthetic */ C2505eJ0 f20452z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZI0(C2505eJ0 c2505eJ0, Looper looper, InterfaceC2071aJ0 interfaceC2071aJ0, XI0 xi0, int i8, long j8) {
        super(looper);
        this.f20452z = c2505eJ0;
        this.f20444o = interfaceC2071aJ0;
        this.f20446t = xi0;
        this.f20445s = j8;
    }

    private final void d() {
        SystemClock.elapsedRealtime();
        this.f20446t.getClass();
        this.f20447u = null;
        C2505eJ0 c2505eJ0 = this.f20452z;
        InterfaceExecutorC3484nJ0 interfaceExecutorC3484nJ0 = c2505eJ0.f21792a;
        ZI0 zi0 = c2505eJ0.f21793b;
        zi0.getClass();
        interfaceExecutorC3484nJ0.execute(zi0);
    }

    public final void a(boolean z7) {
        this.f20451y = z7;
        this.f20447u = null;
        if (hasMessages(1)) {
            this.f20450x = true;
            removeMessages(1);
            if (!z7) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f20450x = true;
                    this.f20444o.g();
                    Thread thread = this.f20449w;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z7) {
            this.f20452z.f21793b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            XI0 xi0 = this.f20446t;
            xi0.getClass();
            xi0.g(this.f20444o, elapsedRealtime, elapsedRealtime - this.f20445s, true);
            this.f20446t = null;
        }
    }

    public final void b(int i8) {
        IOException iOException = this.f20447u;
        if (iOException != null && this.f20448v > i8) {
            throw iOException;
        }
    }

    public final void c(long j8) {
        AbstractC3796qC.f(this.f20452z.f21793b == null);
        this.f20452z.f21793b = this;
        if (j8 > 0) {
            sendEmptyMessageDelayed(1, j8);
        } else {
            d();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f20451y) {
            return;
        }
        int i8 = message.what;
        if (i8 == 1) {
            d();
            return;
        }
        if (i8 == 4) {
            throw ((Error) message.obj);
        }
        this.f20452z.f21793b = null;
        long j8 = this.f20445s;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = elapsedRealtime - j8;
        XI0 xi0 = this.f20446t;
        xi0.getClass();
        if (this.f20450x) {
            xi0.g(this.f20444o, elapsedRealtime, j9, false);
            return;
        }
        int i9 = message.what;
        if (i9 == 2) {
            try {
                xi0.l(this.f20444o, elapsedRealtime, j9);
                return;
            } catch (RuntimeException e8) {
                HL.d("LoadTask", "Unexpected exception handling load completed", e8);
                this.f20452z.f21794c = new zzyw(e8);
                return;
            }
        }
        if (i9 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f20447u = iOException;
        int i10 = this.f20448v + 1;
        this.f20448v = i10;
        YI0 k8 = xi0.k(this.f20444o, elapsedRealtime, j9, iOException, i10);
        if (k8.f20243a == 3) {
            this.f20452z.f21794c = this.f20447u;
        } else if (k8.f20243a != 2) {
            if (k8.f20243a == 1) {
                this.f20448v = 1;
            }
            c(k8.f20244b != -9223372036854775807L ? k8.f20244b : Math.min((this.f20448v - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        try {
            synchronized (this) {
                z7 = this.f20450x;
                this.f20449w = Thread.currentThread();
            }
            if (!z7) {
                Trace.beginSection("load:" + this.f20444o.getClass().getSimpleName());
                try {
                    this.f20444o.e();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f20449w = null;
                Thread.interrupted();
            }
            if (this.f20451y) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e8) {
            if (this.f20451y) {
                return;
            }
            obtainMessage(3, e8).sendToTarget();
        } catch (Exception e9) {
            if (this.f20451y) {
                return;
            }
            HL.d("LoadTask", "Unexpected exception loading stream", e9);
            obtainMessage(3, new zzyw(e9)).sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.f20451y) {
                return;
            }
            HL.d("LoadTask", "OutOfMemory error loading stream", e10);
            obtainMessage(3, new zzyw(e10)).sendToTarget();
        } catch (Error e11) {
            if (!this.f20451y) {
                HL.d("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
