package q;

import J6.AbstractC0650j;
import J6.r;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import r.AbstractC6640a;
import y6.AbstractC6980h;
import y6.AbstractC6987o;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6398b implements Collection, Set, K6.b, K6.e {

    /* renamed from: o, reason: collision with root package name */
    private int[] f40861o;

    /* renamed from: s, reason: collision with root package name */
    private Object[] f40862s;

    /* renamed from: t, reason: collision with root package name */
    private int f40863t;

    /* renamed from: q.b$a */
    private final class a extends AbstractC6403g {
        public a() {
            super(C6398b.this.n());
        }

        @Override // q.AbstractC6403g
        protected Object a(int i8) {
            return C6398b.this.s(i8);
        }

        @Override // q.AbstractC6403g
        protected void b(int i8) {
            C6398b.this.o(i8);
        }
    }

    public C6398b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i8;
        int c8;
        int n8 = n();
        if (obj == null) {
            c8 = AbstractC6400d.d(this);
            i8 = 0;
        } else {
            int hashCode = obj.hashCode();
            i8 = hashCode;
            c8 = AbstractC6400d.c(this, obj, hashCode);
        }
        if (c8 >= 0) {
            return false;
        }
        int i9 = ~c8;
        if (n8 >= e().length) {
            int i10 = 8;
            if (n8 >= 8) {
                i10 = (n8 >> 1) + n8;
            } else if (n8 < 4) {
                i10 = 4;
            }
            int[] e8 = e();
            Object[] d8 = d();
            AbstractC6400d.a(this, i10);
            if (n8 != n()) {
                throw new ConcurrentModificationException();
            }
            if (!(e().length == 0)) {
                AbstractC6980h.i(e8, e(), 0, 0, e8.length, 6, null);
                AbstractC6980h.j(d8, d(), 0, 0, d8.length, 6, null);
            }
        }
        if (i9 < n8) {
            int i11 = i9 + 1;
            AbstractC6980h.e(e(), e(), i11, i9, n8);
            AbstractC6980h.g(d(), d(), i11, i9, n8);
        }
        if (n8 != n() || i9 >= e().length) {
            throw new ConcurrentModificationException();
        }
        e()[i9] = i8;
        d()[i9] = obj;
        r(n() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        r.e(collection, "elements");
        b(n() + collection.size());
        Iterator it = collection.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= add(it.next());
        }
        return z7;
    }

    public final void b(int i8) {
        int n8 = n();
        if (e().length < i8) {
            int[] e8 = e();
            Object[] d8 = d();
            AbstractC6400d.a(this, i8);
            if (n() > 0) {
                AbstractC6980h.i(e8, e(), 0, 0, n(), 6, null);
                AbstractC6980h.j(d8, d(), 0, 0, n(), 6, null);
            }
        }
        if (n() != n8) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (n() != 0) {
            q(AbstractC6640a.f42380a);
            p(AbstractC6640a.f42382c);
            r(0);
        }
        if (n() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        r.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object[] d() {
        return this.f40862s;
    }

    public final int[] e() {
        return this.f40861o;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int n8 = n();
                for (int i8 = 0; i8 < n8; i8++) {
                    if (((Set) obj).contains(s(i8))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] e8 = e();
        int n8 = n();
        int i8 = 0;
        for (int i9 = 0; i9 < n8; i9++) {
            i8 += e8[i9];
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        return obj == null ? AbstractC6400d.d(this) : AbstractC6400d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return n() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public int j() {
        return this.f40863t;
    }

    public final int n() {
        return this.f40863t;
    }

    public final Object o(int i8) {
        int n8 = n();
        Object obj = d()[i8];
        if (n8 <= 1) {
            clear();
        } else {
            int i9 = n8 - 1;
            if (e().length <= 8 || n() >= e().length / 3) {
                if (i8 < i9) {
                    int i10 = i8 + 1;
                    AbstractC6980h.e(e(), e(), i8, i10, n8);
                    AbstractC6980h.g(d(), d(), i8, i10, n8);
                }
                d()[i9] = null;
            } else {
                int n9 = n() > 8 ? n() + (n() >> 1) : 8;
                int[] e8 = e();
                Object[] d8 = d();
                AbstractC6400d.a(this, n9);
                if (i8 > 0) {
                    AbstractC6980h.i(e8, e(), 0, 0, i8, 6, null);
                    AbstractC6980h.j(d8, d(), 0, 0, i8, 6, null);
                }
                if (i8 < i9) {
                    int i11 = i8 + 1;
                    AbstractC6980h.e(e8, e(), i8, i11, n8);
                    AbstractC6980h.g(d8, d(), i8, i11, n8);
                }
            }
            if (n8 != n()) {
                throw new ConcurrentModificationException();
            }
            r(i9);
        }
        return obj;
    }

    public final void p(Object[] objArr) {
        r.e(objArr, "<set-?>");
        this.f40862s = objArr;
    }

    public final void q(int[] iArr) {
        r.e(iArr, "<set-?>");
        this.f40861o = iArr;
    }

    public final void r(int i8) {
        this.f40863t = i8;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        o(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        r.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= remove(it.next());
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        r.e(collection, "elements");
        boolean z7 = false;
        for (int n8 = n() - 1; -1 < n8; n8--) {
            if (!AbstractC6987o.u(collection, d()[n8])) {
                o(n8);
                z7 = true;
            }
        }
        return z7;
    }

    public final Object s(int i8) {
        return d()[i8];
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return j();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC6980h.k(this.f40862s, 0, this.f40863t);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(n() * 14);
        sb.append('{');
        int n8 = n();
        for (int i8 = 0; i8 < n8; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object s8 = s(i8);
            if (s8 != this) {
                sb.append(s8);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        r.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public C6398b(int i8) {
        this.f40861o = AbstractC6640a.f42380a;
        this.f40862s = AbstractC6640a.f42382c;
        if (i8 > 0) {
            AbstractC6400d.a(this, i8);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        r.e(objArr, "array");
        Object[] a8 = AbstractC6399c.a(objArr, this.f40863t);
        AbstractC6980h.g(this.f40862s, a8, 0, 0, this.f40863t);
        r.d(a8, "result");
        return a8;
    }

    public /* synthetic */ C6398b(int i8, int i9, AbstractC0650j abstractC0650j) {
        this((i9 & 1) != 0 ? 0 : i8);
    }
}
