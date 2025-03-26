package R6;

import J6.r;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f4943a;

    public a(d dVar) {
        r.e(dVar, "sequence");
        this.f4943a = new AtomicReference(dVar);
    }

    @Override // R6.d
    public Iterator iterator() {
        d dVar = (d) this.f4943a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
