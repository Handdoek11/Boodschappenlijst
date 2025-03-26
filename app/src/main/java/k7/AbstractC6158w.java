package k7;

import J6.AbstractC0650j;
import j7.c;
import java.util.Iterator;

/* renamed from: k7.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6158w extends AbstractC6115a {

    /* renamed from: a, reason: collision with root package name */
    private final g7.b f38742a;

    public /* synthetic */ AbstractC6158w(g7.b bVar, AbstractC0650j abstractC0650j) {
        this(bVar);
    }

    @Override // k7.AbstractC6115a
    protected final void g(j7.c cVar, Object obj, int i8, int i9) {
        J6.r.e(cVar, "decoder");
        if (i9 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i10 = 0; i10 < i9; i10++) {
            h(cVar, i8 + i10, obj, false);
        }
    }

    @Override // g7.b, g7.h, g7.a
    public abstract i7.f getDescriptor();

    @Override // k7.AbstractC6115a
    protected void h(j7.c cVar, int i8, Object obj, boolean z7) {
        J6.r.e(cVar, "decoder");
        n(obj, i8, c.a.c(cVar, getDescriptor(), i8, this.f38742a, null, 8, null));
    }

    protected abstract void n(Object obj, int i8, Object obj2);

    @Override // g7.h
    public void serialize(j7.f fVar, Object obj) {
        J6.r.e(fVar, "encoder");
        int e8 = e(obj);
        i7.f descriptor = getDescriptor();
        j7.d x7 = fVar.x(descriptor, e8);
        Iterator d8 = d(obj);
        for (int i8 = 0; i8 < e8; i8++) {
            x7.p(getDescriptor(), i8, this.f38742a, d8.next());
        }
        x7.c(descriptor);
    }

    private AbstractC6158w(g7.b bVar) {
        super(null);
        this.f38742a = bVar;
    }
}
