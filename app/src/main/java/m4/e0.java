package m4;

import A3.AbstractC0376j;
import A3.InterfaceC0369c;
import android.os.Looper;
import com.adadapted.android.sdk.constants.Config;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f39048a = G.c("awaitEvenIfOnMainThread task continuation executor");

    public static Object b(AbstractC0376j abstractC0376j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC0376j.k(f39048a, new InterfaceC0369c() { // from class: m4.d0
            @Override // A3.InterfaceC0369c
            public final Object a(AbstractC0376j abstractC0376j2) {
                return e0.d(countDownLatch, abstractC0376j2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(Config.DEFAULT_EVENT_POLLING, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (abstractC0376j.s()) {
            return abstractC0376j.o();
        }
        if (abstractC0376j.q()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC0376j.r()) {
            throw new IllegalStateException(abstractC0376j.n());
        }
        throw new TimeoutException();
    }

    public static boolean c(CountDownLatch countDownLatch, long j8, TimeUnit timeUnit) {
        boolean z7 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d(CountDownLatch countDownLatch, AbstractC0376j abstractC0376j) {
        countDownLatch.countDown();
        return null;
    }
}
