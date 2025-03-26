package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class f0 extends AbstractMap {

    /* renamed from: o, reason: collision with root package name */
    private final int f9357o;

    /* renamed from: s, reason: collision with root package name */
    private List f9358s;

    /* renamed from: t, reason: collision with root package name */
    private Map f9359t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f9360u;

    /* renamed from: v, reason: collision with root package name */
    private volatile g f9361v;

    /* renamed from: w, reason: collision with root package name */
    private Map f9362w;

    /* renamed from: x, reason: collision with root package name */
    private volatile c f9363x;

    static class a extends f0 {
        a(int i8) {
            super(i8, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            androidx.appcompat.app.E.a(obj);
            return super.s(null, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.f0
        public void q() {
            if (!p()) {
                if (l() > 0) {
                    androidx.appcompat.app.E.a(k(0).getKey());
                    throw null;
                }
                Iterator it = n().iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.E.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.q();
        }
    }

    private class c extends g {
        private c() {
            super(f0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.f0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(f0.this, null);
        }

        /* synthetic */ c(f0 f0Var, a aVar) {
            this();
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator f9368a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable f9369b = new b();

        static class a implements Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static class b implements Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f9368a;
            }
        }

        static Iterable b() {
            return f9369b;
        }
    }

    private class e implements Map.Entry, Comparable {

        /* renamed from: o, reason: collision with root package name */
        private final Comparable f9370o;

        /* renamed from: s, reason: collision with root package name */
        private Object f9371s;

        e(f0 f0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean c(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c(this.f9370o, entry.getKey()) && c(this.f9371s, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f9370o;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f9371s;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f9370o;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f9371s;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            f0.this.h();
            Object obj2 = this.f9371s;
            this.f9371s = obj;
            return obj2;
        }

        public String toString() {
            return this.f9370o + "=" + this.f9371s;
        }

        e(Comparable comparable, Object obj) {
            this.f9370o = comparable;
            this.f9371s = obj;
        }
    }

    private class g extends AbstractSet {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            f0.this.s((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = f0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(f0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            f0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f0.this.size();
        }

        /* synthetic */ g(f0 f0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ f0(int i8, a aVar) {
        this(i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int g(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f9358s
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f9358s
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.f0$e r2 = (androidx.datastore.preferences.protobuf.f0.e) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f9358s
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.f0$e r3 = (androidx.datastore.preferences.protobuf.f0.e) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.f0.g(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f9360u) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        h();
        if (!this.f9358s.isEmpty() || (this.f9358s instanceof ArrayList)) {
            return;
        }
        this.f9358s = new ArrayList(this.f9357o);
    }

    private SortedMap o() {
        h();
        if (this.f9359t.isEmpty() && !(this.f9359t instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9359t = treeMap;
            this.f9362w = treeMap.descendingMap();
        }
        return (SortedMap) this.f9359t;
    }

    static f0 r(int i8) {
        return new a(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object t(int i8) {
        h();
        Object value = ((e) this.f9358s.remove(i8)).getValue();
        if (!this.f9359t.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            this.f9358s.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f9358s.isEmpty()) {
            this.f9358s.clear();
        }
        if (this.f9359t.isEmpty()) {
            return;
        }
        this.f9359t.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f9359t.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f9361v == null) {
            this.f9361v = new g(this, null);
        }
        return this.f9361v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return super.equals(obj);
        }
        f0 f0Var = (f0) obj;
        int size = size();
        if (size != f0Var.size()) {
            return false;
        }
        int l8 = l();
        if (l8 != f0Var.l()) {
            return entrySet().equals(f0Var.entrySet());
        }
        for (int i8 = 0; i8 < l8; i8++) {
            if (!k(i8).equals(f0Var.k(i8))) {
                return false;
            }
        }
        if (l8 != size) {
            return this.f9359t.equals(f0Var.f9359t);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int g8 = g(comparable);
        return g8 >= 0 ? ((e) this.f9358s.get(g8)).getValue() : this.f9359t.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int l8 = l();
        int i8 = 0;
        for (int i9 = 0; i9 < l8; i9++) {
            i8 += ((e) this.f9358s.get(i9)).hashCode();
        }
        return m() > 0 ? i8 + this.f9359t.hashCode() : i8;
    }

    Set i() {
        if (this.f9363x == null) {
            this.f9363x = new c(this, null);
        }
        return this.f9363x;
    }

    public Map.Entry k(int i8) {
        return (Map.Entry) this.f9358s.get(i8);
    }

    public int l() {
        return this.f9358s.size();
    }

    public int m() {
        return this.f9359t.size();
    }

    public Iterable n() {
        return this.f9359t.isEmpty() ? d.b() : this.f9359t.entrySet();
    }

    public boolean p() {
        return this.f9360u;
    }

    public void q() {
        if (this.f9360u) {
            return;
        }
        this.f9359t = this.f9359t.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.f9359t);
        this.f9362w = this.f9362w.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.f9362w);
        this.f9360u = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int g8 = g(comparable);
        if (g8 >= 0) {
            return t(g8);
        }
        if (this.f9359t.isEmpty()) {
            return null;
        }
        return this.f9359t.remove(comparable);
    }

    public Object s(Comparable comparable, Object obj) {
        h();
        int g8 = g(comparable);
        if (g8 >= 0) {
            return ((e) this.f9358s.get(g8)).setValue(obj);
        }
        j();
        int i8 = -(g8 + 1);
        if (i8 >= this.f9357o) {
            return o().put(comparable, obj);
        }
        int size = this.f9358s.size();
        int i9 = this.f9357o;
        if (size == i9) {
            e eVar = (e) this.f9358s.remove(i9 - 1);
            o().put(eVar.getKey(), eVar.getValue());
        }
        this.f9358s.add(i8, new e(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f9358s.size() + this.f9359t.size();
    }

    private class b implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        private int f9364o;

        /* renamed from: s, reason: collision with root package name */
        private Iterator f9365s;

        private b() {
            this.f9364o = f0.this.f9358s.size();
        }

        private Iterator a() {
            if (this.f9365s == null) {
                this.f9365s = f0.this.f9362w.entrySet().iterator();
            }
            return this.f9365s;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = f0.this.f9358s;
            int i8 = this.f9364o - 1;
            this.f9364o = i8;
            return (Map.Entry) list.get(i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i8 = this.f9364o;
            return (i8 > 0 && i8 <= f0.this.f9358s.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(f0 f0Var, a aVar) {
            this();
        }
    }

    private class f implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        private int f9373o;

        /* renamed from: s, reason: collision with root package name */
        private boolean f9374s;

        /* renamed from: t, reason: collision with root package name */
        private Iterator f9375t;

        private f() {
            this.f9373o = -1;
        }

        private Iterator a() {
            if (this.f9375t == null) {
                this.f9375t = f0.this.f9359t.entrySet().iterator();
            }
            return this.f9375t;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f9374s = true;
            int i8 = this.f9373o + 1;
            this.f9373o = i8;
            return i8 < f0.this.f9358s.size() ? (Map.Entry) f0.this.f9358s.get(this.f9373o) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9373o + 1 >= f0.this.f9358s.size()) {
                return !f0.this.f9359t.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f9374s) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f9374s = false;
            f0.this.h();
            if (this.f9373o >= f0.this.f9358s.size()) {
                a().remove();
                return;
            }
            f0 f0Var = f0.this;
            int i8 = this.f9373o;
            this.f9373o = i8 - 1;
            f0Var.t(i8);
        }

        /* synthetic */ f(f0 f0Var, a aVar) {
            this();
        }
    }

    private f0(int i8) {
        this.f9357o = i8;
        this.f9358s = Collections.emptyList();
        this.f9359t = Collections.emptyMap();
        this.f9362w = Collections.emptyMap();
    }
}
