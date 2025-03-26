package Y1;

import d2.C5708j;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import q.C6397a;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f6052a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final C6397a f6053b = new C6397a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        C5708j c5708j = (C5708j) this.f6052a.getAndSet(null);
        if (c5708j == null) {
            c5708j = new C5708j(cls, cls2, cls3);
        } else {
            c5708j.a(cls, cls2, cls3);
        }
        synchronized (this.f6053b) {
            list = (List) this.f6053b.get(c5708j);
        }
        this.f6052a.set(c5708j);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f6053b) {
            this.f6053b.put(new C5708j(cls, cls2, cls3), list);
        }
    }
}
