package k7;

import J6.AbstractC0650j;
import j7.c;
import java.util.Iterator;
import java.util.Map;
import y6.AbstractC6971J;

/* renamed from: k7.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6130h0 extends AbstractC6115a {

    /* renamed from: a, reason: collision with root package name */
    private final g7.b f38689a;

    /* renamed from: b, reason: collision with root package name */
    private final g7.b f38690b;

    public /* synthetic */ AbstractC6130h0(g7.b bVar, g7.b bVar2, AbstractC0650j abstractC0650j) {
        this(bVar, bVar2);
    }

    @Override // g7.b, g7.h, g7.a
    public abstract i7.f getDescriptor();

    public final g7.b m() {
        return this.f38689a;
    }

    public final g7.b n() {
        return this.f38690b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(j7.c cVar, Map map, int i8, int i9) {
        J6.r.e(cVar, "decoder");
        J6.r.e(map, "builder");
        if (i9 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        P6.g l8 = P6.m.l(P6.m.m(0, i9 * 2), 2);
        int e8 = l8.e();
        int j8 = l8.j();
        int n8 = l8.n();
        if ((n8 <= 0 || e8 > j8) && (n8 >= 0 || j8 > e8)) {
            return;
        }
        while (true) {
            h(cVar, i8 + e8, map, false);
            if (e8 == j8) {
                return;
            } else {
                e8 += n8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(j7.c cVar, int i8, Map map, boolean z7) {
        int i9;
        J6.r.e(cVar, "decoder");
        J6.r.e(map, "builder");
        Object c8 = c.a.c(cVar, getDescriptor(), i8, this.f38689a, null, 8, null);
        if (z7) {
            i9 = cVar.e(getDescriptor());
            if (i9 != i8 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i8 + ", returned index for value: " + i9).toString());
            }
        } else {
            i9 = i8 + 1;
        }
        int i10 = i9;
        map.put(c8, (!map.containsKey(c8) || (this.f38690b.getDescriptor().e() instanceof i7.e)) ? c.a.c(cVar, getDescriptor(), i10, this.f38690b, null, 8, null) : cVar.i(getDescriptor(), i10, this.f38690b, AbstractC6971J.f(map, c8)));
    }

    @Override // g7.h
    public void serialize(j7.f fVar, Object obj) {
        J6.r.e(fVar, "encoder");
        int e8 = e(obj);
        i7.f descriptor = getDescriptor();
        j7.d x7 = fVar.x(descriptor, e8);
        Iterator d8 = d(obj);
        int i8 = 0;
        while (d8.hasNext()) {
            Map.Entry entry = (Map.Entry) d8.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i9 = i8 + 1;
            x7.p(getDescriptor(), i8, m(), key);
            i8 += 2;
            x7.p(getDescriptor(), i9, n(), value);
        }
        x7.c(descriptor);
    }

    private AbstractC6130h0(g7.b bVar, g7.b bVar2) {
        super(null);
        this.f38689a = bVar;
        this.f38690b = bVar2;
    }
}
