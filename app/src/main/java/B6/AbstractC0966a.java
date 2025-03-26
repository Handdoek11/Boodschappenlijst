package b6;

import a6.j;
import e6.AbstractC5751a;
import f6.g;
import java.util.concurrent.Callable;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0966a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile g f12011a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile g f12012b;

    static Object a(g gVar, Object obj) {
        try {
            return gVar.apply(obj);
        } catch (Throwable th) {
            throw AbstractC5751a.a(th);
        }
    }

    static j b(g gVar, Callable callable) {
        j jVar = (j) a(gVar, callable);
        if (jVar != null) {
            return jVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static j c(Callable callable) {
        try {
            j jVar = (j) callable.call();
            if (jVar != null) {
                return jVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw AbstractC5751a.a(th);
        }
    }

    public static j d(Callable callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        g gVar = f12011a;
        return gVar == null ? c(callable) : b(gVar, callable);
    }

    public static j e(j jVar) {
        if (jVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        g gVar = f12012b;
        return gVar == null ? jVar : (j) a(gVar, jVar);
    }
}
