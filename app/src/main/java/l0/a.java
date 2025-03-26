package L0;

import I6.l;
import J6.AbstractC0650j;
import J6.r;
import J6.s;
import L0.d;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Map f3676a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f3677b;

    /* renamed from: L0.a$a, reason: collision with other inner class name */
    static final class C0067a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final C0067a f3678o = new C0067a();

        C0067a() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            r.e(entry, "entry");
            return "  " + ((d.a) entry.getKey()).a() + " = " + entry.getValue();
        }
    }

    public /* synthetic */ a(Map map, boolean z7, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? new LinkedHashMap() : map, (i8 & 2) != 0 ? true : z7);
    }

    @Override // L0.d
    public Map a() {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(this.f3676a);
        r.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // L0.d
    public Object b(d.a aVar) {
        r.e(aVar, "key");
        return this.f3676a.get(aVar);
    }

    public final void e() {
        if (this.f3677b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return r.a(this.f3676a, ((a) obj).f3676a);
        }
        return false;
    }

    public final void f() {
        this.f3677b.set(true);
    }

    public final void g(d.b... bVarArr) {
        r.e(bVarArr, "pairs");
        e();
        if (bVarArr.length <= 0) {
            return;
        }
        d.b bVar = bVarArr[0];
        throw null;
    }

    public final Object h(d.a aVar) {
        r.e(aVar, "key");
        e();
        return this.f3676a.remove(aVar);
    }

    public int hashCode() {
        return this.f3676a.hashCode();
    }

    public final void i(d.a aVar, Object obj) {
        r.e(aVar, "key");
        j(aVar, obj);
    }

    public final void j(d.a aVar, Object obj) {
        r.e(aVar, "key");
        e();
        if (obj == null) {
            h(aVar);
            return;
        }
        if (!(obj instanceof Set)) {
            this.f3676a.put(aVar, obj);
            return;
        }
        Map map = this.f3676a;
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(AbstractC6987o.e0((Iterable) obj));
        r.d(unmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(aVar, unmodifiableSet);
    }

    public String toString() {
        return AbstractC6987o.I(this.f3676a.entrySet(), ",\n", "{\n", "\n}", 0, null, C0067a.f3678o, 24, null);
    }

    public a(Map map, boolean z7) {
        r.e(map, "preferencesMap");
        this.f3676a = map;
        this.f3677b = new AtomicBoolean(z7);
    }
}
