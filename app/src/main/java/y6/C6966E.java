package y6;

import java.util.Iterator;

/* renamed from: y6.E, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6966E implements Iterable, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final I6.a f44638o;

    public C6966E(I6.a aVar) {
        J6.r.e(aVar, "iteratorFactory");
        this.f44638o = aVar;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C6967F((Iterator) this.f44638o.invoke());
    }
}
