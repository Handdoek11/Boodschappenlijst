package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
final class T2 extends Thread {

    /* renamed from: o, reason: collision with root package name */
    private final Object f30715o;

    /* renamed from: s, reason: collision with root package name */
    private final BlockingQueue f30716s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f30717t = false;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ P2 f30718u;

    public T2(P2 p22, String str, BlockingQueue blockingQueue) {
        this.f30718u = p22;
        Z2.r.l(str);
        Z2.r.l(blockingQueue);
        this.f30715o = new Object();
        this.f30716s = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.f30718u.h().J().b(getName() + " was interrupted", interruptedException);
    }

    private final void c() {
        synchronized (this.f30718u.f30647i) {
            try {
                if (!this.f30717t) {
                    this.f30718u.f30648j.release();
                    this.f30718u.f30647i.notifyAll();
                    if (this == this.f30718u.f30641c) {
                        this.f30718u.f30641c = null;
                    } else if (this == this.f30718u.f30642d) {
                        this.f30718u.f30642d = null;
                    } else {
                        this.f30718u.h().E().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f30717t = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        synchronized (this.f30715o) {
            this.f30715o.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z7 = false;
        while (!z7) {
            try {
                this.f30718u.f30648j.acquire();
                z7 = true;
            } catch (InterruptedException e8) {
                b(e8);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                Q2 q22 = (Q2) this.f30716s.poll();
                if (q22 != null) {
                    Process.setThreadPriority(q22.f30659s ? threadPriority : 10);
                    q22.run();
                } else {
                    synchronized (this.f30715o) {
                        if (this.f30716s.peek() == null && !this.f30718u.f30649k) {
                            try {
                                this.f30715o.wait(30000L);
                            } catch (InterruptedException e9) {
                                b(e9);
                            }
                        }
                    }
                    synchronized (this.f30718u.f30647i) {
                        if (this.f30716s.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
