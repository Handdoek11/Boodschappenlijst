package r3;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class B extends AbstractC6689g implements ExecutorService {
    protected B() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return b().awaitTermination(j8, timeUnit);
    }

    protected abstract ExecutorService b();

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return b().invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return b().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return b().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return b().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        b().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return b().shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return b().submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j8, TimeUnit timeUnit) {
        return b().invokeAll(collection, j8, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j8, TimeUnit timeUnit) {
        return b().invokeAny(collection, j8, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return b().submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return b().submit(callable);
    }
}
