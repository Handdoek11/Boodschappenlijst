package Z6;

import java.util.Collection;
import java.util.ServiceLoader;

/* renamed from: Z6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0793g {

    /* renamed from: a, reason: collision with root package name */
    private static final Collection f6474a = R6.g.k(R6.g.c(ServiceLoader.load(U6.J.class, U6.J.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f6474a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
