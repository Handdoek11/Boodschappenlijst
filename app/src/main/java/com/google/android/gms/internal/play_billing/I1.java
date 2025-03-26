package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class I1 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    L1 f29769o;

    I1(L1 l12) {
        this.f29769o = l12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC5225z1 interfaceFutureC5225z1;
        L1 l12 = this.f29769o;
        if (l12 == null || (interfaceFutureC5225z1 = l12.f29782y) == null) {
            return;
        }
        this.f29769o = null;
        if (interfaceFutureC5225z1.isDone()) {
            l12.q(interfaceFutureC5225z1);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = l12.f29783z;
            l12.f29783z = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    l12.p(new J1(str, null));
                    throw th;
                }
            }
            l12.p(new J1(str + ": " + interfaceFutureC5225z1.toString(), null));
        } finally {
            interfaceFutureC5225z1.cancel(true);
        }
    }
}
