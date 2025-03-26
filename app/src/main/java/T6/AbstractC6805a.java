package t6;

import a6.AbstractC0825b;
import a6.AbstractC0827d;
import a6.AbstractC0829f;
import a6.InterfaceC0828e;
import a6.i;
import a6.j;
import f6.b;
import f6.d;
import f6.g;
import h6.AbstractC5844b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.Callable;
import r6.AbstractC6714f;

/* renamed from: t6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6805a {

    /* renamed from: a, reason: collision with root package name */
    static volatile d f43921a;

    /* renamed from: b, reason: collision with root package name */
    static volatile g f43922b;

    /* renamed from: c, reason: collision with root package name */
    static volatile g f43923c;

    /* renamed from: d, reason: collision with root package name */
    static volatile g f43924d;

    /* renamed from: e, reason: collision with root package name */
    static volatile g f43925e;

    /* renamed from: f, reason: collision with root package name */
    static volatile g f43926f;

    /* renamed from: g, reason: collision with root package name */
    static volatile g f43927g;

    /* renamed from: h, reason: collision with root package name */
    static volatile g f43928h;

    /* renamed from: i, reason: collision with root package name */
    static volatile g f43929i;

    /* renamed from: j, reason: collision with root package name */
    static volatile g f43930j;

    /* renamed from: k, reason: collision with root package name */
    static volatile b f43931k;

    /* renamed from: l, reason: collision with root package name */
    static volatile b f43932l;

    /* renamed from: m, reason: collision with root package name */
    static volatile b f43933m;

    static Object a(b bVar, Object obj, Object obj2) {
        try {
            return bVar.apply(obj, obj2);
        } catch (Throwable th) {
            throw AbstractC6714f.c(th);
        }
    }

    static Object b(g gVar, Object obj) {
        try {
            return gVar.apply(obj);
        } catch (Throwable th) {
            throw AbstractC6714f.c(th);
        }
    }

    static j c(g gVar, Callable callable) {
        return (j) AbstractC5844b.e(b(gVar, callable), "Scheduler Callable result can't be null");
    }

    static j d(Callable callable) {
        try {
            return (j) AbstractC5844b.e(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw AbstractC6714f.c(th);
        }
    }

    public static j e(Callable callable) {
        AbstractC5844b.e(callable, "Scheduler Callable can't be null");
        g gVar = f43923c;
        return gVar == null ? d(callable) : c(gVar, callable);
    }

    public static j f(Callable callable) {
        AbstractC5844b.e(callable, "Scheduler Callable can't be null");
        g gVar = f43925e;
        return gVar == null ? d(callable) : c(gVar, callable);
    }

    public static j g(Callable callable) {
        AbstractC5844b.e(callable, "Scheduler Callable can't be null");
        g gVar = f43926f;
        return gVar == null ? d(callable) : c(gVar, callable);
    }

    public static j h(Callable callable) {
        AbstractC5844b.e(callable, "Scheduler Callable can't be null");
        g gVar = f43924d;
        return gVar == null ? d(callable) : c(gVar, callable);
    }

    static boolean i(Throwable th) {
        return (th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException);
    }

    public static AbstractC0825b j(AbstractC0825b abstractC0825b) {
        g gVar = f43928h;
        return gVar != null ? (AbstractC0825b) b(gVar, abstractC0825b) : abstractC0825b;
    }

    public static AbstractC0827d k(AbstractC0827d abstractC0827d) {
        g gVar = f43930j;
        return gVar != null ? (AbstractC0827d) b(gVar, abstractC0827d) : abstractC0827d;
    }

    public static AbstractC0829f l(AbstractC0829f abstractC0829f) {
        g gVar = f43929i;
        return gVar != null ? (AbstractC0829f) b(gVar, abstractC0829f) : abstractC0829f;
    }

    public static void m(Throwable th) {
        d dVar = f43921a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!i(th)) {
            th = new UndeliverableException(th);
        }
        if (dVar != null) {
            try {
                dVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                s(th2);
            }
        }
        th.printStackTrace();
        s(th);
    }

    public static j n(j jVar) {
        g gVar = f43927g;
        return gVar == null ? jVar : (j) b(gVar, jVar);
    }

    public static Runnable o(Runnable runnable) {
        AbstractC5844b.e(runnable, "run is null");
        g gVar = f43922b;
        return gVar == null ? runnable : (Runnable) b(gVar, runnable);
    }

    public static InterfaceC0828e p(AbstractC0827d abstractC0827d, InterfaceC0828e interfaceC0828e) {
        b bVar = f43932l;
        return bVar != null ? (InterfaceC0828e) a(bVar, abstractC0827d, interfaceC0828e) : interfaceC0828e;
    }

    public static i q(AbstractC0829f abstractC0829f, i iVar) {
        b bVar = f43933m;
        return bVar != null ? (i) a(bVar, abstractC0829f, iVar) : iVar;
    }

    public static p7.a r(AbstractC0825b abstractC0825b, p7.a aVar) {
        b bVar = f43931k;
        return bVar != null ? (p7.a) a(bVar, abstractC0825b, aVar) : aVar;
    }

    static void s(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
