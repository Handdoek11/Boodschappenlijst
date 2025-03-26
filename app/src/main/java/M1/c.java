package M1;

import d2.AbstractC5710l;
import java.util.Queue;

/* loaded from: classes.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f3733a = AbstractC5710l.f(20);

    c() {
    }

    abstract m a();

    m b() {
        m mVar = (m) this.f3733a.poll();
        return mVar == null ? a() : mVar;
    }

    public void c(m mVar) {
        if (this.f3733a.size() < 20) {
            this.f3733a.offer(mVar);
        }
    }
}
