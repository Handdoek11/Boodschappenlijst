package Q;

import B.e;
import J6.AbstractC0649i;
import J6.AbstractC0650j;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import y6.AbstractC6980h;
import y6.AbstractC6987o;

/* renamed from: Q.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686h implements List, K6.a, j$.util.List {

    /* renamed from: o, reason: collision with root package name */
    private Object[] f4516o = new Object[16];

    /* renamed from: s, reason: collision with root package name */
    private long[] f4517s = new long[16];

    /* renamed from: t, reason: collision with root package name */
    private int f4518t = -1;

    /* renamed from: u, reason: collision with root package name */
    private int f4519u;

    /* renamed from: Q.h$b */
    private final class b implements List, K6.a, j$.util.List {

        /* renamed from: o, reason: collision with root package name */
        private final int f4524o;

        /* renamed from: s, reason: collision with root package name */
        private final int f4525s;

        public b(int i8, int i9) {
            this.f4524o = i8;
            this.f4525s = i9;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i8, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean b(e.c cVar) {
            return indexOf(cVar) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof e.c) {
                return b((e.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((e.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public e.c get(int i8) {
            Object obj = C0686h.this.f4516o[i8 + this.f4524o];
            J6.r.c(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        public int e() {
            return this.f4525s - this.f4524o;
        }

        @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof e.c) {
                return j((e.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            C0686h c0686h = C0686h.this;
            int i8 = this.f4524o;
            return c0686h.new a(i8, i8, this.f4525s);
        }

        public int j(e.c cVar) {
            int i8 = this.f4524o;
            int i9 = this.f4525s;
            if (i8 > i9) {
                return -1;
            }
            while (!J6.r.a(C0686h.this.f4516o[i8], cVar)) {
                if (i8 == i9) {
                    return -1;
                }
                i8++;
            }
            return i8 - this.f4524o;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof e.c) {
                return n((e.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            C0686h c0686h = C0686h.this;
            int i8 = this.f4524o;
            return c0686h.new a(i8, i8, this.f4525s);
        }

        public int n(e.c cVar) {
            int i8 = this.f4525s;
            int i9 = this.f4524o;
            if (i9 > i8) {
                return -1;
            }
            while (!J6.r.a(C0686h.this.f4516o[i8], cVar)) {
                if (i8 == i9) {
                    return -1;
                }
                i8--;
            }
            return i8 - this.f4524o;
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Stream.Wrapper.convert(parallelStream());
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i8) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.List, j$.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(java.util.Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.List, j$.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(stream());
        }

        @Override // java.util.List
        public List subList(int i8, int i9) {
            C0686h c0686h = C0686h.this;
            int i10 = this.f4524o;
            return c0686h.new b(i8 + i10, i10 + i9);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC0649i.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(java.util.Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator listIterator(int i8) {
            C0686h c0686h = C0686h.this;
            int i9 = this.f4524o;
            return c0686h.new a(i8 + i9, i9, this.f4525s);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
        public /* synthetic */ j$.util.Spliterator spliterator() {
            return List.CC.$default$spliterator(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) intFunction.apply(0));
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC0649i.b(this, objArr);
        }
    }

    private final void C() {
        int i8 = this.f4518t + 1;
        int f8 = AbstractC6987o.f(this);
        if (i8 <= f8) {
            while (true) {
                this.f4516o[i8] = null;
                if (i8 == f8) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f4519u = this.f4518t + 1;
    }

    private final void o() {
        int i8 = this.f4518t;
        Object[] objArr = this.f4516o;
        if (i8 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f4516o = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f4517s, length);
            J6.r.d(copyOf2, "copyOf(this, newSize)");
            this.f4517s = copyOf2;
        }
    }

    private final long p() {
        long a8 = AbstractC0687i.a(Float.POSITIVE_INFINITY, false);
        int i8 = this.f4518t + 1;
        int f8 = AbstractC6987o.f(this);
        if (i8 <= f8) {
            while (true) {
                long b8 = AbstractC0684f.b(this.f4517s[i8]);
                if (AbstractC0684f.a(b8, a8) < 0) {
                    a8 = b8;
                }
                if (AbstractC0684f.c(a8) < 0.0f && AbstractC0684f.d(a8)) {
                    return a8;
                }
                if (i8 == f8) {
                    break;
                }
                i8++;
            }
        }
        return a8;
    }

    public final void F(e.c cVar, float f8, boolean z7, I6.a aVar) {
        if (this.f4518t == AbstractC6987o.f(this)) {
            v(cVar, f8, z7, aVar);
            if (this.f4518t + 1 == AbstractC6987o.f(this)) {
                C();
                return;
            }
            return;
        }
        long p8 = p();
        int i8 = this.f4518t;
        this.f4518t = AbstractC6987o.f(this);
        v(cVar, f8, z7, aVar);
        if (this.f4518t + 1 < AbstractC6987o.f(this) && AbstractC0684f.a(p8, p()) > 0) {
            int i9 = this.f4518t + 1;
            int i10 = i8 + 1;
            Object[] objArr = this.f4516o;
            AbstractC6980h.g(objArr, objArr, i10, i9, size());
            long[] jArr = this.f4517s;
            AbstractC6980h.f(jArr, jArr, i10, i9, size());
            this.f4518t = ((size() + i8) - this.f4518t) - 1;
        }
        C();
        this.f4518t = i8;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i8, java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        this.f4518t = size() - 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f4518t = -1;
        C();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e.c) {
            return n((e.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((e.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof e.c) {
            return w((e.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof e.c) {
            return y((e.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public boolean n(e.c cVar) {
        return indexOf(cVar) != -1;
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public e.c get(int i8) {
        Object obj = this.f4516o[i8];
        J6.r.c(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (e.c) obj;
    }

    public int r() {
        return this.f4519u;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean s() {
        long p8 = p();
        return AbstractC0684f.c(p8) < 0.0f && AbstractC0684f.d(p8);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return r();
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.List
    public java.util.List subList(int i8, int i9) {
        return new b(i8, i9);
    }

    public final void t(e.c cVar, boolean z7, I6.a aVar) {
        v(cVar, -1.0f, z7, aVar);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC0649i.a(this);
    }

    public final void v(e.c cVar, float f8, boolean z7, I6.a aVar) {
        int i8 = this.f4518t;
        this.f4518t = i8 + 1;
        o();
        Object[] objArr = this.f4516o;
        int i9 = this.f4518t;
        objArr[i9] = cVar;
        this.f4517s[i9] = AbstractC0687i.a(f8, z7);
        C();
        aVar.invoke();
        this.f4518t = i8;
    }

    public int w(e.c cVar) {
        int f8 = AbstractC6987o.f(this);
        if (f8 < 0) {
            return -1;
        }
        int i8 = 0;
        while (!J6.r.a(this.f4516o[i8], cVar)) {
            if (i8 == f8) {
                return -1;
            }
            i8++;
        }
        return i8;
    }

    public final boolean x(float f8, boolean z7) {
        if (this.f4518t == AbstractC6987o.f(this)) {
            return true;
        }
        return AbstractC0684f.a(p(), AbstractC0687i.a(f8, z7)) > 0;
    }

    public int y(e.c cVar) {
        for (int f8 = AbstractC6987o.f(this); -1 < f8; f8--) {
            if (J6.r.a(this.f4516o[f8], cVar)) {
                return f8;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i8) {
        return new a(this, i8, 0, 0, 6, null);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC0649i.b(this, objArr);
    }

    /* renamed from: Q.h$a */
    private final class a implements ListIterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private int f4520o;

        /* renamed from: s, reason: collision with root package name */
        private final int f4521s;

        /* renamed from: t, reason: collision with root package name */
        private final int f4522t;

        public a(int i8, int i9, int i10) {
            this.f4520o = i8;
            this.f4521s = i9;
            this.f4522t = i10;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e.c next() {
            Object[] objArr = C0686h.this.f4516o;
            int i8 = this.f4520o;
            this.f4520o = i8 + 1;
            Object obj = objArr[i8];
            J6.r.c(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e.c previous() {
            Object[] objArr = C0686h.this.f4516o;
            int i8 = this.f4520o - 1;
            this.f4520o = i8;
            Object obj = objArr[i8];
            J6.r.c(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f4520o < this.f4522t;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f4520o > this.f4521s;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f4520o - this.f4521s;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f4520o - this.f4521s) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(C0686h c0686h, int i8, int i9, int i10, int i11, AbstractC0650j abstractC0650j) {
            this((i11 & 1) != 0 ? 0 : i8, (i11 & 2) != 0 ? 0 : i9, (i11 & 4) != 0 ? c0686h.size() : i10);
        }
    }
}
