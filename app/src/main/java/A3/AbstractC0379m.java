package A3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: A3.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0379m {
    public static Object a(AbstractC0376j abstractC0376j) {
        Z2.r.j();
        Z2.r.h();
        Z2.r.m(abstractC0376j, "Task must not be null");
        if (abstractC0376j.r()) {
            return h(abstractC0376j);
        }
        p pVar = new p(null);
        i(abstractC0376j, pVar);
        pVar.a();
        return h(abstractC0376j);
    }

    public static Object b(AbstractC0376j abstractC0376j, long j8, TimeUnit timeUnit) {
        Z2.r.j();
        Z2.r.h();
        Z2.r.m(abstractC0376j, "Task must not be null");
        Z2.r.m(timeUnit, "TimeUnit must not be null");
        if (abstractC0376j.r()) {
            return h(abstractC0376j);
        }
        p pVar = new p(null);
        i(abstractC0376j, pVar);
        if (pVar.d(j8, timeUnit)) {
            return h(abstractC0376j);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static AbstractC0376j c(Executor executor, Callable callable) {
        Z2.r.m(executor, "Executor must not be null");
        Z2.r.m(callable, "Callback must not be null");
        N n8 = new N();
        executor.execute(new O(n8, callable));
        return n8;
    }

    public static AbstractC0376j d(Exception exc) {
        N n8 = new N();
        n8.v(exc);
        return n8;
    }

    public static AbstractC0376j e(Object obj) {
        N n8 = new N();
        n8.w(obj);
        return n8;
    }

    public static AbstractC0376j f(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((AbstractC0376j) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        N n8 = new N();
        r rVar = new r(collection.size(), n8);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            i((AbstractC0376j) it2.next(), rVar);
        }
        return n8;
    }

    public static AbstractC0376j g(AbstractC0376j... abstractC0376jArr) {
        return (abstractC0376jArr == null || abstractC0376jArr.length == 0) ? e(null) : f(Arrays.asList(abstractC0376jArr));
    }

    private static Object h(AbstractC0376j abstractC0376j) {
        if (abstractC0376j.s()) {
            return abstractC0376j.o();
        }
        if (abstractC0376j.q()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC0376j.n());
    }

    private static void i(AbstractC0376j abstractC0376j, q qVar) {
        Executor executor = AbstractC0378l.f205b;
        abstractC0376j.j(executor, qVar);
        abstractC0376j.g(executor, qVar);
        abstractC0376j.b(executor, qVar);
    }
}
