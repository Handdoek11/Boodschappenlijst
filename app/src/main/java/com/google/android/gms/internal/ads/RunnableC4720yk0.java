package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.yk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4720yk0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    Bk0 f28181o;

    RunnableC4720yk0(Bk0 bk0) {
        this.f28181o = bk0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.d dVar;
        Bk0 bk0 = this.f28181o;
        if (bk0 == null || (dVar = bk0.f13850y) == null) {
            return;
        }
        this.f28181o = null;
        if (dVar.isDone()) {
            bk0.v(dVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = bk0.f13851z;
            bk0.f13851z = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    bk0.h(new C4829zk0(str, null));
                    throw th;
                }
            }
            bk0.h(new C4829zk0(str + ": " + dVar.toString(), null));
        } finally {
            dVar.cancel(true);
        }
    }
}
