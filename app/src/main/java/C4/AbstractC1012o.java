package c4;

import c4.AbstractC1011n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: c4.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1012o extends AbstractC1011n implements List, RandomAccess {

    /* renamed from: s, reason: collision with root package name */
    private static final T f12204s = new b(I.f12131v, 0);

    /* renamed from: c4.o$a */
    public static final class a extends AbstractC1011n.a {
        public a() {
            this(4);
        }

        public a e(Object... objArr) {
            super.b(objArr);
            return this;
        }

        public AbstractC1012o f() {
            this.f12203c = true;
            return AbstractC1012o.o(this.f12201a, this.f12202b);
        }

        a(int i8) {
            super(i8);
        }
    }

    /* renamed from: c4.o$b */
    static class b extends AbstractC0998a {

        /* renamed from: t, reason: collision with root package name */
        private final AbstractC1012o f12205t;

        b(AbstractC1012o abstractC1012o, int i8) {
            super(abstractC1012o.size(), i8);
            this.f12205t = abstractC1012o;
        }

        @Override // c4.AbstractC0998a
        protected Object a(int i8) {
            return this.f12205t.get(i8);
        }
    }

    /* renamed from: c4.o$c */
    private static class c extends AbstractC1012o {

        /* renamed from: t, reason: collision with root package name */
        private final transient AbstractC1012o f12206t;

        c(AbstractC1012o abstractC1012o) {
            this.f12206t = abstractC1012o;
        }

        private int I(int i8) {
            return (size() - 1) - i8;
        }

        private int J(int i8) {
            return size() - i8;
        }

        @Override // c4.AbstractC1012o, java.util.List
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public AbstractC1012o subList(int i8, int i9) {
            b4.h.m(i8, i9, size());
            return this.f12206t.subList(J(i9), J(i8)).y();
        }

        @Override // c4.AbstractC1012o, c4.AbstractC1011n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f12206t.contains(obj);
        }

        @Override // java.util.List
        public Object get(int i8) {
            b4.h.g(i8, size());
            return this.f12206t.get(I(i8));
        }

        @Override // c4.AbstractC1012o, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.f12206t.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return I(lastIndexOf);
            }
            return -1;
        }

        @Override // c4.AbstractC1012o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // c4.AbstractC1011n
        boolean j() {
            return this.f12206t.j();
        }

        @Override // c4.AbstractC1012o, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.f12206t.indexOf(obj);
            if (indexOf >= 0) {
                return I(indexOf);
            }
            return -1;
        }

        @Override // c4.AbstractC1012o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f12206t.size();
        }

        @Override // c4.AbstractC1012o
        public AbstractC1012o y() {
            return this.f12206t;
        }

        @Override // c4.AbstractC1012o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i8) {
            return super.listIterator(i8);
        }
    }

    /* renamed from: c4.o$d */
    class d extends AbstractC1012o {

        /* renamed from: t, reason: collision with root package name */
        final transient int f12207t;

        /* renamed from: u, reason: collision with root package name */
        final transient int f12208u;

        d(int i8, int i9) {
            this.f12207t = i8;
            this.f12208u = i9;
        }

        @Override // c4.AbstractC1012o, java.util.List
        /* renamed from: F */
        public AbstractC1012o subList(int i8, int i9) {
            b4.h.m(i8, i9, this.f12208u);
            AbstractC1012o abstractC1012o = AbstractC1012o.this;
            int i10 = this.f12207t;
            return abstractC1012o.subList(i8 + i10, i9 + i10);
        }

        @Override // c4.AbstractC1011n
        Object[] c() {
            return AbstractC1012o.this.c();
        }

        @Override // c4.AbstractC1011n
        int d() {
            return AbstractC1012o.this.e() + this.f12207t + this.f12208u;
        }

        @Override // c4.AbstractC1011n
        int e() {
            return AbstractC1012o.this.e() + this.f12207t;
        }

        @Override // java.util.List
        public Object get(int i8) {
            b4.h.g(i8, this.f12208u);
            return AbstractC1012o.this.get(i8 + this.f12207t);
        }

        @Override // c4.AbstractC1012o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // c4.AbstractC1011n
        boolean j() {
            return true;
        }

        @Override // c4.AbstractC1012o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f12208u;
        }

        @Override // c4.AbstractC1012o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i8) {
            return super.listIterator(i8);
        }
    }

    AbstractC1012o() {
    }

    public static AbstractC1012o C(Comparator comparator, Iterable iterable) {
        b4.h.i(comparator);
        Object[] b8 = v.b(iterable);
        AbstractC0997F.b(b8);
        Arrays.sort(b8, comparator);
        return n(b8);
    }

    static AbstractC1012o n(Object[] objArr) {
        return o(objArr, objArr.length);
    }

    static AbstractC1012o o(Object[] objArr, int i8) {
        return i8 == 0 ? t() : new I(objArr, i8);
    }

    private static AbstractC1012o p(Object... objArr) {
        return n(AbstractC0997F.b(objArr));
    }

    public static AbstractC1012o t() {
        return I.f12131v;
    }

    public static AbstractC1012o v(Object obj, Object obj2) {
        return p(obj, obj2);
    }

    public static AbstractC1012o w(Object obj, Object obj2, Object obj3) {
        return p(obj, obj2, obj3);
    }

    public static AbstractC1012o x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return p(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // java.util.List
    /* renamed from: F */
    public AbstractC1012o subList(int i8, int i9) {
        b4.h.m(i8, i9, size());
        int i10 = i9 - i8;
        return i10 == size() ? this : i10 == 0 ? t() : H(i8, i9);
    }

    AbstractC1012o H(int i8, int i9) {
        return new d(i8, i9 - i8);
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // c4.AbstractC1011n
    int b(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i8 + i9] = get(i9);
        }
        return i8 + size;
    }

    @Override // c4.AbstractC1011n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return x.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = ~(~((i8 * 31) + get(i9).hashCode()));
        }
        return i8;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.d(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public T listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public T listIterator(int i8) {
        b4.h.k(i8, size());
        return isEmpty() ? f12204s : new b(this, i8);
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    public AbstractC1012o y() {
        return size() <= 1 ? this : new c(this);
    }
}
