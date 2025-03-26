package t;

import java.util.concurrent.atomic.AtomicReference;
import x6.C6916E;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f43755a = new AtomicReference(y.g.a());

    /* renamed from: b, reason: collision with root package name */
    private final Object f43756b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private Object f43757c;

    public final Object a() {
        return Thread.currentThread().getId() == AbstractC6763a.b() ? this.f43757c : ((y.f) this.f43755a.get()).b(Thread.currentThread().getId());
    }

    public final void b(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == AbstractC6763a.b()) {
            this.f43757c = obj;
            return;
        }
        synchronized (this.f43756b) {
            y.f fVar = (y.f) this.f43755a.get();
            if (fVar.d(id, obj)) {
                return;
            }
            this.f43755a.set(fVar.c(id, obj));
            C6916E c6916e = C6916E.f44463a;
        }
    }
}
