package c4;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class M {

    class a extends b {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Set f12157o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Set f12158s;

        /* renamed from: c4.M$a$a, reason: collision with other inner class name */
        class C0207a extends AbstractC0999b {

            /* renamed from: t, reason: collision with root package name */
            final Iterator f12159t;

            /* renamed from: u, reason: collision with root package name */
            final Iterator f12160u;

            C0207a() {
                this.f12159t = a.this.f12157o.iterator();
                this.f12160u = a.this.f12158s.iterator();
            }

            @Override // c4.AbstractC0999b
            protected Object a() {
                if (this.f12159t.hasNext()) {
                    return this.f12159t.next();
                }
                while (this.f12160u.hasNext()) {
                    Object next = this.f12160u.next();
                    if (!a.this.f12157o.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f12157o = set;
            this.f12158s = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public S iterator() {
            return new C0207a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f12157o.contains(obj) || this.f12158s.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f12157o.isEmpty() && this.f12158s.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f12157o.size();
            Iterator it = this.f12158s.iterator();
            while (it.hasNext()) {
                if (!this.f12157o.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    public static abstract class b extends AbstractSet {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public abstract S iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private b() {
        }
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static int b(Set set) {
        Iterator it = set.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i8 = ~(~(i8 + (next != null ? next.hashCode() : 0)));
        }
        return i8;
    }

    public static b c(Set set, Set set2) {
        b4.h.j(set, "set1");
        b4.h.j(set2, "set2");
        return new a(set, set2);
    }
}
