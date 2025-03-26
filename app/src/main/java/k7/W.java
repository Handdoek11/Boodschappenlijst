package k7;

import J6.AbstractC0650j;
import j7.c;
import kotlinx.serialization.SerializationException;

/* loaded from: classes2.dex */
public abstract class W implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    private final g7.b f38661a;

    /* renamed from: b, reason: collision with root package name */
    private final g7.b f38662b;

    public /* synthetic */ W(g7.b bVar, g7.b bVar2, AbstractC0650j abstractC0650j) {
        this(bVar, bVar2);
    }

    protected abstract Object a(Object obj);

    protected abstract Object b(Object obj);

    protected abstract Object c(Object obj, Object obj2);

    @Override // g7.a
    public Object deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        j7.c d8 = eVar.d(getDescriptor());
        if (d8.x()) {
            return c(c.a.c(d8, getDescriptor(), 0, this.f38661a, null, 8, null), c.a.c(d8, getDescriptor(), 1, this.f38662b, null, 8, null));
        }
        Object obj = K0.f38633a;
        Object obj2 = K0.f38633a;
        while (true) {
            int e8 = d8.e(getDescriptor());
            if (e8 == -1) {
                d8.c(getDescriptor());
                if (obj == K0.f38633a) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (obj2 != K0.f38633a) {
                    return c(obj, obj2);
                }
                throw new SerializationException("Element 'value' is missing");
            }
            if (e8 == 0) {
                obj = c.a.c(d8, getDescriptor(), 0, this.f38661a, null, 8, null);
            } else {
                if (e8 != 1) {
                    throw new SerializationException("Invalid index: " + e8);
                }
                obj2 = c.a.c(d8, getDescriptor(), 1, this.f38662b, null, 8, null);
            }
        }
    }

    @Override // g7.h
    public void serialize(j7.f fVar, Object obj) {
        J6.r.e(fVar, "encoder");
        j7.d d8 = fVar.d(getDescriptor());
        d8.p(getDescriptor(), 0, this.f38661a, a(obj));
        d8.p(getDescriptor(), 1, this.f38662b, b(obj));
        d8.c(getDescriptor());
    }

    private W(g7.b bVar, g7.b bVar2) {
        this.f38661a = bVar;
        this.f38662b = bVar2;
    }
}
