package Y1;

import W1.g;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.q;
import d2.C5708j;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import q.C6397a;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final q f6049c = new q(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    private final C6397a f6050a = new C6397a();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f6051b = new AtomicReference();

    private C5708j b(Class cls, Class cls2, Class cls3) {
        C5708j c5708j = (C5708j) this.f6051b.getAndSet(null);
        if (c5708j == null) {
            c5708j = new C5708j();
        }
        c5708j.a(cls, cls2, cls3);
        return c5708j;
    }

    public q a(Class cls, Class cls2, Class cls3) {
        q qVar;
        C5708j b8 = b(cls, cls2, cls3);
        synchronized (this.f6050a) {
            qVar = (q) this.f6050a.get(b8);
        }
        this.f6051b.set(b8);
        return qVar;
    }

    public boolean c(q qVar) {
        return f6049c.equals(qVar);
    }

    public void d(Class cls, Class cls2, Class cls3, q qVar) {
        synchronized (this.f6050a) {
            C6397a c6397a = this.f6050a;
            C5708j c5708j = new C5708j(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f6049c;
            }
            c6397a.put(c5708j, qVar);
        }
    }
}
