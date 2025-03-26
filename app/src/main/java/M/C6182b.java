package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6182b implements Iterable {

    /* renamed from: o, reason: collision with root package name */
    c f38887o;

    /* renamed from: s, reason: collision with root package name */
    private c f38888s;

    /* renamed from: t, reason: collision with root package name */
    private final WeakHashMap f38889t = new WeakHashMap();

    /* renamed from: u, reason: collision with root package name */
    private int f38890u = 0;

    /* renamed from: m.b$a */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.C6182b.e
        c b(c cVar) {
            return cVar.f38894u;
        }

        @Override // m.C6182b.e
        c c(c cVar) {
            return cVar.f38893t;
        }
    }

    /* renamed from: m.b$b, reason: collision with other inner class name */
    private static class C0288b extends e {
        C0288b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.C6182b.e
        c b(c cVar) {
            return cVar.f38893t;
        }

        @Override // m.C6182b.e
        c c(c cVar) {
            return cVar.f38894u;
        }
    }

    /* renamed from: m.b$c */
    static class c implements Map.Entry {

        /* renamed from: o, reason: collision with root package name */
        final Object f38891o;

        /* renamed from: s, reason: collision with root package name */
        final Object f38892s;

        /* renamed from: t, reason: collision with root package name */
        c f38893t;

        /* renamed from: u, reason: collision with root package name */
        c f38894u;

        c(Object obj, Object obj2) {
            this.f38891o = obj;
            this.f38892s = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f38891o.equals(cVar.f38891o) && this.f38892s.equals(cVar.f38892s);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f38891o;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f38892s;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f38891o.hashCode() ^ this.f38892s.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f38891o + "=" + this.f38892s;
        }
    }

    /* renamed from: m.b$d */
    public class d extends f implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        private c f38895o;

        /* renamed from: s, reason: collision with root package name */
        private boolean f38896s = true;

        d() {
        }

        @Override // m.C6182b.f
        void a(c cVar) {
            c cVar2 = this.f38895o;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f38894u;
                this.f38895o = cVar3;
                this.f38896s = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f38896s) {
                this.f38896s = false;
                this.f38895o = C6182b.this.f38887o;
            } else {
                c cVar = this.f38895o;
                this.f38895o = cVar != null ? cVar.f38893t : null;
            }
            return this.f38895o;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f38896s) {
                return C6182b.this.f38887o != null;
            }
            c cVar = this.f38895o;
            return (cVar == null || cVar.f38893t == null) ? false : true;
        }
    }

    /* renamed from: m.b$e */
    private static abstract class e extends f implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        c f38898o;

        /* renamed from: s, reason: collision with root package name */
        c f38899s;

        e(c cVar, c cVar2) {
            this.f38898o = cVar2;
            this.f38899s = cVar;
        }

        private c e() {
            c cVar = this.f38899s;
            c cVar2 = this.f38898o;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // m.C6182b.f
        public void a(c cVar) {
            if (this.f38898o == cVar && cVar == this.f38899s) {
                this.f38899s = null;
                this.f38898o = null;
            }
            c cVar2 = this.f38898o;
            if (cVar2 == cVar) {
                this.f38898o = b(cVar2);
            }
            if (this.f38899s == cVar) {
                this.f38899s = e();
            }
        }

        abstract c b(c cVar);

        abstract c c(c cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f38899s;
            this.f38899s = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38899s != null;
        }
    }

    /* renamed from: m.b$f */
    public static abstract class f {
        abstract void a(c cVar);
    }

    public Map.Entry b() {
        return this.f38887o;
    }

    protected c c(Object obj) {
        c cVar = this.f38887o;
        while (cVar != null && !cVar.f38891o.equals(obj)) {
            cVar = cVar.f38893t;
        }
        return cVar;
    }

    public d d() {
        d dVar = new d();
        this.f38889t.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator descendingIterator() {
        C0288b c0288b = new C0288b(this.f38888s, this.f38887o);
        this.f38889t.put(c0288b, Boolean.FALSE);
        return c0288b;
    }

    public Map.Entry e() {
        return this.f38888s;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6182b)) {
            return false;
        }
        C6182b c6182b = (C6182b) obj;
        if (size() != c6182b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c6182b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += ((Map.Entry) it.next()).hashCode();
        }
        return i8;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f38887o, this.f38888s);
        this.f38889t.put(aVar, Boolean.FALSE);
        return aVar;
    }

    c j(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f38890u++;
        c cVar2 = this.f38888s;
        if (cVar2 == null) {
            this.f38887o = cVar;
            this.f38888s = cVar;
            return cVar;
        }
        cVar2.f38893t = cVar;
        cVar.f38894u = cVar2;
        this.f38888s = cVar;
        return cVar;
    }

    public Object n(Object obj, Object obj2) {
        c c8 = c(obj);
        if (c8 != null) {
            return c8.f38892s;
        }
        j(obj, obj2);
        return null;
    }

    public Object o(Object obj) {
        c c8 = c(obj);
        if (c8 == null) {
            return null;
        }
        this.f38890u--;
        if (!this.f38889t.isEmpty()) {
            Iterator it = this.f38889t.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(c8);
            }
        }
        c cVar = c8.f38894u;
        if (cVar != null) {
            cVar.f38893t = c8.f38893t;
        } else {
            this.f38887o = c8.f38893t;
        }
        c cVar2 = c8.f38893t;
        if (cVar2 != null) {
            cVar2.f38894u = cVar;
        } else {
            this.f38888s = cVar;
        }
        c8.f38893t = null;
        c8.f38894u = null;
        return c8.f38892s;
    }

    public int size() {
        return this.f38890u;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
