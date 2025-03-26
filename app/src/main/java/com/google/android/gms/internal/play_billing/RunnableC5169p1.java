package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.play_billing.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5169p1 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final Future f29962o;

    /* renamed from: s, reason: collision with root package name */
    final InterfaceC5163o1 f29963s;

    RunnableC5169p1(Future future, InterfaceC5163o1 interfaceC5163o1) {
        this.f29962o = future;
        this.f29963s = interfaceC5163o1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable a8;
        boolean z7 = true;
        boolean z8 = false;
        Object obj2 = this.f29962o;
        if ((obj2 instanceof O1) && (a8 = P1.a((O1) obj2)) != null) {
            this.f29963s.a(a8);
            return;
        }
        try {
            Future future = this.f29962o;
            if (!future.isDone()) {
                throw new IllegalStateException(AbstractC5208w.a("Future was expected to be done: %s", future));
            }
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z8 = z7;
                } catch (Throwable th) {
                    if (z8) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z8) {
                Thread.currentThread().interrupt();
            }
            this.f29963s.c(obj);
        } catch (ExecutionException e8) {
            this.f29963s.a(e8.getCause());
        } catch (Throwable th2) {
            this.f29963s.a(th2);
        }
    }

    public final String toString() {
        r a8 = AbstractC5190t.a(this);
        a8.a(this.f29963s);
        return a8.toString();
    }
}
