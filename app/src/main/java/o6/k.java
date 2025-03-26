package o6;

import X2.D;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f40024a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f40025b;

    /* renamed from: c, reason: collision with root package name */
    static final AtomicReference f40026c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    static final Map f40027d = new ConcurrentHashMap();

    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(k.f40027d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    k.f40027d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static final class b implements f6.g {
        b() {
        }

        @Override // f6.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(String str) {
            return System.getProperty(str);
        }
    }

    static {
        b bVar = new b();
        boolean b8 = b(true, "rx2.purge-enabled", true, true, bVar);
        f40024a = b8;
        f40025b = c(b8, "rx2.purge-period-seconds", 1, 1, bVar);
        d();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        e(f40024a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    static boolean b(boolean z7, String str, boolean z8, boolean z9, f6.g gVar) {
        if (!z7) {
            return z9;
        }
        try {
            String str2 = (String) gVar.apply(str);
            return str2 == null ? z8 : "true".equals(str2);
        } catch (Throwable unused) {
            return z8;
        }
    }

    static int c(boolean z7, String str, int i8, int i9, f6.g gVar) {
        if (!z7) {
            return i9;
        }
        try {
            String str2 = (String) gVar.apply(str);
            return str2 == null ? i8 : Integer.parseInt(str2);
        } catch (Throwable unused) {
            return i8;
        }
    }

    public static void d() {
        f(f40024a);
    }

    static void e(boolean z7, ScheduledExecutorService scheduledExecutorService) {
        if (z7 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f40027d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static void f(boolean z7) {
        if (!z7) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f40026c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new g("RxSchedulerPurge"));
            if (D.a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                a aVar = new a();
                int i8 = f40025b;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, i8, i8, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }
}
