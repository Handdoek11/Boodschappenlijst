package c4;

import c4.AbstractC1013p;
import c4.AbstractC1014q;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c4.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1015s extends AbstractC1014q implements InterfaceC0992A {

    /* renamed from: t, reason: collision with root package name */
    private final transient r f12228t;

    /* renamed from: c4.s$a */
    public static final class a extends AbstractC1014q.a {
        public C1015s a() {
            Collection entrySet = this.f12224a.entrySet();
            Comparator comparator = this.f12225b;
            if (comparator != null) {
                entrySet = G.a(comparator).d().b(entrySet);
            }
            return C1015s.e(entrySet, this.f12226c);
        }
    }

    C1015s(AbstractC1013p abstractC1013p, int i8, Comparator comparator) {
        super(abstractC1013p, i8);
        this.f12228t = d(comparator);
    }

    private static r d(Comparator comparator) {
        return comparator == null ? r.t() : AbstractC1016t.L(comparator);
    }

    static C1015s e(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return f();
        }
        AbstractC1013p.a aVar = new AbstractC1013p.a(collection.size());
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            r g8 = g(comparator, (Collection) entry.getValue());
            if (!g8.isEmpty()) {
                aVar.e(key, g8);
                i8 += g8.size();
            }
        }
        return new C1015s(aVar.b(), i8, comparator);
    }

    public static C1015s f() {
        return C1009l.f12199u;
    }

    private static r g(Comparator comparator, Collection collection) {
        return comparator == null ? r.q(collection) : AbstractC1016t.H(comparator, collection);
    }
}
